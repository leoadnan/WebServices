package com.ttdev.biz;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-23T11:15:48.508-08:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://foo.com", name = "BizService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BizService {

    @WebResult(name = "productQueryResult", targetNamespace = "http://foo.com", partName = "parameters")
    @WebMethod(action = "http://foo.com/query")
    public ProductQueryResultComplexType query(
        @WebParam(partName = "parameters", name = "productQuery", targetNamespace = "http://foo.com")
        ProductQueryComplexType parameters
    ) throws QueryInvalidQty, QueryInvalidProductId;
}
