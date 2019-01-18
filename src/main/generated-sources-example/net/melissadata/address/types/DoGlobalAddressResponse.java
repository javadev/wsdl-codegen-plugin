
package net.melissadata.address.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doGlobalAddressResult" type="{urn:mdGlobalAddress}Response" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doGlobalAddressResult"
})
@XmlRootElement(name = "doGlobalAddressResponse")
public class DoGlobalAddressResponse {

    @XmlElementRef(name = "doGlobalAddressResult", namespace = "urn:mdGlobalAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<Response> doGlobalAddressResult;

    /**
     * Gets the value of the doGlobalAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public JAXBElement<Response> getDoGlobalAddressResult() {
        return doGlobalAddressResult;
    }

    /**
     * Sets the value of the doGlobalAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public void setDoGlobalAddressResult(JAXBElement<Response> value) {
        this.doGlobalAddressResult = value;
    }

}
