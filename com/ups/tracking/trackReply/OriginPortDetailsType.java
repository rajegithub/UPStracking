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
 * Class OriginPortDetailsType.
 * 
 * @version $Revision$ $Date$
 */
public class OriginPortDetailsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _originPort.
     */
    private java.lang.String _originPort;

    /**
     * Field _estimatedDeparture.
     */
    private com.ups.tracking.trackReply.EstimatedDeparture _estimatedDeparture;


      //----------------/
     //- Constructors -/
    //----------------/

    public OriginPortDetailsType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'estimatedDeparture'.
     * 
     * @return the value of field 'EstimatedDeparture'.
     */
    public com.ups.tracking.trackReply.EstimatedDeparture getEstimatedDeparture(
    ) {
        return this._estimatedDeparture;
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
     * Sets the value of field 'estimatedDeparture'.
     * 
     * @param estimatedDeparture the value of field
     * 'estimatedDeparture'.
     */
    public void setEstimatedDeparture(
            final com.ups.tracking.trackReply.EstimatedDeparture estimatedDeparture) {
        this._estimatedDeparture = estimatedDeparture;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.ups.tracking.trackReply.OriginPortDetailsType
     */
    public static com.ups.tracking.trackReply.OriginPortDetailsType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.OriginPortDetailsType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.OriginPortDetailsType.class, reader);
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
