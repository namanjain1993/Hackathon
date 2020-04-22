package com.amazon.hackathon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.hackathon.models.offer.Offer;
import com.amazon.hackathon.models.offer.OfferCreationRequest;
import com.amazon.hackathon.models.offer.OfferCreationResponse;
import com.amazon.hackathon.services.AsinCopierService;
import com.amazon.hackathon.services.FBASnSService;
import com.amazon.hackathon.services.InventoryService;
import com.amazon.hackathon.services.OfferCreationService;

@RestController
@RequestMapping("/offer")
public class OfferController {

    @GetMapping(value = "/createOffer")
    public static OfferCreationResponse createOffer(@RequestBody OfferCreationRequest offerCreationRequest) {

        /*
        Call Asin Service
        Call Offer Service
        Call FBA Service
        Call Inventory Service
         */

        String asin = AsinCopierService.fetchAValidFBAAsin();

        Offer offer = OfferCreationService
            .createAnOffer(offerCreationRequest.getMarketplace(), offerCreationRequest.getMerchantId(), asin);

        FBASnSService.convertingOfferToFBA(offer);

        FBASnSService.enableForSnS(offer, offerCreationRequest.isEnableForSnS());

        InventoryService.addingInventoryToOffer(offer, offerCreationRequest.getInventoryCount());

        return new OfferCreationResponse(offer, "Successfully created offer", true);
    }

}
