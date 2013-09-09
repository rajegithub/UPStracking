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
 * Class CarrierActivityInformationType.
 * 
 * @version $Revision$ $Date$
 */
public class CarrierActivityInformationType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _carrierId.
     */
    private java.lang.String _carrierId;

    /**
     * Field _description.
     */
    private java.lang.String _description;

    /**
     * Field _status.
     */
    private java.lang.String _status;

    /**
     * Field _arrival.
     */
    private com.ups.tracking.trackReply.Arrival _arrival;

    /**
     * Field _departure.
     */
    private com.ups.tracking.trackReply.Departure _departure;

    /**
     * Field _originPort.
     */
    private java.lang.String _originPort;

    /**
     * Field _destinationPort.
     */
    private java.lang.String _destinationPort;


      //----------------/
     //- Constructors -/
    //----------------/

    public CarrierActivityInformationType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'arrival'.
     * 
     * @return the value of field 'Arrival'.
     */
    public com.ups.tracking.trackReply.Arrival getArrival(
    ) {
        return this._arrival;
    }

    /**
     * Returns the value of field 'carrierId'.
     * 
     * @return the value of field 'CarrierId'.
     */
    public java.lang.String getCarrierId(
    ) {
        return this._carrierId;
    }

    /**
     * Returns the value of field 'departure'.
     * 
     * @return the value of field 'Departure'.
     */
    public com.ups.tracking.trackReply.Departure getDeparture(
    ) {
        return this._departure;
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
     * Returns the value of field 'destinationPort'.
     * 
     * @return the value of field 'DestinationPort'.
     */
    public java.lang.String getDestinationPort(
    ) {
        return this._destinationPort;
    }

    /**
     * Returns the value of field 'originPort'.
     * 
     * @return the value of field 'OriginPort'.
     */
    public java.lang.String getOriginPort(
    ) {
        return this._originPort;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
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
     * Sets the value of field 'arrival'.
     * 
     * @param arrival the value of field 'arrival'.
     */
    public void setArrival(
            final com.ups.tracking.trackReply.Arrival arrival) {
        this._arrival = arrival;
    }

    /**
     * Sets the value of field 'carrierId'.
     * 
     * @param carrierId the value of field 'carrierId'.
     */
    public void setCarrierId(
            final java.lang.String carrierId) {
        this._carrierId = carrierId;
    }

    /**
     * Sets the value of field 'departure'.
     * 
     * @param departure the value of field 'departure'.
     */
    public void setDeparture(
            final com.ups.tracking.trackReply.Departure departure) {
        this._departure = departure;
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
     * Sets the value of field 'destinationPort'.
     * 
     * @param destinationPort the value of field 'destinationPort'.
     */
    public void setDestinationPort(
            final java.lang.String destinationPort) {
        this._destinationPort = destinationPort;
    }

    /**
     * Sets the value of field 'originPort'.
     * 
     * @param originPort the value of field 'originPort'.
     */
    public void setOriginPort(
            final java.lang.String originPort) {
        this._originPort = originPort;
    }

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
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
     * com.ups.tracking.trackReply.CarrierActivityInformationType
     */
    public static com.ups.tracking.trackReply.CarrierActivityInformationType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.CarrierActivityInformationType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.CarrierActivityInformationType.class, reader);
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
