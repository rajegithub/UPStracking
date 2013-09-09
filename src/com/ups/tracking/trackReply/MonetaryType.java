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
 * Class MonetaryType.
 * 
 * @version $Revision$ $Date$
 */
public class MonetaryType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _currencyCode.
     */
    private java.lang.String _currencyCode;

    /**
     * Field _monetaryValue.
     */
    private java.lang.String _monetaryValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public MonetaryType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'currencyCode'.
     * 
     * @return the value of field 'CurrencyCode'.
     */
    public java.lang.String getCurrencyCode(
    ) {
        return this._currencyCode;
    }

    /**
     * Returns the value of field 'monetaryValue'.
     * 
     * @return the value of field 'MonetaryValue'.
     */
    public java.lang.String getMonetaryValue(
    ) {
        return this._monetaryValue;
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
     * Sets the value of field 'currencyCode'.
     * 
     * @param currencyCode the value of field 'currencyCode'.
     */
    public void setCurrencyCode(
            final java.lang.String currencyCode) {
        this._currencyCode = currencyCode;
    }

    /**
     * Sets the value of field 'monetaryValue'.
     * 
     * @param monetaryValue the value of field 'monetaryValue'.
     */
    public void setMonetaryValue(
            final java.lang.String monetaryValue) {
        this._monetaryValue = monetaryValue;
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
     * com.ups.tracking.trackReply.MonetaryType
     */
    public static com.ups.tracking.trackReply.MonetaryType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.MonetaryType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.MonetaryType.class, reader);
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
