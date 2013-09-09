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
 * Class Address.
 * 
 * @version $Revision$ $Date$
 */
public class Address implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _addressLine1.
     */
    private java.lang.String _addressLine1;

    /**
     * Field _addressLine2.
     */
    private java.lang.String _addressLine2;

    /**
     * Field _addressLine3.
     */
    private java.lang.String _addressLine3;

    /**
     * Field _city.
     */
    private java.lang.String _city;

    /**
     * Field _stateProvinceCode.
     */
    private java.lang.String _stateProvinceCode;

    /**
     * Field _postalCode.
     */
    private java.lang.String _postalCode;

    /**
     * Field _countryCode.
     */
    private java.lang.String _countryCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public Address() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'addressLine1'.
     * 
     * @return the value of field 'AddressLine1'.
     */
    public java.lang.String getAddressLine1(
    ) {
        return this._addressLine1;
    }

    /**
     * Returns the value of field 'addressLine2'.
     * 
     * @return the value of field 'AddressLine2'.
     */
    public java.lang.String getAddressLine2(
    ) {
        return this._addressLine2;
    }

    /**
     * Returns the value of field 'addressLine3'.
     * 
     * @return the value of field 'AddressLine3'.
     */
    public java.lang.String getAddressLine3(
    ) {
        return this._addressLine3;
    }

    /**
     * Returns the value of field 'city'.
     * 
     * @return the value of field 'City'.
     */
    public java.lang.String getCity(
    ) {
        return this._city;
    }

    /**
     * Returns the value of field 'countryCode'.
     * 
     * @return the value of field 'CountryCode'.
     */
    public java.lang.String getCountryCode(
    ) {
        return this._countryCode;
    }

    /**
     * Returns the value of field 'postalCode'.
     * 
     * @return the value of field 'PostalCode'.
     */
    public java.lang.String getPostalCode(
    ) {
        return this._postalCode;
    }

    /**
     * Returns the value of field 'stateProvinceCode'.
     * 
     * @return the value of field 'StateProvinceCode'.
     */
    public java.lang.String getStateProvinceCode(
    ) {
        return this._stateProvinceCode;
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
     * Sets the value of field 'addressLine1'.
     * 
     * @param addressLine1 the value of field 'addressLine1'.
     */
    public void setAddressLine1(
            final java.lang.String addressLine1) {
        this._addressLine1 = addressLine1;
    }

    /**
     * Sets the value of field 'addressLine2'.
     * 
     * @param addressLine2 the value of field 'addressLine2'.
     */
    public void setAddressLine2(
            final java.lang.String addressLine2) {
        this._addressLine2 = addressLine2;
    }

    /**
     * Sets the value of field 'addressLine3'.
     * 
     * @param addressLine3 the value of field 'addressLine3'.
     */
    public void setAddressLine3(
            final java.lang.String addressLine3) {
        this._addressLine3 = addressLine3;
    }

    /**
     * Sets the value of field 'city'.
     * 
     * @param city the value of field 'city'.
     */
    public void setCity(
            final java.lang.String city) {
        this._city = city;
    }

    /**
     * Sets the value of field 'countryCode'.
     * 
     * @param countryCode the value of field 'countryCode'.
     */
    public void setCountryCode(
            final java.lang.String countryCode) {
        this._countryCode = countryCode;
    }

    /**
     * Sets the value of field 'postalCode'.
     * 
     * @param postalCode the value of field 'postalCode'.
     */
    public void setPostalCode(
            final java.lang.String postalCode) {
        this._postalCode = postalCode;
    }

    /**
     * Sets the value of field 'stateProvinceCode'.
     * 
     * @param stateProvinceCode the value of field
     * 'stateProvinceCode'.
     */
    public void setStateProvinceCode(
            final java.lang.String stateProvinceCode) {
        this._stateProvinceCode = stateProvinceCode;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.Address
     */
    public static com.ups.tracking.trackReply.Address unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.Address) Unmarshaller.unmarshal(com.ups.tracking.trackReply.Address.class, reader);
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
