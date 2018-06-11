/**
 * LocalCallingAreaKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class LocalCallingAreaKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String callingArea;

    private java.lang.Short localFlag;

    public LocalCallingAreaKey() {
    }

    public LocalCallingAreaKey(
           java.lang.String callingArea,
           java.lang.Short localFlag) {
        this.callingArea = callingArea;
        this.localFlag = localFlag;
    }


    /**
     * Gets the callingArea value for this LocalCallingAreaKey.
     * 
     * @return callingArea
     */
    public java.lang.String getCallingArea() {
        return callingArea;
    }


    /**
     * Sets the callingArea value for this LocalCallingAreaKey.
     * 
     * @param callingArea
     */
    public void setCallingArea(java.lang.String callingArea) {
        this.callingArea = callingArea;
    }


    /**
     * Gets the localFlag value for this LocalCallingAreaKey.
     * 
     * @return localFlag
     */
    public java.lang.Short getLocalFlag() {
        return localFlag;
    }


    /**
     * Sets the localFlag value for this LocalCallingAreaKey.
     * 
     * @param localFlag
     */
    public void setLocalFlag(java.lang.Short localFlag) {
        this.localFlag = localFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalCallingAreaKey)) return false;
        LocalCallingAreaKey other = (LocalCallingAreaKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callingArea==null && other.getCallingArea()==null) || 
             (this.callingArea!=null &&
              this.callingArea.equals(other.getCallingArea()))) &&
            ((this.localFlag==null && other.getLocalFlag()==null) || 
             (this.localFlag!=null &&
              this.localFlag.equals(other.getLocalFlag())));
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
        if (getCallingArea() != null) {
            _hashCode += getCallingArea().hashCode();
        }
        if (getLocalFlag() != null) {
            _hashCode += getLocalFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalCallingAreaKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localFlag"));
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
