
package com.ttdev.sc;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-26T09:58:13.799-08:00
 * Generated source version: 2.7.8
 * 
 */
public final class StatConsumer_P1_Client {

    private static final QName SERVICE_NAME = new QName("http://ttdev.com/sc", "StatConsumer");

    private StatConsumer_P1_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = StatConsumer_Service.WSDL_LOCATION;
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
      
        StatConsumer_Service ss = new StatConsumer_Service(wsdlURL, SERVICE_NAME);
        StatConsumer port = ss.getP1();  
        
        {
        System.out.println("Invoking putStatistics...");
        java.lang.String _putStatistics_parameters = "";
        port.putStatistics(_putStatistics_parameters);


        }

        System.exit(0);
    }

}
