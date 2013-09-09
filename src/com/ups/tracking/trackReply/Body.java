package com.ups.tracking.trackReply;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class Body implements java.io.Serializable {


	//--------------------------/
	//- Class/Member Variables -/
	//--------------------------/

	/**
	 * Field _trackResponse.
	 */
	private java.util.Vector _trackResponse;


	//----------------/
	//- Constructors -/
	//----------------/

	public Body() {
		super();
		this._trackResponse = new java.util.Vector();
	}


	//-----------/
	//- Methods -/
	//-----------/

    /**
     * 
     * 
     * @param vTrackResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrackResponse(
            final com.ups.tracking.trackReply.TrackResponse vTrackResponse)
    throws java.lang.IndexOutOfBoundsException {
        this._trackResponse.addElement(vTrackResponse);
    }
    
    /**
     * 
     * 
     * @param index
     * @param vTrackResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrackResponse(
            final int index,
            final com.ups.tracking.trackReply.TrackResponse vTrackResponse)
    throws java.lang.IndexOutOfBoundsException {
        this._trackResponse.addElement(vTrackResponse);
    }
    
    public java.util.Enumeration enumerateTrackResponse(
    ) {
        return this._trackResponse.elements();
    }

    /**
     * Method getTrackResponse.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.example.testing.TrackReply at the given
     * index
     */
    public com.ups.tracking.trackReply.TrackResponse getTrackResponse(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trackResponse.size()) {
            throw new IndexOutOfBoundsException("getTrackResponse: Index value '" + index + "' not in range [0.." + (this._trackResponse.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.TrackResponse) _trackResponse.get(index);
    }

    /**
     * Method getTrackResponse.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.TrackResponse[] getTrackResponse(
    ) {
        com.ups.tracking.trackReply.TrackResponse[] array = new com.ups.tracking.trackReply.TrackResponse[0];
        return (com.ups.tracking.trackReply.TrackResponse[]) this._trackResponse.toArray(array);
    }

    /**
     * Method getTrackResponseCount.
     * 
     * @return the size of this collection
     */
    public int getTrackResponseCount(
    ) {
        return this._trackResponse.size();
    }
    
    /**
     */
    public void removeAllTrackResponse(
    ) {
        this._trackResponse.clear();
    }

    /**
     * Method removeTrackResponse.
     * 
     * @param vTrackResponse
     * @return true if the object was removed from the collection.
     */
    public boolean removeTrackResponse(
            final com.ups.tracking.trackReply.TrackResponse vTrackResponse) {
        boolean removed = _trackResponse.remove(vTrackResponse);
        return removed;
    }

    /**
     * Method removeTrackResponseAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.TrackResponse removeTrackResponseAt(
            final int index) {
        java.lang.Object obj = this._trackResponse.remove(index);
        return (com.ups.tracking.trackReply.TrackResponse) obj;
    }
    
    /**
     * 
     * 
     * @param index
     * @param vTrackResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTrackResponse(
            final int index,
            final com.ups.tracking.trackReply.TrackResponse vTrackResponse)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trackResponse.size()) {
            throw new IndexOutOfBoundsException("setTrackResponse: Index value '" + index + "' not in range [0.." + (this._trackResponse.size() - 1) + "]");
        }
        
        this._trackResponse.set(index, vTrackResponse);
    }

    /**
     * 
     * 
     * @param vTrackResponseArray
     */
    public void setTrackResponse(
            final com.ups.tracking.trackReply.TrackResponse[] vTrackResponseArray) {
        //-- copy array
        _trackResponse.clear();
        
        for (int i = 0; i < vTrackResponseArray.length; i++) {
                this._trackResponse.add(vTrackResponseArray[i]);
        }
    }
    
	/**
	 * Method isValid.
	 * 
	 * @return true if this object is valid according to the schema
	 */
	public boolean isValid(
			) {
		try {
			validate();
		} catch (org.exolab.castor.xml.ValidationException vex) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * 
	 * @param out
	 * @throws org.exolab.castor.xml.MarshalException if object is
	 * null or if any SAXException is thrown during marshaling
	 * @throws org.exolab.castor.xml.ValidationException if this
	 * object is an invalid instance according to the schema
	 */
	public void marshal(
			final java.io.Writer out)
					throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
		Marshaller.marshal(this, out);
	}

	/**
	 * 
	 * 
	 * @param handler
	 * @throws java.io.IOException if an IOException occurs during
	 * marshaling
	 * @throws org.exolab.castor.xml.ValidationException if this
	 * object is an invalid instance according to the schema
	 * @throws org.exolab.castor.xml.MarshalException if object is
	 * null or if any SAXException is thrown during marshaling
	 */
	public void marshal(
			final org.xml.sax.ContentHandler handler)
					throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
		Marshaller.marshal(this, handler);
	}

	/**
	 * Method unmarshal.
	 * 
	 * @param reader
	 * @throws org.exolab.castor.xml.MarshalException if object is
	 * null or if any SAXException is thrown during marshaling
	 * @throws org.exolab.castor.xml.ValidationException if this
	 * object is an invalid instance according to the schema
	 * @return the unmarshaled com.example.testing.Addres
	 */
	public static com.ups.tracking.trackReply.Body unmarshal(
			final java.io.Reader reader)
					throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
		return (com.ups.tracking.trackReply.Body) Unmarshaller.unmarshal(com.ups.tracking.trackReply.Body.class, reader);
	}

	/**
	 * 
	 * 
	 * @throws org.exolab.castor.xml.ValidationException if this
	 * object is an invalid instance according to the schema
	 */
	public void validate(
			)
					throws org.exolab.castor.xml.ValidationException {
		org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
		validator.validate(this);
	}

}

