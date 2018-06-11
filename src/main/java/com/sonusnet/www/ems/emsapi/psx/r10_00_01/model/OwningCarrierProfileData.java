/**
 * OwningCarrierProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.model;

public class OwningCarrierProfileData  extends com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String owningCarrierProfileId;

    private java.lang.String nationalId;

    private java.lang.String countryId;

    private java.lang.Short numberType;

    private java.lang.String carrierId;

    public OwningCarrierProfileData() {
    }

    public OwningCarrierProfileData(
           java.lang.String owningCarrierProfileId,
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.Short numberType,
           java.lang.String carrierId) {
        this.owningCarrierProfileId = owningCarrierProfileId;
        this.nationalId = nationalId;
        this.countryId = countryId;
        this.numberType = numberType;
        this.carrierId = carrierId;
    }


    /**
     * Gets the owningCarrierProfileId value for this OwningCarrierProfileData.
     * 
     * @return owningCarrierProfileId
     */
    public java.lang.String getOwningCarrierProfileId() {
        return owningCarrierProfileId;
    }


    /**
     * Sets the owningCarrierProfileId value for this OwningCarrierProfileData.
     * 
     * @param owningCarrierProfileId
     */
    public void setOwningCarrierProfileId(java.lang.String owningCarrierProfileId) {
        this.owningCarrierProfileId = owningCarrierProfileId;
    }


    /**
     * Gets the nationalId value for this OwningCarrierProfileData.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this OwningCarrierProfileData.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this OwningCarrierProfileData.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this OwningCarrierProfileData.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the numberType value for this OwningCarrierProfileData.
     * 
     * @return numberType
     */
    public java.lang.Short getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this OwningCarrierProfileData.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.Short numberType) {
        this.numberType = numberType;
    }


    /**
     * Gets the carrierId value for this OwningCarrierProfileData.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this OwningCarrierProfileData.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OwningCarrierProfileData)) return false;
        OwningCarrierProfileData other = (OwningCarrierProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.owningCarrierProfileId==null && other.getOwningCarrierProfileId()==null) || 
             (this.owningCarrierProfileId!=null &&
              this.owningCarrierProfileId.equals(other.getOwningCarrierProfileId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId())));
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
        if (getOwningCarrierProfileId() != null) {
            _hashCode += getOwningCarrierProfileId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OwningCarrierProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OwningCarrierProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owningCarrierProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owningCarrierProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
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
