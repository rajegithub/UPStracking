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
 * Class PackageServiceOptionsType.
 * 
 * @version $Revision$ $Date$
 */
public class PackageServiceOptionsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _COD.
     */
    private com.ups.tracking.trackReply.COD _COD;

    /**
     * Field _signatureRequired.
     */
    private com.ups.tracking.trackReply.SignatureRequired _signatureRequired;

    /**
     * Field _importControl.
     */
    private java.lang.String _importControl;

    /**
     * Field _commercialInvoiceRemoval.
     */
    private java.lang.String _commercialInvoiceRemoval;

    /**
     * Field _UPScarbonneutral.
     */
    private java.lang.String _UPScarbonneutral;

    /**
     * Field _USPSPICNumber.
     */
    private java.lang.String _USPSPICNumber;

    /**
     * Field _exchangeBased.
     */
    private java.lang.String _exchangeBased;

    /**
     * Field _packAndCollect.
     */
    private java.lang.String _packAndCollect;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackageServiceOptionsType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'COD'.
     * 
     * @return the value of field 'COD'.
     */
    public com.ups.tracking.trackReply.COD getCOD(
    ) {
        return this._COD;
    }

    /**
     * Returns the value of field 'commercialInvoiceRemoval'.
     * 
     * @return the value of field 'CommercialInvoiceRemoval'.
     */
    public java.lang.String getCommercialInvoiceRemoval(
    ) {
        return this._commercialInvoiceRemoval;
    }

    /**
     * Returns the value of field 'exchangeBased'.
     * 
     * @return the value of field 'ExchangeBased'.
     */
    public java.lang.String getExchangeBased(
    ) {
        return this._exchangeBased;
    }

    /**
     * Returns the value of field 'importControl'.
     * 
     * @return the value of field 'ImportControl'.
     */
    public java.lang.String getImportControl(
    ) {
        return this._importControl;
    }

    /**
     * Returns the value of field 'packAndCollect'.
     * 
     * @return the value of field 'PackAndCollect'.
     */
    public java.lang.String getPackAndCollect(
    ) {
        return this._packAndCollect;
    }

    /**
     * Returns the value of field 'signatureRequired'.
     * 
     * @return the value of field 'SignatureRequired'.
     */
    public com.ups.tracking.trackReply.SignatureRequired getSignatureRequired(
    ) {
        return this._signatureRequired;
    }

    /**
     * Returns the value of field 'UPScarbonneutral'.
     * 
     * @return the value of field 'UPScarbonneutral'.
     */
    public java.lang.String getUPScarbonneutral(
    ) {
        return this._UPScarbonneutral;
    }

    /**
     * Returns the value of field 'USPSPICNumber'.
     * 
     * @return the value of field 'USPSPICNumber'.
     */
    public java.lang.String getUSPSPICNumber(
    ) {
        return this._USPSPICNumber;
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
     * Sets the value of field 'COD'.
     * 
     * @param COD the value of field 'COD'.
     */
    public void setCOD(
            final com.ups.tracking.trackReply.COD COD) {
        this._COD = COD;
    }

    /**
     * Sets the value of field 'commercialInvoiceRemoval'.
     * 
     * @param commercialInvoiceRemoval the value of field
     * 'commercialInvoiceRemoval'.
     */
    public void setCommercialInvoiceRemoval(
            final java.lang.String commercialInvoiceRemoval) {
        this._commercialInvoiceRemoval = commercialInvoiceRemoval;
    }

    /**
     * Sets the value of field 'exchangeBased'.
     * 
     * @param exchangeBased the value of field 'exchangeBased'.
     */
    public void setExchangeBased(
            final java.lang.String exchangeBased) {
        this._exchangeBased = exchangeBased;
    }

    /**
     * Sets the value of field 'importControl'.
     * 
     * @param importControl the value of field 'importControl'.
     */
    public void setImportControl(
            final java.lang.String importControl) {
        this._importControl = importControl;
    }

    /**
     * Sets the value of field 'packAndCollect'.
     * 
     * @param packAndCollect the value of field 'packAndCollect'.
     */
    public void setPackAndCollect(
            final java.lang.String packAndCollect) {
        this._packAndCollect = packAndCollect;
    }

    /**
     * Sets the value of field 'signatureRequired'.
     * 
     * @param signatureRequired the value of field
     * 'signatureRequired'.
     */
    public void setSignatureRequired(
            final com.ups.tracking.trackReply.SignatureRequired signatureRequired) {
        this._signatureRequired = signatureRequired;
    }

    /**
     * Sets the value of field 'UPScarbonneutral'.
     * 
     * @param UPScarbonneutral the value of field 'UPScarbonneutral'
     */
    public void setUPScarbonneutral(
            final java.lang.String UPScarbonneutral) {
        this._UPScarbonneutral = UPScarbonneutral;
    }

    /**
     * Sets the value of field 'USPSPICNumber'.
     * 
     * @param USPSPICNumber the value of field 'USPSPICNumber'.
     */
    public void setUSPSPICNumber(
            final java.lang.String USPSPICNumber) {
        this._USPSPICNumber = USPSPICNumber;
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
     * com.ups.tracking.trackReply.PackageServiceOptionsType
     */
    public static com.ups.tracking.trackReply.PackageServiceOptionsType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.PackageServiceOptionsType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.PackageServiceOptionsType.class, reader);
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
