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
 * Class ErrorLocation.
 * 
 * @version $Revision$ $Date$
 */
public class ErrorLocation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _errorLocationElementName.
     */
    private java.lang.String _errorLocationElementName;

    /**
     * Field _errorLocationElementReference.
     */
    private java.lang.String _errorLocationElementReference;

    /**
     * Field _errorLocationAttributeName.
     */
    private java.lang.String _errorLocationAttributeName;


      //----------------/
     //- Constructors -/
    //----------------/

    public ErrorLocation() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'errorLocationAttributeName'.
     * 
     * @return the value of field 'ErrorLocationAttributeName'.
     */
    public java.lang.String getErrorLocationAttributeName(
    ) {
        return this._errorLocationAttributeName;
    }

    /**
     * Returns the value of field 'errorLocationElementName'.
     * 
     * @return the value of field 'ErrorLocationElementName'.
     */
    public java.lang.String getErrorLocationElementName(
    ) {
        return this._errorLocationElementName;
    }

    /**
     * Returns the value of field 'errorLocationElementReference'.
     * 
     * @return the value of field 'ErrorLocationElementReference'.
     */
    public java.lang.String getErrorLocationElementReference(
    ) {
        return this._errorLocationElementReference;
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
     * Sets the value of field 'errorLocationAttributeName'.
     * 
     * @param errorLocationAttributeName the value of field
     * 'errorLocationAttributeName'.
     */
    public void setErrorLocationAttributeName(
            final java.lang.String errorLocationAttributeName) {
        this._errorLocationAttributeName = errorLocationAttributeName;
    }

    /**
     * Sets the value of field 'errorLocationElementName'.
     * 
     * @param errorLocationElementName the value of field
     * 'errorLocationElementName'.
     */
    public void setErrorLocationElementName(
            final java.lang.String errorLocationElementName) {
        this._errorLocationElementName = errorLocationElementName;
    }

    /**
     * Sets the value of field 'errorLocationElementReference'.
     * 
     * @param errorLocationElementReference the value of field
     * 'errorLocationElementReference'.
     */
    public void setErrorLocationElementReference(
            final java.lang.String errorLocationElementReference) {
        this._errorLocationElementReference = errorLocationElementReference;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.ups.tracking.trackReply.ErrorLocation
     */
    public static com.ups.tracking.trackReply.ErrorLocation unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.ErrorLocation) Unmarshaller.unmarshal(com.ups.tracking.trackReply.ErrorLocation.class, reader);
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
