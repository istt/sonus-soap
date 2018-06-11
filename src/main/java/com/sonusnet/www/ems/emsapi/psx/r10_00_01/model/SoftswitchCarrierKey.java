/**
 * SoftswitchCarrierKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class SoftswitchCarrierKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String softswitchId;

    private java.lang.String carrierId;

    public SoftswitchCarrierKey() {
    }

    public SoftswitchCarrierKey(
           java.lang.String softswitchId,
           java.lang.String carrierId) {
        this.softswitchId = softswitchId;
        this.carrierId = carrierId;
    }


    /**
     * Gets the softswitchId value for this SoftswitchCarrierKey.
     * 
     * @return softswitchId
     */
    public java.lang.String getSoftswitchId() {
        return softswitchId;
    }


    /**
     * Sets the softswitchId value for this SoftswitchCarrierKey.
     * 
     * @param softswitchId
     */
    public void setSoftswitchId(java.lang.String softswitchId) {
        this.softswitchId = softswitchId;
    }


    /**
     * Gets the carrierId value for this SoftswitchCarrierKey.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this SoftswitchCarrierKey.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoftswitchCarrierKey)) return false;
        SoftswitchCarrierKey other = (SoftswitchCarrierKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.softswitchId==null && other.getSoftswitchId()==null) || 
             (this.softswitchId!=null &&
              this.softswitchId.equals(other.getSoftswitchId()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId())));
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
        if (getSoftswitchId() != null) {
            _hashCode += getSoftswitchId().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoftswitchCarrierKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SoftswitchCarrierKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softswitchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "softswitchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
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
