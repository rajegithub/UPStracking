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
 * Class SignatureImage.
 * 
 * @version $Revision$ $Date$
 */
public class SignatureImage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _graphicImage.
     */
    private java.lang.String _graphicImage;

    /**
     * Field _imageFormat.
     */
    private com.ups.tracking.trackReply.ImageFormat _imageFormat;


      //----------------/
     //- Constructors -/
    //----------------/

    public SignatureImage() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'graphicImage'.
     * 
     * @return the value of field 'GraphicImage'.
     */
    public java.lang.String getGraphicImage(
    ) {
        return this._graphicImage;
    }

    /**
     * Returns the value of field 'imageFormat'.
     * 
     * @return the value of field 'ImageFormat'.
     */
    public com.ups.tracking.trackReply.ImageFormat getImageFormat(
    ) {
        return this._imageFormat;
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
     * Sets the value of field 'graphicImage'.
     * 
     * @param graphicImage the value of field 'graphicImage'.
     */
    public void setGraphicImage(
            final java.lang.String graphicImage) {
        this._graphicImage = graphicImage;
    }

    /**
     * Sets the value of field 'imageFormat'.
     * 
     * @param imageFormat the value of field 'imageFormat'.
     */
    public void setImageFormat(
            final com.ups.tracking.trackReply.ImageFormat imageFormat) {
        this._imageFormat = imageFormat;
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
     * com.ups.tracking.trackReply.SignatureImage
     */
    public static com.ups.tracking.trackReply.SignatureImage unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.SignatureImage) Unmarshaller.unmarshal(com.ups.tracking.trackReply.SignatureImage.class, reader);
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
