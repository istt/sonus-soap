/**
 * TrunkgroupGroupKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class TrunkgroupGroupKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String trunkgroupGroupId;

    public TrunkgroupGroupKey() {
    }

    public TrunkgroupGroupKey(
           java.lang.String trunkgroupGroupId) {
        this.trunkgroupGroupId = trunkgroupGroupId;
    }


    /**
     * Gets the trunkgroupGroupId value for this TrunkgroupGroupKey.
     * 
     * @return trunkgroupGroupId
     */
    public java.lang.String getTrunkgroupGroupId() {
        return trunkgroupGroupId;
    }


    /**
     * Sets the trunkgroupGroupId value for this TrunkgroupGroupKey.
     * 
     * @param trunkgroupGroupId
     */
    public void setTrunkgroupGroupId(java.lang.String trunkgroupGroupId) {
        this.trunkgroupGroupId = trunkgroupGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrunkgroupGroupKey)) return false;
        TrunkgroupGroupKey other = (TrunkgroupGroupKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trunkgroupGroupId==null && other.getTrunkgroupGroupId()==null) || 
             (this.trunkgroupGroupId!=null &&
              this.trunkgroupGroupId.equals(other.getTrunkgroupGroupId())));
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
        if (getTrunkgroupGroupId() != null) {
            _hashCode += getTrunkgroupGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrunkgroupGroupKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupGroupKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupGroupId"));
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
