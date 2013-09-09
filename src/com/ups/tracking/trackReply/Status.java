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
 * Class Status.
 * 
 * @version $Revision$ $Date$
 */
public class Status implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _statusType.
     */
    private com.ups.tracking.trackReply.StatusType _statusType;

    /**
     * Field _statusCode.
     */
    private com.ups.tracking.trackReply.StatusCode _statusCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public Status() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'statusCode'.
     * 
     * @return the value of field 'StatusCode'.
     */
    public com.ups.tracking.trackReply.StatusCode getStatusCode(
    ) {
        return this._statusCode;
    }

    /**
     * Returns the value of field 'statusType'.
     * 
     * @return the value of field 'StatusType'.
     */
    public com.ups.tracking.trackReply.StatusType getStatusType(
    ) {
        return this._statusType;
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
     * Sets the value of field 'statusCode'.
     * 
     * @param statusCode the value of field 'statusCode'.
     */
    public void setStatusCode(
            final com.ups.tracking.trackReply.StatusCode statusCode) {
        this._statusCode = statusCode;
    }

    /**
     * Sets the value of field 'statusType'.
     * 
     * @param statusType the value of field 'statusType'.
     */
    public void setStatusType(
            final com.ups.tracking.trackReply.StatusType statusType) {
        this._statusType = statusType;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.Status
     */
    public static com.ups.tracking.trackReply.Status unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.Status) Unmarshaller.unmarshal(com.ups.tracking.trackReply.Status.class, reader);
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
