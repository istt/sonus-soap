/**
 * ScpPartitionMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class ScpPartitionMap  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String scpPartitionId;

    private java.lang.String partitionId;

    private java.lang.String pprPartitionId;

    public ScpPartitionMap() {
    }

    public ScpPartitionMap(
           java.lang.String scpPartitionId,
           java.lang.String partitionId,
           java.lang.String pprPartitionId) {
        this.scpPartitionId = scpPartitionId;
        this.partitionId = partitionId;
        this.pprPartitionId = pprPartitionId;
    }


    /**
     * Gets the scpPartitionId value for this ScpPartitionMap.
     * 
     * @return scpPartitionId
     */
    public java.lang.String getScpPartitionId() {
        return scpPartitionId;
    }


    /**
     * Sets the scpPartitionId value for this ScpPartitionMap.
     * 
     * @param scpPartitionId
     */
    public void setScpPartitionId(java.lang.String scpPartitionId) {
        this.scpPartitionId = scpPartitionId;
    }


    /**
     * Gets the partitionId value for this ScpPartitionMap.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this ScpPartitionMap.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the pprPartitionId value for this ScpPartitionMap.
     * 
     * @return pprPartitionId
     */
    public java.lang.String getPprPartitionId() {
        return pprPartitionId;
    }


    /**
     * Sets the pprPartitionId value for this ScpPartitionMap.
     * 
     * @param pprPartitionId
     */
    public void setPprPartitionId(java.lang.String pprPartitionId) {
        this.pprPartitionId = pprPartitionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpPartitionMap)) return false;
        ScpPartitionMap other = (ScpPartitionMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scpPartitionId==null && other.getScpPartitionId()==null) || 
             (this.scpPartitionId!=null &&
              this.scpPartitionId.equals(other.getScpPartitionId()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.pprPartitionId==null && other.getPprPartitionId()==null) || 
             (this.pprPartitionId!=null &&
              this.pprPartitionId.equals(other.getPprPartitionId())));
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
        if (getScpPartitionId() != null) {
            _hashCode += getScpPartitionId().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getPprPartitionId() != null) {
            _hashCode += getPprPartitionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpPartitionMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpPartitionMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpPartitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpPartitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pprPartitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pprPartitionId"));
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
