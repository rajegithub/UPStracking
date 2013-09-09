package com.ups.tracking;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class Envelope implements java.io.Serializable {


	//--------------------------/
	//- Class/Member Variables -/
	//--------------------------/

	/**
	 * Field _city.
	 */
	private java.lang.String _header;

	/**
	 * Field _stateOrProvinceCode.
	 */
	private java.util.Vector _body;


	//----------------/
	//- Constructors -/
	//----------------/

	public Envelope() {
		super();
		this._body = new java.util.Vector();
	}


	//-----------/
	//- Methods -/
	//-----------/

	public java.lang.String getHeader() {
		return _header;
	}


	public void setHeader(java.lang.String _header) {
		this._header = _header;
	}


    /**
     * 
     * 
     * @param vBody
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBody(
            final com.fedex.trackreply.Body vBody)
    throws java.lang.IndexOutOfBoundsException {
        this._body.addElement(vBody);
    }
    
    /**
     * 
     * 
     * @param index
     * @param vBody
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBody(
            final int index,
            final com.fedex.trackreply.Body vBody)
    throws java.lang.IndexOutOfBoundsException {
        this._body.addElement(vBody);
    }
    
    public java.util.Enumeration enumerateBody(
    ) {
        return this._body.elements();
    }
    //----------------------------------------------------
    /**
     * Method getBody.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.example.testing.Body at the given
     * index
     */
    public com.fedex.trackreply.Body getBody(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._body.size()) {
            throw new IndexOutOfBoundsException("getBody: Index value '" + index + "' not in range [0.." + (this._body.size() - 1) + "]");
        }
        
        return (com.fedex.trackreply.Body) _body.get(index);
    }

    /**
     * Method getBody.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.fedex.trackreply.Body[] getBody(
    ) {
        com.fedex.trackreply.Body[] array = new com.fedex.trackreply.Body[0];
        return (com.fedex.trackreply.Body[]) this._body.toArray(array);
    }

    /**
     * Method getBodyCount.
     * 
     * @return the size of this collection
     */
    public int getBodyCount(
    ) {
        return this._body.size();
    }
    
    /**
     */
    public void removeAllBody(
    ) {
        this._body.clear();
    }

    /**
     * Method removeBody.
     * 
     * @param vBody
     * @return true if the object was removed from the collection.
     */
    public boolean removeBody(
            final com.fedex.trackreply.Body vBody) {
        boolean removed = _body.remove(vBody);
        return removed;
    }

    /**
     * Method removeBodyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.fedex.trackreply.Body removeBodyAt(
            final int index) {
        java.lang.Object obj = this._body.remove(index);
        return (com.fedex.trackreply.Body) obj;
    }
    
    /**
     * 
     * 
     * @param index
     * @param vBody
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBody(
            final int index,
            final com.fedex.trackreply.Body vBody)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._body.size()) {
            throw new IndexOutOfBoundsException("setBody: Index value '" + index + "' not in range [0.." + (this._body.size() - 1) + "]");
        }
        
        this._body.set(index, vBody);
    }

    /**
     * 
     * 
     * @param vBodyArray
     */
    public void setBody(
            final com.fedex.trackreply.Body[] vBodyArray) {
        //-- copy array
        _body.clear();
        
        for (int i = 0; i < vBodyArray.length; i++) {
                this._body.add(vBodyArray[i]);
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
	public static com.fedex.trackreply.Envelope unmarshal(
			final java.io.Reader reader)
					throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
		return (com.fedex.trackreply.Envelope) Unmarshaller.unmarshal(com.fedex.trackreply.Envelope.class, reader);
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
