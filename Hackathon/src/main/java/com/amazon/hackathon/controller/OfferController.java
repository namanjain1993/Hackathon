package com.amazon.hackathon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @ResponseStatus(HttpStatus.OK)
    public static OfferCreationResponse createOffer(@RequestBody OfferCreationRequest offerCreationRequest)
        throws InterruptedException {

        /*
        Call Asin Service
        Call Offer Service
        Call FBA Service
        Call Inventory Service
         */

        String asin = AsinCopierService.fetchAValidFBAAsin();

        ProgressController.setCurrentTask("Fetching a Valid Asin");
        ProgressController.setPercentage(20);
        Thread.sleep(3000);

        Offer offer = OfferCreationService
            .createAnOffer(offerCreationRequest.getMarketplace(), offerCreationRequest.getMerchantId(), asin);

        ProgressController.setCurrentTask("Creating an Offer");
        ProgressController.setPercentage(40);
        Thread.sleep(3000);

        FBASnSService.convertingOfferToFBA(offer);

        ProgressController.setCurrentTask("Converting to an FBA Offer");
        ProgressController.setPercentage(60);
        Thread.sleep(3000);

        FBASnSService.enableForSnS(offer, offerCreationRequest.isEnableForSnS());

        ProgressController.setCurrentTask("Enabling FBA Offer For SnS");
        ProgressController.setPercentage(80);
        Thread.sleep(3000);

        InventoryService.addingInventoryToOffer(offer, offerCreationRequest.getInventoryCount());

        ProgressController.setCurrentTask("Adding inventory to Offer");
        ProgressController.setPercentage(100);
        Thread.sleep(3000);

        return new OfferCreationResponse(offer, "Successfully created offer", true);
    }

}
