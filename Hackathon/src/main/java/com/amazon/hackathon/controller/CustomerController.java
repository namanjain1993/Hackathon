package com.amazon.hackathon.controller;

import static com.amazon.hackathon.models.customer.CustomerCreationResponse.CustomerCreationResponseBuilder.aCustomerCreationResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value = "/createCustomer")
    public static CustomerCreationResponse createCustomer(
        @RequestBody CustomerCreationRequest customerCreationRequest) {

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

        RCXSubscriptionService
            .addSubscriptionToCustomer(customerCreationResponse, customerCreationRequest.isTieredCustomer());

        customerCreationResponse.setSuccessful(true);

        customerCreationResponse.setMessage("Successfully created a customer");

        return customerCreationResponse;
    }

}
