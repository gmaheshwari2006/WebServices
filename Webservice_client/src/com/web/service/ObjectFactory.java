
package com.web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.web.service package. 
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

    private final static QName _CompanyTernOver_QNAME = new QName("http://service.web.com/", "companyTernOver");
    private final static QName _CompanyTernOverResponse_QNAME = new QName("http://service.web.com/", "companyTernOverResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyTernOverResponse }
     * 
     */
    public CompanyTernOverResponse createCompanyTernOverResponse() {
        return new CompanyTernOverResponse();
    }

    /**
     * Create an instance of {@link CompanyTernOver }
     * 
     */
    public CompanyTernOver createCompanyTernOver() {
        return new CompanyTernOver();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyTernOver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com/", name = "companyTernOver")
    public JAXBElement<CompanyTernOver> createCompanyTernOver(CompanyTernOver value) {
        return new JAXBElement<CompanyTernOver>(_CompanyTernOver_QNAME, CompanyTernOver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyTernOverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com/", name = "companyTernOverResponse")
    public JAXBElement<CompanyTernOverResponse> createCompanyTernOverResponse(CompanyTernOverResponse value) {
        return new JAXBElement<CompanyTernOverResponse>(_CompanyTernOverResponse_QNAME, CompanyTernOverResponse.class, null, value);
    }

}
