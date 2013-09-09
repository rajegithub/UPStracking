package com.ups.tracking;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;


public class TestFillingJClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyStore trusted = null;
		try {
			trusted = KeyStore.getInstance("JKS");
		} catch (KeyStoreException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
        // Get the raw resource, which contains the keystore with
        // your trusted certificates (root and any intermediate certs)
		File file = new File("C:/Users/Raja Gopal/wrkspc/UPStracking/res/cert/keystore1.jks");
        InputStream in = null;
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
            // Initialize the keystore with the provided trusted certificates
            // Also provide the password of the keystore
            trusted.load(in, "rjsatrakapp".toCharArray());
        } catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

		SchemeRegistry schemeRegistry = new SchemeRegistry();
        SSLSocketFactory lSchemeSocketFactory = null;
		try {
			lSchemeSocketFactory = new SSLSocketFactory(trusted, "rjsatrakapp");
		} catch (KeyManagementException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnrecoverableKeyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (KeyStoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        schemeRegistry.register(new Scheme("https", lSchemeSocketFactory, 443));
        
        final HttpParams httpParams = new BasicHttpParams();
        ClientConnectionManager cm = new SingleClientConnManager(httpParams, schemeRegistry);
        final DefaultHttpClient httpClient = new DefaultHttpClient(cm, httpParams);
		
		String url = "https://wwwcie.ups.com/webservices/Track";
//		String TrackingNumber = "1Z12345E1512345676";
		String trackNum = "1Z12345E1512345676";
//Working # 990728071 1Z648616E192760718
		String a = "<AccessRequest xml:lang=\"en-US\"><AccessLicenseNumber>2CBDB7A88F17F295</AccessLicenseNumber><UserId>rgrvon</UserId><Password>Opensrc143`</Password></AccessRequest>";
//		String b = a+"<TrackRequest xml:lang=\"en-US\"><Request><TransactionReference><CustomerContext>Your Test Case SummaryDescription</CustomerContext><XpciVersion>1.0</XpciVersion></TransactionReference><RequestAction>Track</RequestAction><RequestOption></RequestOption></Request><InquiryNumber>"+TrackingNumber+"'</InquiryNumber></TrackRequest>";
//		String b = "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"><env:Header><UPSSecurity xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0\"><UsernameToken><Username>rgrvon</Username><Password>Opensrc143`</Password></UsernameToken><ServiceAccessToken><AccessLicenseNumber>5CBDD7BC435045C6</AccessLicenseNumber></ServiceAccessToken></UPSSecurity></env:Header><env:Body><TrackRequest xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0\"><Request xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0\"><TransactionReference /><RequestAction>Track</RequestAction></Request><InquiryNumber>"+trackNum+"</InquiryNumber></TrackRequest></env:Body></env:Envelope>";
		String b = "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"><env:Header><UPSSecurity xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0\"><UsernameToken><Username>rgrvon</Username><Password>Opensrc143`</Password></UsernameToken><ServiceAccessToken><AccessLicenseNumber>5CBDD7BC435045C6</AccessLicenseNumber></ServiceAccessToken></UPSSecurity></env:Header><env:Body><TrackRequest xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0\"><Request><TransactionReference><CustomerContext><InternalKey>guidlikesubstance</InternalKey></CustomerContext><XpciVersion>1.0</XpciVersion></TransactionReference><RequestAction>Track</RequestAction></Request><InquiryNumber>"+trackNum+"</InquiryNumber></TrackRequest></env:Body></env:Envelope>";
//		HttpMethod method = new GetMethod(url);
//		xmlns:upss=\"http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0\" xmlns:auth=\"http://www.ups.com/schema/xpci/1.0/auth\" xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0\" xmlns=\"http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0\"
		HttpPost lMethod = new HttpPost(url);//<upss:AccessRequest xmlns:upss=\"http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0\"><upss:AccessLicenseNumber>5CBDD7BC435045C6</upss:AccessLicenseNumber><upss:UserId>rgrvon</upss:UserId><upss:Password>Opensrc143`</upss:Password></upss:AccessRequest><?xml version=\"1.0\" encoding=\"utf-8\"?>
		HttpEntity lEntity = null;
		try {
			lEntity = new StringEntity(b, "UTF-8");
//lEntity = new HttpPostEntity(data, "text/xml","UTF-8");
		} catch (UnsupportedEncodingException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lMethod.setEntity(lEntity);

		try {
			HttpResponse returnCode = httpClient.execute(lMethod); 
			HttpEntity entity = returnCode.getEntity();
			InputStream is = entity.getContent();

			    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			    StringBuilder sb = new StringBuilder();

			    String line = null;
			    try {
			        while ((line = reader.readLine()) != null) {
			            sb.append((line + "\n"));
			        }
			    } catch (IOException e) {
			        e.printStackTrace();
			    } finally {
			        try {
			            is.close();
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			    }
//			    sb.toString();

//				Result = sb.toString();
//				System.out.println(Result);
				if(sb.toString().contains("No Access and Authentication Credentials provided")){
					System.out.println("No Access and Authentication Credentials provided");
					System.out.println(sb.toString());
				}else if(sb.toString().contains("<err:Description>")){
					System.out.println(sb.toString().substring(sb.toString().indexOf("<err:Description>"), sb.toString().indexOf("</err:Description>")));
					System.out.println(sb.toString());
					
				}else{
					System.out.println(sb.toString());
				}
			    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

//        NameValuePair param1;
//		param1 = new NameValuePair("API", "TrackV2");
//		NameValuePair param2 = new NameValuePair("XML", b);
//		NameValuePair[] params = new NameValuePair[] {param1, param2};
//		method.setQueryString(params);
		
//		try {
//			int statusCode = client.executeMethod(method);
//
//			if (statusCode != HttpStatus.SC_OK) {
//				System.err.println("Method failed: " + method.getStatusLine());
//			}
//
//			byte[] responseBody = method.getResponseBody();
//			System.out.println(new String(responseBody));
//			
//			com.ups.tracking.trackReply.TrackResponse tr = null;
//
//			try {
//				tr = com.ups.tracking.trackReply.TrackResponse.unmarshal(new StringReader(new String(responseBody)));
//			} catch (MarshalException | ValidationException e) {
//				e.printStackTrace();
//			}
			
//			if(tr!=null){
//				TrackDetail[] td = tr.getTrackInfo().getTrackDetail();
//				for(TrackDetail tempTD: td){
//					System.out.println("***************************START********************************");
//					//System.out.println(tempTD.getAuthorizedAgent());
//					System.out.println(tempTD.getEvent());
//					System.out.print(tempTD.getEventCity()+", ");
//					System.out.println(tempTD.getEventState());
//					//System.out.println(tempTD.getEventCountry());
//					System.out.print(tempTD.getEventDate()+", ");
//					System.out.println(tempTD.getEventTime());
//					//System.out.println(tempTD.getFirmName());
//					//System.out.println(tempTD.getName());
//					//System.out.println(tempTD.getEventZIPCode());
//					System.out.println("***************************END**********************************");
//				}
//			}

//		} catch (HttpException e) {
//			System.err.println("Fatal protocol violation: " + e.getMessage());
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.err.println("Fatal transport error: " + e.getMessage());
//			e.printStackTrace();
//		} finally {
//			method.releaseConnection();
//		}  

	}

}
