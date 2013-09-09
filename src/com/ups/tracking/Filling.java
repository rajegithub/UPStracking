package com.ups.tracking;

import java.io.StringReader;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import com.ups.tracking.trackReply.TrackResponse;

public class Filling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Fill = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Header/><soapenv:Body><trk:TrackResponse xmlns:trk=\"http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0\"><common:Response xmlns:common=\"http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0\"><common:ResponseStatus><common:Code>1</common:Code><common:Description>Success</common:Description></common:ResponseStatus><common:TransactionReference/></common:Response><trk:Shipment><trk:InquiryNumber><trk:Code>01</trk:Code><trk:Description>ShipmentIdentificationNumber</trk:Description><trk:Value>1Z648616E192760718</trk:Value></trk:InquiryNumber><trk:ShipmentWeight><trk:UnitOfMeasurement><trk:Code>KGS</trk:Code></trk:UnitOfMeasurement><trk:Weight>1500.00</trk:Weight></trk:ShipmentWeight><trk:Service><trk:Code>096</trk:Code><trk:Description>UPS Worldwide Express freight</trk:Description></trk:Service><trk:ReferenceNumber><trk:Code>03</trk:Code><trk:Value>999JJJ777</trk:Value></trk:ReferenceNumber><trk:ReferenceNumber><trk:Code>04</trk:Code><trk:Value>ASDF123</trk:Value></trk:ReferenceNumber><trk:ReferenceNumber><trk:Code>13</trk:Code><trk:Value>648616TDSZZ</trk:Value></trk:ReferenceNumber><trk:PickupDate>20121004</trk:PickupDate><trk:Package><trk:TrackingNumber>1Z648616E192760718</trk:TrackingNumber><trk:Activity><trk:ActivityLocation><trk:Address><trk:CountryCode>FR</trk:CountryCode></trk:Address></trk:ActivityLocation><trk:Status><trk:Type>M</trk:Type><trk:Description>Order Processed: Ready for UPS</trk:Description><trk:Code>MP</trk:Code></trk:Status><trk:Date>20121004</trk:Date><trk:Time>135804</trk:Time></trk:Activity><trk:PackageWeight><trk:UnitOfMeasurement><trk:Code>KGS</trk:Code></trk:UnitOfMeasurement><trk:Weight>1500.00</trk:Weight></trk:PackageWeight></trk:Package></trk:Shipment><trk:Disclaimer>You are using UPS tracking service on customer integration test environment, please switch to UPS production environment once you finish the test. The URL is https://onlinetools.ups.com/webservices/Track</trk:Disclaimer></trk:TrackResponse></soapenv:Body></soapenv:Envelope>";
		TrackResponse tr;
		try {
			tr = TrackResponse.unmarshal(new StringReader(Fill));
		} catch (MarshalException | ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
