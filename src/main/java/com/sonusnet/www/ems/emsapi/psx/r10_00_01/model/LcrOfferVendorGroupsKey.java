/**
 * LcrOfferVendorGroupsKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class LcrOfferVendorGroupsKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String offerId;

    private java.lang.String vendorGroupId;

    public LcrOfferVendorGroupsKey() {
    }

    public LcrOfferVendorGroupsKey(
           java.lang.String offerId,
           java.lang.String vendorGroupId) {
        this.offerId = offerId;
        this.vendorGroupId = vendorGroupId;
    }


    /**
     * Gets the offerId value for this LcrOfferVendorGroupsKey.
     * 
     * @return offerId
     */
    public java.lang.String getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this LcrOfferVendorGroupsKey.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.String offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the vendorGroupId value for this LcrOfferVendorGroupsKey.
     * 
     * @return vendorGroupId
     */
    public java.lang.String getVendorGroupId() {
        return vendorGroupId;
    }


    /**
     * Sets the vendorGroupId value for this LcrOfferVendorGroupsKey.
     * 
     * @param vendorGroupId
     */
    public void setVendorGroupId(java.lang.String vendorGroupId) {
        this.vendorGroupId = vendorGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrOfferVendorGroupsKey)) return false;
        LcrOfferVendorGroupsKey other = (LcrOfferVendorGroupsKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.vendorGroupId==null && other.getVendorGroupId()==null) || 
             (this.vendorGroupId!=null &&
              this.vendorGroupId.equals(other.getVendorGroupId())));
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
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getVendorGroupId() != null) {
            _hashCode += getVendorGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrOfferVendorGroupsKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferVendorGroupsKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorGroupId"));
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
