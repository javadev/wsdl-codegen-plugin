
package net.melissadata.address.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransmissionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Records" type="{urn:mdGlobalAddress}ArrayOfRequestRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "transmissionReference",
    "customerID",
    "options",
    "records"
})
public class Request {

    @XmlElementRef(name = "TransmissionReference", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionReference;
    @XmlElementRef(name = "CustomerID", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerID;
    @XmlElementRef(name = "Options", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<String> options;
    @XmlElementRef(name = "Records", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRequestRecord> records;

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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerID(JAXBElement<String> value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptions(JAXBElement<String> value) {
        this.options = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequestRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRequestRecord> getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequestRecord }{@code >}
     *     
     */
    public void setRecords(JAXBElement<ArrayOfRequestRecord> value) {
        this.records = value;
    }

}
