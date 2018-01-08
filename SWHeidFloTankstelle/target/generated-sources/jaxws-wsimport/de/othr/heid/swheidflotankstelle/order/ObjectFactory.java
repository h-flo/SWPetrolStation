
package de.othr.heid.swheidflotankstelle.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.othr.heid.swheidflotankstelle.order package. 
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

    private final static QName _CreateOrder_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "createOrder");
    private final static QName _InsertFuelResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "insertFuelResponse");
    private final static QName _UpdateStatusResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "updateStatusResponse");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "createOrderResponse");
    private final static QName _GetStatusDescriptionResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getStatusDescriptionResponse");
    private final static QName _GetFuelByDTOResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getFuelByDTOResponse");
    private final static QName _OCcompany_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "oCcompany");
    private final static QName _GetFuelByDTO_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getFuelByDTO");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getAllOrdersResponse");
    private final static QName _GetAllOrders_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getAllOrders");
    private final static QName _UpdateFuelPrice_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "updateFuelPrice");
    private final static QName _GetFuelByType_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getFuelByType");
    private final static QName _RemoveFuel_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "removeFuel");
    private final static QName _GetFuelByTypeResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getFuelByTypeResponse");
    private final static QName _RemoveFuelResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "removeFuelResponse");
    private final static QName _UpdateStatus_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "updateStatus");
    private final static QName _GetAllFuels_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getAllFuels");
    private final static QName _GetAllFuelsResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getAllFuelsResponse");
    private final static QName _GetStatusDescription_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "getStatusDescription");
    private final static QName _UpdateFuelPriceResponse_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "updateFuelPriceResponse");
    private final static QName _InsertFuel_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "insertFuel");
    private final static QName _OCsingleIdEntity_QNAME = new QName("http://service.swstelzer.stelzer.oth.de/", "oCsingleIdEntity");
    private final static QName _OCcompanyAddress_QNAME = new QName("", "address");
    private final static QName _OCcompanyName_QNAME = new QName("", "name");
    private final static QName _OCcompanyId_QNAME = new QName("", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.othr.heid.swheidflotankstelle.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link InsertFuelResponse }
     * 
     */
    public InsertFuelResponse createInsertFuelResponse() {
        return new InsertFuelResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusResponse }
     * 
     */
    public UpdateStatusResponse createUpdateStatusResponse() {
        return new UpdateStatusResponse();
    }

    /**
     * Create an instance of {@link GetStatusDescriptionResponse }
     * 
     */
    public GetStatusDescriptionResponse createGetStatusDescriptionResponse() {
        return new GetStatusDescriptionResponse();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link GetFuelByDTO }
     * 
     */
    public GetFuelByDTO createGetFuelByDTO() {
        return new GetFuelByDTO();
    }

    /**
     * Create an instance of {@link GetFuelByDTOResponse }
     * 
     */
    public GetFuelByDTOResponse createGetFuelByDTOResponse() {
        return new GetFuelByDTOResponse();
    }

    /**
     * Create an instance of {@link GetFuelByType }
     * 
     */
    public GetFuelByType createGetFuelByType() {
        return new GetFuelByType();
    }

    /**
     * Create an instance of {@link RemoveFuel }
     * 
     */
    public RemoveFuel createRemoveFuel() {
        return new RemoveFuel();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link UpdateFuelPrice }
     * 
     */
    public UpdateFuelPrice createUpdateFuelPrice() {
        return new UpdateFuelPrice();
    }

    /**
     * Create an instance of {@link RemoveFuelResponse }
     * 
     */
    public RemoveFuelResponse createRemoveFuelResponse() {
        return new RemoveFuelResponse();
    }

    /**
     * Create an instance of {@link GetFuelByTypeResponse }
     * 
     */
    public GetFuelByTypeResponse createGetFuelByTypeResponse() {
        return new GetFuelByTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateStatus }
     * 
     */
    public UpdateStatus createUpdateStatus() {
        return new UpdateStatus();
    }

    /**
     * Create an instance of {@link GetStatusDescription }
     * 
     */
    public GetStatusDescription createGetStatusDescription() {
        return new GetStatusDescription();
    }

    /**
     * Create an instance of {@link UpdateFuelPriceResponse }
     * 
     */
    public UpdateFuelPriceResponse createUpdateFuelPriceResponse() {
        return new UpdateFuelPriceResponse();
    }

    /**
     * Create an instance of {@link GetAllFuelsResponse }
     * 
     */
    public GetAllFuelsResponse createGetAllFuelsResponse() {
        return new GetAllFuelsResponse();
    }

    /**
     * Create an instance of {@link GetAllFuels }
     * 
     */
    public GetAllFuels createGetAllFuels() {
        return new GetAllFuels();
    }

    /**
     * Create an instance of {@link InsertFuel }
     * 
     */
    public InsertFuel createInsertFuel() {
        return new InsertFuel();
    }

    /**
     * Create an instance of {@link OrderDTO }
     * 
     */
    public OrderDTO createOrderDTO() {
        return new OrderDTO();
    }

    /**
     * Create an instance of {@link OCfuel }
     * 
     */
    public OCfuel createOCfuel() {
        return new OCfuel();
    }

    /**
     * Create an instance of {@link OCorder }
     * 
     */
    public OCorder createOCorder() {
        return new OCorder();
    }

    /**
     * Create an instance of {@link OCforwardingCompany }
     * 
     */
    public OCforwardingCompany createOCforwardingCompany() {
        return new OCforwardingCompany();
    }

    /**
     * Create an instance of {@link FuelDTO }
     * 
     */
    public FuelDTO createFuelDTO() {
        return new FuelDTO();
    }

    /**
     * Create an instance of {@link OCcustomer }
     * 
     */
    public OCcustomer createOCcustomer() {
        return new OCcustomer();
    }

    /**
     * Create an instance of {@link OCaddress }
     * 
     */
    public OCaddress createOCaddress() {
        return new OCaddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "createOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<CreateOrder>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFuelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "insertFuelResponse")
    public JAXBElement<InsertFuelResponse> createInsertFuelResponse(InsertFuelResponse value) {
        return new JAXBElement<InsertFuelResponse>(_InsertFuelResponse_QNAME, InsertFuelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "updateStatusResponse")
    public JAXBElement<UpdateStatusResponse> createUpdateStatusResponse(UpdateStatusResponse value) {
        return new JAXBElement<UpdateStatusResponse>(_UpdateStatusResponse_QNAME, UpdateStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getStatusDescriptionResponse")
    public JAXBElement<GetStatusDescriptionResponse> createGetStatusDescriptionResponse(GetStatusDescriptionResponse value) {
        return new JAXBElement<GetStatusDescriptionResponse>(_GetStatusDescriptionResponse_QNAME, GetStatusDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFuelByDTOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getFuelByDTOResponse")
    public JAXBElement<GetFuelByDTOResponse> createGetFuelByDTOResponse(GetFuelByDTOResponse value) {
        return new JAXBElement<GetFuelByDTOResponse>(_GetFuelByDTOResponse_QNAME, GetFuelByDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCcompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "oCcompany")
    public JAXBElement<OCcompany> createOCcompany(OCcompany value) {
        return new JAXBElement<OCcompany>(_OCcompany_QNAME, OCcompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFuelByDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getFuelByDTO")
    public JAXBElement<GetFuelByDTO> createGetFuelByDTO(GetFuelByDTO value) {
        return new JAXBElement<GetFuelByDTO>(_GetFuelByDTO_QNAME, GetFuelByDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFuelPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "updateFuelPrice")
    public JAXBElement<UpdateFuelPrice> createUpdateFuelPrice(UpdateFuelPrice value) {
        return new JAXBElement<UpdateFuelPrice>(_UpdateFuelPrice_QNAME, UpdateFuelPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFuelByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getFuelByType")
    public JAXBElement<GetFuelByType> createGetFuelByType(GetFuelByType value) {
        return new JAXBElement<GetFuelByType>(_GetFuelByType_QNAME, GetFuelByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFuel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "removeFuel")
    public JAXBElement<RemoveFuel> createRemoveFuel(RemoveFuel value) {
        return new JAXBElement<RemoveFuel>(_RemoveFuel_QNAME, RemoveFuel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFuelByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getFuelByTypeResponse")
    public JAXBElement<GetFuelByTypeResponse> createGetFuelByTypeResponse(GetFuelByTypeResponse value) {
        return new JAXBElement<GetFuelByTypeResponse>(_GetFuelByTypeResponse_QNAME, GetFuelByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFuelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "removeFuelResponse")
    public JAXBElement<RemoveFuelResponse> createRemoveFuelResponse(RemoveFuelResponse value) {
        return new JAXBElement<RemoveFuelResponse>(_RemoveFuelResponse_QNAME, RemoveFuelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "updateStatus")
    public JAXBElement<UpdateStatus> createUpdateStatus(UpdateStatus value) {
        return new JAXBElement<UpdateStatus>(_UpdateStatus_QNAME, UpdateStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFuels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getAllFuels")
    public JAXBElement<GetAllFuels> createGetAllFuels(GetAllFuels value) {
        return new JAXBElement<GetAllFuels>(_GetAllFuels_QNAME, GetAllFuels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFuelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getAllFuelsResponse")
    public JAXBElement<GetAllFuelsResponse> createGetAllFuelsResponse(GetAllFuelsResponse value) {
        return new JAXBElement<GetAllFuelsResponse>(_GetAllFuelsResponse_QNAME, GetAllFuelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "getStatusDescription")
    public JAXBElement<GetStatusDescription> createGetStatusDescription(GetStatusDescription value) {
        return new JAXBElement<GetStatusDescription>(_GetStatusDescription_QNAME, GetStatusDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFuelPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "updateFuelPriceResponse")
    public JAXBElement<UpdateFuelPriceResponse> createUpdateFuelPriceResponse(UpdateFuelPriceResponse value) {
        return new JAXBElement<UpdateFuelPriceResponse>(_UpdateFuelPriceResponse_QNAME, UpdateFuelPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFuel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "insertFuel")
    public JAXBElement<InsertFuel> createInsertFuel(InsertFuel value) {
        return new JAXBElement<InsertFuel>(_InsertFuel_QNAME, InsertFuel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCsingleIdEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.swstelzer.stelzer.oth.de/", name = "oCsingleIdEntity")
    public JAXBElement<OCsingleIdEntity> createOCsingleIdEntity(OCsingleIdEntity value) {
        return new JAXBElement<OCsingleIdEntity>(_OCsingleIdEntity_QNAME, OCsingleIdEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCaddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = OCcompany.class)
    public JAXBElement<OCaddress> createOCcompanyAddress(OCaddress value) {
        return new JAXBElement<OCaddress>(_OCcompanyAddress_QNAME, OCaddress.class, OCcompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = OCcompany.class)
    public JAXBElement<String> createOCcompanyName(String value) {
        return new JAXBElement<String>(_OCcompanyName_QNAME, String.class, OCcompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = OCcompany.class)
    public JAXBElement<Long> createOCcompanyId(Long value) {
        return new JAXBElement<Long>(_OCcompanyId_QNAME, Long.class, OCcompany.class, value);
    }

}
