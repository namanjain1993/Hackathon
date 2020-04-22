package com.amazon.hackathon.models.offer;

public class OfferCreationResponse {

    private Offer offer;

    private String message;

    private boolean status;

    public OfferCreationResponse(final Offer offer, final String message, final boolean status) {

        this.offer = offer;
        this.message = message;
        this.status = status;
    }

    public Offer getOffer() {

        return offer;
    }

    public void setOffer(final Offer offer) {

        this.offer = offer;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(final String message) {

        this.message = message;
    }

    public boolean isStatus() {

        return status;
    }

    public void setStatus(final boolean status) {

        this.status = status;
    }

    @Override
    public String toString() {

        return "OfferCreationResponse{" +
            "offer=" + offer +
            ", message='" + message + '\'' +
            ", status=" + status +
            '}';
    }
}
