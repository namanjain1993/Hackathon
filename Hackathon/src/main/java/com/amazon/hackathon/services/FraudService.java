package com.amazon.hackathon.services;

import com.amazon.hackathon.models.customer.CustomerCreationResponse;

public class FraudService {

    public static void whitelistCustomer(boolean paymentWhitelistedRequired,
        CustomerCreationResponse customerCreationResponse){

        if (paymentWhitelistedRequired){
            customerCreationResponse.setPaymentWhitelisted(true);
        }
    }

}
