/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ups.tracking.trackReply;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Response.
 * 
 * @version $Revision$ $Date$
 */
public class Response implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _transactionReference.
     */
    private com.ups.tracking.trackReply.TransactionReference _transactionReference;

    /**
     * Field _responseStatusCode.
     */
    private java.lang.String _responseStatusCode;

    /**
     * Field _responseStatusDescription.
     */
    private java.lang.String _responseStatusDescription;

    /**
     * Field _errorList.
     */
    private java.util.Vector _errorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Response() {
        super();
        this._errorList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vError
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addError(
            final com.ups.tracking.trackReply.Error vError)
    throws java.lang.IndexOutOfBoundsException {
        this._errorList.addElement(vError);
    }

    /**
     * 
     * 
     * @param index
     * @param vError
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addError(
            final int index,
            final com.ups.tracking.trackReply.Error vError)
    throws java.lang.IndexOutOfBoundsException {
        this._errorList.add(index, vError);
    }

    /**
     * Method enumerateError.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Error elements
     */
    public java.util.Enumeration enumerateError(
    ) {
        return this._errorList.elements();
    }

    /**
     * Method getError.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the com.ups.tracking.trackReply.Error
     * at the given index
     */
    public com.ups.tracking.trackReply.Error getError(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._errorList.size()) {
            throw new IndexOutOfBoundsException("getError: Index value '" + index + "' not in range [0.." + (this._errorList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Error) _errorList.get(index);
    }

    /**
     * Method getError.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Error[] getError(
    ) {
        com.ups.tracking.trackReply.Error[] array = new com.ups.tracking.trackReply.Error[0];
        return (com.ups.tracking.trackReply.Error[]) this._errorList.toArray(array);
    }

    /**
     * Method getErrorCount.
     * 
     * @return the size of this collection
     */
    public int getErrorCount(
    ) {
        return this._errorList.size();
    }

    /**
     * Returns the value of field 'responseStatusCode'.
     * 
     * @return the value of field 'ResponseStatusCode'.
     */
    public java.lang.String getResponseStatusCode(
    ) {
        return this._responseStatusCode;
    }

    /**
     * Returns the value of field 'responseStatusDescription'.
     * 
     * @return the value of field 'ResponseStatusDescription'.
     */
    public java.lang.String getResponseStatusDescription(
    ) {
        return this._responseStatusDescription;
    }

    /**
     * Returns the value of field 'transactionReference'.
     * 
     * @return the value of field 'TransactionReference'.
     */
    public com.ups.tracking.trackReply.TransactionReference getTransactionReference(
    ) {
        return this._transactionReference;
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
     */
    public void removeAllError(
    ) {
        this._errorList.clear();
    }

    /**
     * Method removeError.
     * 
     * @param vError
     * @return true if the object was removed from the collection.
     */
    public boolean removeError(
            final com.ups.tracking.trackReply.Error vError) {
        boolean removed = _errorList.remove(vError);
        return removed;
    }

    /**
     * Method removeErrorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Error removeErrorAt(
            final int index) {
        java.lang.Object obj = this._errorList.remove(index);
        return (com.ups.tracking.trackReply.Error) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vError
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setError(
            final int index,
            final com.ups.tracking.trackReply.Error vError)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._errorList.size()) {
            throw new IndexOutOfBoundsException("setError: Index value '" + index + "' not in range [0.." + (this._errorList.size() - 1) + "]");
        }
        
        this._errorList.set(index, vError);
    }

    /**
     * 
     * 
     * @param vErrorArray
     */
    public void setError(
            final com.ups.tracking.trackReply.Error[] vErrorArray) {
        //-- copy array
        _errorList.clear();
        
        for (int i = 0; i < vErrorArray.length; i++) {
                this._errorList.add(vErrorArray[i]);
        }
    }

    /**
     * Sets the value of field 'responseStatusCode'.
     * 
     * @param responseStatusCode the value of field
     * 'responseStatusCode'.
     */
    public void setResponseStatusCode(
            final java.lang.String responseStatusCode) {
        this._responseStatusCode = responseStatusCode;
    }

    /**
     * Sets the value of field 'responseStatusDescription'.
     * 
     * @param responseStatusDescription the value of field
     * 'responseStatusDescription'.
     */
    public void setResponseStatusDescription(
            final java.lang.String responseStatusDescription) {
        this._responseStatusDescription = responseStatusDescription;
    }

    /**
     * Sets the value of field 'transactionReference'.
     * 
     * @param transactionReference the value of field
     * 'transactionReference'.
     */
    public void setTransactionReference(
            final com.ups.tracking.trackReply.TransactionReference transactionReference) {
        this._transactionReference = transactionReference;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.Response
     */
    public static com.ups.tracking.trackReply.Response unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.Response) Unmarshaller.unmarshal(com.ups.tracking.trackReply.Response.class, reader);
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
