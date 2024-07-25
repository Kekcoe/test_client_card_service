
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Связь субъект-подразделение
 * 
 * <p>Java class for RelBranchToPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelBranchToPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RelBranchToPartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="PartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType"/&gt;
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
@XmlType(name = "RelBranchToPartyType", propOrder = {
    "isActive",
    "lastUpdateDate",
    "relBranchToPartyId",
    "partyId",
    "branchCode",
    "sourceSystemInformationList"
})
public class RelBranchToPartyType {

    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "RelBranchToPartyId", required = true)
    protected IntegrationSymbolicIdentifierXType relBranchToPartyId;
    @XmlElement(name = "PartyId", required = true)
    protected IntegrationSymbolicIdentifierXType partyId;
    @XmlElement(name = "BranchCode", required = true)
    protected IntegrationDictionaryRecordXType branchCode;
    @XmlElement(name = "SourceSystemInformationList", required = true)
    protected SourceSystemInformationListType sourceSystemInformationList;

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
     * Gets the value of the relBranchToPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getRelBranchToPartyId() {
        return relBranchToPartyId;
    }

    /**
     * Sets the value of the relBranchToPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setRelBranchToPartyId(IntegrationSymbolicIdentifierXType value) {
        this.relBranchToPartyId = value;
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
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setBranchCode(IntegrationDictionaryRecordXType value) {
        this.branchCode = value;
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
