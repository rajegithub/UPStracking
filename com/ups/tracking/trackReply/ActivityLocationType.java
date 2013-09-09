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
 * Class ActivityLocationType.
 * 
 * @version $Revision$ $Date$
 */
public class ActivityLocationType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _address.
     */
    private com.ups.tracking.trackReply.Address _address;

    /**
     * Field _addressArtifactFormat.
     */
    private com.ups.tracking.trackReply.AddressArtifactFormat _addressArtifactFormat;

    /**
     * Field _transportFacility.
     */
    private com.ups.tracking.trackReply.TransportFacility _transportFacility;

    /**
     * Field _code.
     */
    private java.lang.String _code;

    /**
     * Field _description.
     */
    private java.lang.String _description;

    /**
     * Field _signedForByName.
     */
    private java.lang.String _signedForByName;

    /**
     * Field _signatureImage.
     */
    private com.ups.tracking.trackReply.SignatureImage _signatureImage;

    /**
     * Field _PODLetter.
     */
    private com.ups.tracking.trackReply.PODLetter _PODLetter;

    /**
     * Field _electronicDeliveryNotification.
     */
    private com.ups.tracking.trackReply.ElectronicDeliveryNotification _electronicDeliveryNotification;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActivityLocationType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'Address'.
     */
    public com.ups.tracking.trackReply.Address getAddress(
    ) {
        return this._address;
    }

    /**
     * Returns the value of field 'addressArtifactFormat'.
     * 
     * @return the value of field 'AddressArtifactFormat'.
     */
    public com.ups.tracking.trackReply.AddressArtifactFormat getAddressArtifactFormat(
    ) {
        return this._addressArtifactFormat;
    }

    /**
     * Returns the value of field 'code'.
     * 
     * @return the value of field 'Code'.
     */
    public java.lang.String getCode(
    ) {
        return this._code;
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
     * Returns the value of field 'electronicDeliveryNotification'.
     * 
     * @return the value of field 'ElectronicDeliveryNotification'.
     */
    public com.ups.tracking.trackReply.ElectronicDeliveryNotification getElectronicDeliveryNotification(
    ) {
        return this._electronicDeliveryNotification;
    }

    /**
     * Returns the value of field 'PODLetter'.
     * 
     * @return the value of field 'PODLetter'.
     */
    public com.ups.tracking.trackReply.PODLetter getPODLetter(
    ) {
        return this._PODLetter;
    }

    /**
     * Returns the value of field 'signatureImage'.
     * 
     * @return the value of field 'SignatureImage'.
     */
    public com.ups.tracking.trackReply.SignatureImage getSignatureImage(
    ) {
        return this._signatureImage;
    }

    /**
     * Returns the value of field 'signedForByName'.
     * 
     * @return the value of field 'SignedForByName'.
     */
    public java.lang.String getSignedForByName(
    ) {
        return this._signedForByName;
    }

    /**
     * Returns the value of field 'transportFacility'.
     * 
     * @return the value of field 'TransportFacility'.
     */
    public com.ups.tracking.trackReply.TransportFacility getTransportFacility(
    ) {
        return this._transportFacility;
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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
     */
    public void setAddress(
            final com.ups.tracking.trackReply.Address address) {
        this._address = address;
    }

    /**
     * Sets the value of field 'addressArtifactFormat'.
     * 
     * @param addressArtifactFormat the value of field
     * 'addressArtifactFormat'.
     */
    public void setAddressArtifactFormat(
            final com.ups.tracking.trackReply.AddressArtifactFormat addressArtifactFormat) {
        this._addressArtifactFormat = addressArtifactFormat;
    }

    /**
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(
            final java.lang.String code) {
        this._code = code;
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
     * Sets the value of field 'electronicDeliveryNotification'.
     * 
     * @param electronicDeliveryNotification the value of field
     * 'electronicDeliveryNotification'.
     */
    public void setElectronicDeliveryNotification(
            final com.ups.tracking.trackReply.ElectronicDeliveryNotification electronicDeliveryNotification) {
        this._electronicDeliveryNotification = electronicDeliveryNotification;
    }

    /**
     * Sets the value of field 'PODLetter'.
     * 
     * @param PODLetter the value of field 'PODLetter'.
     */
    public void setPODLetter(
            final com.ups.tracking.trackReply.PODLetter PODLetter) {
        this._PODLetter = PODLetter;
    }

    /**
     * Sets the value of field 'signatureImage'.
     * 
     * @param signatureImage the value of field 'signatureImage'.
     */
    public void setSignatureImage(
            final com.ups.tracking.trackReply.SignatureImage signatureImage) {
        this._signatureImage = signatureImage;
    }

    /**
     * Sets the value of field 'signedForByName'.
     * 
     * @param signedForByName the value of field 'signedForByName'.
     */
    public void setSignedForByName(
            final java.lang.String signedForByName) {
        this._signedForByName = signedForByName;
    }

    /**
     * Sets the value of field 'transportFacility'.
     * 
     * @param transportFacility the value of field
     * 'transportFacility'.
     */
    public void setTransportFacility(
            final com.ups.tracking.trackReply.TransportFacility transportFacility) {
        this._transportFacility = transportFacility;
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
     * com.ups.tracking.trackReply.ActivityLocationType
     */
    public static com.ups.tracking.trackReply.ActivityLocationType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.ActivityLocationType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.ActivityLocationType.class, reader);
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
