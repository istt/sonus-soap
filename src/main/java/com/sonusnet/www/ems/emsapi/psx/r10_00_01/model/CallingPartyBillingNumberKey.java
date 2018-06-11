/**
 * CallingPartyBillingNumberKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class CallingPartyBillingNumberKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String callingBillingControlId;

    public CallingPartyBillingNumberKey() {
    }

    public CallingPartyBillingNumberKey(
           java.lang.String callingBillingControlId) {
        this.callingBillingControlId = callingBillingControlId;
    }


    /**
     * Gets the callingBillingControlId value for this CallingPartyBillingNumberKey.
     * 
     * @return callingBillingControlId
     */
    public java.lang.String getCallingBillingControlId() {
        return callingBillingControlId;
    }


    /**
     * Sets the callingBillingControlId value for this CallingPartyBillingNumberKey.
     * 
     * @param callingBillingControlId
     */
    public void setCallingBillingControlId(java.lang.String callingBillingControlId) {
        this.callingBillingControlId = callingBillingControlId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallingPartyBillingNumberKey)) return false;
        CallingPartyBillingNumberKey other = (CallingPartyBillingNumberKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callingBillingControlId==null && other.getCallingBillingControlId()==null) || 
             (this.callingBillingControlId!=null &&
              this.callingBillingControlId.equals(other.getCallingBillingControlId())));
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
        if (getCallingBillingControlId() != null) {
            _hashCode += getCallingBillingControlId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallingPartyBillingNumberKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingPartyBillingNumberKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingBillingControlId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingBillingControlId"));
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
