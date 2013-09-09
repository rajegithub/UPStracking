package com.ups.tracking.trackRequest;

import java.io.IOException;
import org.exolab.castor.builder.SourceGenerator;

public class SrcGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PathToFile = "C:/Users/Raja Gopal/wrkspc/UPStracking/src/com/ups/tracking/trackRequest/TrackRequest.xsd";
		//Reader reader = null;
		
		String packageName = "com.ups.tracking.trackRequest";
		
		SourceGenerator sg = new SourceGenerator();
		sg.setCreateMarshalMethods(true);
		sg.setDescriptorCreation(true);
		sg.setSuppressNonFatalWarnings(true);
		try {
			//reader = new BufferedReader(new FileReader(PathToFile));
			sg.generateSource(PathToFile, packageName);
			System.out.println("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
