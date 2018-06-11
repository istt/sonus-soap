/**
 * PolicyProfileGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class PolicyProfileGroupData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String policyProfileGroupId;

    private java.lang.Integer sequence;

    private java.lang.String policyProfileId;

    public PolicyProfileGroupData() {
    }

    public PolicyProfileGroupData(
           java.lang.String policyProfileGroupId,
           java.lang.Integer sequence,
           java.lang.String policyProfileId) {
        this.policyProfileGroupId = policyProfileGroupId;
        this.sequence = sequence;
        this.policyProfileId = policyProfileId;
    }


    /**
     * Gets the policyProfileGroupId value for this PolicyProfileGroupData.
     * 
     * @return policyProfileGroupId
     */
    public java.lang.String getPolicyProfileGroupId() {
        return policyProfileGroupId;
    }


    /**
     * Sets the policyProfileGroupId value for this PolicyProfileGroupData.
     * 
     * @param policyProfileGroupId
     */
    public void setPolicyProfileGroupId(java.lang.String policyProfileGroupId) {
        this.policyProfileGroupId = policyProfileGroupId;
    }


    /**
     * Gets the sequence value for this PolicyProfileGroupData.
     * 
     * @return sequence
     */
    public java.lang.Integer getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PolicyProfileGroupData.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.Integer sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the policyProfileId value for this PolicyProfileGroupData.
     * 
     * @return policyProfileId
     */
    public java.lang.String getPolicyProfileId() {
        return policyProfileId;
    }


    /**
     * Sets the policyProfileId value for this PolicyProfileGroupData.
     * 
     * @param policyProfileId
     */
    public void setPolicyProfileId(java.lang.String policyProfileId) {
        this.policyProfileId = policyProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyProfileGroupData)) return false;
        PolicyProfileGroupData other = (PolicyProfileGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.policyProfileGroupId==null && other.getPolicyProfileGroupId()==null) || 
             (this.policyProfileGroupId!=null &&
              this.policyProfileGroupId.equals(other.getPolicyProfileGroupId()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.policyProfileId==null && other.getPolicyProfileId()==null) || 
             (this.policyProfileId!=null &&
              this.policyProfileId.equals(other.getPolicyProfileId())));
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
        if (getPolicyProfileGroupId() != null) {
            _hashCode += getPolicyProfileGroupId().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getPolicyProfileId() != null) {
            _hashCode += getPolicyProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyProfileGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfileGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyProfileGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyProfileGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyProfileId"));
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
