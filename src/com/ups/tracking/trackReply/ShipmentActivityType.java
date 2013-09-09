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
 * Class ShipmentActivityType.
 * 
 * @version $Revision$ $Date$
 */
public class ShipmentActivityType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _activityLocation.
     */
    private com.ups.tracking.trackReply.ActivityLocation _activityLocation;

    /**
     * Field _description.
     */
    private java.lang.String _description;

    /**
     * Field _date.
     */
    private java.lang.String _date;

    /**
     * Field _time.
     */
    private java.lang.String _time;

    /**
     * Field _trailer.
     */
    private java.lang.String _trailer;


      //----------------/
     //- Constructors -/
    //----------------/

    public ShipmentActivityType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'activityLocation'.
     * 
     * @return the value of field 'ActivityLocation'.
     */
    public com.ups.tracking.trackReply.ActivityLocation getActivityLocation(
    ) {
        return this._activityLocation;
    }

    /**
     * Returns the value of field 'date'.
     * 
     * @return the value of field 'Date'.
     */
    public java.lang.String getDate(
    ) {
        return this._date;
    }

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'time'.
     * 
     * @return the value of field 'Time'.
     */
    public java.lang.String getTime(
    ) {
        return this._time;
    }

    /**
     * Returns the value of field 'trailer'.
     * 
     * @return the value of field 'Trailer'.
     */
    public java.lang.String getTrailer(
    ) {
        return this._trailer;
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
     * Sets the value of field 'activityLocation'.
     * 
     * @param activityLocation the value of field 'activityLocation'
     */
    public void setActivityLocation(
            final com.ups.tracking.trackReply.ActivityLocation activityLocation) {
        this._activityLocation = activityLocation;
    }

    /**
     * Sets the value of field 'date'.
     * 
     * @param date the value of field 'date'.
     */
    public void setDate(
            final java.lang.String date) {
        this._date = date;
    }

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'time'.
     * 
     * @param time the value of field 'time'.
     */
    public void setTime(
            final java.lang.String time) {
        this._time = time;
    }

    /**
     * Sets the value of field 'trailer'.
     * 
     * @param trailer the value of field 'trailer'.
     */
    public void setTrailer(
            final java.lang.String trailer) {
        this._trailer = trailer;
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
     * com.ups.tracking.trackReply.ShipmentActivityType
     */
    public static com.ups.tracking.trackReply.ShipmentActivityType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.ShipmentActivityType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.ShipmentActivityType.class, reader);
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
