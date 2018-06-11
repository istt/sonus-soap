/**
 * PSXAPIR10_00_01SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r10_00_01.intf;

public class PSXAPIR10_00_01SoapBindingStub extends org.apache.axis.client.Stub implements com.sonusnet.www.ems.emsapi.psx.r10_00_01.intf.PSXAPI_r10_00_01 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[17];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNextItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityKey"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNextItemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listallReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJobStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getJobStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkRetrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityValue"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "bulkRetrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityValue"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCountReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[16] = oper;

    }

    public PSXAPIR10_00_01SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PSXAPIR10_00_01SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PSXAPIR10_00_01SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
        addBindings8();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ErrorEntity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ErrorEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ErrorEntity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_tns1_ManagedEntityValue");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AccessTransferProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AccessTransferProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AccessTransferProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AccessTransferProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AdMsgProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AdMsgProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AdMsgProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AdMsgProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AdProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AdProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AdProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AmaCalltypeLookup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AmaCalltypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AmaCalltypeLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AmaCalltypeLookupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ApplicationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ApplicationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ApplicationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ArsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ArsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ArsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ArsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Authcode");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Authcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AuthcodeEncryption");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AuthcodeEncryption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AuthcodeEncryptionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AuthcodeEncryptionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AuthcodeGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AuthcodeGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AuthcodeGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AuthcodeGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AuthcodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AuthcodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AutoRecallProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AutoRecallProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AutoRecallProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AutoRecallProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AutoRecallProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AutoRecallProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "AutoRecallProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.AutoRecallProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BgBlockingLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BgBlockingLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BgBlockingLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BgBlockingLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BgBlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BgBlockingLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BgBlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BgBlockingLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BgRegisteredUser");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BgRegisteredUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BgRegisteredUserKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BgRegisteredUserKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingInfoProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingInfoProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingInfoProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingInfoProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingPlan");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingPlanKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingRate");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingRateKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingRateKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingZone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BillingZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BillingZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BlockingLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BlockingLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BlockingLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BlockingLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BlockingLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BlockingLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BusinessGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BusinessGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BusinessGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BusinessGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BusinessLocation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BusinessLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BusinessLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BusinessLocationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BusinessUnit");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BusinessUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "BusinessUnitKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.BusinessUnitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CaleaEntity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CaleaEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CaleaEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CaleaEntityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingClist");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallingClist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingClistKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallingClistKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingPartyBillingNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallingPartyBillingNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingPartyBillingNumberData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallingPartyBillingNumberData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingPartyBillingNumberDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallingPartyBillingNumberDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallingPartyBillingNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallingPartyBillingNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParameterFilterGroupProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParameterFilterGroupProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParameterFilterGroupProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParameterFilterGroupProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParameterFilterGroupProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParameterFilterGroupProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParameterFilterGroupProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParameterFilterGroupProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParameters");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParametersKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParamFilterProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParamFilterProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParamFilterProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParamFilterProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParamFilterProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParamFilterProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallParamFilterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallParamFilterProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallRecordingCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallRecordingCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallRecordingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallRecordingCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallType");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CallTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CallTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CanonicalName");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CanonicalName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CanonicalNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CanonicalNameKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CapQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CapQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CapQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Carrier");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Carrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Carrier900TollNxx");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Carrier900TollNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Carrier900TollNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Carrier900TollNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierCodeConversionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierCodeConversionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierCodeConversionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierCodeConversionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierCodeConversionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierCodeConversionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierCodeConversionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierCodeConversionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierDestinationChargeIndication");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierDestinationChargeIndication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierDestinationChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierDestinationChargeIndicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierSelectionPriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierSelectionPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierSelectionPriorityData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierSelectionPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierSelectionPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierSelectionPriorityDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierSelectionPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierSelectionPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierTypeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierTypeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierTypeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierTypeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierTypeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierTypeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CarrierTypeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CarrierTypeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeAreaGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeAreaGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeAreaGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeAreaGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeAreaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeAreaGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeAreaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeAreaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeBandProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeBandProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeBandProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeBandProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeBandProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeBandProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeBandProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeBandProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeIndex");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeIndexKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeIndexKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeIndication");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeIndication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeIndicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateInfoParameters");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeRateInfoParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateInfoParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeRateInfoParametersKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeRateProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeRateProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeRateProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ChargeRateProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ChargeRateProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ClassOfService");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ClassOfService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ClassOfServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ClassOfServiceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ClusterProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ClusterProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ClusterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ClusterProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecEntry");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecEntryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecEntryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecListProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecListProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecListProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecListProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecRoutingPriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecRoutingPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecRoutingPriorityData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecRoutingPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecRoutingPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecRoutingPriorityDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CodecRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CodecRoutingPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CongestionControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CongestionControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CongestionControlProfileAdaptData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CongestionControlProfileAdaptData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CongestionControlProfileAdaptDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CongestionControlProfileAdaptDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CongestionControlProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CongestionControlProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CongestionControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CongestionControlProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CongestionControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CongestionControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosBlockingLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosBlockingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosBlockingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosBlockingLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosCallRestrictionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosCallRestrictionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosCallRestrictionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosCallRestrictionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosCpcScreen");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosCpcScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosCpcScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosCpcScreenKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosInfodigitScreen");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosInfodigitScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CosInfodigitScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CosInfodigitScreenKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Country");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CountryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CountryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Cpc");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Cpc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcMappingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcMappingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcMappingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcMappingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcMappingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcMappingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcScreening");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcScreening.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "CpcScreeningKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.CpcScreeningKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DdiRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DdiRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DdiRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DdiRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DdiRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DdiRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DdiRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DdiRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Destination");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Destination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DestinationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DestinationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DeviceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DeviceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DeviceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DeviceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DialPlanProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DialPlanProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DialPlanProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DialPlanProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DigitLenEnfProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DigitLenEnfProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DigitLenEnfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DigitLenEnfProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DnsZone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DnsZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DnsZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DnsZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DnsZoneLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DnsZoneLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DnsZoneLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DnsZoneLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DnsZoneLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DnsZoneLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DnsZoneLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DnsZoneLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DomainControllerProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DomainControllerProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DomainControllerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DomainControllerProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DpcExceptionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DpcExceptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DpcExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DpcExceptionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DpcInformation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DpcInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DpcInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DpcInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DscNpActionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DscNpActionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DscNpActionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DscNpActionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DscNpActionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DscNpActionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DscNpActionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DscNpActionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DtmfProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DtmfProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DtmfProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DtmfProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DtmfProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DtmfProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "DtmfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.DtmfProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EchoCancelCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EchoCancelCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EchoCancelCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EchoCancelCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ElementRoutingPriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ElementRoutingPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ElementRoutingPriorityGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ElementRoutingPriorityGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ElementRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ElementRoutingPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ElementScript");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ElementScript.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ElementScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ElementScriptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnblocProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnblocProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnblocProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnblocProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnblocProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnblocProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnblocProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnblocProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EndPointLocationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EndPointLocationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EndPointLocationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EndPointLocationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Enterprise");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Enterprise.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnterpriseKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnterpriseKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumAuthorityProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumAuthorityProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumAuthorityProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumAuthorityProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumAuthorityProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumAuthorityProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumAuthorityProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumAuthorityProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumDomainsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumDomainsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumDomainsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumDomainsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EnumQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EnumQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ErrorEntity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ErrorEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ErrorHandlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ErrorHandlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ErrorHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ErrorHandlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedCarrier");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedCarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedNpa");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedNpa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedNpaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedNpaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedTrunkgroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedTrunkgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "EscapedTrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.EscapedTrunkgroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FeatureControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FeatureControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FeatureControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FeatureControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FeatureKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FeatureKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FilterCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FlexibleVariableRules");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FlexibleVariableRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FlexibleVariableRulesData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FlexibleVariableRulesData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FlexibleVariableRulesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FlexibleVariableRulesDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "FlexibleVariableRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.FlexibleVariableRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ForcedOffnetLocation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ForcedOffnetLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ForcedOffnetLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ForcedOffnetLocationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ForwardersData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ForwardersData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ForwardersDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ForwardersDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Gateway");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Gateway.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupCollection");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupCollectionData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupCollectionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupCollectionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupCollectionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupCollectionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupCollectionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupSig");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupSig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayGroupSigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayLrns");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayLrns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GatewayLrnsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GatewayLrnsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GlobalizeNumberProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GlobalizeNumberProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GlobalizeNumberProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GlobalizeNumberProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GlobalizeNumberProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GlobalizeNumberProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GlobalizeNumberProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GlobalizeNumberProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GlobalTitleProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GlobalTitleProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "GlobalTitleProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.GlobalTitleProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Gr303Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Gr303Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Gr303SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Gr303SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "H323Zone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.H323Zone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "H323ZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.H323ZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "H323ZoneNetwork");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.H323ZoneNetwork.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "H323ZoneNetworkKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.H323ZoneNetworkKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HifraudCountryLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HifraudCountryLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HifraudCountryLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HifraudCountryLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HifraudCountryLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HifraudCountryLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HifraudCountryLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HifraudCountryLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HolidayKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HolidayKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HomeDomainGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HomeDomainGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HomeDomainGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HomeDomainGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainLookup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HomeDomainLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HomeDomainLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HomeDomainLookupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HostedLnp");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HostedLnp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HostedLnpKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HostedLnpKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxApplicationServer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxApplicationServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxApplicationServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxApplicationServerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxAuthenticationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxAuthenticationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxAuthenticationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxAuthenticationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCapabilitiesProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCapabilitiesProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCapabilitiesProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCapabilitiesProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCapabilitiesProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCapabilitiesProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCapabilitiesProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCapabilitiesProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCapability");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCapabilityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCapabilityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxChargingInformation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxChargingInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxChargingInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxChargingInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxCsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxDiameterPeer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxDiameterPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxDiameterPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxDiameterPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxDiameterRealmRoute");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxDiameterRealmRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxDiameterRealmRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxDiameterRealmRouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxDiameterVirtualPeer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxDiameterVirtualPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxDiameterVirtualPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxDiameterVirtualPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxFailOverHss");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxFailOverHss.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxFailOverHssKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxFailOverHssKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxFeatureList");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxFeatureList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxFeatureListKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxFeatureListKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxFmcRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxFmcRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxFmcRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxFmcRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxIfcSet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxIfcSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxIfcSetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxIfcSetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxIfcSetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxIfcSetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxIfcSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxIfcSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxIfcSetUsageData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxIfcSetUsageData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxIfcSetUsageDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxIfcSetUsageDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxImplicitRegistrationSet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxImplicitRegistrationSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxImplicitRegistrationSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxImplicitRegistrationSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxInstance");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxInstanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxInstanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxInterNetworkRoamingAgreements");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxInterNetworkRoamingAgreements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxInterNetworkRoamingAgreementsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxInterNetworkRoamingAgreementsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxMsisdn");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxMsisdnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxNetworkInformation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxNetworkInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxNetworkInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxNetworkInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPartition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPartitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPrivateUserIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPrivateUserIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPrivateUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPrivateUserIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPublicUserIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPublicUserIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxPublicUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxPublicUserIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxRegistrationTermination");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxRegistrationTermination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxRegistrationTerminationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxRegistrationTerminationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSCscf");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSCscf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSCscfKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSCscfKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSubscriptionNotificationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSubscriptionNotificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSubscriptionNotificationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSubscriptionNotificationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSubscriptionPermissions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSubscriptionPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSubscriptionPermissionsData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSubscriptionPermissionsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSubscriptionPermissionsDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSubscriptionPermissionsDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxSubscriptionPermissionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxSubscriptionPermissionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxTriggerPoint");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxTriggerPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxTriggerPointData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxTriggerPointData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxTriggerPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxTriggerPointDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxTriggerPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxTriggerPointKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlChargingInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlChargingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlChargingInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlChargingInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlCsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlCsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlCsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlInitialFilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlInitialFilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlInitialFilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlInitialFilterCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlMsisdn");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlMsisdnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlPsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlPsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlPsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlSCscfName");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlSCscfName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HsxXmlSCscfNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HsxXmlSCscfNameKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HtrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HtrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HtrProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HtrProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HtrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HtrProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "HtrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.HtrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InapQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InapQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InapQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InDialogueHandlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InDialogueHandlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InDialogueHandlingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InDialogueHandlingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InDialogueHandlingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InDialogueHandlingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InDialogueHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InDialogueHandlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Infodigit");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Infodigit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InfodigitKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InfodigitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InfoTransCapProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InfoTransCapProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InfoTransCapProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InfoTransCapProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterBusinessGroupService");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterBusinessGroupService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterBusinessGroupServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterBusinessGroupServiceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterGatewayGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterGatewayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterGatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterGatewayGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterGatewayGroupSig");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterGatewayGroupSig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterGatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterGatewayGroupSigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InternalToSipCauseMapping");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InternalToSipCauseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InternalToSipCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InternalToSipCauseMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Interworking");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Interworking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "InterworkingKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.InterworkingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpPeer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingPeerGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingPeerGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingPeerGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingPeerGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingPeerGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingPeerGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingPeerGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingPeerGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingTonePackage");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingTonePackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "IpSignalingTonePackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.IpSignalingTonePackageKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Lata");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Lata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCountryCap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCountryCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCountryCapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCurrency");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCurrencyKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCustomer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCustomerIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCustomerIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCustomerIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCustomerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCustomerOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCustomerOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrCustomerOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrExceptions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrExceptionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrMarginProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrMarginProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrMarginProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferVendorGroups");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferVendorGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferVendorGroupsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferVendors");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferVendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrOfferVendorsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrQosTypes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrQosTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrQosTypesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrRules");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrTgQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrTgQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrTgQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendor");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LcrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LcrVendorRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingArea");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaFrom");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaFrom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaFromKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaFromKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaNpaNxx");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaNpaNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaNpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaNpaNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaTo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalCallingAreaToKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalCallingAreaToKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalRingBackTone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalRingBackTone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LocalRingBackToneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LocalRingBackToneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LogProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LogProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LogProfileCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LogProfileCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LogProfileCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LogProfileCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LogProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LogProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LwresdDnsServer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LwresdDnsServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LwresdDnsServerData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LwresdDnsServerData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LwresdDnsServerDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LwresdDnsServerDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LwresdDnsServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LwresdDnsServerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LwresdProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LwresdProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "LwresdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.LwresdProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ManagedEntityValue");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MediaQosKpiProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MediaQosKpiProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MediaQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MediaQosKpiProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MessageWaitingIndicator");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MessageWaitingIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MessageWaitingIndicatorKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MessageWaitingIndicatorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MimeSubType");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MimeSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MimeSubTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MimeSubTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MobileQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MobileQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MobileQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MobileQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MpAnnouncementPackage");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MpAnnouncementPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MpAnnouncementPackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MpAnnouncementPackageKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Mta");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Mta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "MtaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.MtaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NetworkdataInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NetworkdataInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NetworkdataInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NetworkdataInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NonSubscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NonSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NonSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NonSubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NpaNxx");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NpaNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NpaNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberAnalysisProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberAnalysisProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberAnalysisProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberAnalysisProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberAnalysisProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberAnalysisProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberAnalysisProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberAnalysisProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberControlProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberControlProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberControlProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberingPlan");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberingPlanKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationCondition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationConditionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationConditionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationProfileDetail");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationProfileDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationProfileDetailKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationProfileDetailKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberTranslationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberTranslationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberUrlTranslation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberUrlTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "NumberUrlTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.NumberUrlTranslationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OlecChosenIxcCarrierCode");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OlecChosenIxcCarrierCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OlecChosenIxcCarrierCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OlecChosenIxcCarrierCodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OperatorNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OperatorNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OperatorNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OperatorNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OrigEntityRoutingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OrigEntityRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OrigEntityRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OrigEntityRoutingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OwningCarrierProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OwningCarrierProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OwningCarrierProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OwningCarrierProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OwningCarrierProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OwningCarrierProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "OwningCarrierProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.OwningCarrierProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PacketServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PacketServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PacketServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Partition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Partition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PartitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PcSsnRoutingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PcSsnRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PcSsnRoutingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PcSsnRoutingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PcSsnRoutingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PcSsnRoutingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PcSsnRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PcSsnRoutingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PeerThrottlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PeerThrottlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PeerThrottlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PeerThrottlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Plmn");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Plmn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PlmnKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PlmnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PlmnProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PlmnProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PlmnProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PlmnProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmCriteriaGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmCriteriaGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmCriteriaGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmCriteriaGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmCriteriaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmCriteriaGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmCriteriaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmRule");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmRuleCustomDnis");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmRuleCustomDnis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmRuleCustomDnisKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmRuleCustomDnisKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PmRuleKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PolicyProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfileGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PolicyProfileGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfileGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PolicyProfileGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfileGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PolicyProfileGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PolicyProfileGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PolicyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PolicyProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PostTranslationSsg");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PostTranslationSsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PostTranslationSsgData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PostTranslationSsgData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PostTranslationSsgDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PostTranslationSsgDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PostTranslationSsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PostTranslationSsgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PprPartitionMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PprPartitionMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PprPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PprPartitionMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PprProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PprProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PprProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PprProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PpspIdsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PpspIdsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PpspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PpspIdsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PreferredPacketServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PreferredPacketServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PreferredPacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PreferredPacketServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PrefixProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PrefixProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PrefixProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PrefixProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixType");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PrefixType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PrefixTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PrefixTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiAuthorizationException");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiBatchException");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ProvApiException");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PspIdsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PspIdsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PspIdsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PublicSafetyAnsweringPoint");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PublicSafetyAnsweringPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PublicSafetyAnsweringPointData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PublicSafetyAnsweringPointData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PublicSafetyAnsweringPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PublicSafetyAnsweringPointDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "PublicSafetyAnsweringPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.PublicSafetyAnsweringPointKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RecorderProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RecorderProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RecorderProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RecorderProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RedirectionInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RedirectionInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RedirectionInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RedirectionInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Region");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Region.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RegionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RegionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RelayIpPort");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RelayIpPort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RelayIpPortKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RelayIpPortKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ReleaseCauseInTriggerProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ReleaseCauseInTriggerProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ReleaseCauseInTriggerProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ReleaseCauseInTriggerProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ReleaseCauseInTriggerProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ReleaseCauseInTriggerProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ReleaseCauseInTriggerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ReleaseCauseInTriggerProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Route");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Route.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteRangeProfileDataSplit");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteRangeProfileDataSplit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteRangeProfileDataSplitKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteRangeProfileDataSplitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteSet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RouteSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RouteSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingCriteriaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingLabelQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabelQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingLabelRoutes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabelRoutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RoutingLabelRoutesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabelRoutesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RuntimeVariable");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RuntimeVariable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RuntimeVariableData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RuntimeVariableData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RuntimeVariableDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RuntimeVariableDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "RuntimeVariableKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RuntimeVariableKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpaDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpaDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings6() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpaDeviceLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpaDeviceLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpaDeviceLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpaDeviceLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpaDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpaDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpPartitionMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpPartitionMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpPartitionMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpRoutingConfig");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpRoutingConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpRoutingConfigKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpRoutingConfigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpServiceDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpServiceDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScpServiceDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Script");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Script.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ScriptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpAssociation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpAssociationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpAssociationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpHostNameProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpHostNameProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpHostNameProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpHostNameProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpIpAddress");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpIpAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SctpIpAddressKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SctpIpAddressKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdAinMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdAinMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdAinMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdAinMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdCapMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdCapMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdCapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdCapMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdEnumMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdEnumMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdEnumMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdEnumMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdInapMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdInapMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdInapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdInapMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdMobileMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdMobileMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdMobileMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdMobileMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdRoutingConfigMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdRoutingConfigMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdRoutingConfigMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdRoutingConfigMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdSipMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdSipMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SdSipMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SdSipMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SecureCryptoSuiteProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SecureCryptoSuiteProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SecureCryptoSuiteProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SecureCryptoSuiteProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SecureCryptoSuiteProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SecureCryptoSuiteProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SecureCryptoSuiteProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SecureCryptoSuiteProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceArea");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceAreaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceDefinition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceExceptionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceExceptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceExceptionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceExceptionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceExceptionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceExceptionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ServiceExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ServiceExceptionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SgxDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SgxDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SgxDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SgxDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ShortKeyProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ShortKeyProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ShortKeyProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ShortKeyProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ShortKeyProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ShortKeyProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ShortKeyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ShortKeyProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SignalingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SignalingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SignalingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SignalingQosKpiProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SignalingQosKpiProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SignalingQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SignalingQosKpiProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranDpcRoute");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranDpcRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranDpcRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranDpcRouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranLocalAs");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranLocalAs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranLocalAsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranLocalAsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranSg");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranSg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranSgKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranSgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranTcapRegistration");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranTcapRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SigtranTcapRegistrationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SigtranTcapRegistrationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipHeaderParserProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipHeaderParserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipHeaderParserProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipHeaderParserProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipHeaderParserProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipHeaderParserProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipHeaderParserProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipHeaderParserProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipLrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipLrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipLrProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipLrProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipLrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipLrProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipLrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipLrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipMimeContentVersions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipMimeContentVersions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipMimeContentVersionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipMimeContentVersionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipResponseCodes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipResponseCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipResponseCodesData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipResponseCodesData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipResponseCodesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipResponseCodesDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipResponseCodesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipResponseCodesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpDeviceData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpDeviceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpDeviceDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpDeviceDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpMappingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpMappingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpMappingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpMappingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpMappingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpMappingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpServiceDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpServiceDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipScpServiceDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipToInternalCauseMapping");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipToInternalCauseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SipToInternalCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SipToInternalCauseMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmAction");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmActionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmActionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings7() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmProfileGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmProfileGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmProfileGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRule");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRuleActionData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmRuleActionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRuleActionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmRuleActionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRuleCriterionData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmRuleCriterionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRuleCriterionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmRuleCriterionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SmmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SmmRuleKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Softswitch");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Softswitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SoftswitchCarrier");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SoftswitchCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SoftswitchCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SoftswitchCarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SoftswitchKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SoftswitchKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SpasDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SpasDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SpasDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SpasDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SplitAreaCode");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SplitAreaCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SplitAreaCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SplitAreaCodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SsDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SsDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SsDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SsDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Ssg");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Ssg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SsgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaNetworkAppearance");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaNetworkAppearance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaNetworkAppearanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaNetworkAppearanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaProtocolProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaProtocolProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaProtocolProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaSp");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaSp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaSpKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaSpKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaSpLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaSpLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaSpLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaSpLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaSpLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaSpLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SuaSpLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SuaSpLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SubscriberApplicationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SubscriberApplicationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SubscriberApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SubscriberApplicationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SubscriberSearchKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SubscriberSearchKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SwitchTypeCpcProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SwitchTypeCpcProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SwitchTypeCpcProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SwitchTypeCpcProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SwitchTypeCpcProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SwitchTypeCpcProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "SwitchTypeCpcProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.SwitchTypeCpcProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TcapProtocolProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TcapProtocolProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TcapProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TcapProtocolProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TciProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TciProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TciProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TciProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TciProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TciProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TciProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TciProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TgCosProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TgCosProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TgCosProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TgCosProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TimeRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TimeRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TimeRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TimeRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TimeRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TimeRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TimeRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TimeRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TollfreePrefix");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TollfreePrefix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TollfreePrefixKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TollfreePrefixKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlApplication");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlApplicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlApplicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlEscape");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlEscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlEscapeData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlEscapeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlEscapeDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlEscapeDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlEscapeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlEscapeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrafficControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrafficControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TranslationLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TranslationLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TranslationLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TranslationLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TranslationNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TranslationNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TranslationNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TranslationNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TriggerTypePriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TriggerTypePriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TriggerTypePriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TriggerTypePriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "Trunkgroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.Trunkgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "TrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.TrunkgroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "UcOcrCos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.UcOcrCos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "UcOcrCosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.UcOcrCosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "UcOcrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.UcOcrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "UcOcrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.UcOcrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "UserInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.UserInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "UserInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.UserInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCountryCap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCountryCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCountryCapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCurrency");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCurrencyKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCustomer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCustomerIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCustomerIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCustomerIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCustomerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCustomerOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCustomerOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrCustomerOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrExceptions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrExceptionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrMarginProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrMarginProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrMarginProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings8() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferVendorGroups");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferVendorGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferVendorGroupsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferVendors");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferVendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrOfferVendorsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrQosTypes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrQosTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrQosTypesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrRules");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrTgQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrTgQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrTgQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendor");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VbrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VbrVendorRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VPNSubscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VPNSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "VPNSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.VPNSubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZoneDefinition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZoneDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZoneDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZoneDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZoneIndexProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZoneIndexProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZoneIndexProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZoneIndexProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZzProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZzProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZzProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZzProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/model", "ZzProfileQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ZzProfileQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[] getNextItems(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey in1, int in2, int in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "getNextItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void bulkDelete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "bulkDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String listall(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3, boolean in4) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "listall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Boolean(in3), new java.lang.Boolean(in4)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void bulkUpdate(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "bulkUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getJobStatus(java.lang.String in0) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "getJobStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[] bulkRetrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in1, int in2, int in3, java.lang.String[] in4, java.lang.String in5) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "bulkRetrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3), in4, in5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void put(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "put"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void put(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "put"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void create(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void create(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void update(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey in1, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void update(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[] in1, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in2, boolean in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Boolean(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue retrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[] retrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getCount(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ManagedEntityValue in1, java.lang.String in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_01/intf", "getCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
