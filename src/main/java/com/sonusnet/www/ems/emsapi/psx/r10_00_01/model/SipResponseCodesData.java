/**
 * SipResponseCodesData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class SipResponseCodesData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipRcProfileId;

    private java.lang.Short sipRecvRespCode;

    private java.lang.Short sipConvRespCode;

    public SipResponseCodesData() {
    }

    public SipResponseCodesData(
           java.lang.String sipRcProfileId,
           java.lang.Short sipRecvRespCode,
           java.lang.Short sipConvRespCode) {
        this.sipRcProfileId = sipRcProfileId;
        this.sipRecvRespCode = sipRecvRespCode;
        this.sipConvRespCode = sipConvRespCode;
    }


    /**
     * Gets the sipRcProfileId value for this SipResponseCodesData.
     * 
     * @return sipRcProfileId
     */
    public java.lang.String getSipRcProfileId() {
        return sipRcProfileId;
    }


    /**
     * Sets the sipRcProfileId value for this SipResponseCodesData.
     * 
     * @param sipRcProfileId
     */
    public void setSipRcProfileId(java.lang.String sipRcProfileId) {
        this.sipRcProfileId = sipRcProfileId;
    }


    /**
     * Gets the sipRecvRespCode value for this SipResponseCodesData.
     * 
     * @return sipRecvRespCode
     */
    public java.lang.Short getSipRecvRespCode() {
        return sipRecvRespCode;
    }


    /**
     * Sets the sipRecvRespCode value for this SipResponseCodesData.
     * 
     * @param sipRecvRespCode
     */
    public void setSipRecvRespCode(java.lang.Short sipRecvRespCode) {
        this.sipRecvRespCode = sipRecvRespCode;
    }


    /**
     * Gets the sipConvRespCode value for this SipResponseCodesData.
     * 
     * @return sipConvRespCode
     */
    public java.lang.Short getSipConvRespCode() {
        return sipConvRespCode;
    }


    /**
     * Sets the sipConvRespCode value for this SipResponseCodesData.
     * 
     * @param sipConvRespCode
     */
    public void setSipConvRespCode(java.lang.Short sipConvRespCode) {
        this.sipConvRespCode = sipConvRespCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipResponseCodesData)) return false;
        SipResponseCodesData other = (SipResponseCodesData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipRcProfileId==null && other.getSipRcProfileId()==null) || 
             (this.sipRcProfileId!=null &&
              this.sipRcProfileId.equals(other.getSipRcProfileId()))) &&
            ((this.sipRecvRespCode==null && other.getSipRecvRespCode()==null) || 
             (this.sipRecvRespCode!=null &&
              this.sipRecvRespCode.equals(other.getSipRecvRespCode()))) &&
            ((this.sipConvRespCode==null && other.getSipConvRespCode()==null) || 
             (this.sipConvRespCode!=null &&
              this.sipConvRespCode.equals(other.getSipConvRespCode())));
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
        if (getSipRcProfileId() != null) {
            _hashCode += getSipRcProfileId().hashCode();
        }
        if (getSipRecvRespCode() != null) {
            _hashCode += getSipRecvRespCode().hashCode();
        }
        if (getSipConvRespCode() != null) {
            _hashCode += getSipConvRespCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipResponseCodesData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipResponseCodesData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRecvRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRecvRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipConvRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipConvRespCode"));
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
