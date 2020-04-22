package controller;

import static models.customer.CustomerCreationResponse.CustomerCreationResponseBuilder.*;

import models.customer.CustomerCreationRequest;
import models.customer.CustomerCreationResponse;
import models.customer.KaminoCustomer;
import services.FraudService;
import services.KaminoService;
import services.RCXSubscriptionService;

public class CustomerController {

    public static CustomerCreationResponse createCustomer(CustomerCreationRequest customerCreationRequest) {

        /*
        Kamino
        Fraud Check
        Add Subscription
         */

        KaminoCustomer kaminoCustomer = KaminoService
            .createKaminoCustomer(customerCreationRequest.getMarketplace());

        CustomerCreationResponse customerCreationResponse = aCustomerCreationResponse()
            .withEncryptedCustomerID(kaminoCustomer.getEncryptedCustomerID()).withEmailId(kaminoCustomer.getEmailId())
            .withName(kaminoCustomer.getName()).withPassword(kaminoCustomer.getPassword())
            .withPaymentId(kaminoCustomer.getPaymentId()).build();

        FraudService.whitelistCustomer(customerCreationRequest.isPaymentWhitelisted(), customerCreationResponse);

        RCXSubscriptionService.addSubscriptionToCustomer(customerCreationResponse, customerCreationRequest.isTieredCustomer());

        customerCreationResponse.setSuccessful(true);

        customerCreationResponse.setMessage("Successfully created a customer");

        return customerCreationResponse;
    }

}
