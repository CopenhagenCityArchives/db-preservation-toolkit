//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.24 at 06:16:58 PM WEST 
//

package com.databasepreservation.modules.siard.common.jaxb.siard1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * List of views
 * <p>
 * <p>
 * <p>Java class for viewsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="viewsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="view" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}viewType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "viewsType", propOrder = {"view"}) public class ViewsType {

        @XmlElement(required = true) protected List<ViewType> view;

        /**
         * Gets the value of the view property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the view property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getView().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ViewType }
         */
        public List<ViewType> getView() {
                if (view == null) {
                        view = new ArrayList<ViewType>();
                }
                return this.view;
        }

}
