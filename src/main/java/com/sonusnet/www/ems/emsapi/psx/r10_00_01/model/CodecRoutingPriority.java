/**
 * CodecRoutingPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class CodecRoutingPriority  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ingressCodecGroupId;

    private java.lang.String description;

    public CodecRoutingPriority() {
    }

    public CodecRoutingPriority(
           java.lang.String ingressCodecGroupId,
           java.lang.String description) {
        this.ingressCodecGroupId = ingressCodecGroupId;
        this.description = description;
    }


    /**
     * Gets the ingressCodecGroupId value for this CodecRoutingPriority.
     * 
     * @return ingressCodecGroupId
     */
    public java.lang.String getIngressCodecGroupId() {
        return ingressCodecGroupId;
    }


    /**
     * Sets the ingressCodecGroupId value for this CodecRoutingPriority.
     * 
     * @param ingressCodecGroupId
     */
    public void setIngressCodecGroupId(java.lang.String ingressCodecGroupId) {
        this.ingressCodecGroupId = ingressCodecGroupId;
    }


    /**
     * Gets the description value for this CodecRoutingPriority.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CodecRoutingPriority.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodecRoutingPriority)) return false;
        CodecRoutingPriority other = (CodecRoutingPriority) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ingressCodecGroupId==null && other.getIngressCodecGroupId()==null) || 
             (this.ingressCodecGroupId!=null &&
              this.ingressCodecGroupId.equals(other.getIngressCodecGroupId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getIngressCodecGroupId() != null) {
            _hashCode += getIngressCodecGroupId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodecRoutingPriority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecRoutingPriority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCodecGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCodecGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
