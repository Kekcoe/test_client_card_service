
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.req;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Список связи субъектов и ОКВЭД
 * 
 * <p>Java class for RelOkvedListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelOkvedListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelOkved" type="{http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/req}RelOkvedType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelOkvedListType", propOrder = {
    "relOkved"
})
public class RelOkvedListType {

    @XmlElement(name = "RelOkved", required = true)
    protected List<RelOkvedType> relOkved;

    /**
     * Gets the value of the relOkved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relOkved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelOkved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelOkvedType }
     * 
     * 
     */
    public List<RelOkvedType> getRelOkved() {
        if (relOkved == null) {
            relOkved = new ArrayList<RelOkvedType>();
        }
        return this.relOkved;
    }

}
