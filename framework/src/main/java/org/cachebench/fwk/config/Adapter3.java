//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.04 at 01:06:46 AM EET 
//


package org.cachebench.fwk.config;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.cachebench.fwk.config.ConfigHelper.parseString(value));
    }

    public String marshal(String value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
