README

# Tools neccessary for generate

1. SOAP UI
2. Apache Axis1
3. WSDL URL: http://10.51.20.70/emsapi/services/PSXAPI/r10_00_01?wsdl

In order to generate code, SoapUI must be configure with Axis 1 Tools.

Download Axis1 Tool here:

http://axis.apache.org/axis/

Extract it to some folder, then select Tools menu from SOAP UI, point the Extracted folder there.

After generate, copy the `com` folder into Eclipse project.

Important: Change the project compatible JRE to 1.7

OK DONE.