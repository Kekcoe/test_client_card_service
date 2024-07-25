
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Список кросс-ссылок
 * 
 * <p>Java class for ExtIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtIdListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtId" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}ExtIdType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtIdListType", propOrder = {
    "extId"
})
public class ExtIdListType {

    @XmlElement(name = "ExtId", required = true)
    protected List<ExtIdType> extId;

    /**
     * Gets the value of the extId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtIdType }
     * 
     * 
     */
    public List<ExtIdType> getExtId() {
        if (extId == null) {
            extId = new ArrayList<ExtIdType>();
        }
        return this.extId;
    }

}
