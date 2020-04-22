import controller.CustomerController;
import controller.OfferController;
import models.customer.CustomerCreationRequest;
import models.offer.OfferCreationRequest;

public class Main {

    public static void main(String[] args) {

        OfferCreationRequest offerCreationRequest = new OfferCreationRequest("UK", "Mid", true, 10);

        System.out.println(OfferController.createOffer(offerCreationRequest));

        CustomerCreationRequest customerCreationRequest = CustomerCreationRequest.CustomerCreationRequestBuilder.aCustomerCreationRequest()
            .withIsTieredCustomer(true).withMarketplace("3").withPaymentWhitelisted(true).build();

        System.out.println(CustomerController.createCustomer(customerCreationRequest));
    }

}
