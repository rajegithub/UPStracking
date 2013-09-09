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
 * Class PackageCOD.
 * 
 * @version $Revision$ $Date$
 */
public class PackageCOD implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _CODAmount.
     */
    private com.ups.tracking.trackReply.CODAmount _CODAmount;

    /**
     * Field _controlNumber.
     */
    private java.lang.String _controlNumber;

    /**
     * Field _CODStatus.
     */
    private java.lang.String _CODStatus;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackageCOD() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'CODAmount'.
     * 
     * @return the value of field 'CODAmount'.
     */
    public com.ups.tracking.trackReply.CODAmount getCODAmount(
    ) {
        return this._CODAmount;
    }

    /**
     * Returns the value of field 'CODStatus'.
     * 
     * @return the value of field 'CODStatus'.
     */
    public java.lang.String getCODStatus(
    ) {
        return this._CODStatus;
    }

    /**
     * Returns the value of field 'controlNumber'.
     * 
     * @return the value of field 'ControlNumber'.
     */
    public java.lang.String getControlNumber(
    ) {
        return this._controlNumber;
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
     * Sets the value of field 'CODAmount'.
     * 
     * @param CODAmount the value of field 'CODAmount'.
     */
    public void setCODAmount(
            final com.ups.tracking.trackReply.CODAmount CODAmount) {
        this._CODAmount = CODAmount;
    }

    /**
     * Sets the value of field 'CODStatus'.
     * 
     * @param CODStatus the value of field 'CODStatus'.
     */
    public void setCODStatus(
            final java.lang.String CODStatus) {
        this._CODStatus = CODStatus;
    }

    /**
     * Sets the value of field 'controlNumber'.
     * 
     * @param controlNumber the value of field 'controlNumber'.
     */
    public void setControlNumber(
            final java.lang.String controlNumber) {
        this._controlNumber = controlNumber;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.PackageCO
     */
    public static com.ups.tracking.trackReply.PackageCOD unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.PackageCOD) Unmarshaller.unmarshal(com.ups.tracking.trackReply.PackageCOD.class, reader);
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
