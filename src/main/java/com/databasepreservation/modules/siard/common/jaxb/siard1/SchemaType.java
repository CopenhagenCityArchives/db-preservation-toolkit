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

/**
 * Schema element in siardArchive
 * <p>
 * <p>
 * <p>Java class for schemaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="schemaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folder" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}fsName"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tables" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}tablesType"/>
 *         &lt;element name="views" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}viewsType" minOccurs="0"/>
 *         &lt;element name="routines" type="{http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd}routinesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "schemaType", propOrder = {"name", "folder", "description",
  "tables", "views", "routines"}) public class SchemaType {

        @XmlElement(required = true) protected String name;
        @XmlElement(required = true) protected String folder;
        protected String description;
        @XmlElement(required = true) protected TablesType tables;
        protected ViewsType views;
        protected RoutinesType routines;

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
         * Gets the value of the folder property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getFolder() {
                return folder;
        }

        /**
         * Sets the value of the folder property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFolder(String value) {
                this.folder = value;
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

        /**
         * Gets the value of the tables property.
         *
         * @return possible object is
         * {@link TablesType }
         */
        public TablesType getTables() {
                return tables;
        }

        /**
         * Sets the value of the tables property.
         *
         * @param value allowed object is
         *              {@link TablesType }
         */
        public void setTables(TablesType value) {
                this.tables = value;
        }

        /**
         * Gets the value of the views property.
         *
         * @return possible object is
         * {@link ViewsType }
         */
        public ViewsType getViews() {
                return views;
        }

        /**
         * Sets the value of the views property.
         *
         * @param value allowed object is
         *              {@link ViewsType }
         */
        public void setViews(ViewsType value) {
                this.views = value;
        }

        /**
         * Gets the value of the routines property.
         *
         * @return possible object is
         * {@link RoutinesType }
         */
        public RoutinesType getRoutines() {
                return routines;
        }

        /**
         * Sets the value of the routines property.
         *
         * @param value allowed object is
         *              {@link RoutinesType }
         */
        public void setRoutines(RoutinesType value) {
                this.routines = value;
        }

}
