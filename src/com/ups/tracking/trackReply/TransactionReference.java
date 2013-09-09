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
 * Class TransactionReference.
 * 
 * @version $Revision$ $Date$
 */
public class TransactionReference implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _customerContext.
     */
    private java.lang.String _customerContext;

    /**
     * Field _transactionIdentifier.
     */
    private java.lang.String _transactionIdentifier;

    /**
     * Field _xpciVersion.
     */
    private java.lang.String _xpciVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public TransactionReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'customerContext'.
     * 
     * @return the value of field 'CustomerContext'.
     */
    public java.lang.String getCustomerContext(
    ) {
        return this._customerContext;
    }

    /**
     * Returns the value of field 'transactionIdentifier'.
     * 
     * @return the value of field 'TransactionIdentifier'.
     */
    public java.lang.String getTransactionIdentifier(
    ) {
        return this._transactionIdentifier;
    }

    /**
     * Returns the value of field 'xpciVersion'.
     * 
     * @return the value of field 'XpciVersion'.
     */
    public java.lang.String getXpciVersion(
    ) {
        return this._xpciVersion;
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
     * Sets the value of field 'customerContext'.
     * 
     * @param customerContext the value of field 'customerContext'.
     */
    public void setCustomerContext(
            final java.lang.String customerContext) {
        this._customerContext = customerContext;
    }

    /**
     * Sets the value of field 'transactionIdentifier'.
     * 
     * @param transactionIdentifier the value of field
     * 'transactionIdentifier'.
     */
    public void setTransactionIdentifier(
            final java.lang.String transactionIdentifier) {
        this._transactionIdentifier = transactionIdentifier;
    }

    /**
     * Sets the value of field 'xpciVersion'.
     * 
     * @param xpciVersion the value of field 'xpciVersion'.
     */
    public void setXpciVersion(
            final java.lang.String xpciVersion) {
        this._xpciVersion = xpciVersion;
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
     * com.ups.tracking.trackReply.TransactionReference
     */
    public static com.ups.tracking.trackReply.TransactionReference unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.TransactionReference) Unmarshaller.unmarshal(com.ups.tracking.trackReply.TransactionReference.class, reader);
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
