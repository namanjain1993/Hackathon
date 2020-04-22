package com.amazon.hackathon.models.customer;

public class CustomerCreationRequest {

    private String marketplace;

    private boolean tieredCustomer;

    private boolean paymentWhitelisted;

    public static final class CustomerCreationRequestBuilder {

        private String marketplace;
        private boolean tieredCustomer;
        private boolean paymentWhitelisted;

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

            this.tieredCustomer = isTieredCustomer;
            return this;
        }

        public CustomerCreationRequestBuilder withPaymentWhitelisted(boolean paymentWhitelisted) {

            this.paymentWhitelisted = paymentWhitelisted;
            return this;
        }

        public CustomerCreationRequest build() {

            CustomerCreationRequest customerCreationRequest = new CustomerCreationRequest();
            customerCreationRequest.marketplace = this.marketplace;
            customerCreationRequest.tieredCustomer = this.tieredCustomer;
            customerCreationRequest.paymentWhitelisted = this.paymentWhitelisted;
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

        return tieredCustomer;
    }

    public void setTieredCustomer(final boolean tieredCustomer) {

        this.tieredCustomer = tieredCustomer;
    }

    public boolean isPaymentWhitelisted() {

        return paymentWhitelisted;
    }

    public void setPaymentWhitelisted(final boolean paymentWhitelisted) {

        this.paymentWhitelisted = paymentWhitelisted;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("CustomerCreationRequest{");
        sb.append("marketplace='").append(marketplace).append('\'');
        sb.append(", tieredCustomer=").append(tieredCustomer);
        sb.append(", paymentWhitelisted=").append(paymentWhitelisted);
        sb.append('}');
        return sb.toString();
    }
}
