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
 * Class DeliveryDetailsType.
 * 
 * @version $Revision$ $Date$
 */
public class DeliveryDetailsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _deliveryDate.
     */
    private com.ups.tracking.trackReply.DeliveryDate _deliveryDate;

    /**
     * Field _serviceCenter.
     */
    private com.ups.tracking.trackReply.ServiceCenter _serviceCenter;


      //----------------/
     //- Constructors -/
    //----------------/

    public DeliveryDetailsType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'deliveryDate'.
     * 
     * @return the value of field 'DeliveryDate'.
     */
    public com.ups.tracking.trackReply.DeliveryDate getDeliveryDate(
    ) {
        return this._deliveryDate;
    }

    /**
     * Returns the value of field 'serviceCenter'.
     * 
     * @return the value of field 'ServiceCenter'.
     */
    public com.ups.tracking.trackReply.ServiceCenter getServiceCenter(
    ) {
        return this._serviceCenter;
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
     * Sets the value of field 'deliveryDate'.
     * 
     * @param deliveryDate the value of field 'deliveryDate'.
     */
    public void setDeliveryDate(
            final com.ups.tracking.trackReply.DeliveryDate deliveryDate) {
        this._deliveryDate = deliveryDate;
    }

    /**
     * Sets the value of field 'serviceCenter'.
     * 
     * @param serviceCenter the value of field 'serviceCenter'.
     */
    public void setServiceCenter(
            final com.ups.tracking.trackReply.ServiceCenter serviceCenter) {
        this._serviceCenter = serviceCenter;
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
     * com.ups.tracking.trackReply.DeliveryDetailsType
     */
    public static com.ups.tracking.trackReply.DeliveryDetailsType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.DeliveryDetailsType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.DeliveryDetailsType.class, reader);
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
