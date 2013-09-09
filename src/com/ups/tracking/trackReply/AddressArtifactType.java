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
 * Class AddressArtifactType.
 * 
 * @version $Revision$ $Date$
 */
public class AddressArtifactType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _streetNumberLow.
     */
    private java.lang.String _streetNumberLow;

    /**
     * Field _streetPrefix.
     */
    private java.lang.String _streetPrefix;

    /**
     * Field _streetName.
     */
    private java.lang.String _streetName;

    /**
     * Field _streetSuffix.
     */
    private java.lang.String _streetSuffix;

    /**
     * Field _streetType.
     */
    private java.lang.String _streetType;

    /**
     * Field _politicalDivision2.
     */
    private java.lang.String _politicalDivision2;

    /**
     * Field _politicalDivision1.
     */
    private java.lang.String _politicalDivision1;

    /**
     * Field _postcodePrimaryLow.
     */
    private java.lang.String _postcodePrimaryLow;

    /**
     * Field _countryCode.
     */
    private java.lang.String _countryCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public AddressArtifactType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'politicalDivision1'.
     * 
     * @return the value of field 'PoliticalDivision1'.
     */
    public java.lang.String getPoliticalDivision1(
    ) {
        return this._politicalDivision1;
    }

    /**
     * Returns the value of field 'politicalDivision2'.
     * 
     * @return the value of field 'PoliticalDivision2'.
     */
    public java.lang.String getPoliticalDivision2(
    ) {
        return this._politicalDivision2;
    }

    /**
     * Returns the value of field 'postcodePrimaryLow'.
     * 
     * @return the value of field 'PostcodePrimaryLow'.
     */
    public java.lang.String getPostcodePrimaryLow(
    ) {
        return this._postcodePrimaryLow;
    }

    /**
     * Returns the value of field 'streetName'.
     * 
     * @return the value of field 'StreetName'.
     */
    public java.lang.String getStreetName(
    ) {
        return this._streetName;
    }

    /**
     * Returns the value of field 'streetNumberLow'.
     * 
     * @return the value of field 'StreetNumberLow'.
     */
    public java.lang.String getStreetNumberLow(
    ) {
        return this._streetNumberLow;
    }

    /**
     * Returns the value of field 'streetPrefix'.
     * 
     * @return the value of field 'StreetPrefix'.
     */
    public java.lang.String getStreetPrefix(
    ) {
        return this._streetPrefix;
    }

    /**
     * Returns the value of field 'streetSuffix'.
     * 
     * @return the value of field 'StreetSuffix'.
     */
    public java.lang.String getStreetSuffix(
    ) {
        return this._streetSuffix;
    }

    /**
     * Returns the value of field 'streetType'.
     * 
     * @return the value of field 'StreetType'.
     */
    public java.lang.String getStreetType(
    ) {
        return this._streetType;
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
     * Sets the value of field 'countryCode'.
     * 
     * @param countryCode the value of field 'countryCode'.
     */
    public void setCountryCode(
            final java.lang.String countryCode) {
        this._countryCode = countryCode;
    }

    /**
     * Sets the value of field 'politicalDivision1'.
     * 
     * @param politicalDivision1 the value of field
     * 'politicalDivision1'.
     */
    public void setPoliticalDivision1(
            final java.lang.String politicalDivision1) {
        this._politicalDivision1 = politicalDivision1;
    }

    /**
     * Sets the value of field 'politicalDivision2'.
     * 
     * @param politicalDivision2 the value of field
     * 'politicalDivision2'.
     */
    public void setPoliticalDivision2(
            final java.lang.String politicalDivision2) {
        this._politicalDivision2 = politicalDivision2;
    }

    /**
     * Sets the value of field 'postcodePrimaryLow'.
     * 
     * @param postcodePrimaryLow the value of field
     * 'postcodePrimaryLow'.
     */
    public void setPostcodePrimaryLow(
            final java.lang.String postcodePrimaryLow) {
        this._postcodePrimaryLow = postcodePrimaryLow;
    }

    /**
     * Sets the value of field 'streetName'.
     * 
     * @param streetName the value of field 'streetName'.
     */
    public void setStreetName(
            final java.lang.String streetName) {
        this._streetName = streetName;
    }

    /**
     * Sets the value of field 'streetNumberLow'.
     * 
     * @param streetNumberLow the value of field 'streetNumberLow'.
     */
    public void setStreetNumberLow(
            final java.lang.String streetNumberLow) {
        this._streetNumberLow = streetNumberLow;
    }

    /**
     * Sets the value of field 'streetPrefix'.
     * 
     * @param streetPrefix the value of field 'streetPrefix'.
     */
    public void setStreetPrefix(
            final java.lang.String streetPrefix) {
        this._streetPrefix = streetPrefix;
    }

    /**
     * Sets the value of field 'streetSuffix'.
     * 
     * @param streetSuffix the value of field 'streetSuffix'.
     */
    public void setStreetSuffix(
            final java.lang.String streetSuffix) {
        this._streetSuffix = streetSuffix;
    }

    /**
     * Sets the value of field 'streetType'.
     * 
     * @param streetType the value of field 'streetType'.
     */
    public void setStreetType(
            final java.lang.String streetType) {
        this._streetType = streetType;
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
     * com.ups.tracking.trackReply.AddressArtifactType
     */
    public static com.ups.tracking.trackReply.AddressArtifactType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.AddressArtifactType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.AddressArtifactType.class, reader);
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
