
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
 * Адрес
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StructureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="House" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hcase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Liter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMainAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OKTMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiasGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KladrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AddressId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="PartyId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType"/&gt;
 *         &lt;element name="AddressType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="RegionType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="AreaType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="CityType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="PlaceType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="StructureType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="StreetType" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
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
@XmlType(name = "AddressType", propOrder = {
    "addressLine",
    "postalCode",
    "regionName",
    "areaName",
    "cityName",
    "placeName",
    "structureName",
    "streetName",
    "house",
    "hcase",
    "block",
    "liter",
    "flat",
    "isMainAddress",
    "oktmo",
    "fiasGuid",
    "kladrId",
    "description",
    "isActive",
    "lastUpdateDate",
    "addressId",
    "partyId",
    "addressType",
    "country",
    "regionType",
    "areaType",
    "cityType",
    "placeType",
    "structureType",
    "streetType",
    "sourceSystemInformationList"
})
public class AddressType {

    @XmlElement(name = "AddressLine")
    protected String addressLine;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "RegionName")
    protected String regionName;
    @XmlElement(name = "AreaName")
    protected String areaName;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "PlaceName")
    protected String placeName;
    @XmlElement(name = "StructureName")
    protected String structureName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "House")
    protected String house;
    @XmlElement(name = "Hcase")
    protected String hcase;
    @XmlElement(name = "Block")
    protected String block;
    @XmlElement(name = "Liter")
    protected String liter;
    @XmlElement(name = "Flat")
    protected String flat;
    @XmlElementRef(name = "IsMainAddress", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMainAddress;
    @XmlElement(name = "OKTMO")
    protected String oktmo;
    @XmlElement(name = "FiasGuid")
    protected String fiasGuid;
    @XmlElement(name = "KladrId")
    protected String kladrId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "AddressId", required = true)
    protected IntegrationSymbolicIdentifierXType addressId;
    @XmlElement(name = "PartyId", required = true)
    protected IntegrationSymbolicIdentifierXType partyId;
    @XmlElement(name = "AddressType")
    protected IntegrationDictionaryRecordXType addressType;
    @XmlElement(name = "Country")
    protected IntegrationDictionaryRecordXType country;
    @XmlElement(name = "RegionType")
    protected IntegrationDictionaryRecordXType regionType;
    @XmlElement(name = "AreaType")
    protected IntegrationDictionaryRecordXType areaType;
    @XmlElement(name = "CityType")
    protected IntegrationDictionaryRecordXType cityType;
    @XmlElement(name = "PlaceType")
    protected IntegrationDictionaryRecordXType placeType;
    @XmlElement(name = "StructureType")
    protected IntegrationDictionaryRecordXType structureType;
    @XmlElement(name = "StreetType")
    protected IntegrationDictionaryRecordXType streetType;
    @XmlElement(name = "SourceSystemInformationList", required = true)
    protected SourceSystemInformationListType sourceSystemInformationList;

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the structureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureName() {
        return structureName;
    }

    /**
     * Sets the value of the structureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureName(String value) {
        this.structureName = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the hcase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcase() {
        return hcase;
    }

    /**
     * Sets the value of the hcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcase(String value) {
        this.hcase = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the liter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiter() {
        return liter;
    }

    /**
     * Sets the value of the liter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiter(String value) {
        this.liter = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlat(String value) {
        this.flat = value;
    }

    /**
     * Gets the value of the isMainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMainAddress() {
        return isMainAddress;
    }

    /**
     * Sets the value of the isMainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMainAddress(JAXBElement<Boolean> value) {
        this.isMainAddress = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the fiasGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasGuid() {
        return fiasGuid;
    }

    /**
     * Sets the value of the fiasGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasGuid(String value) {
        this.fiasGuid = value;
    }

    /**
     * Gets the value of the kladrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKladrId() {
        return kladrId;
    }

    /**
     * Sets the value of the kladrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKladrId(String value) {
        this.kladrId = value;
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
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setAddressId(IntegrationSymbolicIdentifierXType value) {
        this.addressId = value;
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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setAddressType(IntegrationDictionaryRecordXType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setCountry(IntegrationDictionaryRecordXType value) {
        this.country = value;
    }

    /**
     * Gets the value of the regionType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getRegionType() {
        return regionType;
    }

    /**
     * Sets the value of the regionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setRegionType(IntegrationDictionaryRecordXType value) {
        this.regionType = value;
    }

    /**
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getAreaType() {
        return areaType;
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setAreaType(IntegrationDictionaryRecordXType value) {
        this.areaType = value;
    }

    /**
     * Gets the value of the cityType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getCityType() {
        return cityType;
    }

    /**
     * Sets the value of the cityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setCityType(IntegrationDictionaryRecordXType value) {
        this.cityType = value;
    }

    /**
     * Gets the value of the placeType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setPlaceType(IntegrationDictionaryRecordXType value) {
        this.placeType = value;
    }

    /**
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setStructureType(IntegrationDictionaryRecordXType value) {
        this.structureType = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setStreetType(IntegrationDictionaryRecordXType value) {
        this.streetType = value;
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
