
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationRecordXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationRecordXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecordTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SystemNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TransformationMarker" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationRecordXType", propOrder = {
    "recordCode",
    "recordTitle",
    "note",
    "systemId",
    "systemNodeId"
})
@XmlSeeAlso({
    IntegrationDictionaryRecordXType.class
})
public class IntegrationRecordXType {

    @XmlElement(name = "RecordCode", required = true)
    protected String recordCode;
    @XmlElement(name = "RecordTitle")
    protected String recordTitle;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "SystemId")
    protected String systemId;
    @XmlElement(name = "SystemNodeId")
    protected String systemNodeId;
    @XmlAttribute(name = "TransformationMarker")
    protected Boolean transformationMarker;

    /**
     * Gets the value of the recordCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCode() {
        return recordCode;
    }

    /**
     * Sets the value of the recordCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCode(String value) {
        this.recordCode = value;
    }

    /**
     * Gets the value of the recordTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTitle() {
        return recordTitle;
    }

    /**
     * Sets the value of the recordTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTitle(String value) {
        this.recordTitle = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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

    /**
     * Gets the value of the transformationMarker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTransformationMarker() {
        if (transformationMarker == null) {
            return false;
        } else {
            return transformationMarker;
        }
    }

    /**
     * Sets the value of the transformationMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransformationMarker(Boolean value) {
        this.transformationMarker = value;
    }

}
