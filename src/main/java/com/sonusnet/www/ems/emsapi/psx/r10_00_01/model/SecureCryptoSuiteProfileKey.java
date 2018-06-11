/**
 * SecureCryptoSuiteProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class SecureCryptoSuiteProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String securityCryptoSuiteId;

    public SecureCryptoSuiteProfileKey() {
    }

    public SecureCryptoSuiteProfileKey(
           java.lang.String securityCryptoSuiteId) {
        this.securityCryptoSuiteId = securityCryptoSuiteId;
    }


    /**
     * Gets the securityCryptoSuiteId value for this SecureCryptoSuiteProfileKey.
     * 
     * @return securityCryptoSuiteId
     */
    public java.lang.String getSecurityCryptoSuiteId() {
        return securityCryptoSuiteId;
    }


    /**
     * Sets the securityCryptoSuiteId value for this SecureCryptoSuiteProfileKey.
     * 
     * @param securityCryptoSuiteId
     */
    public void setSecurityCryptoSuiteId(java.lang.String securityCryptoSuiteId) {
        this.securityCryptoSuiteId = securityCryptoSuiteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecureCryptoSuiteProfileKey)) return false;
        SecureCryptoSuiteProfileKey other = (SecureCryptoSuiteProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.securityCryptoSuiteId==null && other.getSecurityCryptoSuiteId()==null) || 
             (this.securityCryptoSuiteId!=null &&
              this.securityCryptoSuiteId.equals(other.getSecurityCryptoSuiteId())));
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
        if (getSecurityCryptoSuiteId() != null) {
            _hashCode += getSecurityCryptoSuiteId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecureCryptoSuiteProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SecureCryptoSuiteProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityCryptoSuiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityCryptoSuiteId"));
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
