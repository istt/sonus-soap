/**
 * HomeDomainLookup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class HomeDomainLookup  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String callProcessingElement1Id;

    private java.lang.String callProcessingElement2Id;

    private java.lang.String callProcessingElement3Id;

    private java.lang.String callProcessingElement4Id;

    private java.lang.Short callProcessingElementType;

    private java.lang.String homeDomainGroupId;

    public HomeDomainLookup() {
    }

    public HomeDomainLookup(
           java.lang.String callProcessingElement1Id,
           java.lang.String callProcessingElement2Id,
           java.lang.String callProcessingElement3Id,
           java.lang.String callProcessingElement4Id,
           java.lang.Short callProcessingElementType,
           java.lang.String homeDomainGroupId) {
        this.callProcessingElement1Id = callProcessingElement1Id;
        this.callProcessingElement2Id = callProcessingElement2Id;
        this.callProcessingElement3Id = callProcessingElement3Id;
        this.callProcessingElement4Id = callProcessingElement4Id;
        this.callProcessingElementType = callProcessingElementType;
        this.homeDomainGroupId = homeDomainGroupId;
    }


    /**
     * Gets the callProcessingElement1Id value for this HomeDomainLookup.
     * 
     * @return callProcessingElement1Id
     */
    public java.lang.String getCallProcessingElement1Id() {
        return callProcessingElement1Id;
    }


    /**
     * Sets the callProcessingElement1Id value for this HomeDomainLookup.
     * 
     * @param callProcessingElement1Id
     */
    public void setCallProcessingElement1Id(java.lang.String callProcessingElement1Id) {
        this.callProcessingElement1Id = callProcessingElement1Id;
    }


    /**
     * Gets the callProcessingElement2Id value for this HomeDomainLookup.
     * 
     * @return callProcessingElement2Id
     */
    public java.lang.String getCallProcessingElement2Id() {
        return callProcessingElement2Id;
    }


    /**
     * Sets the callProcessingElement2Id value for this HomeDomainLookup.
     * 
     * @param callProcessingElement2Id
     */
    public void setCallProcessingElement2Id(java.lang.String callProcessingElement2Id) {
        this.callProcessingElement2Id = callProcessingElement2Id;
    }


    /**
     * Gets the callProcessingElement3Id value for this HomeDomainLookup.
     * 
     * @return callProcessingElement3Id
     */
    public java.lang.String getCallProcessingElement3Id() {
        return callProcessingElement3Id;
    }


    /**
     * Sets the callProcessingElement3Id value for this HomeDomainLookup.
     * 
     * @param callProcessingElement3Id
     */
    public void setCallProcessingElement3Id(java.lang.String callProcessingElement3Id) {
        this.callProcessingElement3Id = callProcessingElement3Id;
    }


    /**
     * Gets the callProcessingElement4Id value for this HomeDomainLookup.
     * 
     * @return callProcessingElement4Id
     */
    public java.lang.String getCallProcessingElement4Id() {
        return callProcessingElement4Id;
    }


    /**
     * Sets the callProcessingElement4Id value for this HomeDomainLookup.
     * 
     * @param callProcessingElement4Id
     */
    public void setCallProcessingElement4Id(java.lang.String callProcessingElement4Id) {
        this.callProcessingElement4Id = callProcessingElement4Id;
    }


    /**
     * Gets the callProcessingElementType value for this HomeDomainLookup.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Short getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this HomeDomainLookup.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Short callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the homeDomainGroupId value for this HomeDomainLookup.
     * 
     * @return homeDomainGroupId
     */
    public java.lang.String getHomeDomainGroupId() {
        return homeDomainGroupId;
    }


    /**
     * Sets the homeDomainGroupId value for this HomeDomainLookup.
     * 
     * @param homeDomainGroupId
     */
    public void setHomeDomainGroupId(java.lang.String homeDomainGroupId) {
        this.homeDomainGroupId = homeDomainGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeDomainLookup)) return false;
        HomeDomainLookup other = (HomeDomainLookup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callProcessingElement1Id==null && other.getCallProcessingElement1Id()==null) || 
             (this.callProcessingElement1Id!=null &&
              this.callProcessingElement1Id.equals(other.getCallProcessingElement1Id()))) &&
            ((this.callProcessingElement2Id==null && other.getCallProcessingElement2Id()==null) || 
             (this.callProcessingElement2Id!=null &&
              this.callProcessingElement2Id.equals(other.getCallProcessingElement2Id()))) &&
            ((this.callProcessingElement3Id==null && other.getCallProcessingElement3Id()==null) || 
             (this.callProcessingElement3Id!=null &&
              this.callProcessingElement3Id.equals(other.getCallProcessingElement3Id()))) &&
            ((this.callProcessingElement4Id==null && other.getCallProcessingElement4Id()==null) || 
             (this.callProcessingElement4Id!=null &&
              this.callProcessingElement4Id.equals(other.getCallProcessingElement4Id()))) &&
            ((this.callProcessingElementType==null && other.getCallProcessingElementType()==null) || 
             (this.callProcessingElementType!=null &&
              this.callProcessingElementType.equals(other.getCallProcessingElementType()))) &&
            ((this.homeDomainGroupId==null && other.getHomeDomainGroupId()==null) || 
             (this.homeDomainGroupId!=null &&
              this.homeDomainGroupId.equals(other.getHomeDomainGroupId())));
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
        if (getCallProcessingElement1Id() != null) {
            _hashCode += getCallProcessingElement1Id().hashCode();
        }
        if (getCallProcessingElement2Id() != null) {
            _hashCode += getCallProcessingElement2Id().hashCode();
        }
        if (getCallProcessingElement3Id() != null) {
            _hashCode += getCallProcessingElement3Id().hashCode();
        }
        if (getCallProcessingElement4Id() != null) {
            _hashCode += getCallProcessingElement4Id().hashCode();
        }
        if (getCallProcessingElementType() != null) {
            _hashCode += getCallProcessingElementType().hashCode();
        }
        if (getHomeDomainGroupId() != null) {
            _hashCode += getHomeDomainGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeDomainLookup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainLookup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement3Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement4Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement4Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDomainGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeDomainGroupId"));
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
