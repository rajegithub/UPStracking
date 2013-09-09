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
 * Class PackageType.
 * 
 * @version $Revision$ $Date$
 */
public class PackageType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _trackingNumber.
     */
    private java.lang.String _trackingNumber;

    /**
     * Field _rescheduledDeliveryDate.
     */
    private java.lang.String _rescheduledDeliveryDate;

    /**
     * Field _rescheduledDeliveryTime.
     */
    private java.lang.String _rescheduledDeliveryTime;

    /**
     * Field _reroute.
     */
    private com.ups.tracking.trackReply.Reroute _reroute;

    /**
     * Field _returnTo.
     */
    private com.ups.tracking.trackReply.ReturnTo _returnTo;

    /**
     * Field _packageServiceOptions.
     */
    private com.ups.tracking.trackReply.PackageServiceOptions _packageServiceOptions;

    /**
     * Field _activityList.
     */
    private java.util.Vector _activityList;

    /**
     * Field _messageList.
     */
    private java.util.Vector _messageList;

    /**
     * Field _packageWeight.
     */
    private com.ups.tracking.trackReply.PackageWeight _packageWeight;

    /**
     * Field _referenceNumberList.
     */
    private java.util.Vector _referenceNumberList;

    /**
     * Field _productType.
     */
    private com.ups.tracking.trackReply.ProductType _productType;

    /**
     * Field _locationAssured.
     */
    private java.lang.String _locationAssured;

    /**
     * Field _alternateTrackingNumberList.
     */
    private java.util.Vector _alternateTrackingNumberList;

    /**
     * Field _alternateTrackingInfoList.
     */
    private java.util.Vector _alternateTrackingInfoList;

    /**
     * Field _accessorialList.
     */
    private java.util.Vector _accessorialList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackageType() {
        super();
        this._activityList = new java.util.Vector();
        this._messageList = new java.util.Vector();
        this._referenceNumberList = new java.util.Vector();
        this._alternateTrackingNumberList = new java.util.Vector();
        this._alternateTrackingInfoList = new java.util.Vector();
        this._accessorialList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAccessorial
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccessorial(
            final com.ups.tracking.trackReply.Accessorial vAccessorial)
    throws java.lang.IndexOutOfBoundsException {
        this._accessorialList.addElement(vAccessorial);
    }

    /**
     * 
     * 
     * @param index
     * @param vAccessorial
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccessorial(
            final int index,
            final com.ups.tracking.trackReply.Accessorial vAccessorial)
    throws java.lang.IndexOutOfBoundsException {
        this._accessorialList.add(index, vAccessorial);
    }

    /**
     * 
     * 
     * @param vActivity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addActivity(
            final com.ups.tracking.trackReply.Activity vActivity)
    throws java.lang.IndexOutOfBoundsException {
        this._activityList.addElement(vActivity);
    }

    /**
     * 
     * 
     * @param index
     * @param vActivity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addActivity(
            final int index,
            final com.ups.tracking.trackReply.Activity vActivity)
    throws java.lang.IndexOutOfBoundsException {
        this._activityList.add(index, vActivity);
    }

    /**
     * 
     * 
     * @param vAlternateTrackingInfo
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateTrackingInfo(
            final com.ups.tracking.trackReply.AlternateTrackingInfo vAlternateTrackingInfo)
    throws java.lang.IndexOutOfBoundsException {
        this._alternateTrackingInfoList.addElement(vAlternateTrackingInfo);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateTrackingInfo
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateTrackingInfo(
            final int index,
            final com.ups.tracking.trackReply.AlternateTrackingInfo vAlternateTrackingInfo)
    throws java.lang.IndexOutOfBoundsException {
        this._alternateTrackingInfoList.add(index, vAlternateTrackingInfo);
    }

    /**
     * 
     * 
     * @param vAlternateTrackingNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateTrackingNumber(
            final java.lang.String vAlternateTrackingNumber)
    throws java.lang.IndexOutOfBoundsException {
        this._alternateTrackingNumberList.addElement(vAlternateTrackingNumber);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateTrackingNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateTrackingNumber(
            final int index,
            final java.lang.String vAlternateTrackingNumber)
    throws java.lang.IndexOutOfBoundsException {
        this._alternateTrackingNumberList.add(index, vAlternateTrackingNumber);
    }

    /**
     * 
     * 
     * @param vMessage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMessage(
            final com.ups.tracking.trackReply.Message vMessage)
    throws java.lang.IndexOutOfBoundsException {
        this._messageList.addElement(vMessage);
    }

    /**
     * 
     * 
     * @param index
     * @param vMessage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMessage(
            final int index,
            final com.ups.tracking.trackReply.Message vMessage)
    throws java.lang.IndexOutOfBoundsException {
        this._messageList.add(index, vMessage);
    }

    /**
     * 
     * 
     * @param vReferenceNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReferenceNumber(
            final com.ups.tracking.trackReply.ReferenceNumber vReferenceNumber)
    throws java.lang.IndexOutOfBoundsException {
        this._referenceNumberList.addElement(vReferenceNumber);
    }

    /**
     * 
     * 
     * @param index
     * @param vReferenceNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReferenceNumber(
            final int index,
            final com.ups.tracking.trackReply.ReferenceNumber vReferenceNumber)
    throws java.lang.IndexOutOfBoundsException {
        this._referenceNumberList.add(index, vReferenceNumber);
    }

    /**
     * Method enumerateAccessorial.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Accessorial elements
     */
    public java.util.Enumeration enumerateAccessorial(
    ) {
        return this._accessorialList.elements();
    }

    /**
     * Method enumerateActivity.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Activity elements
     */
    public java.util.Enumeration enumerateActivity(
    ) {
        return this._activityList.elements();
    }

    /**
     * Method enumerateAlternateTrackingInfo.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.AlternateTrackingInfo elements
     */
    public java.util.Enumeration enumerateAlternateTrackingInfo(
    ) {
        return this._alternateTrackingInfoList.elements();
    }

    /**
     * Method enumerateAlternateTrackingNumber.
     * 
     * @return an Enumeration over all java.lang.String elements
     */
    public java.util.Enumeration enumerateAlternateTrackingNumber(
    ) {
        return this._alternateTrackingNumberList.elements();
    }

    /**
     * Method enumerateMessage.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Message elements
     */
    public java.util.Enumeration enumerateMessage(
    ) {
        return this._messageList.elements();
    }

    /**
     * Method enumerateReferenceNumber.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.ReferenceNumber elements
     */
    public java.util.Enumeration enumerateReferenceNumber(
    ) {
        return this._referenceNumberList.elements();
    }

    /**
     * Method getAccessorial.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.Accessorial at the given index
     */
    public com.ups.tracking.trackReply.Accessorial getAccessorial(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accessorialList.size()) {
            throw new IndexOutOfBoundsException("getAccessorial: Index value '" + index + "' not in range [0.." + (this._accessorialList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Accessorial) _accessorialList.get(index);
    }

    /**
     * Method getAccessorial.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Accessorial[] getAccessorial(
    ) {
        com.ups.tracking.trackReply.Accessorial[] array = new com.ups.tracking.trackReply.Accessorial[0];
        return (com.ups.tracking.trackReply.Accessorial[]) this._accessorialList.toArray(array);
    }

    /**
     * Method getAccessorialCount.
     * 
     * @return the size of this collection
     */
    public int getAccessorialCount(
    ) {
        return this._accessorialList.size();
    }

    /**
     * Method getActivity.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.Activity at the given index
     */
    public com.ups.tracking.trackReply.Activity getActivity(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._activityList.size()) {
            throw new IndexOutOfBoundsException("getActivity: Index value '" + index + "' not in range [0.." + (this._activityList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Activity) _activityList.get(index);
    }

    /**
     * Method getActivity.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Activity[] getActivity(
    ) {
        com.ups.tracking.trackReply.Activity[] array = new com.ups.tracking.trackReply.Activity[0];
        return (com.ups.tracking.trackReply.Activity[]) this._activityList.toArray(array);
    }

    /**
     * Method getActivityCount.
     * 
     * @return the size of this collection
     */
    public int getActivityCount(
    ) {
        return this._activityList.size();
    }

    /**
     * Method getAlternateTrackingInfo.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.AlternateTrackingInfo at the
     * given index
     */
    public com.ups.tracking.trackReply.AlternateTrackingInfo getAlternateTrackingInfo(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateTrackingInfoList.size()) {
            throw new IndexOutOfBoundsException("getAlternateTrackingInfo: Index value '" + index + "' not in range [0.." + (this._alternateTrackingInfoList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.AlternateTrackingInfo) _alternateTrackingInfoList.get(index);
    }

    /**
     * Method getAlternateTrackingInfo.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.AlternateTrackingInfo[] getAlternateTrackingInfo(
    ) {
        com.ups.tracking.trackReply.AlternateTrackingInfo[] array = new com.ups.tracking.trackReply.AlternateTrackingInfo[0];
        return (com.ups.tracking.trackReply.AlternateTrackingInfo[]) this._alternateTrackingInfoList.toArray(array);
    }

    /**
     * Method getAlternateTrackingInfoCount.
     * 
     * @return the size of this collection
     */
    public int getAlternateTrackingInfoCount(
    ) {
        return this._alternateTrackingInfoList.size();
    }

    /**
     * Method getAlternateTrackingNumber.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getAlternateTrackingNumber(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateTrackingNumberList.size()) {
            throw new IndexOutOfBoundsException("getAlternateTrackingNumber: Index value '" + index + "' not in range [0.." + (this._alternateTrackingNumberList.size() - 1) + "]");
        }
        
        return (java.lang.String) _alternateTrackingNumberList.get(index);
    }

    /**
     * Method getAlternateTrackingNumber.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getAlternateTrackingNumber(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._alternateTrackingNumberList.toArray(array);
    }

    /**
     * Method getAlternateTrackingNumberCount.
     * 
     * @return the size of this collection
     */
    public int getAlternateTrackingNumberCount(
    ) {
        return this._alternateTrackingNumberList.size();
    }

    /**
     * Returns the value of field 'locationAssured'.
     * 
     * @return the value of field 'LocationAssured'.
     */
    public java.lang.String getLocationAssured(
    ) {
        return this._locationAssured;
    }

    /**
     * Method getMessage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the com.ups.tracking.trackReply.Message
     * at the given index
     */
    public com.ups.tracking.trackReply.Message getMessage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._messageList.size()) {
            throw new IndexOutOfBoundsException("getMessage: Index value '" + index + "' not in range [0.." + (this._messageList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Message) _messageList.get(index);
    }

    /**
     * Method getMessage.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Message[] getMessage(
    ) {
        com.ups.tracking.trackReply.Message[] array = new com.ups.tracking.trackReply.Message[0];
        return (com.ups.tracking.trackReply.Message[]) this._messageList.toArray(array);
    }

    /**
     * Method getMessageCount.
     * 
     * @return the size of this collection
     */
    public int getMessageCount(
    ) {
        return this._messageList.size();
    }

    /**
     * Returns the value of field 'packageServiceOptions'.
     * 
     * @return the value of field 'PackageServiceOptions'.
     */
    public com.ups.tracking.trackReply.PackageServiceOptions getPackageServiceOptions(
    ) {
        return this._packageServiceOptions;
    }

    /**
     * Returns the value of field 'packageWeight'.
     * 
     * @return the value of field 'PackageWeight'.
     */
    public com.ups.tracking.trackReply.PackageWeight getPackageWeight(
    ) {
        return this._packageWeight;
    }

    /**
     * Returns the value of field 'productType'.
     * 
     * @return the value of field 'ProductType'.
     */
    public com.ups.tracking.trackReply.ProductType getProductType(
    ) {
        return this._productType;
    }

    /**
     * Method getReferenceNumber.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.ReferenceNumber at the given inde
     */
    public com.ups.tracking.trackReply.ReferenceNumber getReferenceNumber(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._referenceNumberList.size()) {
            throw new IndexOutOfBoundsException("getReferenceNumber: Index value '" + index + "' not in range [0.." + (this._referenceNumberList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.ReferenceNumber) _referenceNumberList.get(index);
    }

    /**
     * Method getReferenceNumber.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.ReferenceNumber[] getReferenceNumber(
    ) {
        com.ups.tracking.trackReply.ReferenceNumber[] array = new com.ups.tracking.trackReply.ReferenceNumber[0];
        return (com.ups.tracking.trackReply.ReferenceNumber[]) this._referenceNumberList.toArray(array);
    }

    /**
     * Method getReferenceNumberCount.
     * 
     * @return the size of this collection
     */
    public int getReferenceNumberCount(
    ) {
        return this._referenceNumberList.size();
    }

    /**
     * Returns the value of field 'reroute'.
     * 
     * @return the value of field 'Reroute'.
     */
    public com.ups.tracking.trackReply.Reroute getReroute(
    ) {
        return this._reroute;
    }

    /**
     * Returns the value of field 'rescheduledDeliveryDate'.
     * 
     * @return the value of field 'RescheduledDeliveryDate'.
     */
    public java.lang.String getRescheduledDeliveryDate(
    ) {
        return this._rescheduledDeliveryDate;
    }

    /**
     * Returns the value of field 'rescheduledDeliveryTime'.
     * 
     * @return the value of field 'RescheduledDeliveryTime'.
     */
    public java.lang.String getRescheduledDeliveryTime(
    ) {
        return this._rescheduledDeliveryTime;
    }

    /**
     * Returns the value of field 'returnTo'.
     * 
     * @return the value of field 'ReturnTo'.
     */
    public com.ups.tracking.trackReply.ReturnTo getReturnTo(
    ) {
        return this._returnTo;
    }

    /**
     * Returns the value of field 'trackingNumber'.
     * 
     * @return the value of field 'TrackingNumber'.
     */
    public java.lang.String getTrackingNumber(
    ) {
        return this._trackingNumber;
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
     * Method removeAccessorial.
     * 
     * @param vAccessorial
     * @return true if the object was removed from the collection.
     */
    public boolean removeAccessorial(
            final com.ups.tracking.trackReply.Accessorial vAccessorial) {
        boolean removed = _accessorialList.remove(vAccessorial);
        return removed;
    }

    /**
     * Method removeAccessorialAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Accessorial removeAccessorialAt(
            final int index) {
        java.lang.Object obj = this._accessorialList.remove(index);
        return (com.ups.tracking.trackReply.Accessorial) obj;
    }

    /**
     * Method removeActivity.
     * 
     * @param vActivity
     * @return true if the object was removed from the collection.
     */
    public boolean removeActivity(
            final com.ups.tracking.trackReply.Activity vActivity) {
        boolean removed = _activityList.remove(vActivity);
        return removed;
    }

    /**
     * Method removeActivityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Activity removeActivityAt(
            final int index) {
        java.lang.Object obj = this._activityList.remove(index);
        return (com.ups.tracking.trackReply.Activity) obj;
    }

    /**
     */
    public void removeAllAccessorial(
    ) {
        this._accessorialList.clear();
    }

    /**
     */
    public void removeAllActivity(
    ) {
        this._activityList.clear();
    }

    /**
     */
    public void removeAllAlternateTrackingInfo(
    ) {
        this._alternateTrackingInfoList.clear();
    }

    /**
     */
    public void removeAllAlternateTrackingNumber(
    ) {
        this._alternateTrackingNumberList.clear();
    }

    /**
     */
    public void removeAllMessage(
    ) {
        this._messageList.clear();
    }

    /**
     */
    public void removeAllReferenceNumber(
    ) {
        this._referenceNumberList.clear();
    }

    /**
     * Method removeAlternateTrackingInfo.
     * 
     * @param vAlternateTrackingInfo
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlternateTrackingInfo(
            final com.ups.tracking.trackReply.AlternateTrackingInfo vAlternateTrackingInfo) {
        boolean removed = _alternateTrackingInfoList.remove(vAlternateTrackingInfo);
        return removed;
    }

    /**
     * Method removeAlternateTrackingInfoAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.AlternateTrackingInfo removeAlternateTrackingInfoAt(
            final int index) {
        java.lang.Object obj = this._alternateTrackingInfoList.remove(index);
        return (com.ups.tracking.trackReply.AlternateTrackingInfo) obj;
    }

    /**
     * Method removeAlternateTrackingNumber.
     * 
     * @param vAlternateTrackingNumber
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlternateTrackingNumber(
            final java.lang.String vAlternateTrackingNumber) {
        boolean removed = _alternateTrackingNumberList.remove(vAlternateTrackingNumber);
        return removed;
    }

    /**
     * Method removeAlternateTrackingNumberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeAlternateTrackingNumberAt(
            final int index) {
        java.lang.Object obj = this._alternateTrackingNumberList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeMessage.
     * 
     * @param vMessage
     * @return true if the object was removed from the collection.
     */
    public boolean removeMessage(
            final com.ups.tracking.trackReply.Message vMessage) {
        boolean removed = _messageList.remove(vMessage);
        return removed;
    }

    /**
     * Method removeMessageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Message removeMessageAt(
            final int index) {
        java.lang.Object obj = this._messageList.remove(index);
        return (com.ups.tracking.trackReply.Message) obj;
    }

    /**
     * Method removeReferenceNumber.
     * 
     * @param vReferenceNumber
     * @return true if the object was removed from the collection.
     */
    public boolean removeReferenceNumber(
            final com.ups.tracking.trackReply.ReferenceNumber vReferenceNumber) {
        boolean removed = _referenceNumberList.remove(vReferenceNumber);
        return removed;
    }

    /**
     * Method removeReferenceNumberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.ReferenceNumber removeReferenceNumberAt(
            final int index) {
        java.lang.Object obj = this._referenceNumberList.remove(index);
        return (com.ups.tracking.trackReply.ReferenceNumber) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAccessorial
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAccessorial(
            final int index,
            final com.ups.tracking.trackReply.Accessorial vAccessorial)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accessorialList.size()) {
            throw new IndexOutOfBoundsException("setAccessorial: Index value '" + index + "' not in range [0.." + (this._accessorialList.size() - 1) + "]");
        }
        
        this._accessorialList.set(index, vAccessorial);
    }

    /**
     * 
     * 
     * @param vAccessorialArray
     */
    public void setAccessorial(
            final com.ups.tracking.trackReply.Accessorial[] vAccessorialArray) {
        //-- copy array
        _accessorialList.clear();
        
        for (int i = 0; i < vAccessorialArray.length; i++) {
                this._accessorialList.add(vAccessorialArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vActivity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setActivity(
            final int index,
            final com.ups.tracking.trackReply.Activity vActivity)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._activityList.size()) {
            throw new IndexOutOfBoundsException("setActivity: Index value '" + index + "' not in range [0.." + (this._activityList.size() - 1) + "]");
        }
        
        this._activityList.set(index, vActivity);
    }

    /**
     * 
     * 
     * @param vActivityArray
     */
    public void setActivity(
            final com.ups.tracking.trackReply.Activity[] vActivityArray) {
        //-- copy array
        _activityList.clear();
        
        for (int i = 0; i < vActivityArray.length; i++) {
                this._activityList.add(vActivityArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateTrackingInfo
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlternateTrackingInfo(
            final int index,
            final com.ups.tracking.trackReply.AlternateTrackingInfo vAlternateTrackingInfo)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateTrackingInfoList.size()) {
            throw new IndexOutOfBoundsException("setAlternateTrackingInfo: Index value '" + index + "' not in range [0.." + (this._alternateTrackingInfoList.size() - 1) + "]");
        }
        
        this._alternateTrackingInfoList.set(index, vAlternateTrackingInfo);
    }

    /**
     * 
     * 
     * @param vAlternateTrackingInfoArray
     */
    public void setAlternateTrackingInfo(
            final com.ups.tracking.trackReply.AlternateTrackingInfo[] vAlternateTrackingInfoArray) {
        //-- copy array
        _alternateTrackingInfoList.clear();
        
        for (int i = 0; i < vAlternateTrackingInfoArray.length; i++) {
                this._alternateTrackingInfoList.add(vAlternateTrackingInfoArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateTrackingNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlternateTrackingNumber(
            final int index,
            final java.lang.String vAlternateTrackingNumber)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateTrackingNumberList.size()) {
            throw new IndexOutOfBoundsException("setAlternateTrackingNumber: Index value '" + index + "' not in range [0.." + (this._alternateTrackingNumberList.size() - 1) + "]");
        }
        
        this._alternateTrackingNumberList.set(index, vAlternateTrackingNumber);
    }

    /**
     * 
     * 
     * @param vAlternateTrackingNumberArray
     */
    public void setAlternateTrackingNumber(
            final java.lang.String[] vAlternateTrackingNumberArray) {
        //-- copy array
        _alternateTrackingNumberList.clear();
        
        for (int i = 0; i < vAlternateTrackingNumberArray.length; i++) {
                this._alternateTrackingNumberList.add(vAlternateTrackingNumberArray[i]);
        }
    }

    /**
     * Sets the value of field 'locationAssured'.
     * 
     * @param locationAssured the value of field 'locationAssured'.
     */
    public void setLocationAssured(
            final java.lang.String locationAssured) {
        this._locationAssured = locationAssured;
    }

    /**
     * 
     * 
     * @param index
     * @param vMessage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMessage(
            final int index,
            final com.ups.tracking.trackReply.Message vMessage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._messageList.size()) {
            throw new IndexOutOfBoundsException("setMessage: Index value '" + index + "' not in range [0.." + (this._messageList.size() - 1) + "]");
        }
        
        this._messageList.set(index, vMessage);
    }

    /**
     * 
     * 
     * @param vMessageArray
     */
    public void setMessage(
            final com.ups.tracking.trackReply.Message[] vMessageArray) {
        //-- copy array
        _messageList.clear();
        
        for (int i = 0; i < vMessageArray.length; i++) {
                this._messageList.add(vMessageArray[i]);
        }
    }

    /**
     * Sets the value of field 'packageServiceOptions'.
     * 
     * @param packageServiceOptions the value of field
     * 'packageServiceOptions'.
     */
    public void setPackageServiceOptions(
            final com.ups.tracking.trackReply.PackageServiceOptions packageServiceOptions) {
        this._packageServiceOptions = packageServiceOptions;
    }

    /**
     * Sets the value of field 'packageWeight'.
     * 
     * @param packageWeight the value of field 'packageWeight'.
     */
    public void setPackageWeight(
            final com.ups.tracking.trackReply.PackageWeight packageWeight) {
        this._packageWeight = packageWeight;
    }

    /**
     * Sets the value of field 'productType'.
     * 
     * @param productType the value of field 'productType'.
     */
    public void setProductType(
            final com.ups.tracking.trackReply.ProductType productType) {
        this._productType = productType;
    }

    /**
     * 
     * 
     * @param index
     * @param vReferenceNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReferenceNumber(
            final int index,
            final com.ups.tracking.trackReply.ReferenceNumber vReferenceNumber)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._referenceNumberList.size()) {
            throw new IndexOutOfBoundsException("setReferenceNumber: Index value '" + index + "' not in range [0.." + (this._referenceNumberList.size() - 1) + "]");
        }
        
        this._referenceNumberList.set(index, vReferenceNumber);
    }

    /**
     * 
     * 
     * @param vReferenceNumberArray
     */
    public void setReferenceNumber(
            final com.ups.tracking.trackReply.ReferenceNumber[] vReferenceNumberArray) {
        //-- copy array
        _referenceNumberList.clear();
        
        for (int i = 0; i < vReferenceNumberArray.length; i++) {
                this._referenceNumberList.add(vReferenceNumberArray[i]);
        }
    }

    /**
     * Sets the value of field 'reroute'.
     * 
     * @param reroute the value of field 'reroute'.
     */
    public void setReroute(
            final com.ups.tracking.trackReply.Reroute reroute) {
        this._reroute = reroute;
    }

    /**
     * Sets the value of field 'rescheduledDeliveryDate'.
     * 
     * @param rescheduledDeliveryDate the value of field
     * 'rescheduledDeliveryDate'.
     */
    public void setRescheduledDeliveryDate(
            final java.lang.String rescheduledDeliveryDate) {
        this._rescheduledDeliveryDate = rescheduledDeliveryDate;
    }

    /**
     * Sets the value of field 'rescheduledDeliveryTime'.
     * 
     * @param rescheduledDeliveryTime the value of field
     * 'rescheduledDeliveryTime'.
     */
    public void setRescheduledDeliveryTime(
            final java.lang.String rescheduledDeliveryTime) {
        this._rescheduledDeliveryTime = rescheduledDeliveryTime;
    }

    /**
     * Sets the value of field 'returnTo'.
     * 
     * @param returnTo the value of field 'returnTo'.
     */
    public void setReturnTo(
            final com.ups.tracking.trackReply.ReturnTo returnTo) {
        this._returnTo = returnTo;
    }

    /**
     * Sets the value of field 'trackingNumber'.
     * 
     * @param trackingNumber the value of field 'trackingNumber'.
     */
    public void setTrackingNumber(
            final java.lang.String trackingNumber) {
        this._trackingNumber = trackingNumber;
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
     * com.ups.tracking.trackReply.PackageType
     */
    public static com.ups.tracking.trackReply.PackageType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.PackageType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.PackageType.class, reader);
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
