
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
 * Связь субъект-лицензия
 * 
 * <p>Java class for RelLicenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelLicenseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicensesIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LicenseEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RelLicenseId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="PartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="LicenseCode" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType"/&gt;
 *         &lt;element name="SourceSystemInformationList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}SourceSystemInformationListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelLicenseType", propOrder = {
    "licenseNumber",
    "licenseDescription",
    "licensesIssuedBy",
    "licenseStartDate",
    "licenseEndDate",
    "isActive",
    "lastUpdateDate",
    "relLicenseId",
    "partyId",
    "licenseCode",
    "sourceSystemInformationList"
})
public class RelLicenseType {

    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "LicenseDescription")
    protected String licenseDescription;
    @XmlElement(name = "LicensesIssuedBy")
    protected String licensesIssuedBy;
    @XmlElementRef(name = "LicenseStartDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> licenseStartDate;
    @XmlElementRef(name = "LicenseEndDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> licenseEndDate;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "RelLicenseId", required = true)
    protected IntegrationSymbolicIdentifierXType relLicenseId;
    @XmlElement(name = "PartyId", required = true)
    protected IntegrationSymbolicIdentifierXType partyId;
    @XmlElement(name = "LicenseCode", required = true)
    protected IntegrationDictionaryRecordXType licenseCode;
    @XmlElement(name = "SourceSystemInformationList", required = true)
    protected SourceSystemInformationListType sourceSystemInformationList;

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licenseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseDescription() {
        return licenseDescription;
    }

    /**
     * Sets the value of the licenseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseDescription(String value) {
        this.licenseDescription = value;
    }

    /**
     * Gets the value of the licensesIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensesIssuedBy() {
        return licensesIssuedBy;
    }

    /**
     * Sets the value of the licensesIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensesIssuedBy(String value) {
        this.licensesIssuedBy = value;
    }

    /**
     * Gets the value of the licenseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLicenseStartDate() {
        return licenseStartDate;
    }

    /**
     * Sets the value of the licenseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLicenseStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.licenseStartDate = value;
    }

    /**
     * Gets the value of the licenseEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLicenseEndDate() {
        return licenseEndDate;
    }

    /**
     * Sets the value of the licenseEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLicenseEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.licenseEndDate = value;
    }

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
     * Gets the value of the relLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getRelLicenseId() {
        return relLicenseId;
    }

    /**
     * Sets the value of the relLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setRelLicenseId(IntegrationSymbolicIdentifierXType value) {
        this.relLicenseId = value;
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
     * Gets the value of the licenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getLicenseCode() {
        return licenseCode;
    }

    /**
     * Sets the value of the licenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setLicenseCode(IntegrationDictionaryRecordXType value) {
        this.licenseCode = value;
    }

    /**
     * Gets the value of the sourceSystemInformationList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSystemInformationListType }
     *     
     */
    public SourceSystemInformationListType getSourceSystemInformationList() {
        return sourceSystemInformationList;
    }

    /**
     * Sets the value of the sourceSystemInformationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSystemInformationListType }
     *     
     */
    public void setSourceSystemInformationList(SourceSystemInformationListType value) {
        this.sourceSystemInformationList = value;
    }

}
