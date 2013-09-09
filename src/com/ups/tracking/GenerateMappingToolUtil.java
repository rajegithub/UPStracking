package com.ups.tracking;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.tools.MappingTool;

import com.ups.tracking.trackReply.TrackResponse;

public class GenerateMappingToolUtil {

	public static void generate() throws MappingException, FileNotFoundException {
	    MappingTool tool = new MappingTool();
	    tool.setInternalContext(new org.castor.xml.BackwardCompatibilityContext());
	    tool.addClass(TrackResponse.class);
	    OutputStream file = new FileOutputStream("C:/Users/Raja Gopal/wrkspc/UPStracking/src/com/ups/tracking/trackReply/mapping.xml" ); 

	    Writer writer = new OutputStreamWriter(file);
	    tool.write(writer);
	    //SourceGenerator.main(options);
	}

	public static void main(String[] args) {
	    try {
	    	GenerateMappingToolUtil.generate();
	    } catch (MappingException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}

}
