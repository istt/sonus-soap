/**
 * HifraudCountryLabelProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class HifraudCountryLabelProfile  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String blockingProfileId;

    public HifraudCountryLabelProfile() {
    }

    public HifraudCountryLabelProfile(
           java.lang.String blockingProfileId) {
        this.blockingProfileId = blockingProfileId;
    }


    /**
     * Gets the blockingProfileId value for this HifraudCountryLabelProfile.
     * 
     * @return blockingProfileId
     */
    public java.lang.String getBlockingProfileId() {
        return blockingProfileId;
    }


    /**
     * Sets the blockingProfileId value for this HifraudCountryLabelProfile.
     * 
     * @param blockingProfileId
     */
    public void setBlockingProfileId(java.lang.String blockingProfileId) {
        this.blockingProfileId = blockingProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HifraudCountryLabelProfile)) return false;
        HifraudCountryLabelProfile other = (HifraudCountryLabelProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blockingProfileId==null && other.getBlockingProfileId()==null) || 
             (this.blockingProfileId!=null &&
              this.blockingProfileId.equals(other.getBlockingProfileId())));
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
        if (getBlockingProfileId() != null) {
            _hashCode += getBlockingProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HifraudCountryLabelProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HifraudCountryLabelProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockingProfileId"));
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
