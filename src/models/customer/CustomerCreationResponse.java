package models.customer;

public class CustomerCreationResponse {

    private String name;

    private String encryptedCustomerID;

    private String emailId;

    private String password;

    private boolean tieredCustomer;

    private String paymentId;

    private boolean paymentWhitelisted;

    private int subscriptionCount;

    private boolean successful;

    private String message;

    public static final class CustomerCreationResponseBuilder {

        private String name;
        private String encryptedCustomerID;
        private String emailId;
        private String password;
        private boolean tieredCustomer;
        private int subscriptionCount;
        private boolean successful;
        private String message;
        private String paymentId;
        private boolean paymentWhitelisted;

        private CustomerCreationResponseBuilder() {

        }

        public static CustomerCreationResponseBuilder aCustomerCreationResponse() {

            return new CustomerCreationResponseBuilder();
        }

        public CustomerCreationResponseBuilder withName(String name) {

            this.name = name;
            return this;
        }

        public CustomerCreationResponseBuilder withEncryptedCustomerID(String encryptedCustomerID) {

            this.encryptedCustomerID = encryptedCustomerID;
            return this;
        }

        public CustomerCreationResponseBuilder withEmailId(String emailId) {

            this.emailId = emailId;
            return this;
        }

        public CustomerCreationResponseBuilder withPassword(String password) {

            this.password = password;
            return this;
        }

        public CustomerCreationResponseBuilder withTieredCustomer(boolean tieredCustomer) {

            this.tieredCustomer = tieredCustomer;
            return this;
        }

        public CustomerCreationResponseBuilder withSubscriptionCount(int subscriptionCount) {

            this.subscriptionCount = subscriptionCount;
            return this;
        }

        public CustomerCreationResponseBuilder withSuccessful(boolean successful) {

            this.successful = successful;
            return this;
        }

        public CustomerCreationResponseBuilder withMessage(String message) {

            this.message = message;
            return this;
        }

        public CustomerCreationResponseBuilder withPaymentWhitelisted(boolean paymentWhitelisted) {

            this.paymentWhitelisted = paymentWhitelisted;
            return this;
        }

        public CustomerCreationResponseBuilder withPaymentId(String paymentId) {

            this.paymentId = paymentId;
            return this;
        }

        public CustomerCreationResponse build() {

            CustomerCreationResponse customerCreationResponse = new CustomerCreationResponse();
            customerCreationResponse.subscriptionCount = this.subscriptionCount;
            customerCreationResponse.password = this.password;
            customerCreationResponse.name = this.name;
            customerCreationResponse.encryptedCustomerID = this.encryptedCustomerID;
            customerCreationResponse.message = this.message;
            customerCreationResponse.tieredCustomer = this.tieredCustomer;
            customerCreationResponse.emailId = this.emailId;
            customerCreationResponse.successful = this.successful;
            customerCreationResponse.paymentWhitelisted = this.paymentWhitelisted;
            customerCreationResponse.paymentId = this.paymentId;
            return customerCreationResponse;
        }
    }

    public String getName() {

        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }

    public String getEncryptedCustomerID() {

        return encryptedCustomerID;
    }

    public void setEncryptedCustomerID(final String encryptedCustomerID) {

        this.encryptedCustomerID = encryptedCustomerID;
    }

    public String getEmailId() {

        return emailId;
    }

    public void setEmailId(final String emailId) {

        this.emailId = emailId;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(final String password) {

        this.password = password;
    }

    public boolean isTieredCustomer() {

        return tieredCustomer;
    }

    public void setTieredCustomer(final boolean tieredCustomer) {

        this.tieredCustomer = tieredCustomer;
    }

    public int getSubscriptionCount() {

        return subscriptionCount;
    }

    public void setSubscriptionCount(final int subscriptionCount) {

        this.subscriptionCount = subscriptionCount;
    }

    public boolean isSuccessful() {

        return successful;
    }

    public void setSuccessful(final boolean successful) {

        this.successful = successful;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(final String message) {

        this.message = message;
    }

    public String getPaymentId() {

        return paymentId;
    }

    public void setPaymentId(final String paymentId) {

        this.paymentId = paymentId;
    }

    public boolean isPaymentWhitelisted() {

        return paymentWhitelisted;
    }

    public void setPaymentWhitelisted(final boolean paymentWhitelisted) {

        this.paymentWhitelisted = paymentWhitelisted;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("CustomerCreationResponse{");
        sb.append("name='").append(name).append('\'');
        sb.append(", encryptedCustomerID='").append(encryptedCustomerID).append('\'');
        sb.append(", emailId='").append(emailId).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", tieredCustomer=").append(tieredCustomer);
        sb.append(", paymentId='").append(paymentId).append('\'');
        sb.append(", paymentWhitelisted=").append(paymentWhitelisted);
        sb.append(", subscriptionCount=").append(subscriptionCount);
        sb.append(", successful=").append(successful);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
