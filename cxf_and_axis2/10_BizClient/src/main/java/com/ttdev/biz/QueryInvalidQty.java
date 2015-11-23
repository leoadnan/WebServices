
package com.ttdev.biz;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-23T11:15:48.490-08:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "invalidQty", targetNamespace = "http://foo.com")
public class QueryInvalidQty extends Exception {
    
    private int invalidQty;

    public QueryInvalidQty() {
        super();
    }
    
    public QueryInvalidQty(String message) {
        super(message);
    }
    
    public QueryInvalidQty(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryInvalidQty(String message, int invalidQty) {
        super(message);
        this.invalidQty = invalidQty;
    }

    public QueryInvalidQty(String message, int invalidQty, Throwable cause) {
        super(message, cause);
        this.invalidQty = invalidQty;
    }

    public int getFaultInfo() {
        return this.invalidQty;
    }
}
