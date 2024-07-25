
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Субъект
 * 
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsVip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortNameOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullNameOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortNameOrgLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullNameOrgLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsResidentCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsResidentTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsProblemFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEssentialProblemFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDealProblemFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmployeesCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KPPRegistrationPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KPPMajorTaxpayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CmoLiquidationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OGRNRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FLChPRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLChPRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FLChPRegistrationStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonResidentRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonResidentRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IsStrategicOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsGozOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSelfRegulating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsApkExporter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVedMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsExporter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsImporter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMfh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreditHistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSavingAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="PartyType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="PartyStatus" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="OrgType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="FinalSegment" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="GksSegment" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="IndividualSegment" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibilityZone" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="SeparatedSubjects" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationToProjectsOrg" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="SmallMiddleOrg" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleService" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="OKFS" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="OKOGU" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="OKTMO" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="OKATO" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="OKOPF" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="DiasoftCategory" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountry" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedCapital" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}AuthorizedCapitalType" minOccurs="0"/&gt;
 *         &lt;element name="PODFTInformation" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}PODFTInformationType" minOccurs="0"/&gt;
 *         &lt;element name="MainSolveOption" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="SourceSystemPartyInformationList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}SourceSystemPartyInformationListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "isActive",
    "lastUpdateDate",
    "isVip",
    "shortNameOrg",
    "fullNameOrg",
    "shortNameOrgLat",
    "fullNameOrgLat",
    "isResidentCurrency",
    "isResidentTax",
    "isProblemFactor",
    "isEssentialProblemFactor",
    "isDealProblemFactor",
    "isProblem",
    "employeesCount",
    "inn",
    "kppRegistrationPlace",
    "kppMajorTaxpayer",
    "ogrn",
    "kio",
    "okpo",
    "registrationDate",
    "cmoLiquidationDate",
    "registrationNumber",
    "ogrnRegistrationDate",
    "flChPRegistrationNumber",
    "flChPRegistrationDate",
    "flChPRegistrationStructure",
    "nonResidentRegistrationNumber",
    "nonResidentRegistrationDate",
    "isStrategicOrg",
    "isGozOrg",
    "isSelfRegulating",
    "isApkExporter",
    "isVedMember",
    "isExporter",
    "isImporter",
    "isMfh",
    "creditHistory",
    "isSavingAccount",
    "partyId",
    "partyType",
    "partyStatus",
    "orgType",
    "finalSegment",
    "gksSegment",
    "individualSegment",
    "responsibilityZone",
    "separatedSubjects",
    "affiliationToProjectsOrg",
    "smallMiddleOrg",
    "responsibleService",
    "okfs",
    "okogu",
    "oktmo",
    "okato",
    "okopf",
    "diasoftCategory",
    "residenceCountry",
    "authorizedCapital",
    "podftInformation",
    "mainSolveOption",
    "sourceSystemPartyInformationList"
})
public class PartyType {

    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "IsVip", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVip;
    @XmlElement(name = "ShortNameOrg")
    protected String shortNameOrg;
    @XmlElement(name = "FullNameOrg")
    protected String fullNameOrg;
    @XmlElement(name = "ShortNameOrgLat")
    protected String shortNameOrgLat;
    @XmlElement(name = "FullNameOrgLat")
    protected String fullNameOrgLat;
    @XmlElementRef(name = "IsResidentCurrency", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isResidentCurrency;
    @XmlElementRef(name = "IsResidentTax", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isResidentTax;
    @XmlElementRef(name = "IsProblemFactor", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isProblemFactor;
    @XmlElementRef(name = "IsEssentialProblemFactor", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEssentialProblemFactor;
    @XmlElementRef(name = "IsDealProblemFactor", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDealProblemFactor;
    @XmlElementRef(name = "IsProblem", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isProblem;
    @XmlElement(name = "EmployeesCount")
    protected String employeesCount;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "KPPRegistrationPlace")
    protected String kppRegistrationPlace;
    @XmlElement(name = "KPPMajorTaxpayer")
    protected String kppMajorTaxpayer;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "KIO")
    protected String kio;
    @XmlElement(name = "OKPO")
    protected String okpo;
    @XmlElementRef(name = "RegistrationDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> registrationDate;
    @XmlElementRef(name = "CmoLiquidationDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cmoLiquidationDate;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElementRef(name = "OGRNRegistrationDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ogrnRegistrationDate;
    @XmlElement(name = "FLChPRegistrationNumber")
    protected String flChPRegistrationNumber;
    @XmlElementRef(name = "FLChPRegistrationDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> flChPRegistrationDate;
    @XmlElement(name = "FLChPRegistrationStructure")
    protected String flChPRegistrationStructure;
    @XmlElement(name = "NonResidentRegistrationNumber")
    protected String nonResidentRegistrationNumber;
    @XmlElementRef(name = "NonResidentRegistrationDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nonResidentRegistrationDate;
    @XmlElementRef(name = "IsStrategicOrg", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStrategicOrg;
    @XmlElementRef(name = "IsGozOrg", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isGozOrg;
    @XmlElementRef(name = "IsSelfRegulating", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSelfRegulating;
    @XmlElementRef(name = "IsApkExporter", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isApkExporter;
    @XmlElementRef(name = "IsVedMember", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVedMember;
    @XmlElementRef(name = "IsExporter", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isExporter;
    @XmlElementRef(name = "IsImporter", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isImporter;
    @XmlElementRef(name = "IsMfh", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMfh;
    @XmlElement(name = "CreditHistory")
    protected String creditHistory;
    @XmlElementRef(name = "IsSavingAccount", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSavingAccount;
    @XmlElement(name = "PartyId", required = true)
    protected IntegrationSymbolicIdentifierXType partyId;
    @XmlElement(name = "PartyType")
    protected IntegrationDictionaryRecordXType partyType;
    @XmlElement(name = "PartyStatus")
    protected IntegrationDictionaryRecordXType partyStatus;
    @XmlElement(name = "OrgType")
    protected IntegrationDictionaryRecordXType orgType;
    @XmlElement(name = "FinalSegment")
    protected IntegrationDictionaryRecordXType finalSegment;
    @XmlElement(name = "GksSegment")
    protected IntegrationDictionaryRecordXType gksSegment;
    @XmlElement(name = "IndividualSegment")
    protected IntegrationDictionaryRecordXType individualSegment;
    @XmlElement(name = "ResponsibilityZone")
    protected IntegrationDictionaryRecordXType responsibilityZone;
    @XmlElement(name = "SeparatedSubjects")
    protected IntegrationDictionaryRecordXType separatedSubjects;
    @XmlElement(name = "AffiliationToProjectsOrg")
    protected IntegrationDictionaryRecordXType affiliationToProjectsOrg;
    @XmlElement(name = "SmallMiddleOrg")
    protected IntegrationDictionaryRecordXType smallMiddleOrg;
    @XmlElement(name = "ResponsibleService")
    protected IntegrationDictionaryRecordXType responsibleService;
    @XmlElement(name = "OKFS")
    protected IntegrationDictionaryRecordXType okfs;
    @XmlElement(name = "OKOGU")
    protected IntegrationDictionaryRecordXType okogu;
    @XmlElement(name = "OKTMO")
    protected IntegrationDictionaryRecordXType oktmo;
    @XmlElement(name = "OKATO")
    protected IntegrationDictionaryRecordXType okato;
    @XmlElement(name = "OKOPF")
    protected IntegrationDictionaryRecordXType okopf;
    @XmlElement(name = "DiasoftCategory")
    protected IntegrationDictionaryRecordXType diasoftCategory;
    @XmlElement(name = "ResidenceCountry")
    protected IntegrationDictionaryRecordXType residenceCountry;
    @XmlElement(name = "AuthorizedCapital")
    protected AuthorizedCapitalType authorizedCapital;
    @XmlElement(name = "PODFTInformation")
    protected PODFTInformationType podftInformation;
    @XmlElement(name = "MainSolveOption")
    protected IntegrationDictionaryRecordXType mainSolveOption;
    @XmlElement(name = "SourceSystemPartyInformationList", required = true)
    protected SourceSystemPartyInformationListType sourceSystemPartyInformationList;

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the isVip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVip() {
        return isVip;
    }

    /**
     * Sets the value of the isVip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVip(JAXBElement<Boolean> value) {
        this.isVip = value;
    }

    /**
     * Gets the value of the shortNameOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNameOrg() {
        return shortNameOrg;
    }

    /**
     * Sets the value of the shortNameOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNameOrg(String value) {
        this.shortNameOrg = value;
    }

    /**
     * Gets the value of the fullNameOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameOrg() {
        return fullNameOrg;
    }

    /**
     * Sets the value of the fullNameOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameOrg(String value) {
        this.fullNameOrg = value;
    }

    /**
     * Gets the value of the shortNameOrgLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNameOrgLat() {
        return shortNameOrgLat;
    }

    /**
     * Sets the value of the shortNameOrgLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNameOrgLat(String value) {
        this.shortNameOrgLat = value;
    }

    /**
     * Gets the value of the fullNameOrgLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameOrgLat() {
        return fullNameOrgLat;
    }

    /**
     * Sets the value of the fullNameOrgLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameOrgLat(String value) {
        this.fullNameOrgLat = value;
    }

    /**
     * Gets the value of the isResidentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsResidentCurrency() {
        return isResidentCurrency;
    }

    /**
     * Sets the value of the isResidentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsResidentCurrency(JAXBElement<Boolean> value) {
        this.isResidentCurrency = value;
    }

    /**
     * Gets the value of the isResidentTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsResidentTax() {
        return isResidentTax;
    }

    /**
     * Sets the value of the isResidentTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsResidentTax(JAXBElement<Boolean> value) {
        this.isResidentTax = value;
    }

    /**
     * Gets the value of the isProblemFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsProblemFactor() {
        return isProblemFactor;
    }

    /**
     * Sets the value of the isProblemFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsProblemFactor(JAXBElement<Boolean> value) {
        this.isProblemFactor = value;
    }

    /**
     * Gets the value of the isEssentialProblemFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEssentialProblemFactor() {
        return isEssentialProblemFactor;
    }

    /**
     * Sets the value of the isEssentialProblemFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEssentialProblemFactor(JAXBElement<Boolean> value) {
        this.isEssentialProblemFactor = value;
    }

    /**
     * Gets the value of the isDealProblemFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDealProblemFactor() {
        return isDealProblemFactor;
    }

    /**
     * Sets the value of the isDealProblemFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDealProblemFactor(JAXBElement<Boolean> value) {
        this.isDealProblemFactor = value;
    }

    /**
     * Gets the value of the isProblem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsProblem() {
        return isProblem;
    }

    /**
     * Sets the value of the isProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsProblem(JAXBElement<Boolean> value) {
        this.isProblem = value;
    }

    /**
     * Gets the value of the employeesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeesCount() {
        return employeesCount;
    }

    /**
     * Sets the value of the employeesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeesCount(String value) {
        this.employeesCount = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kppRegistrationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPPRegistrationPlace() {
        return kppRegistrationPlace;
    }

    /**
     * Sets the value of the kppRegistrationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPPRegistrationPlace(String value) {
        this.kppRegistrationPlace = value;
    }

    /**
     * Gets the value of the kppMajorTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPPMajorTaxpayer() {
        return kppMajorTaxpayer;
    }

    /**
     * Sets the value of the kppMajorTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPPMajorTaxpayer(String value) {
        this.kppMajorTaxpayer = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the kio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKIO() {
        return kio;
    }

    /**
     * Sets the value of the kio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKIO(String value) {
        this.kio = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKPO(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the cmoLiquidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCmoLiquidationDate() {
        return cmoLiquidationDate;
    }

    /**
     * Sets the value of the cmoLiquidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCmoLiquidationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.cmoLiquidationDate = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the ogrnRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOGRNRegistrationDate() {
        return ogrnRegistrationDate;
    }

    /**
     * Sets the value of the ogrnRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOGRNRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ogrnRegistrationDate = value;
    }

    /**
     * Gets the value of the flChPRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLChPRegistrationNumber() {
        return flChPRegistrationNumber;
    }

    /**
     * Sets the value of the flChPRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLChPRegistrationNumber(String value) {
        this.flChPRegistrationNumber = value;
    }

    /**
     * Gets the value of the flChPRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFLChPRegistrationDate() {
        return flChPRegistrationDate;
    }

    /**
     * Sets the value of the flChPRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFLChPRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.flChPRegistrationDate = value;
    }

    /**
     * Gets the value of the flChPRegistrationStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLChPRegistrationStructure() {
        return flChPRegistrationStructure;
    }

    /**
     * Sets the value of the flChPRegistrationStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLChPRegistrationStructure(String value) {
        this.flChPRegistrationStructure = value;
    }

    /**
     * Gets the value of the nonResidentRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonResidentRegistrationNumber() {
        return nonResidentRegistrationNumber;
    }

    /**
     * Sets the value of the nonResidentRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonResidentRegistrationNumber(String value) {
        this.nonResidentRegistrationNumber = value;
    }

    /**
     * Gets the value of the nonResidentRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNonResidentRegistrationDate() {
        return nonResidentRegistrationDate;
    }

    /**
     * Sets the value of the nonResidentRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNonResidentRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.nonResidentRegistrationDate = value;
    }

    /**
     * Gets the value of the isStrategicOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStrategicOrg() {
        return isStrategicOrg;
    }

    /**
     * Sets the value of the isStrategicOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStrategicOrg(JAXBElement<Boolean> value) {
        this.isStrategicOrg = value;
    }

    /**
     * Gets the value of the isGozOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsGozOrg() {
        return isGozOrg;
    }

    /**
     * Sets the value of the isGozOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsGozOrg(JAXBElement<Boolean> value) {
        this.isGozOrg = value;
    }

    /**
     * Gets the value of the isSelfRegulating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSelfRegulating() {
        return isSelfRegulating;
    }

    /**
     * Sets the value of the isSelfRegulating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSelfRegulating(JAXBElement<Boolean> value) {
        this.isSelfRegulating = value;
    }

    /**
     * Gets the value of the isApkExporter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsApkExporter() {
        return isApkExporter;
    }

    /**
     * Sets the value of the isApkExporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsApkExporter(JAXBElement<Boolean> value) {
        this.isApkExporter = value;
    }

    /**
     * Gets the value of the isVedMember property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVedMember() {
        return isVedMember;
    }

    /**
     * Sets the value of the isVedMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVedMember(JAXBElement<Boolean> value) {
        this.isVedMember = value;
    }

    /**
     * Gets the value of the isExporter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsExporter() {
        return isExporter;
    }

    /**
     * Sets the value of the isExporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsExporter(JAXBElement<Boolean> value) {
        this.isExporter = value;
    }

    /**
     * Gets the value of the isImporter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsImporter() {
        return isImporter;
    }

    /**
     * Sets the value of the isImporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsImporter(JAXBElement<Boolean> value) {
        this.isImporter = value;
    }

    /**
     * Gets the value of the isMfh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMfh() {
        return isMfh;
    }

    /**
     * Sets the value of the isMfh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMfh(JAXBElement<Boolean> value) {
        this.isMfh = value;
    }

    /**
     * Gets the value of the creditHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditHistory() {
        return creditHistory;
    }

    /**
     * Sets the value of the creditHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditHistory(String value) {
        this.creditHistory = value;
    }

    /**
     * Gets the value of the isSavingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSavingAccount() {
        return isSavingAccount;
    }

    /**
     * Sets the value of the isSavingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSavingAccount(JAXBElement<Boolean> value) {
        this.isSavingAccount = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setPartyId(IntegrationSymbolicIdentifierXType value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setPartyType(IntegrationDictionaryRecordXType value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getPartyStatus() {
        return partyStatus;
    }

    /**
     * Sets the value of the partyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setPartyStatus(IntegrationDictionaryRecordXType value) {
        this.partyStatus = value;
    }

    /**
     * Gets the value of the orgType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getOrgType() {
        return orgType;
    }

    /**
     * Sets the value of the orgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setOrgType(IntegrationDictionaryRecordXType value) {
        this.orgType = value;
    }

    /**
     * Gets the value of the finalSegment property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getFinalSegment() {
        return finalSegment;
    }

    /**
     * Sets the value of the finalSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setFinalSegment(IntegrationDictionaryRecordXType value) {
        this.finalSegment = value;
    }

    /**
     * Gets the value of the gksSegment property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getGksSegment() {
        return gksSegment;
    }

    /**
     * Sets the value of the gksSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setGksSegment(IntegrationDictionaryRecordXType value) {
        this.gksSegment = value;
    }

    /**
     * Gets the value of the individualSegment property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getIndividualSegment() {
        return individualSegment;
    }

    /**
     * Sets the value of the individualSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setIndividualSegment(IntegrationDictionaryRecordXType value) {
        this.individualSegment = value;
    }

    /**
     * Gets the value of the responsibilityZone property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getResponsibilityZone() {
        return responsibilityZone;
    }

    /**
     * Sets the value of the responsibilityZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setResponsibilityZone(IntegrationDictionaryRecordXType value) {
        this.responsibilityZone = value;
    }

    /**
     * Gets the value of the separatedSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getSeparatedSubjects() {
        return separatedSubjects;
    }

    /**
     * Sets the value of the separatedSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setSeparatedSubjects(IntegrationDictionaryRecordXType value) {
        this.separatedSubjects = value;
    }

    /**
     * Gets the value of the affiliationToProjectsOrg property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getAffiliationToProjectsOrg() {
        return affiliationToProjectsOrg;
    }

    /**
     * Sets the value of the affiliationToProjectsOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setAffiliationToProjectsOrg(IntegrationDictionaryRecordXType value) {
        this.affiliationToProjectsOrg = value;
    }

    /**
     * Gets the value of the smallMiddleOrg property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getSmallMiddleOrg() {
        return smallMiddleOrg;
    }

    /**
     * Sets the value of the smallMiddleOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setSmallMiddleOrg(IntegrationDictionaryRecordXType value) {
        this.smallMiddleOrg = value;
    }

    /**
     * Gets the value of the responsibleService property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getResponsibleService() {
        return responsibleService;
    }

    /**
     * Sets the value of the responsibleService property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setResponsibleService(IntegrationDictionaryRecordXType value) {
        this.responsibleService = value;
    }

    /**
     * Gets the value of the okfs property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getOKFS() {
        return okfs;
    }

    /**
     * Sets the value of the okfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setOKFS(IntegrationDictionaryRecordXType value) {
        this.okfs = value;
    }

    /**
     * Gets the value of the okogu property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getOKOGU() {
        return okogu;
    }

    /**
     * Sets the value of the okogu property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setOKOGU(IntegrationDictionaryRecordXType value) {
        this.okogu = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setOKTMO(IntegrationDictionaryRecordXType value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getOKATO() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setOKATO(IntegrationDictionaryRecordXType value) {
        this.okato = value;
    }

    /**
     * Gets the value of the okopf property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setOKOPF(IntegrationDictionaryRecordXType value) {
        this.okopf = value;
    }

    /**
     * Gets the value of the diasoftCategory property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getDiasoftCategory() {
        return diasoftCategory;
    }

    /**
     * Sets the value of the diasoftCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setDiasoftCategory(IntegrationDictionaryRecordXType value) {
        this.diasoftCategory = value;
    }

    /**
     * Gets the value of the residenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getResidenceCountry() {
        return residenceCountry;
    }

    /**
     * Sets the value of the residenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setResidenceCountry(IntegrationDictionaryRecordXType value) {
        this.residenceCountry = value;
    }

    /**
     * Gets the value of the authorizedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedCapitalType }
     *     
     */
    public AuthorizedCapitalType getAuthorizedCapital() {
        return authorizedCapital;
    }

    /**
     * Sets the value of the authorizedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedCapitalType }
     *     
     */
    public void setAuthorizedCapital(AuthorizedCapitalType value) {
        this.authorizedCapital = value;
    }

    /**
     * Gets the value of the podftInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PODFTInformationType }
     *     
     */
    public PODFTInformationType getPODFTInformation() {
        return podftInformation;
    }

    /**
     * Sets the value of the podftInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PODFTInformationType }
     *     
     */
    public void setPODFTInformation(PODFTInformationType value) {
        this.podftInformation = value;
    }

    /**
     * Gets the value of the mainSolveOption property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getMainSolveOption() {
        return mainSolveOption;
    }

    /**
     * Sets the value of the mainSolveOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setMainSolveOption(IntegrationDictionaryRecordXType value) {
        this.mainSolveOption = value;
    }

    /**
     * Gets the value of the sourceSystemPartyInformationList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSystemPartyInformationListType }
     *     
     */
    public SourceSystemPartyInformationListType getSourceSystemPartyInformationList() {
        return sourceSystemPartyInformationList;
    }

    /**
     * Sets the value of the sourceSystemPartyInformationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSystemPartyInformationListType }
     *     
     */
    public void setSourceSystemPartyInformationList(SourceSystemPartyInformationListType value) {
        this.sourceSystemPartyInformationList = value;
    }

}
