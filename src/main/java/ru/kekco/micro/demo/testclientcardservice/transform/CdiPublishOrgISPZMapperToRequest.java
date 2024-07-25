package ru.kekco.micro.demo.testclientcardservice.transform;

import jakarta.xml.bind.JAXBElement;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.*;
import ru.rshb.csm.ispz.cdi_publish_ispz._202205.req.AddressType;
import ru.rshb.csm.ispz.cdi_publish_ispz._202205.req.CdiPublishOrgISPZReqType;
import ru.rshb.csm.ispz.cdi_publish_ispz._202205.req.SourceSystemPartyInformationListType;
import ru.rshb.csm.ispz.cdi_publish_ispz._202205.req.SourceSystemPartyInformationType;
import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

import javax.xml.namespace.QName;
import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Mapper(componentModel = "spring",
        uses = {ObjectFactory.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CdiPublishOrgISPZMapperToRequest {
    @Slf4j
    final class LogCdiPublishOrgISPZMapperToRequest
    {}

    @Mapping(target = "party.partyId.objectId", source = "clientDTO", qualifiedByName = "getCdiId")
    @Mapping(target = "party.sourceSystemPartyInformationList", source = "clientDTO",
            qualifiedByName = "getSourceSystemPartyInformationTypeListFromRequest")
    @Mapping(target = "party.INN", source = "inn")
    @Mapping(target = "party.lastUpdateDate", source = "updDate")
    @Mapping(target = "party.isResidentTax", source = "clientDTO", qualifiedByName = "booleanToJAXBElement")
    @Mapping(target = "party.OGRN", source = "ogrn")
    @Mapping(target = "party.KPPRegistrationPlace", source = "kpp")
    @Mapping(target = "addressList.address", source = "clientDTO", qualifiedByName = "getAddressListTypeFromRequest")
    CdiPublishOrgISPZReqType fromClientDTO(ClientDTO clientDTO);

    @Named("getCdiId")
    default String getCdiId(ClientDTO clientDTO) {
        return StringUtils.isEmpty(clientDTO.getIdCdi2()) ? clientDTO.getIdCdi() : clientDTO.getIdCdi2();
    }

    @Mapping(target = "sourceSystemPartyId.objectId", source = "clientIdentityUid")
    SourceSystemPartyInformationType toSourceSystemPartyInformationType(ClientDTO clientDTO);

    @Named("getSourceSystemPartyInformationTypeListFromRequest")
    default SourceSystemPartyInformationListType getSourceSystemPartyInformationTypeListFromRequest(ClientDTO clientDTO) {
        SourceSystemPartyInformationType first = Collections.singletonList(toSourceSystemPartyInformationType(clientDTO)).get(0);
        SourceSystemPartyInformationListType sourceSystemPartyInformationTypeList = new ru.rshb.csm.ispz.cdi_publish_ispz._202205.req.ObjectFactory().createSourceSystemPartyInformationListType();
        sourceSystemPartyInformationTypeList.getSourceSystemPartyInformation().add(first);
        return sourceSystemPartyInformationTypeList;
    }

    @Named("booleanToJAXBElement")
    default JAXBElement<Boolean> booleanToJAXBElement(ClientDTO clientDTO) throws SchemaFactoryConfigurationError {
        QName qName = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsResidentTax");
        return new JAXBElement<>(qName, Boolean.class, clientDTO.getIsResident());
    }

    @Named("getAddressListTypeFromRequest")
    default List<AddressType> getAddressListTypeFromRequest(ClientDTO clientDTO) {
        List<AddressType> addressTypeList = new ArrayList<>();
        var legalType = new AddressType();
        var currentType = new AddressType();
        legalType.setAddressLine(clientDTO.getLegalAddress());
        currentType.setAddressLine(clientDTO.getCurrentAddress());
        addressTypeList.add(legalType);
        addressTypeList.add(currentType);
        return addressTypeList;
    }

}