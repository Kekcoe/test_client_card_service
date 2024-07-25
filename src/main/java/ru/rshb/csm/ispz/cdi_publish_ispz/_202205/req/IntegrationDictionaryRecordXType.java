
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип используемый для передачи значений справочника, которые подлежат трансформации. Маркер трансформации заполняется адартером.
 * 
 * <p>Java class for IntegrationDictionaryRecordXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationDictionaryRecordXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}IntegrationRecordXType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DictionaryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationDictionaryRecordXType", propOrder = {
    "desc",
    "dictionaryCode"
})
public class IntegrationDictionaryRecordXType
    extends IntegrationRecordXType
{

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "DictionaryCode")
    protected String dictionaryCode;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the dictionaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryCode() {
        return dictionaryCode;
    }

    /**
     * Sets the value of the dictionaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryCode(String value) {
        this.dictionaryCode = value;
    }

}
