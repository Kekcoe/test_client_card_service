
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Связанные лица
 * 
 * <p>Java class for RelPartyToPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelPartyToPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BaseDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedCapitalShare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="RelatedPartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="RelatedPartyCFTId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType" minOccurs="0"/&gt;
 *         &lt;element name="PartyRelationType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType"/&gt;
 *         &lt;element name="BaseDocumentType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="RelPartyToPartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="SourceSystemInformationList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}SourceSystemInformationListType"/&gt;
 *         &lt;element name="ChangedInAnotherSubject" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelPartyToPartyType", propOrder = {
    "validFrom",
    "validTo",
    "baseDocumentNumber",
    "authorizedCapitalShare",
    "partyId",
    "relatedPartyId",
    "relatedPartyCFTId",
    "partyRelationType",
    "baseDocumentType",
    "relPartyToPartyId",
    "sourceSystemInformationList",
    "changedInAnotherSubject"
})
public class RelPartyToPartyType {

    @XmlElementRef(name = "ValidFrom", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> validFrom;
    @XmlElementRef(name = "ValidTo", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> validTo;
    @XmlElement(name = "BaseDocumentNumber")
    protected String baseDocumentNumber;
    @XmlElement(name = "AuthorizedCapitalShare")
    protected String authorizedCapitalShare;
    @XmlElement(name = "PartyId", required = true)
    protected IntegrationSymbolicIdentifierXType partyId;
    @XmlElement(name = "RelatedPartyId", required = true)
    protected IntegrationSymbolicIdentifierXType relatedPartyId;
    @XmlElement(name = "RelatedPartyCFTId")
    protected IntegrationSymbolicIdentifierXType relatedPartyCFTId;
    @XmlElement(name = "PartyRelationType", required = true)
    protected IntegrationDictionaryRecordXType partyRelationType;
    @XmlElement(name = "BaseDocumentType")
    protected IntegrationDictionaryRecordXType baseDocumentType;
    @XmlElement(name = "RelPartyToPartyId", required = true)
    protected IntegrationSymbolicIdentifierXType relPartyToPartyId;
    @XmlElement(name = "SourceSystemInformationList", required = true)
    protected SourceSystemInformationListType sourceSystemInformationList;
    @XmlElement(name = "ChangedInAnotherSubject")
    protected IntegrationSymbolicIdentifierXType changedInAnotherSubject;

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidTo(JAXBElement<XMLGregorianCalendar> value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the baseDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDocumentNumber() {
        return baseDocumentNumber;
    }

    /**
     * Sets the value of the baseDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDocumentNumber(String value) {
        this.baseDocumentNumber = value;
    }

    /**
     * Gets the value of the authorizedCapitalShare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedCapitalShare() {
        return authorizedCapitalShare;
    }

    /**
     * Sets the value of the authorizedCapitalShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedCapitalShare(String value) {
        this.authorizedCapitalShare = value;
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
     * Gets the value of the relatedPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getRelatedPartyId() {
        return relatedPartyId;
    }

    /**
     * Sets the value of the relatedPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setRelatedPartyId(IntegrationSymbolicIdentifierXType value) {
        this.relatedPartyId = value;
    }

    /**
     * Gets the value of the relatedPartyCFTId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getRelatedPartyCFTId() {
        return relatedPartyCFTId;
    }

    /**
     * Sets the value of the relatedPartyCFTId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setRelatedPartyCFTId(IntegrationSymbolicIdentifierXType value) {
        this.relatedPartyCFTId = value;
    }

    /**
     * Gets the value of the partyRelationType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getPartyRelationType() {
        return partyRelationType;
    }

    /**
     * Sets the value of the partyRelationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setPartyRelationType(IntegrationDictionaryRecordXType value) {
        this.partyRelationType = value;
    }

    /**
     * Gets the value of the baseDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getBaseDocumentType() {
        return baseDocumentType;
    }

    /**
     * Sets the value of the baseDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setBaseDocumentType(IntegrationDictionaryRecordXType value) {
        this.baseDocumentType = value;
    }

    /**
     * Gets the value of the relPartyToPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getRelPartyToPartyId() {
        return relPartyToPartyId;
    }

    /**
     * Sets the value of the relPartyToPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setRelPartyToPartyId(IntegrationSymbolicIdentifierXType value) {
        this.relPartyToPartyId = value;
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

    /**
     * Gets the value of the changedInAnotherSubject property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getChangedInAnotherSubject() {
        return changedInAnotherSubject;
    }

    /**
     * Sets the value of the changedInAnotherSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setChangedInAnotherSubject(IntegrationSymbolicIdentifierXType value) {
        this.changedInAnotherSubject = value;
    }

}
