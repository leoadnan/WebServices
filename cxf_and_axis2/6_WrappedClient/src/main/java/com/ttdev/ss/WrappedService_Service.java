package com.ttdev.ss;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-21T21:04:02.002-08:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "WrappedService", 
                  wsdlLocation = "src/main/resources/SimpleService.wsdl",
                  targetNamespace = "http://ttdev.com/ss") 
public class WrappedService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ttdev.com/ss", "WrappedService");
    public final static QName P1 = new QName("http://ttdev.com/ss", "p1");
    static {
    	URL url = null;    	
    	try {
            url = new URL("file:src/main/resources/SimpleService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:src/main/resources/SimpleService.wsdl");
            // e.printStackTrace();
        }        
        WSDL_LOCATION = url;
    }

    public WrappedService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WrappedService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WrappedService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns WrappedService
     */
    @WebEndpoint(name = "p1")
    public WrappedService getP1() {
        return super.getPort(P1, WrappedService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WrappedService
     */
    @WebEndpoint(name = "p1")
    public WrappedService getP1(WebServiceFeature... features) {
        return super.getPort(P1, WrappedService.class, features);
    }

}
