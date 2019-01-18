
package net.melissadata.address.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Records" type="{urn:mdGlobalAddress}ArrayOfResponseRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "version",
    "transmissionReference",
    "transmissionResults",
    "totalRecords",
    "records"
})
public class Response {

    @XmlElementRef(name = "Version", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;
    @XmlElementRef(name = "TransmissionReference", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionReference;
    @XmlElementRef(name = "TransmissionResults", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionResults;
    @XmlElementRef(name = "TotalRecords", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalRecords;
    @XmlElementRef(name = "Records", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResponseRecord> records;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

    /**
     * Gets the value of the transmissionReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionReference() {
        return transmissionReference;
    }

    /**
     * Sets the value of the transmissionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionReference(JAXBElement<String> value) {
        this.transmissionReference = value;
    }

    /**
     * Gets the value of the transmissionResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionResults() {
        return transmissionResults;
    }

    /**
     * Sets the value of the transmissionResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionResults(JAXBElement<String> value) {
        this.transmissionResults = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalRecords(JAXBElement<String> value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResponseRecord> getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseRecord }{@code >}
     *     
     */
    public void setRecords(JAXBElement<ArrayOfResponseRecord> value) {
        this.records = value;
    }

}
