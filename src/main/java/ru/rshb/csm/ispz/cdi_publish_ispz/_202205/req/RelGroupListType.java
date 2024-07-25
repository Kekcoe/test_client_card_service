
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Список связи субъектов и группы компаний
 * 
 * <p>Java class for RelGroupListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelGroupListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelGroup" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelGroupType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelGroupListType", propOrder = {
    "relGroup"
})
public class RelGroupListType {

    @XmlElement(name = "RelGroup", required = true)
    protected List<RelGroupType> relGroup;

    /**
     * Gets the value of the relGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelGroupType }
     * 
     * 
     */
    public List<RelGroupType> getRelGroup() {
        if (relGroup == null) {
            relGroup = new ArrayList<RelGroupType>();
        }
        return this.relGroup;
    }

}
