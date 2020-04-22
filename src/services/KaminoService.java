package services;

import models.customer.KaminoCustomer;

public class KaminoService {

    public static KaminoCustomer createKaminoCustomer(String marketplace){

        return KaminoCustomer.KaminoCustomerBuilder.aKaminoCustomer().withEmailId()
    }

}
