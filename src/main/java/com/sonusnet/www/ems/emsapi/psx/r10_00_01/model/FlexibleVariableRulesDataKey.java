/**
 * FlexibleVariableRulesDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class FlexibleVariableRulesDataKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String flexibleVariableRuleId;

    private java.lang.Short flexibleVariable;

    private java.lang.Short lookupType;

    public FlexibleVariableRulesDataKey() {
    }

    public FlexibleVariableRulesDataKey(
           java.lang.String flexibleVariableRuleId,
           java.lang.Short flexibleVariable,
           java.lang.Short lookupType) {
        this.flexibleVariableRuleId = flexibleVariableRuleId;
        this.flexibleVariable = flexibleVariable;
        this.lookupType = lookupType;
    }


    /**
     * Gets the flexibleVariableRuleId value for this FlexibleVariableRulesDataKey.
     * 
     * @return flexibleVariableRuleId
     */
    public java.lang.String getFlexibleVariableRuleId() {
        return flexibleVariableRuleId;
    }


    /**
     * Sets the flexibleVariableRuleId value for this FlexibleVariableRulesDataKey.
     * 
     * @param flexibleVariableRuleId
     */
    public void setFlexibleVariableRuleId(java.lang.String flexibleVariableRuleId) {
        this.flexibleVariableRuleId = flexibleVariableRuleId;
    }


    /**
     * Gets the flexibleVariable value for this FlexibleVariableRulesDataKey.
     * 
     * @return flexibleVariable
     */
    public java.lang.Short getFlexibleVariable() {
        return flexibleVariable;
    }


    /**
     * Sets the flexibleVariable value for this FlexibleVariableRulesDataKey.
     * 
     * @param flexibleVariable
     */
    public void setFlexibleVariable(java.lang.Short flexibleVariable) {
        this.flexibleVariable = flexibleVariable;
    }


    /**
     * Gets the lookupType value for this FlexibleVariableRulesDataKey.
     * 
     * @return lookupType
     */
    public java.lang.Short getLookupType() {
        return lookupType;
    }


    /**
     * Sets the lookupType value for this FlexibleVariableRulesDataKey.
     * 
     * @param lookupType
     */
    public void setLookupType(java.lang.Short lookupType) {
        this.lookupType = lookupType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexibleVariableRulesDataKey)) return false;
        FlexibleVariableRulesDataKey other = (FlexibleVariableRulesDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flexibleVariableRuleId==null && other.getFlexibleVariableRuleId()==null) || 
             (this.flexibleVariableRuleId!=null &&
              this.flexibleVariableRuleId.equals(other.getFlexibleVariableRuleId()))) &&
            ((this.flexibleVariable==null && other.getFlexibleVariable()==null) || 
             (this.flexibleVariable!=null &&
              this.flexibleVariable.equals(other.getFlexibleVariable()))) &&
            ((this.lookupType==null && other.getLookupType()==null) || 
             (this.lookupType!=null &&
              this.lookupType.equals(other.getLookupType())));
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
        if (getFlexibleVariableRuleId() != null) {
            _hashCode += getFlexibleVariableRuleId().hashCode();
        }
        if (getFlexibleVariable() != null) {
            _hashCode += getFlexibleVariable().hashCode();
        }
        if (getLookupType() != null) {
            _hashCode += getLookupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexibleVariableRulesDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FlexibleVariableRulesDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexibleVariableRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flexibleVariableRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexibleVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flexibleVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookupType"));
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
