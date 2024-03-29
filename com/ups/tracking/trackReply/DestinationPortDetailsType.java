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
 * Class DestinationPortDetailsType.
 * 
 * @version $Revision$ $Date$
 */
public class DestinationPortDetailsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _destinationPort.
     */
    private java.lang.String _destinationPort;

    /**
     * Field _estimatedArrival.
     */
    private com.ups.tracking.trackReply.EstimatedArrival _estimatedArrival;


      //----------------/
     //- Constructors -/
    //----------------/

    public DestinationPortDetailsType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'estimatedArrival'.
     * 
     * @return the value of field 'EstimatedArrival'.
     */
    public com.ups.tracking.trackReply.EstimatedArrival getEstimatedArrival(
    ) {
        return this._estimatedArrival;
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
     * Sets the value of field 'destinationPort'.
     * 
     * @param destinationPort the value of field 'destinationPort'.
     */
    public void setDestinationPort(
            final java.lang.String destinationPort) {
        this._destinationPort = destinationPort;
    }

    /**
     * Sets the value of field 'estimatedArrival'.
     * 
     * @param estimatedArrival the value of field 'estimatedArrival'
     */
    public void setEstimatedArrival(
            final com.ups.tracking.trackReply.EstimatedArrival estimatedArrival) {
        this._estimatedArrival = estimatedArrival;
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
     * com.ups.tracking.trackReply.DestinationPortDetailsType
     */
    public static com.ups.tracking.trackReply.DestinationPortDetailsType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.DestinationPortDetailsType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.DestinationPortDetailsType.class, reader);
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
