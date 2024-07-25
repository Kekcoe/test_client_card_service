
package ru.rshb.csm.ispz.cdi_publish_ispz._202205.resp;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.rshb.csm.ispz.cdi_publish_org_ispz._202205.resp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CdiPublishOrgISPZResp_QNAME = new QName("http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/resp", "CdiPublishOrgISPZResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.rshb.csm.ispz.cdi_publish_org_ispz._202205.resp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CdiPublishOrgISPZRespType }
     * 
     */
    public CdiPublishOrgISPZRespType createCdiPublishOrgISPZRespType() {
        return new CdiPublishOrgISPZRespType();
    }

    /**
     * Create an instance of {@link ErrorListType }
     * 
     */
    public ErrorListType createErrorListType() {
        return new ErrorListType();
    }

    /**
     * Create an instance of {@link IntegrationSimpleErrorDataType }
     * 
     */
    public IntegrationSimpleErrorDataType createIntegrationSimpleErrorDataType() {
        return new IntegrationSimpleErrorDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CdiPublishOrgISPZRespType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CdiPublishOrgISPZRespType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rshb.ru/csm/ispz/cdi_publish_org_ispz/202205/resp", name = "CdiPublishOrgISPZResp")
    public JAXBElement<CdiPublishOrgISPZRespType> createCdiPublishOrgISPZResp(CdiPublishOrgISPZRespType value) {
        return new JAXBElement<CdiPublishOrgISPZRespType>(_CdiPublishOrgISPZResp_QNAME, CdiPublishOrgISPZRespType.class, null, value);
    }

}
