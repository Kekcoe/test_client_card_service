
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Интеграционный символьный идентификатор с поддержкой распределенной
 *                 системы (может хранить информацию об системе/приложении, а также об ее
 *                 узле/экземпляре, в контексте которого существует идентификатор)
 * 
 * <p>Java class for IntegrationSymbolicIdentifierXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationSymbolicIdentifierXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SystemNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationSymbolicIdentifierXType", propOrder = {
    "objectId",
    "systemId",
    "systemNodeId"
})
public class IntegrationSymbolicIdentifierXType {

    @XmlElement(name = "ObjectId", required = true)
    protected String objectId;
    @XmlElement(name = "SystemId")
    protected String systemId;
    @XmlElement(name = "SystemNodeId")
    protected String systemNodeId;

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Gets the value of the systemNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNodeId() {
        return systemNodeId;
    }

    /**
     * Sets the value of the systemNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemNodeId(String value) {
        this.systemNodeId = value;
    }

}
