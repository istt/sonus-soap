package com.istt.sonus;

import org.apache.axis.message.SOAPHeaderElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

// Package name to be generate from SOAP UI: com.sonusnet.www.ems.emsapi.psx.r10_00_01
import com.sonusnet.www.ems.emsapi.psx.r10_00_01.intf.PSXAPIR10_00_01SoapBindingStub;
import com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabel;
import com.sonusnet.www.ems.emsapi.psx.r10_00_01.model.RoutingLabelKey;
// After the copy, above error disapper
public class APITest
{
	public static void main( String[] args ) throws Exception
	{
		String emsIpAddress = "10.51.20.70";
		if ( args.length < 4 )
		{
			System.out.println( "Usage: test_sonus.jar <USERNAME> <PASSWORD> <PSXNAME> <ROUTELABELNAME>" );
			System.exit( -1 );
		}
		//Name of PSX as registered in the EMS
		String username = args[0];
		String password = args[1];
		String psxName = args[2];
		String routeLabelName = args[3];

		try
		{
			System.out.println( "Starting the connection to the switch" );
			//String url = "https://" + emsIpAddress + ":443/emsapi/services/PSXAPI/r10_00_01";
			String url = "http://" + emsIpAddress + ":80/emsapi/services/PSXAPI/r10_00_01";
			System.out.println( "Binding to URL - " + url );
			URL serverUrl = new URL( url );
			PSXAPIR10_00_01SoapBindingStub psxApi = new PSXAPIR10_00_01SoapBindingStub( serverUrl, null );
			System.out.println( "Setting username and password" );
			SOAPHeaderElement usernameElement = new SOAPHeaderElement( "", "USER" );
			SOAPHeaderElement passwordElement = new SOAPHeaderElement( "", "PASSWORD" );
			System.out.println("Setting username:" + username);
			usernameElement.setObjectValue( username );
			System.out.println("Setting password:" + password);
			passwordElement.setObjectValue( password );

			psxApi.setHeader( usernameElement );
			psxApi.setHeader( passwordElement );

			System.out.println( "Establishing the connection to the EMS" );

			RoutingLabelKey routeLabelKey = new RoutingLabelKey();
			routeLabelKey.setRoutingLabelId( routeLabelName );
			RoutingLabel routeLabel = ( RoutingLabel ) psxApi.retrieve( psxName, routeLabelKey );

			System.out.println( "Routing Label ID is " + routeLabel.getRoutingLabelId() );
			System.out.println( "Overflow number is " + routeLabel.getOverflowNumber() );
		}
		catch ( MalformedURLException | RemoteException e )
		{
			throw new Exception( e );
		}
	}
}
