//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.10.04 at 05:00:25 PM CEST
//
package org.modelio.module.attacktreedesigner.conversion.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for attackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attackType">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="counterMeasure" type="{}counterMeasureType" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="operator" type="{}operatorType" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attackType", propOrder = {
    "tag",
    "customTag",
    "counterMeasure",
    "operator"
})
public class AttackType {
    @XmlAttribute(name = "name", required = true)
    protected String name;

    protected List<TagType> tag;

    protected List<CounterMeasureType> counterMeasure;

    protected OperatorType operator;

    protected List<CustomTagType> customTag;

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagType }
     */
    public List<TagType> getTag() {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the counterMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCounterMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterMeasureType }
     */
    public List<CounterMeasureType> getCounterMeasure() {
        if (this.counterMeasure == null) {
            this.counterMeasure = new ArrayList<>();
        }
        return this.counterMeasure;
    }

    /**
     * Gets the value of the operator property.
     * @return
     * possible object is
     * {@link OperatorType }
     */
    public OperatorType getOperator() {
        return this.operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value allowed object is
     * {@link OperatorType }
     */
    public void setOperator(OperatorType value) {
        this.operator = value;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the customTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCustomTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTagType }
     */
    public List<CustomTagType> getCustomTag() {
        if (this.customTag == null) {
            this.customTag = new ArrayList<>();
        }
        return this.customTag;
    }

}
