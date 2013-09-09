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
 * Class TrackResponse.
 * 
 * @version $Revision$ $Date$
 */
public class TrackResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _response.
     */
    private com.ups.tracking.trackReply.Response _response;

    /**
     * Field _shipmentList.
     */
    private java.util.Vector _shipmentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TrackResponse() {
        super();
        this._shipmentList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vShipment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addShipment(
            final com.ups.tracking.trackReply.Shipment vShipment)
    throws java.lang.IndexOutOfBoundsException {
        this._shipmentList.addElement(vShipment);
    }

    /**
     * 
     * 
     * @param index
     * @param vShipment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addShipment(
            final int index,
            final com.ups.tracking.trackReply.Shipment vShipment)
    throws java.lang.IndexOutOfBoundsException {
        this._shipmentList.add(index, vShipment);
    }

    /**
     * Method enumerateShipment.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Shipment elements
     */
    public java.util.Enumeration enumerateShipment(
    ) {
        return this._shipmentList.elements();
    }

    /**
     * Returns the value of field 'response'.
     * 
     * @return the value of field 'Response'.
     */
    public com.ups.tracking.trackReply.Response getResponse(
    ) {
        return this._response;
    }

    /**
     * Method getShipment.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.Shipment at the given index
     */
    public com.ups.tracking.trackReply.Shipment getShipment(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._shipmentList.size()) {
            throw new IndexOutOfBoundsException("getShipment: Index value '" + index + "' not in range [0.." + (this._shipmentList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Shipment) _shipmentList.get(index);
    }

    /**
     * Method getShipment.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Shipment[] getShipment(
    ) {
        com.ups.tracking.trackReply.Shipment[] array = new com.ups.tracking.trackReply.Shipment[0];
        return (com.ups.tracking.trackReply.Shipment[]) this._shipmentList.toArray(array);
    }

    /**
     * Method getShipmentCount.
     * 
     * @return the size of this collection
     */
    public int getShipmentCount(
    ) {
        return this._shipmentList.size();
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
     */
    public void removeAllShipment(
    ) {
        this._shipmentList.clear();
    }

    /**
     * Method removeShipment.
     * 
     * @param vShipment
     * @return true if the object was removed from the collection.
     */
    public boolean removeShipment(
            final com.ups.tracking.trackReply.Shipment vShipment) {
        boolean removed = _shipmentList.remove(vShipment);
        return removed;
    }

    /**
     * Method removeShipmentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Shipment removeShipmentAt(
            final int index) {
        java.lang.Object obj = this._shipmentList.remove(index);
        return (com.ups.tracking.trackReply.Shipment) obj;
    }

    /**
     * Sets the value of field 'response'.
     * 
     * @param response the value of field 'response'.
     */
    public void setResponse(
            final com.ups.tracking.trackReply.Response response) {
        this._response = response;
    }

    /**
     * 
     * 
     * @param index
     * @param vShipment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setShipment(
            final int index,
            final com.ups.tracking.trackReply.Shipment vShipment)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._shipmentList.size()) {
            throw new IndexOutOfBoundsException("setShipment: Index value '" + index + "' not in range [0.." + (this._shipmentList.size() - 1) + "]");
        }
        
        this._shipmentList.set(index, vShipment);
    }

    /**
     * 
     * 
     * @param vShipmentArray
     */
    public void setShipment(
            final com.ups.tracking.trackReply.Shipment[] vShipmentArray) {
        //-- copy array
        _shipmentList.clear();
        
        for (int i = 0; i < vShipmentArray.length; i++) {
                this._shipmentList.add(vShipmentArray[i]);
        }
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
     * com.ups.tracking.trackReply.TrackResponse
     */
    public static com.ups.tracking.trackReply.TrackResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.TrackResponse) Unmarshaller.unmarshal(com.ups.tracking.trackReply.TrackResponse.class, reader);
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
