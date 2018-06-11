/**
 * DtmfProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class DtmfProfileData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String dtmfProfileId;

    private java.lang.String dtmfDigitKey;

    private java.lang.Short dtmfAction;

    private java.lang.String scriptId;

    public DtmfProfileData() {
    }

    public DtmfProfileData(
           java.lang.String dtmfProfileId,
           java.lang.String dtmfDigitKey,
           java.lang.Short dtmfAction,
           java.lang.String scriptId) {
        this.dtmfProfileId = dtmfProfileId;
        this.dtmfDigitKey = dtmfDigitKey;
        this.dtmfAction = dtmfAction;
        this.scriptId = scriptId;
    }


    /**
     * Gets the dtmfProfileId value for this DtmfProfileData.
     * 
     * @return dtmfProfileId
     */
    public java.lang.String getDtmfProfileId() {
        return dtmfProfileId;
    }


    /**
     * Sets the dtmfProfileId value for this DtmfProfileData.
     * 
     * @param dtmfProfileId
     */
    public void setDtmfProfileId(java.lang.String dtmfProfileId) {
        this.dtmfProfileId = dtmfProfileId;
    }


    /**
     * Gets the dtmfDigitKey value for this DtmfProfileData.
     * 
     * @return dtmfDigitKey
     */
    public java.lang.String getDtmfDigitKey() {
        return dtmfDigitKey;
    }


    /**
     * Sets the dtmfDigitKey value for this DtmfProfileData.
     * 
     * @param dtmfDigitKey
     */
    public void setDtmfDigitKey(java.lang.String dtmfDigitKey) {
        this.dtmfDigitKey = dtmfDigitKey;
    }


    /**
     * Gets the dtmfAction value for this DtmfProfileData.
     * 
     * @return dtmfAction
     */
    public java.lang.Short getDtmfAction() {
        return dtmfAction;
    }


    /**
     * Sets the dtmfAction value for this DtmfProfileData.
     * 
     * @param dtmfAction
     */
    public void setDtmfAction(java.lang.Short dtmfAction) {
        this.dtmfAction = dtmfAction;
    }


    /**
     * Gets the scriptId value for this DtmfProfileData.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this DtmfProfileData.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtmfProfileData)) return false;
        DtmfProfileData other = (DtmfProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dtmfProfileId==null && other.getDtmfProfileId()==null) || 
             (this.dtmfProfileId!=null &&
              this.dtmfProfileId.equals(other.getDtmfProfileId()))) &&
            ((this.dtmfDigitKey==null && other.getDtmfDigitKey()==null) || 
             (this.dtmfDigitKey!=null &&
              this.dtmfDigitKey.equals(other.getDtmfDigitKey()))) &&
            ((this.dtmfAction==null && other.getDtmfAction()==null) || 
             (this.dtmfAction!=null &&
              this.dtmfAction.equals(other.getDtmfAction()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId())));
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
        if (getDtmfProfileId() != null) {
            _hashCode += getDtmfProfileId().hashCode();
        }
        if (getDtmfDigitKey() != null) {
            _hashCode += getDtmfDigitKey().hashCode();
        }
        if (getDtmfAction() != null) {
            _hashCode += getDtmfAction().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtmfProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DtmfProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtmfProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtmfProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtmfDigitKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtmfDigitKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtmfAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtmfAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptId"));
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
