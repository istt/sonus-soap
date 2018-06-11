/**
 * PrefixTypeKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class PrefixTypeKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Short prefixTypeId;

    public PrefixTypeKey() {
    }

    public PrefixTypeKey(
           java.lang.Short prefixTypeId) {
        this.prefixTypeId = prefixTypeId;
    }


    /**
     * Gets the prefixTypeId value for this PrefixTypeKey.
     * 
     * @return prefixTypeId
     */
    public java.lang.Short getPrefixTypeId() {
        return prefixTypeId;
    }


    /**
     * Sets the prefixTypeId value for this PrefixTypeKey.
     * 
     * @param prefixTypeId
     */
    public void setPrefixTypeId(java.lang.Short prefixTypeId) {
        this.prefixTypeId = prefixTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrefixTypeKey)) return false;
        PrefixTypeKey other = (PrefixTypeKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prefixTypeId==null && other.getPrefixTypeId()==null) || 
             (this.prefixTypeId!=null &&
              this.prefixTypeId.equals(other.getPrefixTypeId())));
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
        if (getPrefixTypeId() != null) {
            _hashCode += getPrefixTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrefixTypeKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixTypeKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
