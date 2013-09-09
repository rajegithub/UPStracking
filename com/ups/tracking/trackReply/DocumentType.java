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
 * Class DocumentType.
 * 
 * @version $Revision$ $Date$
 */
public class DocumentType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type.
     */
    private com.ups.tracking.trackReply.Type _type;

    /**
     * Field _graphicImage.
     */
    private java.lang.String _graphicImage;

    /**
     * Field _format.
     */
    private com.ups.tracking.trackReply.Format _format;


      //----------------/
     //- Constructors -/
    //----------------/

    public DocumentType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'format'.
     * 
     * @return the value of field 'Format'.
     */
    public com.ups.tracking.trackReply.Format getFormat(
    ) {
        return this._format;
    }

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
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public com.ups.tracking.trackReply.Type getType(
    ) {
        return this._type;
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
     * Sets the value of field 'format'.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(
            final com.ups.tracking.trackReply.Format format) {
        this._format = format;
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
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final com.ups.tracking.trackReply.Type type) {
        this._type = type;
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
     * com.ups.tracking.trackReply.DocumentType
     */
    public static com.ups.tracking.trackReply.DocumentType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.DocumentType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.DocumentType.class, reader);
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
