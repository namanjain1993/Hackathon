package services;

import java.util.Objects;

import models.offer.Offer;
import models.offer.SnSMetaInfo;

public class FBASnSService {

    public static void convertingOfferToFBA(Offer offer) {

    }

    public static void enableForSnS(Offer offer, boolean enableForSnS) {

        if (enableForSnS && Objects.nonNull(offer)) {
            offer.setSnSMetaInfo(new SnSMetaInfo(true, true));
        }
    }

}
