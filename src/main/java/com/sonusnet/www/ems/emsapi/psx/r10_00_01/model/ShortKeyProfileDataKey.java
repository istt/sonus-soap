/**
 * ShortKeyProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class ShortKeyProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String shortKeyProfileId;

    private java.lang.String shortKeyCode;

    public ShortKeyProfileDataKey() {
    }

    public ShortKeyProfileDataKey(
           java.lang.String shortKeyProfileId,
           java.lang.String shortKeyCode) {
        this.shortKeyProfileId = shortKeyProfileId;
        this.shortKeyCode = shortKeyCode;
    }


    /**
     * Gets the shortKeyProfileId value for this ShortKeyProfileDataKey.
     * 
     * @return shortKeyProfileId
     */
    public java.lang.String getShortKeyProfileId() {
        return shortKeyProfileId;
    }


    /**
     * Sets the shortKeyProfileId value for this ShortKeyProfileDataKey.
     * 
     * @param shortKeyProfileId
     */
    public void setShortKeyProfileId(java.lang.String shortKeyProfileId) {
        this.shortKeyProfileId = shortKeyProfileId;
    }


    /**
     * Gets the shortKeyCode value for this ShortKeyProfileDataKey.
     * 
     * @return shortKeyCode
     */
    public java.lang.String getShortKeyCode() {
        return shortKeyCode;
    }


    /**
     * Sets the shortKeyCode value for this ShortKeyProfileDataKey.
     * 
     * @param shortKeyCode
     */
    public void setShortKeyCode(java.lang.String shortKeyCode) {
        this.shortKeyCode = shortKeyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShortKeyProfileDataKey)) return false;
        ShortKeyProfileDataKey other = (ShortKeyProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shortKeyProfileId==null && other.getShortKeyProfileId()==null) || 
             (this.shortKeyProfileId!=null &&
              this.shortKeyProfileId.equals(other.getShortKeyProfileId()))) &&
            ((this.shortKeyCode==null && other.getShortKeyCode()==null) || 
             (this.shortKeyCode!=null &&
              this.shortKeyCode.equals(other.getShortKeyCode())));
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
        if (getShortKeyProfileId() != null) {
            _hashCode += getShortKeyProfileId().hashCode();
        }
        if (getShortKeyCode() != null) {
            _hashCode += getShortKeyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShortKeyProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ShortKeyProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortKeyProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortKeyProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortKeyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortKeyCode"));
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
