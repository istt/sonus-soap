/**
 * ChargeRateProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class ChargeRateProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String chargeRateProfileId;

    private java.lang.String timeRangeProfileId;

    public ChargeRateProfileDataKey() {
    }

    public ChargeRateProfileDataKey(
           java.lang.String chargeRateProfileId,
           java.lang.String timeRangeProfileId) {
        this.chargeRateProfileId = chargeRateProfileId;
        this.timeRangeProfileId = timeRangeProfileId;
    }


    /**
     * Gets the chargeRateProfileId value for this ChargeRateProfileDataKey.
     * 
     * @return chargeRateProfileId
     */
    public java.lang.String getChargeRateProfileId() {
        return chargeRateProfileId;
    }


    /**
     * Sets the chargeRateProfileId value for this ChargeRateProfileDataKey.
     * 
     * @param chargeRateProfileId
     */
    public void setChargeRateProfileId(java.lang.String chargeRateProfileId) {
        this.chargeRateProfileId = chargeRateProfileId;
    }


    /**
     * Gets the timeRangeProfileId value for this ChargeRateProfileDataKey.
     * 
     * @return timeRangeProfileId
     */
    public java.lang.String getTimeRangeProfileId() {
        return timeRangeProfileId;
    }


    /**
     * Sets the timeRangeProfileId value for this ChargeRateProfileDataKey.
     * 
     * @param timeRangeProfileId
     */
    public void setTimeRangeProfileId(java.lang.String timeRangeProfileId) {
        this.timeRangeProfileId = timeRangeProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeRateProfileDataKey)) return false;
        ChargeRateProfileDataKey other = (ChargeRateProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeRateProfileId==null && other.getChargeRateProfileId()==null) || 
             (this.chargeRateProfileId!=null &&
              this.chargeRateProfileId.equals(other.getChargeRateProfileId()))) &&
            ((this.timeRangeProfileId==null && other.getTimeRangeProfileId()==null) || 
             (this.timeRangeProfileId!=null &&
              this.timeRangeProfileId.equals(other.getTimeRangeProfileId())));
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
        if (getChargeRateProfileId() != null) {
            _hashCode += getChargeRateProfileId().hashCode();
        }
        if (getTimeRangeProfileId() != null) {
            _hashCode += getTimeRangeProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeRateProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeRateProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeRateProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRangeProfileId"));
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
