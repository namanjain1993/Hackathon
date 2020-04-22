package com.amazon.hackathon.models.offer;

public class AsinWithCatalogue {

    private String Asin;

    private String label;

    public AsinWithCatalogue(final String asin, final String label) {
        Asin = asin;
        this.label = label;
    }

    public String getAsin() {

        return Asin;
    }

    public void setAsin(final String asin) {

        Asin = asin;
    }
}
