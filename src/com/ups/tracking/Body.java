package com.ups.tracking;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class Body implements java.io.Serializable {


	//--------------------------/
	//- Class/Member Variables -/
	//--------------------------/

	/**
	 * Field _trackReply.
	 */
	private java.util.Vector _trackReply;


	//----------------/
	//- Constructors -/
	//----------------/

	public Body() {
		super();
		this._trackReply = new java.util.Vector();
	}


	//-----------/
	//- Methods -/
	//-----------/

    /**
     * 
     * 
     * @param vTrackReply
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrackReply(
            final com.fedex.trackreply.TrackReply vTrackReply)
    throws java.lang.IndexOutOfBoundsException {
        this._trackReply.addElement(vTrackReply);
    }
    
    /**
     * 
     * 
     * @param index
     * @param vTrackReply
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrackReply(
            final int index,
            final com.fedex.trackreply.TrackReply vTrackReply)
    throws java.lang.IndexOutOfBoundsException {
        this._trackReply.addElement(vTrackReply);
    }
    
    public java.util.Enumeration enumerateTrackReply(
    ) {
        return this._trackReply.elements();
    }

    /**
     * Method getTrackReply.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.example.testing.TrackReply at the given
     * index
     */
    public com.fedex.trackreply.TrackReply getTrackReply(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trackReply.size()) {
            throw new IndexOutOfBoundsException("getTrackReply: Index value '" + index + "' not in range [0.." + (this._trackReply.size() - 1) + "]");
        }
        
        return (com.fedex.trackreply.TrackReply) _trackReply.get(index);
    }

    /**
     * Method getTrackReply.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.fedex.trackreply.TrackReply[] getTrackReply(
    ) {
        com.fedex.trackreply.TrackReply[] array = new com.fedex.trackreply.TrackReply[0];
        return (com.fedex.trackreply.TrackReply[]) this._trackReply.toArray(array);
    }

    /**
     * Method getTrackReplyCount.
     * 
     * @return the size of this collection
     */
    public int getTrackReplyCount(
    ) {
        return this._trackReply.size();
    }
    
    /**
     */
    public void removeAllTrackReply(
    ) {
        this._trackReply.clear();
    }

    /**
     * Method removeTrackReply.
     * 
     * @param vTrackReply
     * @return true if the object was removed from the collection.
     */
    public boolean removeTrackReply(
            final com.fedex.trackreply.TrackReply vTrackReply) {
        boolean removed = _trackReply.remove(vTrackReply);
        return removed;
    }

    /**
     * Method removeTrackReplyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.fedex.trackreply.TrackReply removeTrackReplyAt(
            final int index) {
        java.lang.Object obj = this._trackReply.remove(index);
        return (com.fedex.trackreply.TrackReply) obj;
    }
    
    /**
     * 
     * 
     * @param index
     * @param vTrackReply
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTrackReply(
            final int index,
            final com.fedex.trackreply.TrackReply vTrackReply)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trackReply.size()) {
            throw new IndexOutOfBoundsException("setTrackReply: Index value '" + index + "' not in range [0.." + (this._trackReply.size() - 1) + "]");
        }
        
        this._trackReply.set(index, vTrackReply);
    }

    /**
     * 
     * 
     * @param vTrackReplyArray
     */
    public void setTrackReply(
            final com.fedex.trackreply.TrackReply[] vTrackReplyArray) {
        //-- copy array
        _trackReply.clear();
        
        for (int i = 0; i < vTrackReplyArray.length; i++) {
                this._trackReply.add(vTrackReplyArray[i]);
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
	public static com.fedex.trackreply.Body unmarshal(
			final java.io.Reader reader)
					throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
		return (com.fedex.trackreply.Body) Unmarshaller.unmarshal(com.fedex.trackreply.Body.class, reader);
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

