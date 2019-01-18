
package net.melissadata.address.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.melissadata.address.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Request_QNAME = new QName("urn:mdGlobalAddress", "Request");
    private final static QName _ArrayOfRequestRecord_QNAME = new QName("urn:mdGlobalAddress", "ArrayOfRequestRecord");
    private final static QName _RequestRecord_QNAME = new QName("urn:mdGlobalAddress", "RequestRecord");
    private final static QName _Response_QNAME = new QName("urn:mdGlobalAddress", "Response");
    private final static QName _ArrayOfResponseRecord_QNAME = new QName("urn:mdGlobalAddress", "ArrayOfResponseRecord");
    private final static QName _ResponseRecord_QNAME = new QName("urn:mdGlobalAddress", "ResponseRecord");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DoGlobalAddressResponseDoGlobalAddressResult_QNAME = new QName("urn:mdGlobalAddress", "doGlobalAddressResult");
    private final static QName _ResponseRecordRecordID_QNAME = new QName("urn:mdGlobalAddress", "RecordID");
    private final static QName _ResponseRecordResults_QNAME = new QName("urn:mdGlobalAddress", "Results");
    private final static QName _ResponseRecordFormattedAddress_QNAME = new QName("urn:mdGlobalAddress", "FormattedAddress");
    private final static QName _ResponseRecordOrganization_QNAME = new QName("urn:mdGlobalAddress", "Organization");
    private final static QName _ResponseRecordAddressLine1_QNAME = new QName("urn:mdGlobalAddress", "AddressLine1");
    private final static QName _ResponseRecordAddressLine2_QNAME = new QName("urn:mdGlobalAddress", "AddressLine2");
    private final static QName _ResponseRecordAddressLine3_QNAME = new QName("urn:mdGlobalAddress", "AddressLine3");
    private final static QName _ResponseRecordAddressLine4_QNAME = new QName("urn:mdGlobalAddress", "AddressLine4");
    private final static QName _ResponseRecordAddressLine5_QNAME = new QName("urn:mdGlobalAddress", "AddressLine5");
    private final static QName _ResponseRecordAddressLine6_QNAME = new QName("urn:mdGlobalAddress", "AddressLine6");
    private final static QName _ResponseRecordAddressLine7_QNAME = new QName("urn:mdGlobalAddress", "AddressLine7");
    private final static QName _ResponseRecordAddressLine8_QNAME = new QName("urn:mdGlobalAddress", "AddressLine8");
    private final static QName _ResponseRecordSubPremises_QNAME = new QName("urn:mdGlobalAddress", "SubPremises");
    private final static QName _ResponseRecordDoubleDependentLocality_QNAME = new QName("urn:mdGlobalAddress", "DoubleDependentLocality");
    private final static QName _ResponseRecordDependentLocality_QNAME = new QName("urn:mdGlobalAddress", "DependentLocality");
    private final static QName _ResponseRecordLocality_QNAME = new QName("urn:mdGlobalAddress", "Locality");
    private final static QName _ResponseRecordSubAdministrativeArea_QNAME = new QName("urn:mdGlobalAddress", "SubAdministrativeArea");
    private final static QName _ResponseRecordAdministrativeArea_QNAME = new QName("urn:mdGlobalAddress", "AdministrativeArea");
    private final static QName _ResponseRecordPostalCode_QNAME = new QName("urn:mdGlobalAddress", "PostalCode");
    private final static QName _ResponseRecordAddressType_QNAME = new QName("urn:mdGlobalAddress", "AddressType");
    private final static QName _ResponseRecordAddressKey_QNAME = new QName("urn:mdGlobalAddress", "AddressKey");
    private final static QName _ResponseRecordSubNationalArea_QNAME = new QName("urn:mdGlobalAddress", "SubNationalArea");
    private final static QName _ResponseRecordCountryName_QNAME = new QName("urn:mdGlobalAddress", "CountryName");
    private final static QName _ResponseRecordCountryISO31661Alpha2_QNAME = new QName("urn:mdGlobalAddress", "CountryISO3166_1_Alpha2");
    private final static QName _ResponseRecordCountryISO31661Alpha3_QNAME = new QName("urn:mdGlobalAddress", "CountryISO3166_1_Alpha3");
    private final static QName _ResponseRecordCountryISO31661Numeric_QNAME = new QName("urn:mdGlobalAddress", "CountryISO3166_1_Numeric");
    private final static QName _ResponseRecordCountrySubdivisionCode_QNAME = new QName("urn:mdGlobalAddress", "CountrySubdivisionCode");
    private final static QName _ResponseRecordThoroughfare_QNAME = new QName("urn:mdGlobalAddress", "Thoroughfare");
    private final static QName _ResponseRecordThoroughfarePreDirection_QNAME = new QName("urn:mdGlobalAddress", "ThoroughfarePreDirection");
    private final static QName _ResponseRecordThoroughfareLeadingType_QNAME = new QName("urn:mdGlobalAddress", "ThoroughfareLeadingType");
    private final static QName _ResponseRecordThoroughfareName_QNAME = new QName("urn:mdGlobalAddress", "ThoroughfareName");
    private final static QName _ResponseRecordThoroughfareTrailingType_QNAME = new QName("urn:mdGlobalAddress", "ThoroughfareTrailingType");
    private final static QName _ResponseRecordThoroughfarePostDirection_QNAME = new QName("urn:mdGlobalAddress", "ThoroughfarePostDirection");
    private final static QName _ResponseRecordDependentThoroughfare_QNAME = new QName("urn:mdGlobalAddress", "DependentThoroughfare");
    private final static QName _ResponseRecordDependentThoroughfarePreDirection_QNAME = new QName("urn:mdGlobalAddress", "DependentThoroughfarePreDirection");
    private final static QName _ResponseRecordDependentThoroughfareLeadingType_QNAME = new QName("urn:mdGlobalAddress", "DependentThoroughfareLeadingType");
    private final static QName _ResponseRecordDependentThoroughfareName_QNAME = new QName("urn:mdGlobalAddress", "DependentThoroughfareName");
    private final static QName _ResponseRecordDependentThoroughfareTrailingType_QNAME = new QName("urn:mdGlobalAddress", "DependentThoroughfareTrailingType");
    private final static QName _ResponseRecordDependentThoroughfarePostDirection_QNAME = new QName("urn:mdGlobalAddress", "DependentThoroughfarePostDirection");
    private final static QName _ResponseRecordBuilding_QNAME = new QName("urn:mdGlobalAddress", "Building");
    private final static QName _ResponseRecordPremisesType_QNAME = new QName("urn:mdGlobalAddress", "PremisesType");
    private final static QName _ResponseRecordPremisesNumber_QNAME = new QName("urn:mdGlobalAddress", "PremisesNumber");
    private final static QName _ResponseRecordSubPremisesType_QNAME = new QName("urn:mdGlobalAddress", "SubPremisesType");
    private final static QName _ResponseRecordSubPremisesNumber_QNAME = new QName("urn:mdGlobalAddress", "SubPremisesNumber");
    private final static QName _ResponseRecordPostBox_QNAME = new QName("urn:mdGlobalAddress", "PostBox");
    private final static QName _ResponseRecordLatitude_QNAME = new QName("urn:mdGlobalAddress", "Latitude");
    private final static QName _ResponseRecordLongitude_QNAME = new QName("urn:mdGlobalAddress", "Longitude");
    private final static QName _ResponseVersion_QNAME = new QName("urn:mdGlobalAddress", "Version");
    private final static QName _ResponseTransmissionReference_QNAME = new QName("urn:mdGlobalAddress", "TransmissionReference");
    private final static QName _ResponseTransmissionResults_QNAME = new QName("urn:mdGlobalAddress", "TransmissionResults");
    private final static QName _ResponseTotalRecords_QNAME = new QName("urn:mdGlobalAddress", "TotalRecords");
    private final static QName _ResponseRecords_QNAME = new QName("urn:mdGlobalAddress", "Records");
    private final static QName _RequestRecordCountry_QNAME = new QName("urn:mdGlobalAddress", "Country");
    private final static QName _RequestRecordRecordOptions_QNAME = new QName("urn:mdGlobalAddress", "RecordOptions");
    private final static QName _RequestCustomerID_QNAME = new QName("urn:mdGlobalAddress", "CustomerID");
    private final static QName _RequestOptions_QNAME = new QName("urn:mdGlobalAddress", "Options");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.melissadata.address.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoGlobalAddress }
     * 
     */
    public DoGlobalAddress createDoGlobalAddress() {
        return new DoGlobalAddress();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link ArrayOfRequestRecord }
     * 
     */
    public ArrayOfRequestRecord createArrayOfRequestRecord() {
        return new ArrayOfRequestRecord();
    }

    /**
     * Create an instance of {@link RequestRecord }
     * 
     */
    public RequestRecord createRequestRecord() {
        return new RequestRecord();
    }

    /**
     * Create an instance of {@link DoGlobalAddressResponse }
     * 
     */
    public DoGlobalAddressResponse createDoGlobalAddressResponse() {
        return new DoGlobalAddressResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ArrayOfResponseRecord }
     * 
     */
    public ArrayOfResponseRecord createArrayOfResponseRecord() {
        return new ArrayOfResponseRecord();
    }

    /**
     * Create an instance of {@link ResponseRecord }
     * 
     */
    public ResponseRecord createResponseRecord() {
        return new ResponseRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ArrayOfRequestRecord")
    public JAXBElement<ArrayOfRequestRecord> createArrayOfRequestRecord(ArrayOfRequestRecord value) {
        return new JAXBElement<ArrayOfRequestRecord>(_ArrayOfRequestRecord_QNAME, ArrayOfRequestRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "RequestRecord")
    public JAXBElement<RequestRecord> createRequestRecord(RequestRecord value) {
        return new JAXBElement<RequestRecord>(_RequestRecord_QNAME, RequestRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ArrayOfResponseRecord")
    public JAXBElement<ArrayOfResponseRecord> createArrayOfResponseRecord(ArrayOfResponseRecord value) {
        return new JAXBElement<ArrayOfResponseRecord>(_ArrayOfResponseRecord_QNAME, ArrayOfResponseRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ResponseRecord")
    public JAXBElement<ResponseRecord> createResponseRecord(ResponseRecord value) {
        return new JAXBElement<ResponseRecord>(_ResponseRecord_QNAME, ResponseRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Request", scope = DoGlobalAddress.class)
    public JAXBElement<Request> createDoGlobalAddressRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, DoGlobalAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "doGlobalAddressResult", scope = DoGlobalAddressResponse.class)
    public JAXBElement<Response> createDoGlobalAddressResponseDoGlobalAddressResult(Response value) {
        return new JAXBElement<Response>(_DoGlobalAddressResponseDoGlobalAddressResult_QNAME, Response.class, DoGlobalAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "RecordID", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordRecordID(String value) {
        return new JAXBElement<String>(_ResponseRecordRecordID_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Results", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordResults(String value) {
        return new JAXBElement<String>(_ResponseRecordResults_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "FormattedAddress", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordFormattedAddress(String value) {
        return new JAXBElement<String>(_ResponseRecordFormattedAddress_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Organization", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordOrganization(String value) {
        return new JAXBElement<String>(_ResponseRecordOrganization_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine1", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine1(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine1_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine2", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine2(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine2_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine3", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine3(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine3_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine4", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine4(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine4_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine5", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine5(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine5_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine6", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine6(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine6_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine7", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine7(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine7_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine8", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressLine8(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine8_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubPremises", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordSubPremises(String value) {
        return new JAXBElement<String>(_ResponseRecordSubPremises_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DoubleDependentLocality", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDoubleDependentLocality(String value) {
        return new JAXBElement<String>(_ResponseRecordDoubleDependentLocality_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentLocality", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentLocality(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentLocality_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Locality", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordLocality(String value) {
        return new JAXBElement<String>(_ResponseRecordLocality_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubAdministrativeArea", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordSubAdministrativeArea(String value) {
        return new JAXBElement<String>(_ResponseRecordSubAdministrativeArea_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AdministrativeArea", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAdministrativeArea(String value) {
        return new JAXBElement<String>(_ResponseRecordAdministrativeArea_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "PostalCode", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordPostalCode(String value) {
        return new JAXBElement<String>(_ResponseRecordPostalCode_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressType(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressKey", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordAddressKey(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressKey_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubNationalArea", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordSubNationalArea(String value) {
        return new JAXBElement<String>(_ResponseRecordSubNationalArea_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "CountryName", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordCountryName(String value) {
        return new JAXBElement<String>(_ResponseRecordCountryName_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "CountryISO3166_1_Alpha2", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordCountryISO31661Alpha2(String value) {
        return new JAXBElement<String>(_ResponseRecordCountryISO31661Alpha2_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "CountryISO3166_1_Alpha3", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordCountryISO31661Alpha3(String value) {
        return new JAXBElement<String>(_ResponseRecordCountryISO31661Alpha3_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "CountryISO3166_1_Numeric", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordCountryISO31661Numeric(String value) {
        return new JAXBElement<String>(_ResponseRecordCountryISO31661Numeric_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "CountrySubdivisionCode", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordCountrySubdivisionCode(String value) {
        return new JAXBElement<String>(_ResponseRecordCountrySubdivisionCode_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Thoroughfare", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordThoroughfare(String value) {
        return new JAXBElement<String>(_ResponseRecordThoroughfare_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ThoroughfarePreDirection", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordThoroughfarePreDirection(String value) {
        return new JAXBElement<String>(_ResponseRecordThoroughfarePreDirection_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ThoroughfareLeadingType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordThoroughfareLeadingType(String value) {
        return new JAXBElement<String>(_ResponseRecordThoroughfareLeadingType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ThoroughfareName", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordThoroughfareName(String value) {
        return new JAXBElement<String>(_ResponseRecordThoroughfareName_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ThoroughfareTrailingType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordThoroughfareTrailingType(String value) {
        return new JAXBElement<String>(_ResponseRecordThoroughfareTrailingType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "ThoroughfarePostDirection", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordThoroughfarePostDirection(String value) {
        return new JAXBElement<String>(_ResponseRecordThoroughfarePostDirection_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentThoroughfare", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentThoroughfare(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentThoroughfare_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentThoroughfarePreDirection", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentThoroughfarePreDirection(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentThoroughfarePreDirection_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentThoroughfareLeadingType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentThoroughfareLeadingType(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentThoroughfareLeadingType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentThoroughfareName", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentThoroughfareName(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentThoroughfareName_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentThoroughfareTrailingType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentThoroughfareTrailingType(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentThoroughfareTrailingType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentThoroughfarePostDirection", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordDependentThoroughfarePostDirection(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentThoroughfarePostDirection_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Building", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordBuilding(String value) {
        return new JAXBElement<String>(_ResponseRecordBuilding_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "PremisesType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordPremisesType(String value) {
        return new JAXBElement<String>(_ResponseRecordPremisesType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "PremisesNumber", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordPremisesNumber(String value) {
        return new JAXBElement<String>(_ResponseRecordPremisesNumber_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubPremisesType", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordSubPremisesType(String value) {
        return new JAXBElement<String>(_ResponseRecordSubPremisesType_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubPremisesNumber", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordSubPremisesNumber(String value) {
        return new JAXBElement<String>(_ResponseRecordSubPremisesNumber_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "PostBox", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordPostBox(String value) {
        return new JAXBElement<String>(_ResponseRecordPostBox_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Latitude", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordLatitude(String value) {
        return new JAXBElement<String>(_ResponseRecordLatitude_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Longitude", scope = ResponseRecord.class)
    public JAXBElement<String> createResponseRecordLongitude(String value) {
        return new JAXBElement<String>(_ResponseRecordLongitude_QNAME, String.class, ResponseRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Version", scope = Response.class)
    public JAXBElement<String> createResponseVersion(String value) {
        return new JAXBElement<String>(_ResponseVersion_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "TransmissionReference", scope = Response.class)
    public JAXBElement<String> createResponseTransmissionReference(String value) {
        return new JAXBElement<String>(_ResponseTransmissionReference_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "TransmissionResults", scope = Response.class)
    public JAXBElement<String> createResponseTransmissionResults(String value) {
        return new JAXBElement<String>(_ResponseTransmissionResults_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "TotalRecords", scope = Response.class)
    public JAXBElement<String> createResponseTotalRecords(String value) {
        return new JAXBElement<String>(_ResponseTotalRecords_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Records", scope = Response.class)
    public JAXBElement<ArrayOfResponseRecord> createResponseRecords(ArrayOfResponseRecord value) {
        return new JAXBElement<ArrayOfResponseRecord>(_ResponseRecords_QNAME, ArrayOfResponseRecord.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "RecordID", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordRecordID(String value) {
        return new JAXBElement<String>(_ResponseRecordRecordID_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Organization", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordOrganization(String value) {
        return new JAXBElement<String>(_ResponseRecordOrganization_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine1", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine1(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine1_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine2", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine2(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine2_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine3", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine3(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine3_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine4", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine4(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine4_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine5", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine5(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine5_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine6", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine6(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine6_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine7", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine7(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine7_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AddressLine8", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAddressLine8(String value) {
        return new JAXBElement<String>(_ResponseRecordAddressLine8_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DoubleDependentLocality", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordDoubleDependentLocality(String value) {
        return new JAXBElement<String>(_ResponseRecordDoubleDependentLocality_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "DependentLocality", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordDependentLocality(String value) {
        return new JAXBElement<String>(_ResponseRecordDependentLocality_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Locality", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordLocality(String value) {
        return new JAXBElement<String>(_ResponseRecordLocality_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubAdministrativeArea", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordSubAdministrativeArea(String value) {
        return new JAXBElement<String>(_ResponseRecordSubAdministrativeArea_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "AdministrativeArea", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordAdministrativeArea(String value) {
        return new JAXBElement<String>(_ResponseRecordAdministrativeArea_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "PostalCode", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordPostalCode(String value) {
        return new JAXBElement<String>(_ResponseRecordPostalCode_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "SubNationalArea", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordSubNationalArea(String value) {
        return new JAXBElement<String>(_ResponseRecordSubNationalArea_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Country", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordCountry(String value) {
        return new JAXBElement<String>(_RequestRecordCountry_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "RecordOptions", scope = RequestRecord.class)
    public JAXBElement<String> createRequestRecordRecordOptions(String value) {
        return new JAXBElement<String>(_RequestRecordRecordOptions_QNAME, String.class, RequestRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "TransmissionReference", scope = Request.class)
    public JAXBElement<String> createRequestTransmissionReference(String value) {
        return new JAXBElement<String>(_ResponseTransmissionReference_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "CustomerID", scope = Request.class)
    public JAXBElement<String> createRequestCustomerID(String value) {
        return new JAXBElement<String>(_RequestCustomerID_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Options", scope = Request.class)
    public JAXBElement<String> createRequestOptions(String value) {
        return new JAXBElement<String>(_RequestOptions_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mdGlobalAddress", name = "Records", scope = Request.class)
    public JAXBElement<ArrayOfRequestRecord> createRequestRecords(ArrayOfRequestRecord value) {
        return new JAXBElement<ArrayOfRequestRecord>(_ResponseRecords_QNAME, ArrayOfRequestRecord.class, Request.class, value);
    }

}
