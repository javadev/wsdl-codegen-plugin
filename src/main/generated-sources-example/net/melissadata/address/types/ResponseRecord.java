
package net.melissadata.address.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubPremises" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoubleDependentLocality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentLocality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubAdministrativeArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdministrativeArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubNationalArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryISO3166_1_Alpha2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryISO3166_1_Alpha3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryISO3166_1_Numeric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubdivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThoroughfarePreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThoroughfareLeadingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThoroughfareTrailingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThoroughfarePostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentThoroughfare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentThoroughfarePreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentThoroughfareLeadingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentThoroughfareTrailingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentThoroughfarePostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PremisesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PremisesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubPremisesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubPremisesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseRecord", propOrder = {
    "recordID",
    "results",
    "formattedAddress",
    "organization",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "addressLine6",
    "addressLine7",
    "addressLine8",
    "subPremises",
    "doubleDependentLocality",
    "dependentLocality",
    "locality",
    "subAdministrativeArea",
    "administrativeArea",
    "postalCode",
    "addressType",
    "addressKey",
    "subNationalArea",
    "countryName",
    "countryISO31661Alpha2",
    "countryISO31661Alpha3",
    "countryISO31661Numeric",
    "countrySubdivisionCode",
    "thoroughfare",
    "thoroughfarePreDirection",
    "thoroughfareLeadingType",
    "thoroughfareName",
    "thoroughfareTrailingType",
    "thoroughfarePostDirection",
    "dependentThoroughfare",
    "dependentThoroughfarePreDirection",
    "dependentThoroughfareLeadingType",
    "dependentThoroughfareName",
    "dependentThoroughfareTrailingType",
    "dependentThoroughfarePostDirection",
    "building",
    "premisesType",
    "premisesNumber",
    "subPremisesType",
    "subPremisesNumber",
    "postBox",
    "latitude",
    "longitude"
})
public class ResponseRecord {

    @XmlElementRef(name = "RecordID", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordID;
    @XmlElementRef(name = "Results", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> results;
    @XmlElementRef(name = "FormattedAddress", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "Organization", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organization;
    @XmlElementRef(name = "AddressLine1", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "AddressLine4", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine4;
    @XmlElementRef(name = "AddressLine5", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine5;
    @XmlElementRef(name = "AddressLine6", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine6;
    @XmlElementRef(name = "AddressLine7", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine7;
    @XmlElementRef(name = "AddressLine8", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine8;
    @XmlElementRef(name = "SubPremises", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subPremises;
    @XmlElementRef(name = "DoubleDependentLocality", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doubleDependentLocality;
    @XmlElementRef(name = "DependentLocality", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentLocality;
    @XmlElementRef(name = "Locality", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "SubAdministrativeArea", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subAdministrativeArea;
    @XmlElementRef(name = "AdministrativeArea", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> administrativeArea;
    @XmlElementRef(name = "PostalCode", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "AddressType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressType;
    @XmlElementRef(name = "AddressKey", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressKey;
    @XmlElementRef(name = "SubNationalArea", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subNationalArea;
    @XmlElementRef(name = "CountryName", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryName;
    @XmlElementRef(name = "CountryISO3166_1_Alpha2", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryISO31661Alpha2;
    @XmlElementRef(name = "CountryISO3166_1_Alpha3", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryISO31661Alpha3;
    @XmlElementRef(name = "CountryISO3166_1_Numeric", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryISO31661Numeric;
    @XmlElementRef(name = "CountrySubdivisionCode", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countrySubdivisionCode;
    @XmlElementRef(name = "Thoroughfare", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thoroughfare;
    @XmlElementRef(name = "ThoroughfarePreDirection", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thoroughfarePreDirection;
    @XmlElementRef(name = "ThoroughfareLeadingType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thoroughfareLeadingType;
    @XmlElementRef(name = "ThoroughfareName", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thoroughfareName;
    @XmlElementRef(name = "ThoroughfareTrailingType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thoroughfareTrailingType;
    @XmlElementRef(name = "ThoroughfarePostDirection", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thoroughfarePostDirection;
    @XmlElementRef(name = "DependentThoroughfare", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentThoroughfare;
    @XmlElementRef(name = "DependentThoroughfarePreDirection", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentThoroughfarePreDirection;
    @XmlElementRef(name = "DependentThoroughfareLeadingType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentThoroughfareLeadingType;
    @XmlElementRef(name = "DependentThoroughfareName", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentThoroughfareName;
    @XmlElementRef(name = "DependentThoroughfareTrailingType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentThoroughfareTrailingType;
    @XmlElementRef(name = "DependentThoroughfarePostDirection", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependentThoroughfarePostDirection;
    @XmlElementRef(name = "Building", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> building;
    @XmlElementRef(name = "PremisesType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premisesType;
    @XmlElementRef(name = "PremisesNumber", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premisesNumber;
    @XmlElementRef(name = "SubPremisesType", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subPremisesType;
    @XmlElementRef(name = "SubPremisesNumber", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subPremisesNumber;
    @XmlElementRef(name = "PostBox", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postBox;
    @XmlElementRef(name = "Latitude", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitude;
    @XmlElementRef(name = "Longitude", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longitude;

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordID(JAXBElement<String> value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResults(JAXBElement<String> value) {
        this.results = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<String> value) {
        this.organization = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine4(JAXBElement<String> value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine5(JAXBElement<String> value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the addressLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine6() {
        return addressLine6;
    }

    /**
     * Sets the value of the addressLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine6(JAXBElement<String> value) {
        this.addressLine6 = value;
    }

    /**
     * Gets the value of the addressLine7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine7() {
        return addressLine7;
    }

    /**
     * Sets the value of the addressLine7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine7(JAXBElement<String> value) {
        this.addressLine7 = value;
    }

    /**
     * Gets the value of the addressLine8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine8() {
        return addressLine8;
    }

    /**
     * Sets the value of the addressLine8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine8(JAXBElement<String> value) {
        this.addressLine8 = value;
    }

    /**
     * Gets the value of the subPremises property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubPremises() {
        return subPremises;
    }

    /**
     * Sets the value of the subPremises property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubPremises(JAXBElement<String> value) {
        this.subPremises = value;
    }

    /**
     * Gets the value of the doubleDependentLocality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoubleDependentLocality() {
        return doubleDependentLocality;
    }

    /**
     * Sets the value of the doubleDependentLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoubleDependentLocality(JAXBElement<String> value) {
        this.doubleDependentLocality = value;
    }

    /**
     * Gets the value of the dependentLocality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentLocality() {
        return dependentLocality;
    }

    /**
     * Sets the value of the dependentLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentLocality(JAXBElement<String> value) {
        this.dependentLocality = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocality(JAXBElement<String> value) {
        this.locality = value;
    }

    /**
     * Gets the value of the subAdministrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    /**
     * Sets the value of the subAdministrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubAdministrativeArea(JAXBElement<String> value) {
        this.subAdministrativeArea = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrativeArea(JAXBElement<String> value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressType(JAXBElement<String> value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressKey() {
        return addressKey;
    }

    /**
     * Sets the value of the addressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressKey(JAXBElement<String> value) {
        this.addressKey = value;
    }

    /**
     * Gets the value of the subNationalArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubNationalArea() {
        return subNationalArea;
    }

    /**
     * Sets the value of the subNationalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubNationalArea(JAXBElement<String> value) {
        this.subNationalArea = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryName(JAXBElement<String> value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryISO31661Alpha2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryISO31661Alpha2() {
        return countryISO31661Alpha2;
    }

    /**
     * Sets the value of the countryISO31661Alpha2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryISO31661Alpha2(JAXBElement<String> value) {
        this.countryISO31661Alpha2 = value;
    }

    /**
     * Gets the value of the countryISO31661Alpha3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryISO31661Alpha3() {
        return countryISO31661Alpha3;
    }

    /**
     * Sets the value of the countryISO31661Alpha3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryISO31661Alpha3(JAXBElement<String> value) {
        this.countryISO31661Alpha3 = value;
    }

    /**
     * Gets the value of the countryISO31661Numeric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryISO31661Numeric() {
        return countryISO31661Numeric;
    }

    /**
     * Sets the value of the countryISO31661Numeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryISO31661Numeric(JAXBElement<String> value) {
        this.countryISO31661Numeric = value;
    }

    /**
     * Gets the value of the countrySubdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountrySubdivisionCode() {
        return countrySubdivisionCode;
    }

    /**
     * Sets the value of the countrySubdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountrySubdivisionCode(JAXBElement<String> value) {
        this.countrySubdivisionCode = value;
    }

    /**
     * Gets the value of the thoroughfare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThoroughfare() {
        return thoroughfare;
    }

    /**
     * Sets the value of the thoroughfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThoroughfare(JAXBElement<String> value) {
        this.thoroughfare = value;
    }

    /**
     * Gets the value of the thoroughfarePreDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThoroughfarePreDirection() {
        return thoroughfarePreDirection;
    }

    /**
     * Sets the value of the thoroughfarePreDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThoroughfarePreDirection(JAXBElement<String> value) {
        this.thoroughfarePreDirection = value;
    }

    /**
     * Gets the value of the thoroughfareLeadingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThoroughfareLeadingType() {
        return thoroughfareLeadingType;
    }

    /**
     * Sets the value of the thoroughfareLeadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThoroughfareLeadingType(JAXBElement<String> value) {
        this.thoroughfareLeadingType = value;
    }

    /**
     * Gets the value of the thoroughfareName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThoroughfareName() {
        return thoroughfareName;
    }

    /**
     * Sets the value of the thoroughfareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThoroughfareName(JAXBElement<String> value) {
        this.thoroughfareName = value;
    }

    /**
     * Gets the value of the thoroughfareTrailingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThoroughfareTrailingType() {
        return thoroughfareTrailingType;
    }

    /**
     * Sets the value of the thoroughfareTrailingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThoroughfareTrailingType(JAXBElement<String> value) {
        this.thoroughfareTrailingType = value;
    }

    /**
     * Gets the value of the thoroughfarePostDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThoroughfarePostDirection() {
        return thoroughfarePostDirection;
    }

    /**
     * Sets the value of the thoroughfarePostDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThoroughfarePostDirection(JAXBElement<String> value) {
        this.thoroughfarePostDirection = value;
    }

    /**
     * Gets the value of the dependentThoroughfare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentThoroughfare() {
        return dependentThoroughfare;
    }

    /**
     * Sets the value of the dependentThoroughfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentThoroughfare(JAXBElement<String> value) {
        this.dependentThoroughfare = value;
    }

    /**
     * Gets the value of the dependentThoroughfarePreDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentThoroughfarePreDirection() {
        return dependentThoroughfarePreDirection;
    }

    /**
     * Sets the value of the dependentThoroughfarePreDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentThoroughfarePreDirection(JAXBElement<String> value) {
        this.dependentThoroughfarePreDirection = value;
    }

    /**
     * Gets the value of the dependentThoroughfareLeadingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentThoroughfareLeadingType() {
        return dependentThoroughfareLeadingType;
    }

    /**
     * Sets the value of the dependentThoroughfareLeadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentThoroughfareLeadingType(JAXBElement<String> value) {
        this.dependentThoroughfareLeadingType = value;
    }

    /**
     * Gets the value of the dependentThoroughfareName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentThoroughfareName() {
        return dependentThoroughfareName;
    }

    /**
     * Sets the value of the dependentThoroughfareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentThoroughfareName(JAXBElement<String> value) {
        this.dependentThoroughfareName = value;
    }

    /**
     * Gets the value of the dependentThoroughfareTrailingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentThoroughfareTrailingType() {
        return dependentThoroughfareTrailingType;
    }

    /**
     * Sets the value of the dependentThoroughfareTrailingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentThoroughfareTrailingType(JAXBElement<String> value) {
        this.dependentThoroughfareTrailingType = value;
    }

    /**
     * Gets the value of the dependentThoroughfarePostDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependentThoroughfarePostDirection() {
        return dependentThoroughfarePostDirection;
    }

    /**
     * Sets the value of the dependentThoroughfarePostDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependentThoroughfarePostDirection(JAXBElement<String> value) {
        this.dependentThoroughfarePostDirection = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuilding(JAXBElement<String> value) {
        this.building = value;
    }

    /**
     * Gets the value of the premisesType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremisesType() {
        return premisesType;
    }

    /**
     * Sets the value of the premisesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremisesType(JAXBElement<String> value) {
        this.premisesType = value;
    }

    /**
     * Gets the value of the premisesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremisesNumber() {
        return premisesNumber;
    }

    /**
     * Sets the value of the premisesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremisesNumber(JAXBElement<String> value) {
        this.premisesNumber = value;
    }

    /**
     * Gets the value of the subPremisesType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubPremisesType() {
        return subPremisesType;
    }

    /**
     * Sets the value of the subPremisesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubPremisesType(JAXBElement<String> value) {
        this.subPremisesType = value;
    }

    /**
     * Gets the value of the subPremisesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubPremisesNumber() {
        return subPremisesNumber;
    }

    /**
     * Sets the value of the subPremisesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubPremisesNumber(JAXBElement<String> value) {
        this.subPremisesNumber = value;
    }

    /**
     * Gets the value of the postBox property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostBox() {
        return postBox;
    }

    /**
     * Sets the value of the postBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostBox(JAXBElement<String> value) {
        this.postBox = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<String> value) {
        this.longitude = value;
    }

}
