package models.customer;

public class CustomerCreationRequest {

    private String marketplace;

    private boolean isTieredCustomer;

    public static final class CustomerCreationRequestBuilder {

        private String marketplace;
        private boolean isTieredCustomer;

        private CustomerCreationRequestBuilder() {

        }

        public static CustomerCreationRequestBuilder aCustomerCreationRequest() {

            return new CustomerCreationRequestBuilder();
        }

        public CustomerCreationRequestBuilder withMarketplace(String marketplace) {

            this.marketplace = marketplace;
            return this;
        }

        public CustomerCreationRequestBuilder withIsTieredCustomer(boolean isTieredCustomer) {

            this.isTieredCustomer = isTieredCustomer;
            return this;
        }

        public CustomerCreationRequest build() {

            CustomerCreationRequest customerCreationRequest = new CustomerCreationRequest();
            customerCreationRequest.marketplace = this.marketplace;
            customerCreationRequest.isTieredCustomer = this.isTieredCustomer;
            return customerCreationRequest;
        }
    }

    public String getMarketplace() {

        return marketplace;
    }

    public void setMarketplace(final String marketplace) {

        this.marketplace = marketplace;
    }

    public boolean isTieredCustomer() {

        return isTieredCustomer;
    }

    public void setTieredCustomer(final boolean tieredCustomer) {

        isTieredCustomer = tieredCustomer;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("CustomerCreationRequest{");
        sb.append("marketplace='").append(marketplace).append('\'');
        sb.append(", isTieredCustomer=").append(isTieredCustomer);
        sb.append('}');
        return sb.toString();
    }
}
