/**
 * TrafficControlEscapeDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class TrafficControlEscapeDataKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String tcEscapeProfileId;

    private java.lang.Integer escapeType;

    private java.lang.Integer escapeData;

    public TrafficControlEscapeDataKey() {
    }

    public TrafficControlEscapeDataKey(
           java.lang.String tcEscapeProfileId,
           java.lang.Integer escapeType,
           java.lang.Integer escapeData) {
        this.tcEscapeProfileId = tcEscapeProfileId;
        this.escapeType = escapeType;
        this.escapeData = escapeData;
    }


    /**
     * Gets the tcEscapeProfileId value for this TrafficControlEscapeDataKey.
     * 
     * @return tcEscapeProfileId
     */
    public java.lang.String getTcEscapeProfileId() {
        return tcEscapeProfileId;
    }


    /**
     * Sets the tcEscapeProfileId value for this TrafficControlEscapeDataKey.
     * 
     * @param tcEscapeProfileId
     */
    public void setTcEscapeProfileId(java.lang.String tcEscapeProfileId) {
        this.tcEscapeProfileId = tcEscapeProfileId;
    }


    /**
     * Gets the escapeType value for this TrafficControlEscapeDataKey.
     * 
     * @return escapeType
     */
    public java.lang.Integer getEscapeType() {
        return escapeType;
    }


    /**
     * Sets the escapeType value for this TrafficControlEscapeDataKey.
     * 
     * @param escapeType
     */
    public void setEscapeType(java.lang.Integer escapeType) {
        this.escapeType = escapeType;
    }


    /**
     * Gets the escapeData value for this TrafficControlEscapeDataKey.
     * 
     * @return escapeData
     */
    public java.lang.Integer getEscapeData() {
        return escapeData;
    }


    /**
     * Sets the escapeData value for this TrafficControlEscapeDataKey.
     * 
     * @param escapeData
     */
    public void setEscapeData(java.lang.Integer escapeData) {
        this.escapeData = escapeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficControlEscapeDataKey)) return false;
        TrafficControlEscapeDataKey other = (TrafficControlEscapeDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tcEscapeProfileId==null && other.getTcEscapeProfileId()==null) || 
             (this.tcEscapeProfileId!=null &&
              this.tcEscapeProfileId.equals(other.getTcEscapeProfileId()))) &&
            ((this.escapeType==null && other.getEscapeType()==null) || 
             (this.escapeType!=null &&
              this.escapeType.equals(other.getEscapeType()))) &&
            ((this.escapeData==null && other.getEscapeData()==null) || 
             (this.escapeData!=null &&
              this.escapeData.equals(other.getEscapeData())));
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
        if (getTcEscapeProfileId() != null) {
            _hashCode += getTcEscapeProfileId().hashCode();
        }
        if (getEscapeType() != null) {
            _hashCode += getEscapeType().hashCode();
        }
        if (getEscapeData() != null) {
            _hashCode += getEscapeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficControlEscapeDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlEscapeDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcEscapeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcEscapeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escapeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escapeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
