
package com.ttdev.sp;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-26T09:58:13.703-08:00
 * Generated source version: 2.7.8
 * 
 */
 
public class StatProducer_P1_Server{

    protected StatProducer_P1_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new StatProducerImpl();
        String address = "http://localhost:8080/sp/p1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new StatProducer_P1_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
