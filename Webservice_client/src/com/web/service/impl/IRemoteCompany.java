
package com.web.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.web.service.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IRemoteCompany", targetNamespace = "http://service.web.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRemoteCompany {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "companyTernOver", targetNamespace = "http://service.web.com/", className = "com.web.service.CompanyTernOver")
    @ResponseWrapper(localName = "companyTernOverResponse", targetNamespace = "http://service.web.com/", className = "com.web.service.CompanyTernOverResponse")
    @Action(input = "http://service.web.com/IRemoteCompany/companyTernOverRequest", output = "http://service.web.com/IRemoteCompany/companyTernOverResponse")
    public int companyTernOver(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
