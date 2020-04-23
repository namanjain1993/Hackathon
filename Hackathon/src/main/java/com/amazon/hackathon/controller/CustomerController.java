package com.amazon.hackathon.controller;

import static com.amazon.hackathon.models.customer.CustomerCreationResponse.CustomerCreationResponseBuilder.aCustomerCreationResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.hackathon.models.customer.CustomerCreationRequest;
import com.amazon.hackathon.models.customer.CustomerCreationResponse;
import com.amazon.hackathon.models.customer.KaminoCustomer;
import com.amazon.hackathon.services.FraudService;
import com.amazon.hackathon.services.KaminoService;
import com.amazon.hackathon.services.RCXSubscriptionService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping(value = "/createCustomer")
    public static CustomerCreationResponse createCustomer(
        @RequestBody CustomerCreationRequest customerCreationRequest) throws InterruptedException {

        /*
        Kamino
        Fraud Check
        Add Subscription
         */

        KaminoCustomer kaminoCustomer = KaminoService
            .createKaminoCustomer(customerCreationRequest.getMarketplace());

        ProgressController.setCurrentTask("Creating Customer Using Kamano");
        ProgressController.setPercentage(33);

        Thread.sleep(4000);

        CustomerCreationResponse customerCreationResponse = aCustomerCreationResponse()
            .withEncryptedCustomerID(kaminoCustomer.getEncryptedCustomerID()).withEmailId(kaminoCustomer.getEmailId())
            .withName(kaminoCustomer.getName()).withPassword(kaminoCustomer.getPassword())
            .withPaymentId(kaminoCustomer.getPaymentId()).build();

        FraudService.whitelistCustomer(customerCreationRequest.isPaymentWhitelisted(), customerCreationResponse);

        ProgressController.setCurrentTask("Whitelisting customer for Fraud Checks");
        ProgressController.setPercentage(66);

        Thread.sleep(4000);

        RCXSubscriptionService
            .addSubscriptionToCustomer(customerCreationResponse, customerCreationRequest.isTieredCustomer());

        ProgressController.setCurrentTask("Adding Subscriptions if required");
        ProgressController.setPercentage(100);

        Thread.sleep(4000);

        customerCreationResponse.setSuccessful(true);

        customerCreationResponse.setMessage("Successfully created a customer");

        ProgressController.setCurrentTask("NA");
        ProgressController.setPercentage(0);

        return customerCreationResponse;
    }

}
