
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация ПОД/ФТ
 * 
 * <p>Java class for PODFTInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PODFTInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PODFTFormCreateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PODFTFormUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FATCAStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CRSStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FATCAStatus" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *         &lt;element name="CRSStatus" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PODFTInformationType", propOrder = {
    "podftFormCreateDate",
    "podftFormUpdateDate",
    "fatcaStatusDate",
    "crsStatusDate",
    "fatcaStatus",
    "crsStatus"
})
public class PODFTInformationType {

    @XmlElementRef(name = "PODFTFormCreateDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> podftFormCreateDate;
    @XmlElementRef(name = "PODFTFormUpdateDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> podftFormUpdateDate;
    @XmlElementRef(name = "FATCAStatusDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fatcaStatusDate;
    @XmlElementRef(name = "CRSStatusDate", namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> crsStatusDate;
    @XmlElement(name = "FATCAStatus")
    protected IntegrationDictionaryRecordXType fatcaStatus;
    @XmlElement(name = "CRSStatus")
    protected IntegrationDictionaryRecordXType crsStatus;

    /**
     * Gets the value of the podftFormCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPODFTFormCreateDate() {
        return podftFormCreateDate;
    }

    /**
     * Sets the value of the podftFormCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPODFTFormCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.podftFormCreateDate = value;
    }

    /**
     * Gets the value of the podftFormUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPODFTFormUpdateDate() {
        return podftFormUpdateDate;
    }

    /**
     * Sets the value of the podftFormUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPODFTFormUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.podftFormUpdateDate = value;
    }

    /**
     * Gets the value of the fatcaStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFATCAStatusDate() {
        return fatcaStatusDate;
    }

    /**
     * Sets the value of the fatcaStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFATCAStatusDate(JAXBElement<XMLGregorianCalendar> value) {
        this.fatcaStatusDate = value;
    }

    /**
     * Gets the value of the crsStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCRSStatusDate() {
        return crsStatusDate;
    }

    /**
     * Sets the value of the crsStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCRSStatusDate(JAXBElement<XMLGregorianCalendar> value) {
        this.crsStatusDate = value;
    }

    /**
     * Gets the value of the fatcaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getFATCAStatus() {
        return fatcaStatus;
    }

    /**
     * Sets the value of the fatcaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setFATCAStatus(IntegrationDictionaryRecordXType value) {
        this.fatcaStatus = value;
    }

    /**
     * Gets the value of the crsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getCRSStatus() {
        return crsStatus;
    }

    /**
     * Sets the value of the crsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setCRSStatus(IntegrationDictionaryRecordXType value) {
        this.crsStatus = value;
    }

}
