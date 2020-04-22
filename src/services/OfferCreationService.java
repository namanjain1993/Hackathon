package services;

import models.offer.Offer;

public class OfferCreationService {

    public static Offer createAnOffer(String marketplace, String merchantId, String asin) {

        /*
        See how Asin's can be randomized
         */

        Offer offer = new Offer(merchantId, "1234", asin);

        return offer;
    }

}
