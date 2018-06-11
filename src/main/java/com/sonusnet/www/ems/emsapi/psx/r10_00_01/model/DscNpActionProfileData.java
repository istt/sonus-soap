/**
 * DscNpActionProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class DscNpActionProfileData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String dscNpActionProfileId;

    private java.lang.String apc;

    private java.lang.String opc;

    private java.lang.Short apcFormat;

    private java.lang.Short opcFormat;

    private java.lang.Short npAction;

    public DscNpActionProfileData() {
    }

    public DscNpActionProfileData(
           java.lang.String dscNpActionProfileId,
           java.lang.String apc,
           java.lang.String opc,
           java.lang.Short apcFormat,
           java.lang.Short opcFormat,
           java.lang.Short npAction) {
        this.dscNpActionProfileId = dscNpActionProfileId;
        this.apc = apc;
        this.opc = opc;
        this.apcFormat = apcFormat;
        this.opcFormat = opcFormat;
        this.npAction = npAction;
    }


    /**
     * Gets the dscNpActionProfileId value for this DscNpActionProfileData.
     * 
     * @return dscNpActionProfileId
     */
    public java.lang.String getDscNpActionProfileId() {
        return dscNpActionProfileId;
    }


    /**
     * Sets the dscNpActionProfileId value for this DscNpActionProfileData.
     * 
     * @param dscNpActionProfileId
     */
    public void setDscNpActionProfileId(java.lang.String dscNpActionProfileId) {
        this.dscNpActionProfileId = dscNpActionProfileId;
    }


    /**
     * Gets the apc value for this DscNpActionProfileData.
     * 
     * @return apc
     */
    public java.lang.String getApc() {
        return apc;
    }


    /**
     * Sets the apc value for this DscNpActionProfileData.
     * 
     * @param apc
     */
    public void setApc(java.lang.String apc) {
        this.apc = apc;
    }


    /**
     * Gets the opc value for this DscNpActionProfileData.
     * 
     * @return opc
     */
    public java.lang.String getOpc() {
        return opc;
    }


    /**
     * Sets the opc value for this DscNpActionProfileData.
     * 
     * @param opc
     */
    public void setOpc(java.lang.String opc) {
        this.opc = opc;
    }


    /**
     * Gets the apcFormat value for this DscNpActionProfileData.
     * 
     * @return apcFormat
     */
    public java.lang.Short getApcFormat() {
        return apcFormat;
    }


    /**
     * Sets the apcFormat value for this DscNpActionProfileData.
     * 
     * @param apcFormat
     */
    public void setApcFormat(java.lang.Short apcFormat) {
        this.apcFormat = apcFormat;
    }


    /**
     * Gets the opcFormat value for this DscNpActionProfileData.
     * 
     * @return opcFormat
     */
    public java.lang.Short getOpcFormat() {
        return opcFormat;
    }


    /**
     * Sets the opcFormat value for this DscNpActionProfileData.
     * 
     * @param opcFormat
     */
    public void setOpcFormat(java.lang.Short opcFormat) {
        this.opcFormat = opcFormat;
    }


    /**
     * Gets the npAction value for this DscNpActionProfileData.
     * 
     * @return npAction
     */
    public java.lang.Short getNpAction() {
        return npAction;
    }


    /**
     * Sets the npAction value for this DscNpActionProfileData.
     * 
     * @param npAction
     */
    public void setNpAction(java.lang.Short npAction) {
        this.npAction = npAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DscNpActionProfileData)) return false;
        DscNpActionProfileData other = (DscNpActionProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dscNpActionProfileId==null && other.getDscNpActionProfileId()==null) || 
             (this.dscNpActionProfileId!=null &&
              this.dscNpActionProfileId.equals(other.getDscNpActionProfileId()))) &&
            ((this.apc==null && other.getApc()==null) || 
             (this.apc!=null &&
              this.apc.equals(other.getApc()))) &&
            ((this.opc==null && other.getOpc()==null) || 
             (this.opc!=null &&
              this.opc.equals(other.getOpc()))) &&
            ((this.apcFormat==null && other.getApcFormat()==null) || 
             (this.apcFormat!=null &&
              this.apcFormat.equals(other.getApcFormat()))) &&
            ((this.opcFormat==null && other.getOpcFormat()==null) || 
             (this.opcFormat!=null &&
              this.opcFormat.equals(other.getOpcFormat()))) &&
            ((this.npAction==null && other.getNpAction()==null) || 
             (this.npAction!=null &&
              this.npAction.equals(other.getNpAction())));
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
        if (getDscNpActionProfileId() != null) {
            _hashCode += getDscNpActionProfileId().hashCode();
        }
        if (getApc() != null) {
            _hashCode += getApc().hashCode();
        }
        if (getOpc() != null) {
            _hashCode += getOpc().hashCode();
        }
        if (getApcFormat() != null) {
            _hashCode += getApcFormat().hashCode();
        }
        if (getOpcFormat() != null) {
            _hashCode += getOpcFormat().hashCode();
        }
        if (getNpAction() != null) {
            _hashCode += getNpAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DscNpActionProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DscNpActionProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscNpActionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dscNpActionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apcFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apcFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opcFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npAction"));
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
