package com.amazon.hackathon.services;

import java.util.Objects;

import com.amazon.hackathon.models.offer.Inventory;
import com.amazon.hackathon.models.offer.Offer;

public class InventoryService {

    public static boolean addingInventoryToOffer(Offer offer, Integer count) {

        if (Objects.nonNull(count) && count > 0) {
            offer.setInventory(new Inventory(count));
        }

        return true;
    }

}
