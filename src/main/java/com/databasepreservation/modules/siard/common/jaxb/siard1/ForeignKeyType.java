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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * foreignKey element in siardArchive
 * <p>
 * <p>
 * <p>Java class for foreignKeyType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="foreignKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencedSchema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencedTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}referenceType" maxOccurs="unbounded"/>
 *         &lt;element name="matchType" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}matchTypeType" minOccurs="0"/>
 *         &lt;element name="deleteAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "foreignKeyType", propOrder = {"name", "referencedSchema",
  "referencedTable", "reference", "matchType", "deleteAction", "updateAction",
  "description"}) public class ForeignKeyType {

        @XmlElement(required = true) protected String name;
        @XmlElement(required = true) protected String referencedSchema;
        @XmlElement(required = true) protected String referencedTable;
        @XmlElement(required = true) protected List<ReferenceType> reference;
        @XmlSchemaType(name = "string") protected MatchTypeType matchType;
        protected String deleteAction;
        protected String updateAction;
        protected String description;

        /**
         * Gets the value of the name property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
                return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
                this.name = value;
        }

        /**
         * Gets the value of the referencedSchema property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getReferencedSchema() {
                return referencedSchema;
        }

        /**
         * Sets the value of the referencedSchema property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReferencedSchema(String value) {
                this.referencedSchema = value;
        }

        /**
         * Gets the value of the referencedTable property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getReferencedTable() {
                return referencedTable;
        }

        /**
         * Sets the value of the referencedTable property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReferencedTable(String value) {
                this.referencedTable = value;
        }

        /**
         * Gets the value of the reference property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReference().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceType }
         */
        public List<ReferenceType> getReference() {
                if (reference == null) {
                        reference = new ArrayList<ReferenceType>();
                }
                return this.reference;
        }

        /**
         * Gets the value of the matchType property.
         *
         * @return possible object is
         * {@link MatchTypeType }
         */
        public MatchTypeType getMatchType() {
                return matchType;
        }

        /**
         * Sets the value of the matchType property.
         *
         * @param value allowed object is
         *              {@link MatchTypeType }
         */
        public void setMatchType(MatchTypeType value) {
                this.matchType = value;
        }

        /**
         * Gets the value of the deleteAction property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDeleteAction() {
                return deleteAction;
        }

        /**
         * Sets the value of the deleteAction property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDeleteAction(String value) {
                this.deleteAction = value;
        }

        /**
         * Gets the value of the updateAction property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUpdateAction() {
                return updateAction;
        }

        /**
         * Sets the value of the updateAction property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUpdateAction(String value) {
                this.updateAction = value;
        }

        /**
         * Gets the value of the description property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescription() {
                return description;
        }

        /**
         * Sets the value of the description property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescription(String value) {
                this.description = value;
        }

}
