package com.amazon.hackathon.services;

import com.amazon.hackathon.models.customer.CustomerCreationResponse;

public class RCXSubscriptionService {

    public static void addSubscriptionToCustomer(CustomerCreationResponse customerCreationResponse,
        boolean isTiredCustomer) {

        if (isTiredCustomer) {
            customerCreationResponse.setTieredCustomer(true);
            customerCreationResponse.setSubscriptionCount(5);
        }

    }

}
