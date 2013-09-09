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
 * Class Shipment.
 * 
 * @version $Revision$ $Date$
 */
public class Shipment implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _inquiryNumber.
     */
    private com.ups.tracking.trackReply.InquiryNumber _inquiryNumber;

    /**
     * Field _shipmentIdentificationNumber.
     */
    private java.lang.String _shipmentIdentificationNumber;

    /**
     * Field _shipmentType.
     */
    private com.ups.tracking.trackReply.ShipmentType _shipmentType;

    /**
     * Field _candidateBookmark.
     */
    private java.lang.String _candidateBookmark;

    /**
     * Field _shipper.
     */
    private com.ups.tracking.trackReply.Shipper _shipper;

    /**
     * Field _shipTo.
     */
    private com.ups.tracking.trackReply.ShipTo _shipTo;

    /**
     * Field _shipmentWeight.
     */
    private com.ups.tracking.trackReply.ShipmentWeight _shipmentWeight;

    /**
     * Field _service.
     */
    private com.ups.tracking.trackReply.Service _service;

    /**
     * Field _referenceNumberList.
     */
    private java.util.Vector _referenceNumberList;

    /**
     * Field _currentStatus.
     */
    private com.ups.tracking.trackReply.CurrentStatus _currentStatus;

    /**
     * Field _pickupDate.
     */
    private java.lang.String _pickupDate;

    /**
     * Field _deliveryDetails.
     */
    private com.ups.tracking.trackReply.DeliveryDetails _deliveryDetails;

    /**
     * Field _deliveryDateTimeList.
     */
    private java.util.Vector _deliveryDateTimeList;

    /**
     * Field _volume.
     */
    private com.ups.tracking.trackReply.Volume _volume;

    /**
     * Field _billToName.
     */
    private java.lang.String _billToName;

    /**
     * Field _pickUpServiceCenter.
     */
    private com.ups.tracking.trackReply.PickUpServiceCenter _pickUpServiceCenter;

    /**
     * Field _numberOfPieces.
     */
    private java.lang.String _numberOfPieces;

    /**
     * Field _numberOfPallets.
     */
    private java.lang.String _numberOfPallets;

    /**
     * Field _shipmentServiceOptions.
     */
    private com.ups.tracking.trackReply.ShipmentServiceOptions _shipmentServiceOptions;

    /**
     * Field _estimatedDeliveryDetails.
     */
    private com.ups.tracking.trackReply.EstimatedDeliveryDetails _estimatedDeliveryDetails;

    /**
     * Field _signedForByName.
     */
    private java.lang.String _signedForByName;

    /**
     * Field _activityList.
     */
    private java.util.Vector _activityList;

    /**
     * Field _originPortDetails.
     */
    private com.ups.tracking.trackReply.OriginPortDetails _originPortDetails;

    /**
     * Field _destinationPortDetails.
     */
    private com.ups.tracking.trackReply.DestinationPortDetails _destinationPortDetails;

    /**
     * Field _descriptionOfGoods.
     */
    private java.lang.String _descriptionOfGoods;

    /**
     * Field _cargoReady.
     */
    private com.ups.tracking.trackReply.CargoReady _cargoReady;

    /**
     * Field _manifest.
     */
    private com.ups.tracking.trackReply.Manifest _manifest;

    /**
     * Field _carrierActivityInformationList.
     */
    private java.util.Vector _carrierActivityInformationList;

    /**
     * Field _documentList.
     */
    private java.util.Vector _documentList;

    /**
     * Field _scheduledDeliveryDate.
     */
    private java.lang.String _scheduledDeliveryDate;

    /**
     * Field _scheduledDeliveryTime.
     */
    private java.lang.String _scheduledDeliveryTime;

    /**
     * Field _fileNumber.
     */
    private java.lang.String _fileNumber;

    /**
     * Field _appointment.
     */
    private com.ups.tracking.trackReply.Appointment _appointment;

    /**
     * Field _packageList.
     */
    private java.util.Vector _packageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Shipment() {
        super();
        this._referenceNumberList = new java.util.Vector();
        this._deliveryDateTimeList = new java.util.Vector();
        this._activityList = new java.util.Vector();
        this._carrierActivityInformationList = new java.util.Vector();
        this._documentList = new java.util.Vector();
        this._packageList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * @param vCarrierActivityInformation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCarrierActivityInformation(
            final com.ups.tracking.trackReply.CarrierActivityInformation vCarrierActivityInformation)
    throws java.lang.IndexOutOfBoundsException {
        this._carrierActivityInformationList.addElement(vCarrierActivityInformation);
    }

    /**
     * 
     * 
     * @param index
     * @param vCarrierActivityInformation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCarrierActivityInformation(
            final int index,
            final com.ups.tracking.trackReply.CarrierActivityInformation vCarrierActivityInformation)
    throws java.lang.IndexOutOfBoundsException {
        this._carrierActivityInformationList.add(index, vCarrierActivityInformation);
    }

    /**
     * 
     * 
     * @param vDeliveryDateTime
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDeliveryDateTime(
            final com.ups.tracking.trackReply.DeliveryDateTime vDeliveryDateTime)
    throws java.lang.IndexOutOfBoundsException {
        this._deliveryDateTimeList.addElement(vDeliveryDateTime);
    }

    /**
     * 
     * 
     * @param index
     * @param vDeliveryDateTime
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDeliveryDateTime(
            final int index,
            final com.ups.tracking.trackReply.DeliveryDateTime vDeliveryDateTime)
    throws java.lang.IndexOutOfBoundsException {
        this._deliveryDateTimeList.add(index, vDeliveryDateTime);
    }

    /**
     * 
     * 
     * @param vDocument
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDocument(
            final com.ups.tracking.trackReply.Document vDocument)
    throws java.lang.IndexOutOfBoundsException {
        this._documentList.addElement(vDocument);
    }

    /**
     * 
     * 
     * @param index
     * @param vDocument
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDocument(
            final int index,
            final com.ups.tracking.trackReply.Document vDocument)
    throws java.lang.IndexOutOfBoundsException {
        this._documentList.add(index, vDocument);
    }

    /**
     * 
     * 
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final com.ups.tracking.trackReply.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.addElement(vPackage);
    }

    /**
     * 
     * 
     * @param index
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final int index,
            final com.ups.tracking.trackReply.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
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
     * Method enumerateCarrierActivityInformation.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.CarrierActivityInformation
     * elements
     */
    public java.util.Enumeration enumerateCarrierActivityInformation(
    ) {
        return this._carrierActivityInformationList.elements();
    }

    /**
     * Method enumerateDeliveryDateTime.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.DeliveryDateTime elements
     */
    public java.util.Enumeration enumerateDeliveryDateTime(
    ) {
        return this._deliveryDateTimeList.elements();
    }

    /**
     * Method enumerateDocument.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Document elements
     */
    public java.util.Enumeration enumerateDocument(
    ) {
        return this._documentList.elements();
    }

    /**
     * Method enumeratePackage.
     * 
     * @return an Enumeration over all
     * com.ups.tracking.trackReply.Package elements
     */
    public java.util.Enumeration enumeratePackage(
    ) {
        return this._packageList.elements();
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
     * Returns the value of field 'appointment'.
     * 
     * @return the value of field 'Appointment'.
     */
    public com.ups.tracking.trackReply.Appointment getAppointment(
    ) {
        return this._appointment;
    }

    /**
     * Returns the value of field 'billToName'.
     * 
     * @return the value of field 'BillToName'.
     */
    public java.lang.String getBillToName(
    ) {
        return this._billToName;
    }

    /**
     * Returns the value of field 'candidateBookmark'.
     * 
     * @return the value of field 'CandidateBookmark'.
     */
    public java.lang.String getCandidateBookmark(
    ) {
        return this._candidateBookmark;
    }

    /**
     * Returns the value of field 'cargoReady'.
     * 
     * @return the value of field 'CargoReady'.
     */
    public com.ups.tracking.trackReply.CargoReady getCargoReady(
    ) {
        return this._cargoReady;
    }

    /**
     * Method getCarrierActivityInformation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.CarrierActivityInformation at
     * the given index
     */
    public com.ups.tracking.trackReply.CarrierActivityInformation getCarrierActivityInformation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._carrierActivityInformationList.size()) {
            throw new IndexOutOfBoundsException("getCarrierActivityInformation: Index value '" + index + "' not in range [0.." + (this._carrierActivityInformationList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.CarrierActivityInformation) _carrierActivityInformationList.get(index);
    }

    /**
     * Method getCarrierActivityInformation.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.CarrierActivityInformation[] getCarrierActivityInformation(
    ) {
        com.ups.tracking.trackReply.CarrierActivityInformation[] array = new com.ups.tracking.trackReply.CarrierActivityInformation[0];
        return (com.ups.tracking.trackReply.CarrierActivityInformation[]) this._carrierActivityInformationList.toArray(array);
    }

    /**
     * Method getCarrierActivityInformationCount.
     * 
     * @return the size of this collection
     */
    public int getCarrierActivityInformationCount(
    ) {
        return this._carrierActivityInformationList.size();
    }

    /**
     * Returns the value of field 'currentStatus'.
     * 
     * @return the value of field 'CurrentStatus'.
     */
    public com.ups.tracking.trackReply.CurrentStatus getCurrentStatus(
    ) {
        return this._currentStatus;
    }

    /**
     * Method getDeliveryDateTime.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.DeliveryDateTime at the given
     * index
     */
    public com.ups.tracking.trackReply.DeliveryDateTime getDeliveryDateTime(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._deliveryDateTimeList.size()) {
            throw new IndexOutOfBoundsException("getDeliveryDateTime: Index value '" + index + "' not in range [0.." + (this._deliveryDateTimeList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.DeliveryDateTime) _deliveryDateTimeList.get(index);
    }

    /**
     * Method getDeliveryDateTime.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.DeliveryDateTime[] getDeliveryDateTime(
    ) {
        com.ups.tracking.trackReply.DeliveryDateTime[] array = new com.ups.tracking.trackReply.DeliveryDateTime[0];
        return (com.ups.tracking.trackReply.DeliveryDateTime[]) this._deliveryDateTimeList.toArray(array);
    }

    /**
     * Method getDeliveryDateTimeCount.
     * 
     * @return the size of this collection
     */
    public int getDeliveryDateTimeCount(
    ) {
        return this._deliveryDateTimeList.size();
    }

    /**
     * Returns the value of field 'deliveryDetails'.
     * 
     * @return the value of field 'DeliveryDetails'.
     */
    public com.ups.tracking.trackReply.DeliveryDetails getDeliveryDetails(
    ) {
        return this._deliveryDetails;
    }

    /**
     * Returns the value of field 'descriptionOfGoods'.
     * 
     * @return the value of field 'DescriptionOfGoods'.
     */
    public java.lang.String getDescriptionOfGoods(
    ) {
        return this._descriptionOfGoods;
    }

    /**
     * Returns the value of field 'destinationPortDetails'.
     * 
     * @return the value of field 'DestinationPortDetails'.
     */
    public com.ups.tracking.trackReply.DestinationPortDetails getDestinationPortDetails(
    ) {
        return this._destinationPortDetails;
    }

    /**
     * Method getDocument.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.ups.tracking.trackReply.Document at the given index
     */
    public com.ups.tracking.trackReply.Document getDocument(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._documentList.size()) {
            throw new IndexOutOfBoundsException("getDocument: Index value '" + index + "' not in range [0.." + (this._documentList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Document) _documentList.get(index);
    }

    /**
     * Method getDocument.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Document[] getDocument(
    ) {
        com.ups.tracking.trackReply.Document[] array = new com.ups.tracking.trackReply.Document[0];
        return (com.ups.tracking.trackReply.Document[]) this._documentList.toArray(array);
    }

    /**
     * Method getDocumentCount.
     * 
     * @return the size of this collection
     */
    public int getDocumentCount(
    ) {
        return this._documentList.size();
    }

    /**
     * Returns the value of field 'estimatedDeliveryDetails'.
     * 
     * @return the value of field 'EstimatedDeliveryDetails'.
     */
    public com.ups.tracking.trackReply.EstimatedDeliveryDetails getEstimatedDeliveryDetails(
    ) {
        return this._estimatedDeliveryDetails;
    }

    /**
     * Returns the value of field 'fileNumber'.
     * 
     * @return the value of field 'FileNumber'.
     */
    public java.lang.String getFileNumber(
    ) {
        return this._fileNumber;
    }

    /**
     * Returns the value of field 'inquiryNumber'.
     * 
     * @return the value of field 'InquiryNumber'.
     */
    public com.ups.tracking.trackReply.InquiryNumber getInquiryNumber(
    ) {
        return this._inquiryNumber;
    }

    /**
     * Returns the value of field 'manifest'.
     * 
     * @return the value of field 'Manifest'.
     */
    public com.ups.tracking.trackReply.Manifest getManifest(
    ) {
        return this._manifest;
    }

    /**
     * Returns the value of field 'numberOfPallets'.
     * 
     * @return the value of field 'NumberOfPallets'.
     */
    public java.lang.String getNumberOfPallets(
    ) {
        return this._numberOfPallets;
    }

    /**
     * Returns the value of field 'numberOfPieces'.
     * 
     * @return the value of field 'NumberOfPieces'.
     */
    public java.lang.String getNumberOfPieces(
    ) {
        return this._numberOfPieces;
    }

    /**
     * Returns the value of field 'originPortDetails'.
     * 
     * @return the value of field 'OriginPortDetails'.
     */
    public com.ups.tracking.trackReply.OriginPortDetails getOriginPortDetails(
    ) {
        return this._originPortDetails;
    }

    /**
     * Method getPackage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the com.ups.tracking.trackReply.Package
     * at the given index
     */
    public com.ups.tracking.trackReply.Package getPackage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }
        
        return (com.ups.tracking.trackReply.Package) _packageList.get(index);
    }

    /**
     * Method getPackage.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.ups.tracking.trackReply.Package[] getPackage(
    ) {
        com.ups.tracking.trackReply.Package[] array = new com.ups.tracking.trackReply.Package[0];
        return (com.ups.tracking.trackReply.Package[]) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCount.
     * 
     * @return the size of this collection
     */
    public int getPackageCount(
    ) {
        return this._packageList.size();
    }

    /**
     * Returns the value of field 'pickUpServiceCenter'.
     * 
     * @return the value of field 'PickUpServiceCenter'.
     */
    public com.ups.tracking.trackReply.PickUpServiceCenter getPickUpServiceCenter(
    ) {
        return this._pickUpServiceCenter;
    }

    /**
     * Returns the value of field 'pickupDate'.
     * 
     * @return the value of field 'PickupDate'.
     */
    public java.lang.String getPickupDate(
    ) {
        return this._pickupDate;
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
     * Returns the value of field 'scheduledDeliveryDate'.
     * 
     * @return the value of field 'ScheduledDeliveryDate'.
     */
    public java.lang.String getScheduledDeliveryDate(
    ) {
        return this._scheduledDeliveryDate;
    }

    /**
     * Returns the value of field 'scheduledDeliveryTime'.
     * 
     * @return the value of field 'ScheduledDeliveryTime'.
     */
    public java.lang.String getScheduledDeliveryTime(
    ) {
        return this._scheduledDeliveryTime;
    }

    /**
     * Returns the value of field 'service'.
     * 
     * @return the value of field 'Service'.
     */
    public com.ups.tracking.trackReply.Service getService(
    ) {
        return this._service;
    }

    /**
     * Returns the value of field 'shipTo'.
     * 
     * @return the value of field 'ShipTo'.
     */
    public com.ups.tracking.trackReply.ShipTo getShipTo(
    ) {
        return this._shipTo;
    }

    /**
     * Returns the value of field 'shipmentIdentificationNumber'.
     * 
     * @return the value of field 'ShipmentIdentificationNumber'.
     */
    public java.lang.String getShipmentIdentificationNumber(
    ) {
        return this._shipmentIdentificationNumber;
    }

    /**
     * Returns the value of field 'shipmentServiceOptions'.
     * 
     * @return the value of field 'ShipmentServiceOptions'.
     */
    public com.ups.tracking.trackReply.ShipmentServiceOptions getShipmentServiceOptions(
    ) {
        return this._shipmentServiceOptions;
    }

    /**
     * Returns the value of field 'shipmentType'.
     * 
     * @return the value of field 'ShipmentType'.
     */
    public com.ups.tracking.trackReply.ShipmentType getShipmentType(
    ) {
        return this._shipmentType;
    }

    /**
     * Returns the value of field 'shipmentWeight'.
     * 
     * @return the value of field 'ShipmentWeight'.
     */
    public com.ups.tracking.trackReply.ShipmentWeight getShipmentWeight(
    ) {
        return this._shipmentWeight;
    }

    /**
     * Returns the value of field 'shipper'.
     * 
     * @return the value of field 'Shipper'.
     */
    public com.ups.tracking.trackReply.Shipper getShipper(
    ) {
        return this._shipper;
    }

    /**
     * Returns the value of field 'signedForByName'.
     * 
     * @return the value of field 'SignedForByName'.
     */
    public java.lang.String getSignedForByName(
    ) {
        return this._signedForByName;
    }

    /**
     * Returns the value of field 'volume'.
     * 
     * @return the value of field 'Volume'.
     */
    public com.ups.tracking.trackReply.Volume getVolume(
    ) {
        return this._volume;
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
    public void removeAllActivity(
    ) {
        this._activityList.clear();
    }

    /**
     */
    public void removeAllCarrierActivityInformation(
    ) {
        this._carrierActivityInformationList.clear();
    }

    /**
     */
    public void removeAllDeliveryDateTime(
    ) {
        this._deliveryDateTimeList.clear();
    }

    /**
     */
    public void removeAllDocument(
    ) {
        this._documentList.clear();
    }

    /**
     */
    public void removeAllPackage(
    ) {
        this._packageList.clear();
    }

    /**
     */
    public void removeAllReferenceNumber(
    ) {
        this._referenceNumberList.clear();
    }

    /**
     * Method removeCarrierActivityInformation.
     * 
     * @param vCarrierActivityInformation
     * @return true if the object was removed from the collection.
     */
    public boolean removeCarrierActivityInformation(
            final com.ups.tracking.trackReply.CarrierActivityInformation vCarrierActivityInformation) {
        boolean removed = _carrierActivityInformationList.remove(vCarrierActivityInformation);
        return removed;
    }

    /**
     * Method removeCarrierActivityInformationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.CarrierActivityInformation removeCarrierActivityInformationAt(
            final int index) {
        java.lang.Object obj = this._carrierActivityInformationList.remove(index);
        return (com.ups.tracking.trackReply.CarrierActivityInformation) obj;
    }

    /**
     * Method removeDeliveryDateTime.
     * 
     * @param vDeliveryDateTime
     * @return true if the object was removed from the collection.
     */
    public boolean removeDeliveryDateTime(
            final com.ups.tracking.trackReply.DeliveryDateTime vDeliveryDateTime) {
        boolean removed = _deliveryDateTimeList.remove(vDeliveryDateTime);
        return removed;
    }

    /**
     * Method removeDeliveryDateTimeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.DeliveryDateTime removeDeliveryDateTimeAt(
            final int index) {
        java.lang.Object obj = this._deliveryDateTimeList.remove(index);
        return (com.ups.tracking.trackReply.DeliveryDateTime) obj;
    }

    /**
     * Method removeDocument.
     * 
     * @param vDocument
     * @return true if the object was removed from the collection.
     */
    public boolean removeDocument(
            final com.ups.tracking.trackReply.Document vDocument) {
        boolean removed = _documentList.remove(vDocument);
        return removed;
    }

    /**
     * Method removeDocumentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Document removeDocumentAt(
            final int index) {
        java.lang.Object obj = this._documentList.remove(index);
        return (com.ups.tracking.trackReply.Document) obj;
    }

    /**
     * Method removePackage.
     * 
     * @param vPackage
     * @return true if the object was removed from the collection.
     */
    public boolean removePackage(
            final com.ups.tracking.trackReply.Package vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.ups.tracking.trackReply.Package removePackageAt(
            final int index) {
        java.lang.Object obj = this._packageList.remove(index);
        return (com.ups.tracking.trackReply.Package) obj;
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
     * Sets the value of field 'appointment'.
     * 
     * @param appointment the value of field 'appointment'.
     */
    public void setAppointment(
            final com.ups.tracking.trackReply.Appointment appointment) {
        this._appointment = appointment;
    }

    /**
     * Sets the value of field 'billToName'.
     * 
     * @param billToName the value of field 'billToName'.
     */
    public void setBillToName(
            final java.lang.String billToName) {
        this._billToName = billToName;
    }

    /**
     * Sets the value of field 'candidateBookmark'.
     * 
     * @param candidateBookmark the value of field
     * 'candidateBookmark'.
     */
    public void setCandidateBookmark(
            final java.lang.String candidateBookmark) {
        this._candidateBookmark = candidateBookmark;
    }

    /**
     * Sets the value of field 'cargoReady'.
     * 
     * @param cargoReady the value of field 'cargoReady'.
     */
    public void setCargoReady(
            final com.ups.tracking.trackReply.CargoReady cargoReady) {
        this._cargoReady = cargoReady;
    }

    /**
     * 
     * 
     * @param index
     * @param vCarrierActivityInformation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCarrierActivityInformation(
            final int index,
            final com.ups.tracking.trackReply.CarrierActivityInformation vCarrierActivityInformation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._carrierActivityInformationList.size()) {
            throw new IndexOutOfBoundsException("setCarrierActivityInformation: Index value '" + index + "' not in range [0.." + (this._carrierActivityInformationList.size() - 1) + "]");
        }
        
        this._carrierActivityInformationList.set(index, vCarrierActivityInformation);
    }

    /**
     * 
     * 
     * @param vCarrierActivityInformationArray
     */
    public void setCarrierActivityInformation(
            final com.ups.tracking.trackReply.CarrierActivityInformation[] vCarrierActivityInformationArray) {
        //-- copy array
        _carrierActivityInformationList.clear();
        
        for (int i = 0; i < vCarrierActivityInformationArray.length; i++) {
                this._carrierActivityInformationList.add(vCarrierActivityInformationArray[i]);
        }
    }

    /**
     * Sets the value of field 'currentStatus'.
     * 
     * @param currentStatus the value of field 'currentStatus'.
     */
    public void setCurrentStatus(
            final com.ups.tracking.trackReply.CurrentStatus currentStatus) {
        this._currentStatus = currentStatus;
    }

    /**
     * 
     * 
     * @param index
     * @param vDeliveryDateTime
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDeliveryDateTime(
            final int index,
            final com.ups.tracking.trackReply.DeliveryDateTime vDeliveryDateTime)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._deliveryDateTimeList.size()) {
            throw new IndexOutOfBoundsException("setDeliveryDateTime: Index value '" + index + "' not in range [0.." + (this._deliveryDateTimeList.size() - 1) + "]");
        }
        
        this._deliveryDateTimeList.set(index, vDeliveryDateTime);
    }

    /**
     * 
     * 
     * @param vDeliveryDateTimeArray
     */
    public void setDeliveryDateTime(
            final com.ups.tracking.trackReply.DeliveryDateTime[] vDeliveryDateTimeArray) {
        //-- copy array
        _deliveryDateTimeList.clear();
        
        for (int i = 0; i < vDeliveryDateTimeArray.length; i++) {
                this._deliveryDateTimeList.add(vDeliveryDateTimeArray[i]);
        }
    }

    /**
     * Sets the value of field 'deliveryDetails'.
     * 
     * @param deliveryDetails the value of field 'deliveryDetails'.
     */
    public void setDeliveryDetails(
            final com.ups.tracking.trackReply.DeliveryDetails deliveryDetails) {
        this._deliveryDetails = deliveryDetails;
    }

    /**
     * Sets the value of field 'descriptionOfGoods'.
     * 
     * @param descriptionOfGoods the value of field
     * 'descriptionOfGoods'.
     */
    public void setDescriptionOfGoods(
            final java.lang.String descriptionOfGoods) {
        this._descriptionOfGoods = descriptionOfGoods;
    }

    /**
     * Sets the value of field 'destinationPortDetails'.
     * 
     * @param destinationPortDetails the value of field
     * 'destinationPortDetails'.
     */
    public void setDestinationPortDetails(
            final com.ups.tracking.trackReply.DestinationPortDetails destinationPortDetails) {
        this._destinationPortDetails = destinationPortDetails;
    }

    /**
     * 
     * 
     * @param index
     * @param vDocument
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDocument(
            final int index,
            final com.ups.tracking.trackReply.Document vDocument)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._documentList.size()) {
            throw new IndexOutOfBoundsException("setDocument: Index value '" + index + "' not in range [0.." + (this._documentList.size() - 1) + "]");
        }
        
        this._documentList.set(index, vDocument);
    }

    /**
     * 
     * 
     * @param vDocumentArray
     */
    public void setDocument(
            final com.ups.tracking.trackReply.Document[] vDocumentArray) {
        //-- copy array
        _documentList.clear();
        
        for (int i = 0; i < vDocumentArray.length; i++) {
                this._documentList.add(vDocumentArray[i]);
        }
    }

    /**
     * Sets the value of field 'estimatedDeliveryDetails'.
     * 
     * @param estimatedDeliveryDetails the value of field
     * 'estimatedDeliveryDetails'.
     */
    public void setEstimatedDeliveryDetails(
            final com.ups.tracking.trackReply.EstimatedDeliveryDetails estimatedDeliveryDetails) {
        this._estimatedDeliveryDetails = estimatedDeliveryDetails;
    }

    /**
     * Sets the value of field 'fileNumber'.
     * 
     * @param fileNumber the value of field 'fileNumber'.
     */
    public void setFileNumber(
            final java.lang.String fileNumber) {
        this._fileNumber = fileNumber;
    }

    /**
     * Sets the value of field 'inquiryNumber'.
     * 
     * @param inquiryNumber the value of field 'inquiryNumber'.
     */
    public void setInquiryNumber(
            final com.ups.tracking.trackReply.InquiryNumber inquiryNumber) {
        this._inquiryNumber = inquiryNumber;
    }

    /**
     * Sets the value of field 'manifest'.
     * 
     * @param manifest the value of field 'manifest'.
     */
    public void setManifest(
            final com.ups.tracking.trackReply.Manifest manifest) {
        this._manifest = manifest;
    }

    /**
     * Sets the value of field 'numberOfPallets'.
     * 
     * @param numberOfPallets the value of field 'numberOfPallets'.
     */
    public void setNumberOfPallets(
            final java.lang.String numberOfPallets) {
        this._numberOfPallets = numberOfPallets;
    }

    /**
     * Sets the value of field 'numberOfPieces'.
     * 
     * @param numberOfPieces the value of field 'numberOfPieces'.
     */
    public void setNumberOfPieces(
            final java.lang.String numberOfPieces) {
        this._numberOfPieces = numberOfPieces;
    }

    /**
     * Sets the value of field 'originPortDetails'.
     * 
     * @param originPortDetails the value of field
     * 'originPortDetails'.
     */
    public void setOriginPortDetails(
            final com.ups.tracking.trackReply.OriginPortDetails originPortDetails) {
        this._originPortDetails = originPortDetails;
    }

    /**
     * 
     * 
     * @param index
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPackage(
            final int index,
            final com.ups.tracking.trackReply.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("setPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }
        
        this._packageList.set(index, vPackage);
    }

    /**
     * 
     * 
     * @param vPackageArray
     */
    public void setPackage(
            final com.ups.tracking.trackReply.Package[] vPackageArray) {
        //-- copy array
        _packageList.clear();
        
        for (int i = 0; i < vPackageArray.length; i++) {
                this._packageList.add(vPackageArray[i]);
        }
    }

    /**
     * Sets the value of field 'pickUpServiceCenter'.
     * 
     * @param pickUpServiceCenter the value of field
     * 'pickUpServiceCenter'.
     */
    public void setPickUpServiceCenter(
            final com.ups.tracking.trackReply.PickUpServiceCenter pickUpServiceCenter) {
        this._pickUpServiceCenter = pickUpServiceCenter;
    }

    /**
     * Sets the value of field 'pickupDate'.
     * 
     * @param pickupDate the value of field 'pickupDate'.
     */
    public void setPickupDate(
            final java.lang.String pickupDate) {
        this._pickupDate = pickupDate;
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
     * Sets the value of field 'scheduledDeliveryDate'.
     * 
     * @param scheduledDeliveryDate the value of field
     * 'scheduledDeliveryDate'.
     */
    public void setScheduledDeliveryDate(
            final java.lang.String scheduledDeliveryDate) {
        this._scheduledDeliveryDate = scheduledDeliveryDate;
    }

    /**
     * Sets the value of field 'scheduledDeliveryTime'.
     * 
     * @param scheduledDeliveryTime the value of field
     * 'scheduledDeliveryTime'.
     */
    public void setScheduledDeliveryTime(
            final java.lang.String scheduledDeliveryTime) {
        this._scheduledDeliveryTime = scheduledDeliveryTime;
    }

    /**
     * Sets the value of field 'service'.
     * 
     * @param service the value of field 'service'.
     */
    public void setService(
            final com.ups.tracking.trackReply.Service service) {
        this._service = service;
    }

    /**
     * Sets the value of field 'shipTo'.
     * 
     * @param shipTo the value of field 'shipTo'.
     */
    public void setShipTo(
            final com.ups.tracking.trackReply.ShipTo shipTo) {
        this._shipTo = shipTo;
    }

    /**
     * Sets the value of field 'shipmentIdentificationNumber'.
     * 
     * @param shipmentIdentificationNumber the value of field
     * 'shipmentIdentificationNumber'.
     */
    public void setShipmentIdentificationNumber(
            final java.lang.String shipmentIdentificationNumber) {
        this._shipmentIdentificationNumber = shipmentIdentificationNumber;
    }

    /**
     * Sets the value of field 'shipmentServiceOptions'.
     * 
     * @param shipmentServiceOptions the value of field
     * 'shipmentServiceOptions'.
     */
    public void setShipmentServiceOptions(
            final com.ups.tracking.trackReply.ShipmentServiceOptions shipmentServiceOptions) {
        this._shipmentServiceOptions = shipmentServiceOptions;
    }

    /**
     * Sets the value of field 'shipmentType'.
     * 
     * @param shipmentType the value of field 'shipmentType'.
     */
    public void setShipmentType(
            final com.ups.tracking.trackReply.ShipmentType shipmentType) {
        this._shipmentType = shipmentType;
    }

    /**
     * Sets the value of field 'shipmentWeight'.
     * 
     * @param shipmentWeight the value of field 'shipmentWeight'.
     */
    public void setShipmentWeight(
            final com.ups.tracking.trackReply.ShipmentWeight shipmentWeight) {
        this._shipmentWeight = shipmentWeight;
    }

    /**
     * Sets the value of field 'shipper'.
     * 
     * @param shipper the value of field 'shipper'.
     */
    public void setShipper(
            final com.ups.tracking.trackReply.Shipper shipper) {
        this._shipper = shipper;
    }

    /**
     * Sets the value of field 'signedForByName'.
     * 
     * @param signedForByName the value of field 'signedForByName'.
     */
    public void setSignedForByName(
            final java.lang.String signedForByName) {
        this._signedForByName = signedForByName;
    }

    /**
     * Sets the value of field 'volume'.
     * 
     * @param volume the value of field 'volume'.
     */
    public void setVolume(
            final com.ups.tracking.trackReply.Volume volume) {
        this._volume = volume;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.Shipment
     */
    public static com.ups.tracking.trackReply.Shipment unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.Shipment) Unmarshaller.unmarshal(com.ups.tracking.trackReply.Shipment.class, reader);
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
