/**
 * AutoRecallProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class AutoRecallProfileData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String autoRecallProfileId;

    private java.lang.Integer calledNoa;

    private java.lang.String businessGroupId;

    private java.lang.String businessLocationId;

    private java.lang.Integer calledNumberLength;

    private java.lang.String prefixDigits;

    public AutoRecallProfileData() {
    }

    public AutoRecallProfileData(
           java.lang.String autoRecallProfileId,
           java.lang.Integer calledNoa,
           java.lang.String businessGroupId,
           java.lang.String businessLocationId,
           java.lang.Integer calledNumberLength,
           java.lang.String prefixDigits) {
        this.autoRecallProfileId = autoRecallProfileId;
        this.calledNoa = calledNoa;
        this.businessGroupId = businessGroupId;
        this.businessLocationId = businessLocationId;
        this.calledNumberLength = calledNumberLength;
        this.prefixDigits = prefixDigits;
    }


    /**
     * Gets the autoRecallProfileId value for this AutoRecallProfileData.
     * 
     * @return autoRecallProfileId
     */
    public java.lang.String getAutoRecallProfileId() {
        return autoRecallProfileId;
    }


    /**
     * Sets the autoRecallProfileId value for this AutoRecallProfileData.
     * 
     * @param autoRecallProfileId
     */
    public void setAutoRecallProfileId(java.lang.String autoRecallProfileId) {
        this.autoRecallProfileId = autoRecallProfileId;
    }


    /**
     * Gets the calledNoa value for this AutoRecallProfileData.
     * 
     * @return calledNoa
     */
    public java.lang.Integer getCalledNoa() {
        return calledNoa;
    }


    /**
     * Sets the calledNoa value for this AutoRecallProfileData.
     * 
     * @param calledNoa
     */
    public void setCalledNoa(java.lang.Integer calledNoa) {
        this.calledNoa = calledNoa;
    }


    /**
     * Gets the businessGroupId value for this AutoRecallProfileData.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this AutoRecallProfileData.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the businessLocationId value for this AutoRecallProfileData.
     * 
     * @return businessLocationId
     */
    public java.lang.String getBusinessLocationId() {
        return businessLocationId;
    }


    /**
     * Sets the businessLocationId value for this AutoRecallProfileData.
     * 
     * @param businessLocationId
     */
    public void setBusinessLocationId(java.lang.String businessLocationId) {
        this.businessLocationId = businessLocationId;
    }


    /**
     * Gets the calledNumberLength value for this AutoRecallProfileData.
     * 
     * @return calledNumberLength
     */
    public java.lang.Integer getCalledNumberLength() {
        return calledNumberLength;
    }


    /**
     * Sets the calledNumberLength value for this AutoRecallProfileData.
     * 
     * @param calledNumberLength
     */
    public void setCalledNumberLength(java.lang.Integer calledNumberLength) {
        this.calledNumberLength = calledNumberLength;
    }


    /**
     * Gets the prefixDigits value for this AutoRecallProfileData.
     * 
     * @return prefixDigits
     */
    public java.lang.String getPrefixDigits() {
        return prefixDigits;
    }


    /**
     * Sets the prefixDigits value for this AutoRecallProfileData.
     * 
     * @param prefixDigits
     */
    public void setPrefixDigits(java.lang.String prefixDigits) {
        this.prefixDigits = prefixDigits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoRecallProfileData)) return false;
        AutoRecallProfileData other = (AutoRecallProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoRecallProfileId==null && other.getAutoRecallProfileId()==null) || 
             (this.autoRecallProfileId!=null &&
              this.autoRecallProfileId.equals(other.getAutoRecallProfileId()))) &&
            ((this.calledNoa==null && other.getCalledNoa()==null) || 
             (this.calledNoa!=null &&
              this.calledNoa.equals(other.getCalledNoa()))) &&
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.businessLocationId==null && other.getBusinessLocationId()==null) || 
             (this.businessLocationId!=null &&
              this.businessLocationId.equals(other.getBusinessLocationId()))) &&
            ((this.calledNumberLength==null && other.getCalledNumberLength()==null) || 
             (this.calledNumberLength!=null &&
              this.calledNumberLength.equals(other.getCalledNumberLength()))) &&
            ((this.prefixDigits==null && other.getPrefixDigits()==null) || 
             (this.prefixDigits!=null &&
              this.prefixDigits.equals(other.getPrefixDigits())));
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
        if (getAutoRecallProfileId() != null) {
            _hashCode += getAutoRecallProfileId().hashCode();
        }
        if (getCalledNoa() != null) {
            _hashCode += getCalledNoa().hashCode();
        }
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getBusinessLocationId() != null) {
            _hashCode += getBusinessLocationId().hashCode();
        }
        if (getCalledNumberLength() != null) {
            _hashCode += getCalledNumberLength().hashCode();
        }
        if (getPrefixDigits() != null) {
            _hashCode += getPrefixDigits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoRecallProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AutoRecallProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRecallProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoRecallProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNumberLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNumberLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixDigits"));
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
