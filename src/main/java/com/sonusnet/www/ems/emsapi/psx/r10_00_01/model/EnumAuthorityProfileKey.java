/**
 * EnumAuthorityProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class EnumAuthorityProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String enumAuthProfileId;

    public EnumAuthorityProfileKey() {
    }

    public EnumAuthorityProfileKey(
           java.lang.String enumAuthProfileId) {
        this.enumAuthProfileId = enumAuthProfileId;
    }


    /**
     * Gets the enumAuthProfileId value for this EnumAuthorityProfileKey.
     * 
     * @return enumAuthProfileId
     */
    public java.lang.String getEnumAuthProfileId() {
        return enumAuthProfileId;
    }


    /**
     * Sets the enumAuthProfileId value for this EnumAuthorityProfileKey.
     * 
     * @param enumAuthProfileId
     */
    public void setEnumAuthProfileId(java.lang.String enumAuthProfileId) {
        this.enumAuthProfileId = enumAuthProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumAuthorityProfileKey)) return false;
        EnumAuthorityProfileKey other = (EnumAuthorityProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumAuthProfileId==null && other.getEnumAuthProfileId()==null) || 
             (this.enumAuthProfileId!=null &&
              this.enumAuthProfileId.equals(other.getEnumAuthProfileId())));
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
        if (getEnumAuthProfileId() != null) {
            _hashCode += getEnumAuthProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumAuthorityProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumAuthorityProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumAuthProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumAuthProfileId"));
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
