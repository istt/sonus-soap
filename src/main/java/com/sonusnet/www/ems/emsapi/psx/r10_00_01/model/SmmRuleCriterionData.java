/**
 * SmmRuleCriterionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class SmmRuleCriterionData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String smmRuleId;

    private java.lang.String criterionId;

    private java.lang.Short criterionIndex;

    public SmmRuleCriterionData() {
    }

    public SmmRuleCriterionData(
           java.lang.String smmRuleId,
           java.lang.String criterionId,
           java.lang.Short criterionIndex) {
        this.smmRuleId = smmRuleId;
        this.criterionId = criterionId;
        this.criterionIndex = criterionIndex;
    }


    /**
     * Gets the smmRuleId value for this SmmRuleCriterionData.
     * 
     * @return smmRuleId
     */
    public java.lang.String getSmmRuleId() {
        return smmRuleId;
    }


    /**
     * Sets the smmRuleId value for this SmmRuleCriterionData.
     * 
     * @param smmRuleId
     */
    public void setSmmRuleId(java.lang.String smmRuleId) {
        this.smmRuleId = smmRuleId;
    }


    /**
     * Gets the criterionId value for this SmmRuleCriterionData.
     * 
     * @return criterionId
     */
    public java.lang.String getCriterionId() {
        return criterionId;
    }


    /**
     * Sets the criterionId value for this SmmRuleCriterionData.
     * 
     * @param criterionId
     */
    public void setCriterionId(java.lang.String criterionId) {
        this.criterionId = criterionId;
    }


    /**
     * Gets the criterionIndex value for this SmmRuleCriterionData.
     * 
     * @return criterionIndex
     */
    public java.lang.Short getCriterionIndex() {
        return criterionIndex;
    }


    /**
     * Sets the criterionIndex value for this SmmRuleCriterionData.
     * 
     * @param criterionIndex
     */
    public void setCriterionIndex(java.lang.Short criterionIndex) {
        this.criterionIndex = criterionIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmRuleCriterionData)) return false;
        SmmRuleCriterionData other = (SmmRuleCriterionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmRuleId==null && other.getSmmRuleId()==null) || 
             (this.smmRuleId!=null &&
              this.smmRuleId.equals(other.getSmmRuleId()))) &&
            ((this.criterionId==null && other.getCriterionId()==null) || 
             (this.criterionId!=null &&
              this.criterionId.equals(other.getCriterionId()))) &&
            ((this.criterionIndex==null && other.getCriterionIndex()==null) || 
             (this.criterionIndex!=null &&
              this.criterionIndex.equals(other.getCriterionIndex())));
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
        if (getSmmRuleId() != null) {
            _hashCode += getSmmRuleId().hashCode();
        }
        if (getCriterionId() != null) {
            _hashCode += getCriterionId().hashCode();
        }
        if (getCriterionIndex() != null) {
            _hashCode += getCriterionIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmRuleCriterionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRuleCriterionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterionIndex"));
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
