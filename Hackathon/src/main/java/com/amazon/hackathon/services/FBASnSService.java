package com.amazon.hackathon.services;

import java.util.Objects;

import com.amazon.hackathon.models.offer.Offer;
import com.amazon.hackathon.models.offer.SnSMetaInfo;

public class FBASnSService {

    public static void convertingOfferToFBA(Offer offer) {

    }

    public static void enableForSnS(Offer offer, boolean enableForSnS) {

        if (enableForSnS && Objects.nonNull(offer)) {
            offer.setSnSMetaInfo(new SnSMetaInfo(true, true));
        }
    }

}
