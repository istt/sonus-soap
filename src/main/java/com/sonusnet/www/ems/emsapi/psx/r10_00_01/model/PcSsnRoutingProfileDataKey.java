/**
 * PcSsnRoutingProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class PcSsnRoutingProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String pcSsnProfileId;

    private java.lang.Integer priority;

    public PcSsnRoutingProfileDataKey() {
    }

    public PcSsnRoutingProfileDataKey(
           java.lang.String pcSsnProfileId,
           java.lang.Integer priority) {
        this.pcSsnProfileId = pcSsnProfileId;
        this.priority = priority;
    }


    /**
     * Gets the pcSsnProfileId value for this PcSsnRoutingProfileDataKey.
     * 
     * @return pcSsnProfileId
     */
    public java.lang.String getPcSsnProfileId() {
        return pcSsnProfileId;
    }


    /**
     * Sets the pcSsnProfileId value for this PcSsnRoutingProfileDataKey.
     * 
     * @param pcSsnProfileId
     */
    public void setPcSsnProfileId(java.lang.String pcSsnProfileId) {
        this.pcSsnProfileId = pcSsnProfileId;
    }


    /**
     * Gets the priority value for this PcSsnRoutingProfileDataKey.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PcSsnRoutingProfileDataKey.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcSsnRoutingProfileDataKey)) return false;
        PcSsnRoutingProfileDataKey other = (PcSsnRoutingProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pcSsnProfileId==null && other.getPcSsnProfileId()==null) || 
             (this.pcSsnProfileId!=null &&
              this.pcSsnProfileId.equals(other.getPcSsnProfileId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getPcSsnProfileId() != null) {
            _hashCode += getPcSsnProfileId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcSsnRoutingProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PcSsnRoutingProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcSsnProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcSsnProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
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
