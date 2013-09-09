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
 * Class Error.
 * 
 * @version $Revision$ $Date$
 */
public class Error implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _errorSeverity.
     */
    private java.lang.String _errorSeverity;

    /**
     * Field _errorCode.
     */
    private java.lang.String _errorCode;

    /**
     * Field _errorDescription.
     */
    private java.lang.String _errorDescription;

    /**
     * Field _minimumRetrySeconds.
     */
    private java.lang.String _minimumRetrySeconds;

    /**
     * Field _errorLocationList.
     */
    private java.util.Vector _errorLocationList;

    /**
     * Field _errorDigestList.
     */
    private java.util.Vector _errorDigestList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Error() {
        super();
        this._errorLocationList = new java.util.Vector();
        this._errorDigestList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vErrorDigest
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addErrorDigest(
            final java.lang.String vErrorDigest)
    throws java.lang.IndexOutOfBoundsException {
        this._errorDigestList.addElement(vErrorDigest);
    }

    /**
     * 
     * 
     * @param index
     * @param vErrorDigest
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addErrorDigest(
            final int index,
            final java.lang.String vErrorDigest)
    throws java.lang.IndexOutOfBoundsException {
        this._errorDigestList.add(index, vErrorDigest);
    }

    /**
     * 
     * 
     * @param vErrorLocation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addErrorLocation(
            final com.ups.tracking.trackReply.ErrorLocation vErrorLocation)
    throws java.lang.IndexOutOfBoundsException {
        this._errorLocationList.addElement(vErrorLocation);
    }

    /**
     * 
     * 
     * @param index
     * @param vErrorLocation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addErrorLocation(
            final int index,
            final com.ups.tracking.trackReply.ErrorLocation vErrorLocation)
    throws java.lang.IndexOutOfBoundsException {
        this._errorLocationList.add(index, vErrorLocation);
    }

    /**
     * Method enumerateErrorDigest.
     * 
     * @return an Enumeration over all java.lang.String elements
     */
    public java.util.Enumeration enumerateErrorDigest(
    ) {
        return this._errorDigestList.elements();
    }

    /**
     * Method enumerateErrorLocation.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.ErrorLocation elements
     */
    public java.util.Enumeration enumerateErrorLocation(
    ) {
        return this._errorLocationList.elements();
    }

    /**
     * Returns the value of field 'errorCode'.
     * 
     * @return the value of field 'ErrorCode'.
     */
    public java.lang.String getErrorCode(
    ) {
        return this._errorCode;
    }

    /**
     * Returns the value of field 'errorDescription'.
     * 
     * @return the value of field 'ErrorDescription'.
     */
    public java.lang.String getErrorDescription(
    ) {
        return this._errorDescription;
    }

    /**
     * Method getErrorDigest.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getErrorDigest(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._errorDigestList.size()) {
            throw new IndexOutOfBoundsException("getErrorDigest: Index value '" + index + "' not in range [0.." + (this._errorDigestList.size() - 1) + "]");
        }
        
        return (java.lang.String) _errorDigestList.get(index);
    }

    /**
     * Method getErrorDigest.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getErrorDigest(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._errorDigestList.toArray(array);
    }

    /**
     * Method getErrorDigestCount.
     * 
     * @return the size of this collection
     */
    public int getErrorDigestCount(
    ) {
        return this._errorDigestList.size();
    }

    /**
     * Method getErrorLocation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.ErrorLocation at the given index
     */
    public com.ups.tracking.trackReply.ErrorLocation getErrorLocation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._errorLocationList.size()) {
            throw new IndexOutOfBoundsException("getErrorLocation: Index value '" + index + "' not in range [0.." + (this._errorLocationList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.ErrorLocation) _errorLocationList.get(index);
    }

    /**
     * Method getErrorLocation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.ErrorLocation[] getErrorLocation(
    ) {
        com.ups.tracking.trackReply.ErrorLocation[] array = new com.ups.tracking.trackReply.ErrorLocation[0];
        return (com.ups.tracking.trackReply.ErrorLocation[]) this._errorLocationList.toArray(array);
    }

    /**
     * Method getErrorLocationCount.
     * 
     * @return the size of this collection
     */
    public int getErrorLocationCount(
    ) {
        return this._errorLocationList.size();
    }

    /**
     * Returns the value of field 'errorSeverity'.
     * 
     * @return the value of field 'ErrorSeverity'.
     */
    public java.lang.String getErrorSeverity(
    ) {
        return this._errorSeverity;
    }

    /**
     * Returns the value of field 'minimumRetrySeconds'.
     * 
     * @return the value of field 'MinimumRetrySeconds'.
     */
    public java.lang.String getMinimumRetrySeconds(
    ) {
        return this._minimumRetrySeconds;
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
    public void removeAllErrorDigest(
    ) {
        this._errorDigestList.clear();
    }

    /**
     */
    public void removeAllErrorLocation(
    ) {
        this._errorLocationList.clear();
    }

    /**
     * Method removeErrorDigest.
     * 
     * @param vErrorDigest
     * @return true if the object was removed from the collection.
     */
    public boolean removeErrorDigest(
            final java.lang.String vErrorDigest) {
        boolean removed = _errorDigestList.remove(vErrorDigest);
        return removed;
    }

    /**
     * Method removeErrorDigestAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeErrorDigestAt(
            final int index) {
        java.lang.Object obj = this._errorDigestList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeErrorLocation.
     * 
     * @param vErrorLocation
     * @return true if the object was removed from the collection.
     */
    public boolean removeErrorLocation(
            final com.ups.tracking.trackReply.ErrorLocation vErrorLocation) {
        boolean removed = _errorLocationList.remove(vErrorLocation);
        return removed;
    }

    /**
     * Method removeErrorLocationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.ErrorLocation removeErrorLocationAt(
            final int index) {
        java.lang.Object obj = this._errorLocationList.remove(index);
        return (com.ups.tracking.trackReply.ErrorLocation) obj;
    }

    /**
     * Sets the value of field 'errorCode'.
     * 
     * @param errorCode the value of field 'errorCode'.
     */
    public void setErrorCode(
            final java.lang.String errorCode) {
        this._errorCode = errorCode;
    }

    /**
     * Sets the value of field 'errorDescription'.
     * 
     * @param errorDescription the value of field 'errorDescription'
     */
    public void setErrorDescription(
            final java.lang.String errorDescription) {
        this._errorDescription = errorDescription;
    }

    /**
     * 
     * 
     * @param index
     * @param vErrorDigest
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setErrorDigest(
            final int index,
            final java.lang.String vErrorDigest)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._errorDigestList.size()) {
            throw new IndexOutOfBoundsException("setErrorDigest: Index value '" + index + "' not in range [0.." + (this._errorDigestList.size() - 1) + "]");
        }
        
        this._errorDigestList.set(index, vErrorDigest);
    }

    /**
     * 
     * 
     * @param vErrorDigestArray
     */
    public void setErrorDigest(
            final java.lang.String[] vErrorDigestArray) {
        //-- copy array
        _errorDigestList.clear();
        
        for (int i = 0; i < vErrorDigestArray.length; i++) {
                this._errorDigestList.add(vErrorDigestArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vErrorLocation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setErrorLocation(
            final int index,
            final com.ups.tracking.trackReply.ErrorLocation vErrorLocation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._errorLocationList.size()) {
            throw new IndexOutOfBoundsException("setErrorLocation: Index value '" + index + "' not in range [0.." + (this._errorLocationList.size() - 1) + "]");
        }
        
        this._errorLocationList.set(index, vErrorLocation);
    }

    /**
     * 
     * 
     * @param vErrorLocationArray
     */
    public void setErrorLocation(
            final com.ups.tracking.trackReply.ErrorLocation[] vErrorLocationArray) {
        //-- copy array
        _errorLocationList.clear();
        
        for (int i = 0; i < vErrorLocationArray.length; i++) {
                this._errorLocationList.add(vErrorLocationArray[i]);
        }
    }

    /**
     * Sets the value of field 'errorSeverity'.
     * 
     * @param errorSeverity the value of field 'errorSeverity'.
     */
    public void setErrorSeverity(
            final java.lang.String errorSeverity) {
        this._errorSeverity = errorSeverity;
    }

    /**
     * Sets the value of field 'minimumRetrySeconds'.
     * 
     * @param minimumRetrySeconds the value of field
     * 'minimumRetrySeconds'.
     */
    public void setMinimumRetrySeconds(
            final java.lang.String minimumRetrySeconds) {
        this._minimumRetrySeconds = minimumRetrySeconds;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.Error
     */
    public static com.ups.tracking.trackReply.Error unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.Error) Unmarshaller.unmarshal(com.ups.tracking.trackReply.Error.class, reader);
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
