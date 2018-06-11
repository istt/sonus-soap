/**
 * TgCosProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class TgCosProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String tgCosProfileId;

    private java.lang.String ingressTgCos;

    private java.lang.String egressTgCos;

    public TgCosProfileKey() {
    }

    public TgCosProfileKey(
           java.lang.String tgCosProfileId,
           java.lang.String ingressTgCos,
           java.lang.String egressTgCos) {
        this.tgCosProfileId = tgCosProfileId;
        this.ingressTgCos = ingressTgCos;
        this.egressTgCos = egressTgCos;
    }


    /**
     * Gets the tgCosProfileId value for this TgCosProfileKey.
     * 
     * @return tgCosProfileId
     */
    public java.lang.String getTgCosProfileId() {
        return tgCosProfileId;
    }


    /**
     * Sets the tgCosProfileId value for this TgCosProfileKey.
     * 
     * @param tgCosProfileId
     */
    public void setTgCosProfileId(java.lang.String tgCosProfileId) {
        this.tgCosProfileId = tgCosProfileId;
    }


    /**
     * Gets the ingressTgCos value for this TgCosProfileKey.
     * 
     * @return ingressTgCos
     */
    public java.lang.String getIngressTgCos() {
        return ingressTgCos;
    }


    /**
     * Sets the ingressTgCos value for this TgCosProfileKey.
     * 
     * @param ingressTgCos
     */
    public void setIngressTgCos(java.lang.String ingressTgCos) {
        this.ingressTgCos = ingressTgCos;
    }


    /**
     * Gets the egressTgCos value for this TgCosProfileKey.
     * 
     * @return egressTgCos
     */
    public java.lang.String getEgressTgCos() {
        return egressTgCos;
    }


    /**
     * Sets the egressTgCos value for this TgCosProfileKey.
     * 
     * @param egressTgCos
     */
    public void setEgressTgCos(java.lang.String egressTgCos) {
        this.egressTgCos = egressTgCos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TgCosProfileKey)) return false;
        TgCosProfileKey other = (TgCosProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tgCosProfileId==null && other.getTgCosProfileId()==null) || 
             (this.tgCosProfileId!=null &&
              this.tgCosProfileId.equals(other.getTgCosProfileId()))) &&
            ((this.ingressTgCos==null && other.getIngressTgCos()==null) || 
             (this.ingressTgCos!=null &&
              this.ingressTgCos.equals(other.getIngressTgCos()))) &&
            ((this.egressTgCos==null && other.getEgressTgCos()==null) || 
             (this.egressTgCos!=null &&
              this.egressTgCos.equals(other.getEgressTgCos())));
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
        if (getTgCosProfileId() != null) {
            _hashCode += getTgCosProfileId().hashCode();
        }
        if (getIngressTgCos() != null) {
            _hashCode += getIngressTgCos().hashCode();
        }
        if (getEgressTgCos() != null) {
            _hashCode += getEgressTgCos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TgCosProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TgCosProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tgCosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tgCosProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressTgCos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressTgCos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressTgCos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressTgCos"));
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
