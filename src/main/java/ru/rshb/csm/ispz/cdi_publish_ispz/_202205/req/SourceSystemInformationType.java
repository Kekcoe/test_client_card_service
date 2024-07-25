
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация по системам источникам
 * 
 * <p>Java class for SourceSystemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceSystemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceSystemCode" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationDictionaryRecordXType"/&gt;
 *         &lt;element name="SourceSystemId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationSymbolicIdentifierXType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceSystemInformationType", propOrder = {
    "sourceSystemCode",
    "sourceSystemId"
})
public class SourceSystemInformationType {

    @XmlElement(name = "SourceSystemCode", required = true)
    protected IntegrationDictionaryRecordXType sourceSystemCode;
    @XmlElement(name = "SourceSystemId")
    protected IntegrationSymbolicIdentifierXType sourceSystemId;

    /**
     * Gets the value of the sourceSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public IntegrationDictionaryRecordXType getSourceSystemCode() {
        return sourceSystemCode;
    }

    /**
     * Sets the value of the sourceSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDictionaryRecordXType }
     *     
     */
    public void setSourceSystemCode(IntegrationDictionaryRecordXType value) {
        this.sourceSystemCode = value;
    }

    /**
     * Gets the value of the sourceSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public IntegrationSymbolicIdentifierXType getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSymbolicIdentifierXType }
     *     
     */
    public void setSourceSystemId(IntegrationSymbolicIdentifierXType value) {
        this.sourceSystemId = value;
    }

}
