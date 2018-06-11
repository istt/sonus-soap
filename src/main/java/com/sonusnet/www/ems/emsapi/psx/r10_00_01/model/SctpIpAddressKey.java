/**
 * SctpIpAddressKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class SctpIpAddressKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String sctpIpAddressId;

    public SctpIpAddressKey() {
    }

    public SctpIpAddressKey(
           java.lang.String sctpIpAddressId) {
        this.sctpIpAddressId = sctpIpAddressId;
    }


    /**
     * Gets the sctpIpAddressId value for this SctpIpAddressKey.
     * 
     * @return sctpIpAddressId
     */
    public java.lang.String getSctpIpAddressId() {
        return sctpIpAddressId;
    }


    /**
     * Sets the sctpIpAddressId value for this SctpIpAddressKey.
     * 
     * @param sctpIpAddressId
     */
    public void setSctpIpAddressId(java.lang.String sctpIpAddressId) {
        this.sctpIpAddressId = sctpIpAddressId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SctpIpAddressKey)) return false;
        SctpIpAddressKey other = (SctpIpAddressKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sctpIpAddressId==null && other.getSctpIpAddressId()==null) || 
             (this.sctpIpAddressId!=null &&
              this.sctpIpAddressId.equals(other.getSctpIpAddressId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSctpIpAddressId() != null) {
            _hashCode += getSctpIpAddressId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SctpIpAddressKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpIpAddressKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sctpIpAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sctpIpAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
