
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип запроса сервиса публикации в ИС ПЗ данных по организации по факту изменения данных в CDI
 * 
 * <p>Java class for CdiPublishOrgISPZReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdiPublishOrgISPZReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Party" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="RelBranchToPartyList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelBranchToPartyListType" minOccurs="0"/&gt;
 *         &lt;element name="RelGroupList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelGroupListType" minOccurs="0"/&gt;
 *         &lt;element name="RelOkvedList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelOkvedListType" minOccurs="0"/&gt;
 *         &lt;element name="RelLicenseList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelLicenseListType" minOccurs="0"/&gt;
 *         &lt;element name="BankRelList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}BankRelListType" minOccurs="0"/&gt;
 *         &lt;element name="ContactList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}ContactListType" minOccurs="0"/&gt;
 *         &lt;element name="AddressList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}AddressListType" minOccurs="0"/&gt;
 *         &lt;element name="VerificationList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}VerificationListType" minOccurs="0"/&gt;
 *         &lt;element name="StateList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}StateListType" minOccurs="0"/&gt;
 *         &lt;element name="ExtIdList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}ExtIdListType" minOccurs="0"/&gt;
 *         &lt;element name="RelPartyToPartyList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelPartyToPartyListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdiPublishOrgISPZReqType", propOrder = {
    "party",
    "relBranchToPartyList",
    "relGroupList",
    "relOkvedList",
    "relLicenseList",
    "bankRelList",
    "contactList",
    "addressList",
    "verificationList",
    "stateList",
    "extIdList",
    "relPartyToPartyList"
})
public class CdiPublishOrgISPZReqType {

    @XmlElement(name = "Party")
    protected PartyType party;
    @XmlElement(name = "RelBranchToPartyList")
    protected RelBranchToPartyListType relBranchToPartyList;
    @XmlElement(name = "RelGroupList")
    protected RelGroupListType relGroupList;
    @XmlElement(name = "RelOkvedList")
    protected RelOkvedListType relOkvedList;
    @XmlElement(name = "RelLicenseList")
    protected RelLicenseListType relLicenseList;
    @XmlElement(name = "BankRelList")
    protected BankRelListType bankRelList;
    @XmlElement(name = "ContactList")
    protected ContactListType contactList;
    @XmlElement(name = "AddressList")
    protected AddressListType addressList;
    @XmlElement(name = "VerificationList")
    protected VerificationListType verificationList;
    @XmlElement(name = "StateList")
    protected StateListType stateList;
    @XmlElement(name = "ExtIdList")
    protected ExtIdListType extIdList;
    @XmlElement(name = "RelPartyToPartyList")
    protected RelPartyToPartyListType relPartyToPartyList;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the relBranchToPartyList property.
     * 
     * @return
     *     possible object is
     *     {@link RelBranchToPartyListType }
     *     
     */
    public RelBranchToPartyListType getRelBranchToPartyList() {
        return relBranchToPartyList;
    }

    /**
     * Sets the value of the relBranchToPartyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelBranchToPartyListType }
     *     
     */
    public void setRelBranchToPartyList(RelBranchToPartyListType value) {
        this.relBranchToPartyList = value;
    }

    /**
     * Gets the value of the relGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link RelGroupListType }
     *     
     */
    public RelGroupListType getRelGroupList() {
        return relGroupList;
    }

    /**
     * Sets the value of the relGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelGroupListType }
     *     
     */
    public void setRelGroupList(RelGroupListType value) {
        this.relGroupList = value;
    }

    /**
     * Gets the value of the relOkvedList property.
     * 
     * @return
     *     possible object is
     *     {@link RelOkvedListType }
     *     
     */
    public RelOkvedListType getRelOkvedList() {
        return relOkvedList;
    }

    /**
     * Sets the value of the relOkvedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelOkvedListType }
     *     
     */
    public void setRelOkvedList(RelOkvedListType value) {
        this.relOkvedList = value;
    }

    /**
     * Gets the value of the relLicenseList property.
     * 
     * @return
     *     possible object is
     *     {@link RelLicenseListType }
     *     
     */
    public RelLicenseListType getRelLicenseList() {
        return relLicenseList;
    }

    /**
     * Sets the value of the relLicenseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelLicenseListType }
     *     
     */
    public void setRelLicenseList(RelLicenseListType value) {
        this.relLicenseList = value;
    }

    /**
     * Gets the value of the bankRelList property.
     * 
     * @return
     *     possible object is
     *     {@link BankRelListType }
     *     
     */
    public BankRelListType getBankRelList() {
        return bankRelList;
    }

    /**
     * Sets the value of the bankRelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRelListType }
     *     
     */
    public void setBankRelList(BankRelListType value) {
        this.bankRelList = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactListType }
     *     
     */
    public ContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactListType }
     *     
     */
    public void setContactList(ContactListType value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListType }
     *     
     */
    public AddressListType getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListType }
     *     
     */
    public void setAddressList(AddressListType value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the verificationList property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationListType }
     *     
     */
    public VerificationListType getVerificationList() {
        return verificationList;
    }

    /**
     * Sets the value of the verificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationListType }
     *     
     */
    public void setVerificationList(VerificationListType value) {
        this.verificationList = value;
    }

    /**
     * Gets the value of the stateList property.
     * 
     * @return
     *     possible object is
     *     {@link StateListType }
     *     
     */
    public StateListType getStateList() {
        return stateList;
    }

    /**
     * Sets the value of the stateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateListType }
     *     
     */
    public void setStateList(StateListType value) {
        this.stateList = value;
    }

    /**
     * Gets the value of the extIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtIdListType }
     *     
     */
    public ExtIdListType getExtIdList() {
        return extIdList;
    }

    /**
     * Sets the value of the extIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtIdListType }
     *     
     */
    public void setExtIdList(ExtIdListType value) {
        this.extIdList = value;
    }

    /**
     * Gets the value of the relPartyToPartyList property.
     * 
     * @return
     *     possible object is
     *     {@link RelPartyToPartyListType }
     *     
     */
    public RelPartyToPartyListType getRelPartyToPartyList() {
        return relPartyToPartyList;
    }

    /**
     * Sets the value of the relPartyToPartyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelPartyToPartyListType }
     *     
     */
    public void setRelPartyToPartyList(RelPartyToPartyListType value) {
        this.relPartyToPartyList = value;
    }

}
