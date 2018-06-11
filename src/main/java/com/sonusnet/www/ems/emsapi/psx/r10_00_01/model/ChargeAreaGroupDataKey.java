/**
 * ChargeAreaGroupDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class ChargeAreaGroupDataKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String chargeAreaGroupId;

    private java.lang.String chargeArea;

    public ChargeAreaGroupDataKey() {
    }

    public ChargeAreaGroupDataKey(
           java.lang.String chargeAreaGroupId,
           java.lang.String chargeArea) {
        this.chargeAreaGroupId = chargeAreaGroupId;
        this.chargeArea = chargeArea;
    }


    /**
     * Gets the chargeAreaGroupId value for this ChargeAreaGroupDataKey.
     * 
     * @return chargeAreaGroupId
     */
    public java.lang.String getChargeAreaGroupId() {
        return chargeAreaGroupId;
    }


    /**
     * Sets the chargeAreaGroupId value for this ChargeAreaGroupDataKey.
     * 
     * @param chargeAreaGroupId
     */
    public void setChargeAreaGroupId(java.lang.String chargeAreaGroupId) {
        this.chargeAreaGroupId = chargeAreaGroupId;
    }


    /**
     * Gets the chargeArea value for this ChargeAreaGroupDataKey.
     * 
     * @return chargeArea
     */
    public java.lang.String getChargeArea() {
        return chargeArea;
    }


    /**
     * Sets the chargeArea value for this ChargeAreaGroupDataKey.
     * 
     * @param chargeArea
     */
    public void setChargeArea(java.lang.String chargeArea) {
        this.chargeArea = chargeArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeAreaGroupDataKey)) return false;
        ChargeAreaGroupDataKey other = (ChargeAreaGroupDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeAreaGroupId==null && other.getChargeAreaGroupId()==null) || 
             (this.chargeAreaGroupId!=null &&
              this.chargeAreaGroupId.equals(other.getChargeAreaGroupId()))) &&
            ((this.chargeArea==null && other.getChargeArea()==null) || 
             (this.chargeArea!=null &&
              this.chargeArea.equals(other.getChargeArea())));
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
        if (getChargeAreaGroupId() != null) {
            _hashCode += getChargeAreaGroupId().hashCode();
        }
        if (getChargeArea() != null) {
            _hashCode += getChargeArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeAreaGroupDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeAreaGroupDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAreaGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeAreaGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeArea"));
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
