package controller;

import models.offer.Offer;
import models.offer.OfferCreationRequest;
import models.offer.OfferCreationResponse;
import services.AsinCopierService;
import services.FBASnSService;
import services.InventoryService;
import services.OfferCreationService;

public class OfferController {

    public static OfferCreationResponse createOffer(OfferCreationRequest offerCreationRequest) {

        /*
        Call Asin Service
        Call Offer Service
        Call FBA Service
        Call Inventory Service
         */

        String asin = AsinCopierService.fetchAValidFBAAsin();

        Offer offer = OfferCreationService.createAnOffer(offerCreationRequest.getMarketplace(), offerCreationRequest.getMerchantId(), asin);

        FBASnSService.convertingOfferToFBA(offer);

        FBASnSService.enableForSnS(offer, offerCreationRequest.isEnableForSnS());

        InventoryService.addingInventoryToOffer(offer, offerCreationRequest.getInventoryCount());

        return new OfferCreationResponse(offer, "Successfully created offer", true);
    }

}
