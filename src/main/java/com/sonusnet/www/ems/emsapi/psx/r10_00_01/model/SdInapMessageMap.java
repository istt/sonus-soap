/**
 * SdInapMessageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class SdInapMessageMap  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.Integer inapOperationCode;

    private java.lang.String inapMessageId;

    public SdInapMessageMap() {
    }

    public SdInapMessageMap(
           java.lang.String serviceId,
           java.lang.Integer inapOperationCode,
           java.lang.String inapMessageId) {
        this.serviceId = serviceId;
        this.inapOperationCode = inapOperationCode;
        this.inapMessageId = inapMessageId;
    }


    /**
     * Gets the serviceId value for this SdInapMessageMap.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdInapMessageMap.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the inapOperationCode value for this SdInapMessageMap.
     * 
     * @return inapOperationCode
     */
    public java.lang.Integer getInapOperationCode() {
        return inapOperationCode;
    }


    /**
     * Sets the inapOperationCode value for this SdInapMessageMap.
     * 
     * @param inapOperationCode
     */
    public void setInapOperationCode(java.lang.Integer inapOperationCode) {
        this.inapOperationCode = inapOperationCode;
    }


    /**
     * Gets the inapMessageId value for this SdInapMessageMap.
     * 
     * @return inapMessageId
     */
    public java.lang.String getInapMessageId() {
        return inapMessageId;
    }


    /**
     * Sets the inapMessageId value for this SdInapMessageMap.
     * 
     * @param inapMessageId
     */
    public void setInapMessageId(java.lang.String inapMessageId) {
        this.inapMessageId = inapMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdInapMessageMap)) return false;
        SdInapMessageMap other = (SdInapMessageMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.inapOperationCode==null && other.getInapOperationCode()==null) || 
             (this.inapOperationCode!=null &&
              this.inapOperationCode.equals(other.getInapOperationCode()))) &&
            ((this.inapMessageId==null && other.getInapMessageId()==null) || 
             (this.inapMessageId!=null &&
              this.inapMessageId.equals(other.getInapMessageId())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getInapOperationCode() != null) {
            _hashCode += getInapOperationCode().hashCode();
        }
        if (getInapMessageId() != null) {
            _hashCode += getInapMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdInapMessageMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdInapMessageMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapMessageId"));
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
