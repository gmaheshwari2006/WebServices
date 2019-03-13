
package com.web.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RemoteCompanyService", targetNamespace = "http://impl.service.web.com/", wsdlLocation = "http://localhost:8080/web/service?wsdl")
public class RemoteCompanyService
    extends Service
{

    private final static URL REMOTECOMPANYSERVICE_WSDL_LOCATION;
    private final static WebServiceException REMOTECOMPANYSERVICE_EXCEPTION;
    private final static QName REMOTECOMPANYSERVICE_QNAME = new QName("http://impl.service.web.com/", "RemoteCompanyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/web/service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REMOTECOMPANYSERVICE_WSDL_LOCATION = url;
        REMOTECOMPANYSERVICE_EXCEPTION = e;
    }

    public RemoteCompanyService() {
        super(__getWsdlLocation(), REMOTECOMPANYSERVICE_QNAME);
    }

    public RemoteCompanyService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REMOTECOMPANYSERVICE_QNAME, features);
    }

    public RemoteCompanyService(URL wsdlLocation) {
        super(wsdlLocation, REMOTECOMPANYSERVICE_QNAME);
    }

    public RemoteCompanyService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REMOTECOMPANYSERVICE_QNAME, features);
    }

    public RemoteCompanyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemoteCompanyService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IRemoteCompany
     */
    @WebEndpoint(name = "RemoteCompanyPort")
    public IRemoteCompany getRemoteCompanyPort() {
        return super.getPort(new QName("http://impl.service.web.com/", "RemoteCompanyPort"), IRemoteCompany.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRemoteCompany
     */
    @WebEndpoint(name = "RemoteCompanyPort")
    public IRemoteCompany getRemoteCompanyPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.web.com/", "RemoteCompanyPort"), IRemoteCompany.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REMOTECOMPANYSERVICE_EXCEPTION!= null) {
            throw REMOTECOMPANYSERVICE_EXCEPTION;
        }
        return REMOTECOMPANYSERVICE_WSDL_LOCATION;
    }

}
