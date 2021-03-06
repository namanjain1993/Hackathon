package com.amazon.hackathon.models.offer;

public class OfferCreationRequest {


    private String merchantId;

    private boolean enableForSnS;

    private Integer inventoryCount;

    private String marketplace;

    public OfferCreationRequest(final String marketplace, final String merchantId, final boolean enableForSnS, final Integer inventoryCount) {
        this.marketplace = marketplace;
        this.merchantId = merchantId;
        this.enableForSnS = enableForSnS;
        this.inventoryCount = inventoryCount;
    }

    public String getMerchantId() {

        return merchantId;
    }

    public void setMerchantId(final String merchantId) {

        this.merchantId = merchantId;
    }

    public boolean isEnableForSnS() {

        return enableForSnS;
    }

    public void setEnableForSnS(final boolean enableForSnS) {

        this.enableForSnS = enableForSnS;
    }

    public Integer getInventoryCount() {

        return inventoryCount;
    }

    public void setInventoryCount(final Integer inventoryCount) {

        this.inventoryCount = inventoryCount;
    }

    public String getMarketplace() {

        return marketplace;
    }

    public void setMarketplace(final String marketplace) {

        this.marketplace = marketplace;
    }
}
