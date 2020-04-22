package services;

import models.customer.CustomerCreationResponse;
import models.customer.KaminoCustomer;

public class FraudService {

    public static void whitelistCustomer(boolean paymentWhitelistedRequired,
        CustomerCreationResponse customerCreationResponse){

        if (paymentWhitelistedRequired){
            customerCreationResponse.setPaymentWhitelisted(true);
        }
    }

}
