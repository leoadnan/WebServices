
package com.ttdev.service.img;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.binding.soap.SoapBinding;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-23T14:03:57.222-08:00
 * Generated source version: 2.7.8
 * 
 */
public final class ImageService_P1_Client {

    private static final QName SERVICE_NAME = new QName("urn:ttdev.com:service/img", "ImageService");

    private ImageService_P1_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ImageService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ImageService_Service ss = new ImageService_Service(wsdlURL, SERVICE_NAME);
        ImageService port = ss.getP1();  
        BindingProvider bp = (BindingProvider)port;
        Map<String, Object> context = bp.getRequestContext();
        context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:1234/is/p1");
        
        Binding binding = bp.getBinding();
        SOAPBinding soapBinding = (SOAPBinding)binding;
        soapBinding.setMTOMEnabled(true);
        
        {
        System.out.println("Invoking uploadImage...");
        java.lang.String _uploadImage_productId = "p01";
        FileDataSource ds = new FileDataSource("src/main/resources/p01.png");
        port.uploadImage(_uploadImage_productId, new DataHandler(ds));


        }

        System.exit(0);
    }

}
