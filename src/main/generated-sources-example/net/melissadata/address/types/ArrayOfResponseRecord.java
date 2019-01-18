
package net.melissadata.address.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResponseRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseRecord" type="{urn:mdGlobalAddress}ResponseRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseRecord", propOrder = {
    "responseRecord"
})
public class ArrayOfResponseRecord {

    @XmlElement(name = "ResponseRecord", nillable = true)
    protected List<ResponseRecord> responseRecord;

    /**
     * Gets the value of the responseRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseRecord }
     * 
     * 
     */
    public List<ResponseRecord> getResponseRecord() {
        if (responseRecord == null) {
            responseRecord = new ArrayList<ResponseRecord>();
        }
        return this.responseRecord;
    }

}
