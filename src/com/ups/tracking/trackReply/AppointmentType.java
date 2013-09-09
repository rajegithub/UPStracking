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
 * Class AppointmentType.
 * 
 * @version $Revision$ $Date$
 */
public class AppointmentType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _made.
     */
    private com.ups.tracking.trackReply.Made _made;

    /**
     * Field _requested.
     */
    private com.ups.tracking.trackReply.Requested _requested;

    /**
     * Field _beginTime.
     */
    private java.lang.String _beginTime;

    /**
     * Field _endTime.
     */
    private java.lang.String _endTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public AppointmentType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'beginTime'.
     * 
     * @return the value of field 'BeginTime'.
     */
    public java.lang.String getBeginTime(
    ) {
        return this._beginTime;
    }

    /**
     * Returns the value of field 'endTime'.
     * 
     * @return the value of field 'EndTime'.
     */
    public java.lang.String getEndTime(
    ) {
        return this._endTime;
    }

    /**
     * Returns the value of field 'made'.
     * 
     * @return the value of field 'Made'.
     */
    public com.ups.tracking.trackReply.Made getMade(
    ) {
        return this._made;
    }

    /**
     * Returns the value of field 'requested'.
     * 
     * @return the value of field 'Requested'.
     */
    public com.ups.tracking.trackReply.Requested getRequested(
    ) {
        return this._requested;
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
     * Sets the value of field 'beginTime'.
     * 
     * @param beginTime the value of field 'beginTime'.
     */
    public void setBeginTime(
            final java.lang.String beginTime) {
        this._beginTime = beginTime;
    }

    /**
     * Sets the value of field 'endTime'.
     * 
     * @param endTime the value of field 'endTime'.
     */
    public void setEndTime(
            final java.lang.String endTime) {
        this._endTime = endTime;
    }

    /**
     * Sets the value of field 'made'.
     * 
     * @param made the value of field 'made'.
     */
    public void setMade(
            final com.ups.tracking.trackReply.Made made) {
        this._made = made;
    }

    /**
     * Sets the value of field 'requested'.
     * 
     * @param requested the value of field 'requested'.
     */
    public void setRequested(
            final com.ups.tracking.trackReply.Requested requested) {
        this._requested = requested;
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
     * com.ups.tracking.trackReply.AppointmentType
     */
    public static com.ups.tracking.trackReply.AppointmentType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.AppointmentType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.AppointmentType.class, reader);
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
