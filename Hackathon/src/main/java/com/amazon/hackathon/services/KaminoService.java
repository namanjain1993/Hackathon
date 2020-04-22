package com.amazon.hackathon.services;

import static utils.Constants.Customer.*;

import com.amazon.hackathon.models.customer.KaminoCustomer;

public class KaminoService {

    public static KaminoCustomer createKaminoCustomer(String marketplace) {
        return KaminoCustomer.KaminoCustomerBuilder.aKaminoCustomer().withEmailId(EMAIL_1)
            .withEncryptedCustomerID(ECID_1).withName(NAME_1).withPassword(PASSWORD_1).withPaymentId(PID_1).build();
    }

}
