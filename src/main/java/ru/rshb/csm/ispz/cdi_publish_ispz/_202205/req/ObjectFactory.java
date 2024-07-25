
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.rshb.csm.ispz.cdi_publish_org_ispz._202205.req package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CdiPublishOrgISPZReq_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "CdiPublishOrgISPZReq");
    private final static QName _RelPartyToPartyTypeValidFrom_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "ValidFrom");
    private final static QName _RelPartyToPartyTypeValidTo_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "ValidTo");
    private final static QName _ExtIdTypeIsExtIdActive_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsExtIdActive");
    private final static QName _ExtIdTypeStartDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "StartDate");
    private final static QName _ExtIdTypeEndDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "EndDate");
    private final static QName _StateTypeReorganizationDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "ReorganizationDate");
    private final static QName _VerificationTypeCheckDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "CheckDate");
    private final static QName _AddressTypeIsMainAddress_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsMainAddress");
    private final static QName _ContactTypeIsMainContact_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsMainContact");
    private final static QName _ContactTypeIsActiveContact_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsActiveContact");
    private final static QName _RelLicenseTypeLicenseStartDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "LicenseStartDate");
    private final static QName _RelLicenseTypeLicenseEndDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "LicenseEndDate");
    private final static QName _RelOkvedTypeIsMainOkved_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsMainOkved");
    private final static QName _PODFTInformationTypePODFTFormCreateDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "PODFTFormCreateDate");
    private final static QName _PODFTInformationTypePODFTFormUpdateDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "PODFTFormUpdateDate");
    private final static QName _PODFTInformationTypeFATCAStatusDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "FATCAStatusDate");
    private final static QName _PODFTInformationTypeCRSStatusDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "CRSStatusDate");
    private final static QName _PartyTypeIsVip_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsVip");
    private final static QName _PartyTypeIsResidentCurrency_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsResidentCurrency");
    private final static QName _PartyTypeIsResidentTax_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsResidentTax");
    private final static QName _PartyTypeIsProblemFactor_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsProblemFactor");
    private final static QName _PartyTypeIsEssentialProblemFactor_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsEssentialProblemFactor");
    private final static QName _PartyTypeIsDealProblemFactor_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsDealProblemFactor");
    private final static QName _PartyTypeIsProblem_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsProblem");
    private final static QName _PartyTypeRegistrationDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "RegistrationDate");
    private final static QName _PartyTypeCmoLiquidationDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "CmoLiquidationDate");
    private final static QName _PartyTypeOGRNRegistrationDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "OGRNRegistrationDate");
    private final static QName _PartyTypeFLChPRegistrationDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "FLChPRegistrationDate");
    private final static QName _PartyTypeNonResidentRegistrationDate_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "NonResidentRegistrationDate");
    private final static QName _PartyTypeIsStrategicOrg_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsStrategicOrg");
    private final static QName _PartyTypeIsGozOrg_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsGozOrg");
    private final static QName _PartyTypeIsSelfRegulating_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsSelfRegulating");
    private final static QName _PartyTypeIsApkExporter_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsApkExporter");
    private final static QName _PartyTypeIsVedMember_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsVedMember");
    private final static QName _PartyTypeIsExporter_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsExporter");
    private final static QName _PartyTypeIsImporter_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsImporter");
    private final static QName _PartyTypeIsMfh_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsMfh");
    private final static QName _PartyTypeIsSavingAccount_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", "IsSavingAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.rshb.csm.ispz.cdi_publish_org_ispz._202205.req
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CdiPublishOrgISPZReqType }
     * 
     */
    public CdiPublishOrgISPZReqType createCdiPublishOrgISPZReqType() {
        return new CdiPublishOrgISPZReqType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link AuthorizedCapitalType }
     * 
     */
    public AuthorizedCapitalType createAuthorizedCapitalType() {
        return new AuthorizedCapitalType();
    }

    /**
     * Create an instance of {@link PODFTInformationType }
     * 
     */
    public PODFTInformationType createPODFTInformationType() {
        return new PODFTInformationType();
    }

    /**
     * Create an instance of {@link RelBranchToPartyListType }
     * 
     */
    public RelBranchToPartyListType createRelBranchToPartyListType() {
        return new RelBranchToPartyListType();
    }

    /**
     * Create an instance of {@link RelBranchToPartyType }
     * 
     */
    public RelBranchToPartyType createRelBranchToPartyType() {
        return new RelBranchToPartyType();
    }

    /**
     * Create an instance of {@link RelGroupListType }
     * 
     */
    public RelGroupListType createRelGroupListType() {
        return new RelGroupListType();
    }

    /**
     * Create an instance of {@link RelGroupType }
     * 
     */
    public RelGroupType createRelGroupType() {
        return new RelGroupType();
    }

    /**
     * Create an instance of {@link RelOkvedListType }
     * 
     */
    public RelOkvedListType createRelOkvedListType() {
        return new RelOkvedListType();
    }

    /**
     * Create an instance of {@link RelOkvedType }
     * 
     */
    public RelOkvedType createRelOkvedType() {
        return new RelOkvedType();
    }

    /**
     * Create an instance of {@link RelLicenseListType }
     * 
     */
    public RelLicenseListType createRelLicenseListType() {
        return new RelLicenseListType();
    }

    /**
     * Create an instance of {@link RelLicenseType }
     * 
     */
    public RelLicenseType createRelLicenseType() {
        return new RelLicenseType();
    }

    /**
     * Create an instance of {@link BankRelListType }
     * 
     */
    public BankRelListType createBankRelListType() {
        return new BankRelListType();
    }

    /**
     * Create an instance of {@link BankRelType }
     * 
     */
    public BankRelType createBankRelType() {
        return new BankRelType();
    }

    /**
     * Create an instance of {@link ContactListType }
     * 
     */
    public ContactListType createContactListType() {
        return new ContactListType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link AddressListType }
     * 
     */
    public AddressListType createAddressListType() {
        return new AddressListType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link VerificationListType }
     * 
     */
    public VerificationListType createVerificationListType() {
        return new VerificationListType();
    }

    /**
     * Create an instance of {@link VerificationType }
     * 
     */
    public VerificationType createVerificationType() {
        return new VerificationType();
    }

    /**
     * Create an instance of {@link StateListType }
     * 
     */
    public StateListType createStateListType() {
        return new StateListType();
    }

    /**
     * Create an instance of {@link StateType }
     * 
     */
    public StateType createStateType() {
        return new StateType();
    }

    /**
     * Create an instance of {@link ExtIdListType }
     * 
     */
    public ExtIdListType createExtIdListType() {
        return new ExtIdListType();
    }

    /**
     * Create an instance of {@link ExtIdType }
     * 
     */
    public ExtIdType createExtIdType() {
        return new ExtIdType();
    }

    /**
     * Create an instance of {@link RelPartyToPartyListType }
     * 
     */
    public RelPartyToPartyListType createRelPartyToPartyListType() {
        return new RelPartyToPartyListType();
    }

    /**
     * Create an instance of {@link RelPartyToPartyType }
     * 
     */
    public RelPartyToPartyType createRelPartyToPartyType() {
        return new RelPartyToPartyType();
    }

    /**
     * Create an instance of {@link SourceSystemInformationListType }
     * 
     */
    public SourceSystemInformationListType createSourceSystemInformationListType() {
        return new SourceSystemInformationListType();
    }

    /**
     * Create an instance of {@link SourceSystemInformationType }
     * 
     */
    public SourceSystemInformationType createSourceSystemInformationType() {
        return new SourceSystemInformationType();
    }

    /**
     * Create an instance of {@link SourceSystemPartyInformationListType }
     * 
     */
    public SourceSystemPartyInformationListType createSourceSystemPartyInformationListType() {
        return new SourceSystemPartyInformationListType();
    }

    /**
     * Create an instance of {@link SourceSystemPartyInformationType }
     * 
     */
    public SourceSystemPartyInformationType createSourceSystemPartyInformationType() {
        return new SourceSystemPartyInformationType();
    }

    /**
     * Create an instance of {@link IntegrationSymbolicIdentifierXType }
     * 
     */
    public IntegrationSymbolicIdentifierXType createIntegrationSymbolicIdentifierXType() {
        return new IntegrationSymbolicIdentifierXType();
    }

    /**
     * Create an instance of {@link IntegrationDictionaryRecordXType }
     * 
     */
    public IntegrationDictionaryRecordXType createIntegrationDictionaryRecordXType() {
        return new IntegrationDictionaryRecordXType();
    }

    /**
     * Create an instance of {@link IntegrationRecordXType }
     * 
     */
    public IntegrationRecordXType createIntegrationRecordXType() {
        return new IntegrationRecordXType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CdiPublishOrgISPZReqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CdiPublishOrgISPZReqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "CdiPublishOrgISPZReq")
    public JAXBElement<CdiPublishOrgISPZReqType> createCdiPublishOrgISPZReq(CdiPublishOrgISPZReqType value) {
        return new JAXBElement<CdiPublishOrgISPZReqType>(_CdiPublishOrgISPZReq_QNAME, CdiPublishOrgISPZReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ValidFrom", scope = RelPartyToPartyType.class)
    public JAXBElement<XMLGregorianCalendar> createRelPartyToPartyTypeValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelPartyToPartyTypeValidFrom_QNAME, XMLGregorianCalendar.class, RelPartyToPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ValidTo", scope = RelPartyToPartyType.class)
    public JAXBElement<XMLGregorianCalendar> createRelPartyToPartyTypeValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelPartyToPartyTypeValidTo_QNAME, XMLGregorianCalendar.class, RelPartyToPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsExtIdActive", scope = ExtIdType.class)
    public JAXBElement<Boolean> createExtIdTypeIsExtIdActive(Boolean value) {
        return new JAXBElement<Boolean>(_ExtIdTypeIsExtIdActive_QNAME, Boolean.class, ExtIdType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "StartDate", scope = ExtIdType.class)
    public JAXBElement<XMLGregorianCalendar> createExtIdTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtIdTypeStartDate_QNAME, XMLGregorianCalendar.class, ExtIdType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "EndDate", scope = ExtIdType.class)
    public JAXBElement<XMLGregorianCalendar> createExtIdTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtIdTypeEndDate_QNAME, XMLGregorianCalendar.class, ExtIdType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ReorganizationDate", scope = StateType.class)
    public JAXBElement<XMLGregorianCalendar> createStateTypeReorganizationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StateTypeReorganizationDate_QNAME, XMLGregorianCalendar.class, StateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "StartDate", scope = StateType.class)
    public JAXBElement<XMLGregorianCalendar> createStateTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtIdTypeStartDate_QNAME, XMLGregorianCalendar.class, StateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "EndDate", scope = StateType.class)
    public JAXBElement<XMLGregorianCalendar> createStateTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtIdTypeEndDate_QNAME, XMLGregorianCalendar.class, StateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "CheckDate", scope = VerificationType.class)
    public JAXBElement<XMLGregorianCalendar> createVerificationTypeCheckDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VerificationTypeCheckDate_QNAME, XMLGregorianCalendar.class, VerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsMainAddress", scope = AddressType.class)
    public JAXBElement<Boolean> createAddressTypeIsMainAddress(Boolean value) {
        return new JAXBElement<Boolean>(_AddressTypeIsMainAddress_QNAME, Boolean.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsMainContact", scope = ContactType.class)
    public JAXBElement<Boolean> createContactTypeIsMainContact(Boolean value) {
        return new JAXBElement<Boolean>(_ContactTypeIsMainContact_QNAME, Boolean.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsActiveContact", scope = ContactType.class)
    public JAXBElement<Boolean> createContactTypeIsActiveContact(Boolean value) {
        return new JAXBElement<Boolean>(_ContactTypeIsActiveContact_QNAME, Boolean.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "LicenseStartDate", scope = RelLicenseType.class)
    public JAXBElement<XMLGregorianCalendar> createRelLicenseTypeLicenseStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelLicenseTypeLicenseStartDate_QNAME, XMLGregorianCalendar.class, RelLicenseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "LicenseEndDate", scope = RelLicenseType.class)
    public JAXBElement<XMLGregorianCalendar> createRelLicenseTypeLicenseEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelLicenseTypeLicenseEndDate_QNAME, XMLGregorianCalendar.class, RelLicenseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsMainOkved", scope = RelOkvedType.class)
    public JAXBElement<Boolean> createRelOkvedTypeIsMainOkved(Boolean value) {
        return new JAXBElement<Boolean>(_RelOkvedTypeIsMainOkved_QNAME, Boolean.class, RelOkvedType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ValidFrom", scope = RelOkvedType.class)
    public JAXBElement<XMLGregorianCalendar> createRelOkvedTypeValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelPartyToPartyTypeValidFrom_QNAME, XMLGregorianCalendar.class, RelOkvedType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ValidTo", scope = RelOkvedType.class)
    public JAXBElement<XMLGregorianCalendar> createRelOkvedTypeValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelPartyToPartyTypeValidTo_QNAME, XMLGregorianCalendar.class, RelOkvedType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ValidFrom", scope = RelGroupType.class)
    public JAXBElement<XMLGregorianCalendar> createRelGroupTypeValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelPartyToPartyTypeValidFrom_QNAME, XMLGregorianCalendar.class, RelGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "ValidTo", scope = RelGroupType.class)
    public JAXBElement<XMLGregorianCalendar> createRelGroupTypeValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelPartyToPartyTypeValidTo_QNAME, XMLGregorianCalendar.class, RelGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "PODFTFormCreateDate", scope = PODFTInformationType.class)
    public JAXBElement<XMLGregorianCalendar> createPODFTInformationTypePODFTFormCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PODFTInformationTypePODFTFormCreateDate_QNAME, XMLGregorianCalendar.class, PODFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "PODFTFormUpdateDate", scope = PODFTInformationType.class)
    public JAXBElement<XMLGregorianCalendar> createPODFTInformationTypePODFTFormUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PODFTInformationTypePODFTFormUpdateDate_QNAME, XMLGregorianCalendar.class, PODFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "FATCAStatusDate", scope = PODFTInformationType.class)
    public JAXBElement<XMLGregorianCalendar> createPODFTInformationTypeFATCAStatusDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PODFTInformationTypeFATCAStatusDate_QNAME, XMLGregorianCalendar.class, PODFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "CRSStatusDate", scope = PODFTInformationType.class)
    public JAXBElement<XMLGregorianCalendar> createPODFTInformationTypeCRSStatusDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PODFTInformationTypeCRSStatusDate_QNAME, XMLGregorianCalendar.class, PODFTInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsVip", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsVip(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsVip_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsResidentCurrency", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsResidentCurrency(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsResidentCurrency_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsResidentTax", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsResidentTax(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsResidentTax_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsProblemFactor", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsProblemFactor(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsProblemFactor_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsEssentialProblemFactor", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsEssentialProblemFactor(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsEssentialProblemFactor_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsDealProblemFactor", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsDealProblemFactor(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsDealProblemFactor_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsProblem", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsProblem(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsProblem_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "RegistrationDate", scope = PartyType.class)
    public JAXBElement<XMLGregorianCalendar> createPartyTypeRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyTypeRegistrationDate_QNAME, XMLGregorianCalendar.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "CmoLiquidationDate", scope = PartyType.class)
    public JAXBElement<XMLGregorianCalendar> createPartyTypeCmoLiquidationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyTypeCmoLiquidationDate_QNAME, XMLGregorianCalendar.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "OGRNRegistrationDate", scope = PartyType.class)
    public JAXBElement<XMLGregorianCalendar> createPartyTypeOGRNRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyTypeOGRNRegistrationDate_QNAME, XMLGregorianCalendar.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "FLChPRegistrationDate", scope = PartyType.class)
    public JAXBElement<XMLGregorianCalendar> createPartyTypeFLChPRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyTypeFLChPRegistrationDate_QNAME, XMLGregorianCalendar.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "NonResidentRegistrationDate", scope = PartyType.class)
    public JAXBElement<XMLGregorianCalendar> createPartyTypeNonResidentRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyTypeNonResidentRegistrationDate_QNAME, XMLGregorianCalendar.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsStrategicOrg", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsStrategicOrg(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsStrategicOrg_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsGozOrg", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsGozOrg(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsGozOrg_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsSelfRegulating", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsSelfRegulating(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsSelfRegulating_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsApkExporter", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsApkExporter(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsApkExporter_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsVedMember", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsVedMember(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsVedMember_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsExporter", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsExporter(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsExporter_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsImporter", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsImporter(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsImporter_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsMfh", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsMfh(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsMfh_QNAME, Boolean.class, PartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", name = "IsSavingAccount", scope = PartyType.class)
    public JAXBElement<Boolean> createPartyTypeIsSavingAccount(Boolean value) {
        return new JAXBElement<Boolean>(_PartyTypeIsSavingAccount_QNAME, Boolean.class, PartyType.class, value);
    }

}
