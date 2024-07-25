
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.resp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип ответа сервиса публикации в ИС ПЗ данных по организации по факту изменения данных в CDI
 * 
 * <p>Java class for CdiPublishOrgISPZRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdiPublishOrgISPZRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorList" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/resp}ErrorListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdiPublishOrgISPZRespType", propOrder = {
    "errorList"
})
public class CdiPublishOrgISPZRespType {

    @XmlElement(name = "ErrorList", required = true)
    protected ErrorListType errorList;

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorListType }
     *     
     */
    public ErrorListType getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorListType }
     *     
     */
    public void setErrorList(ErrorListType value) {
        this.errorList = value;
    }

}
