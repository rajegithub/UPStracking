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
 * Class ShipmentLocationType.
 * 
 * @version $Revision$ $Date$
 */
public class ShipmentLocationType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _addressList.
     */
    private java.util.Vector _addressList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ShipmentLocationType() {
        super();
        this._addressList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAddress
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAddress(
            final com.ups.tracking.trackReply.Address vAddress)
    throws java.lang.IndexOutOfBoundsException {
        this._addressList.addElement(vAddress);
    }

    /**
     * 
     * 
     * @param index
     * @param vAddress
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAddress(
            final int index,
            final com.ups.tracking.trackReply.Address vAddress)
    throws java.lang.IndexOutOfBoundsException {
        this._addressList.add(index, vAddress);
    }

    /**
     * Method enumerateAddress.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Address elements
     */
    public java.util.Enumeration enumerateAddress(
    ) {
        return this._addressList.elements();
    }

    /**
     * Method getAddress.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the com.ups.tracking.trackReply.Address
     * at the given index
     */
    public com.ups.tracking.trackReply.Address getAddress(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._addressList.size()) {
            throw new IndexOutOfBoundsException("getAddress: Index value '" + index + "' not in range [0.." + (this._addressList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Address) _addressList.get(index);
    }

    /**
     * Method getAddress.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Address[] getAddress(
    ) {
        com.ups.tracking.trackReply.Address[] array = new com.ups.tracking.trackReply.Address[0];
        return (com.ups.tracking.trackReply.Address[]) this._addressList.toArray(array);
    }

    /**
     * Method getAddressCount.
     * 
     * @return the size of this collection
     */
    public int getAddressCount(
    ) {
        return this._addressList.size();
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
     * Method removeAddress.
     * 
     * @param vAddress
     * @return true if the object was removed from the collection.
     */
    public boolean removeAddress(
            final com.ups.tracking.trackReply.Address vAddress) {
        boolean removed = _addressList.remove(vAddress);
        return removed;
    }

    /**
     * Method removeAddressAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Address removeAddressAt(
            final int index) {
        java.lang.Object obj = this._addressList.remove(index);
        return (com.ups.tracking.trackReply.Address) obj;
    }

    /**
     */
    public void removeAllAddress(
    ) {
        this._addressList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vAddress
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAddress(
            final int index,
            final com.ups.tracking.trackReply.Address vAddress)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._addressList.size()) {
            throw new IndexOutOfBoundsException("setAddress: Index value '" + index + "' not in range [0.." + (this._addressList.size() - 1) + "]");
        }
        
        this._addressList.set(index, vAddress);
    }

    /**
     * 
     * 
     * @param vAddressArray
     */
    public void setAddress(
            final com.ups.tracking.trackReply.Address[] vAddressArray) {
        //-- copy array
        _addressList.clear();
        
        for (int i = 0; i < vAddressArray.length; i++) {
                this._addressList.add(vAddressArray[i]);
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
     * com.ups.tracking.trackReply.ShipmentLocationType
     */
    public static com.ups.tracking.trackReply.ShipmentLocationType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.ShipmentLocationType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.ShipmentLocationType.class, reader);
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
