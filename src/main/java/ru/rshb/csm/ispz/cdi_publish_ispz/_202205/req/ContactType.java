
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Контакт
 * 
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMainContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActiveContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ContactId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="PartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="ContactType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="ContactDetailType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
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
@XmlType(name = "ContactType", propOrder = {
    "contactValue",
    "description",
    "isMainContact",
    "isActiveContact",
    "status",
    "isActive",
    "lastUpdateDate",
    "contactId",
    "partyId",
    "contactType",
    "contactDetailType",
    "sourceSystemInformationList"
})
public class ContactType {

    @XmlElement(name = "ContactValue", required = true)
    protected String contactValue;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "IsMainContact", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMainContact;
    @XmlElementRef(name = "IsActiveContact", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isActiveContact;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "ContactId", required = true)
    protected IntegrationSymbolicIdentifierXType contactId;
    @XmlElement(name = "PartyId", required = true)
    protected IntegrationSymbolicIdentifierXType partyId;
    @XmlElement(name = "ContactType")
    protected IntegrationDictionaryRecordXType contactType;
    @XmlElement(name = "ContactDetailType")
    protected IntegrationDictionaryRecordXType contactDetailType;
    @XmlElement(name = "SourceSystemInformationList", required = true)
    protected SourceSystemInformationListType sourceSystemInformationList;

    /**
     * Gets the value of the contactValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValue() {
        return contactValue;
    }

    /**
     * Sets the value of the contactValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValue(String value) {
        this.contactValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isMainContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMainContact() {
        return isMainContact;
    }

    /**
     * Sets the value of the isMainContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMainContact(JAXBElement<Boolean> value) {
        this.isMainContact = value;
    }

    /**
     * Gets the value of the isActiveContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsActiveContact() {
        return isActiveContact;
    }

    /**
     * Sets the value of the isActiveContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsActiveContact(JAXBElement<Boolean> value) {
        this.isActiveContact = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setContactId(IntegrationSymbolicIdentifierXType value) {
        this.contactId = value;
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
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setContactType(IntegrationDictionaryRecordXType value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the contactDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getContactDetailType() {
        return contactDetailType;
    }

    /**
     * Sets the value of the contactDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setContactDetailType(IntegrationDictionaryRecordXType value) {
        this.contactDetailType = value;
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
