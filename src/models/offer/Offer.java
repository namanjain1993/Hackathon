package models.offer;

public class Offer {

    private String merchantId;

    private String sku;

    private String asin;

    private Inventory inventory;

    private SnSMetaInfo snSMetaInfo;

    public Offer(final String merchantId, final String sku, final String asin) {
        this.merchantId = merchantId;
        this.sku = sku;
        this.asin = asin;
    }

    public Inventory getInventory() {

        return inventory;
    }

    public void setInventory(final Inventory inventory) {

        this.inventory = inventory;
    }

    public SnSMetaInfo getSnSMetaInfo() {

        return snSMetaInfo;
    }

    public void setSnSMetaInfo(final SnSMetaInfo snSMetaInfo) {

        this.snSMetaInfo = snSMetaInfo;
    }

    public String getMerchantId() {

        return merchantId;
    }

    public void setMerchantId(final String merchantId) {

        this.merchantId = merchantId;
    }

    public String getSku() {

        return sku;
    }

    public void setSku(final String sku) {

        this.sku = sku;
    }

    public String getAsin() {

        return asin;
    }

    public void setAsin(final String asin) {

        this.asin = asin;
    }

    @Override
    public String toString() {

        return "Offer{" +
            "merchantId='" + merchantId + '\'' +
            ", sku='" + sku + '\'' +
            ", asin='" + asin + '\'' +
            ", inventory=" + inventory +
            ", snSMetaInfo=" + snSMetaInfo +
            '}';
    }
}
