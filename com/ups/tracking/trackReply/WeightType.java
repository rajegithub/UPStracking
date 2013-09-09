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
 * Class WeightType.
 * 
 * @version $Revision$ $Date$
 */
public class WeightType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _unitOfMeasurement.
     */
    private com.ups.tracking.trackReply.UnitOfMeasurement _unitOfMeasurement;

    /**
     * Field _weight.
     */
    private java.lang.String _weight;


      //----------------/
     //- Constructors -/
    //----------------/

    public WeightType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'unitOfMeasurement'.
     * 
     * @return the value of field 'UnitOfMeasurement'.
     */
    public com.ups.tracking.trackReply.UnitOfMeasurement getUnitOfMeasurement(
    ) {
        return this._unitOfMeasurement;
    }

    /**
     * Returns the value of field 'weight'.
     * 
     * @return the value of field 'Weight'.
     */
    public java.lang.String getWeight(
    ) {
        return this._weight;
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
     * Sets the value of field 'unitOfMeasurement'.
     * 
     * @param unitOfMeasurement the value of field
     * 'unitOfMeasurement'.
     */
    public void setUnitOfMeasurement(
            final com.ups.tracking.trackReply.UnitOfMeasurement unitOfMeasurement) {
        this._unitOfMeasurement = unitOfMeasurement;
    }

    /**
     * Sets the value of field 'weight'.
     * 
     * @param weight the value of field 'weight'.
     */
    public void setWeight(
            final java.lang.String weight) {
        this._weight = weight;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.ups.tracking.trackReply.WeightTyp
     */
    public static com.ups.tracking.trackReply.WeightType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.ups.tracking.trackReply.WeightType) Unmarshaller.unmarshal(com.ups.tracking.trackReply.WeightType.class, reader);
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
