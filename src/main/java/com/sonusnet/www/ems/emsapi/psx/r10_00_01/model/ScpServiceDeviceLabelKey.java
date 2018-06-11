/**
 * ScpServiceDeviceLabelKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class ScpServiceDeviceLabelKey  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.String processManager;

    private java.lang.String processConfiguration;

    public ScpServiceDeviceLabelKey() {
    }

    public ScpServiceDeviceLabelKey(
           java.lang.String serviceId,
           java.lang.String processManager,
           java.lang.String processConfiguration) {
        this.serviceId = serviceId;
        this.processManager = processManager;
        this.processConfiguration = processConfiguration;
    }


    /**
     * Gets the serviceId value for this ScpServiceDeviceLabelKey.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ScpServiceDeviceLabelKey.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the processManager value for this ScpServiceDeviceLabelKey.
     * 
     * @return processManager
     */
    public java.lang.String getProcessManager() {
        return processManager;
    }


    /**
     * Sets the processManager value for this ScpServiceDeviceLabelKey.
     * 
     * @param processManager
     */
    public void setProcessManager(java.lang.String processManager) {
        this.processManager = processManager;
    }


    /**
     * Gets the processConfiguration value for this ScpServiceDeviceLabelKey.
     * 
     * @return processConfiguration
     */
    public java.lang.String getProcessConfiguration() {
        return processConfiguration;
    }


    /**
     * Sets the processConfiguration value for this ScpServiceDeviceLabelKey.
     * 
     * @param processConfiguration
     */
    public void setProcessConfiguration(java.lang.String processConfiguration) {
        this.processConfiguration = processConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpServiceDeviceLabelKey)) return false;
        ScpServiceDeviceLabelKey other = (ScpServiceDeviceLabelKey) obj;
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
            ((this.processManager==null && other.getProcessManager()==null) || 
             (this.processManager!=null &&
              this.processManager.equals(other.getProcessManager()))) &&
            ((this.processConfiguration==null && other.getProcessConfiguration()==null) || 
             (this.processConfiguration!=null &&
              this.processConfiguration.equals(other.getProcessConfiguration())));
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
        if (getProcessManager() != null) {
            _hashCode += getProcessManager().hashCode();
        }
        if (getProcessConfiguration() != null) {
            _hashCode += getProcessConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpServiceDeviceLabelKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpServiceDeviceLabelKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processManager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processConfiguration"));
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
