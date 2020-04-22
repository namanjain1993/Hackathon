package com.amazon.hackathon.models.customer;

public class KaminoCustomer {

    private String name;

    private String encryptedCustomerID;

    private String emailId;

    private String password;

    private String paymentId;

    public static final class KaminoCustomerBuilder {

        private String name;
        private String encryptedCustomerID;
        private String emailId;
        private String password;
        private String paymentId;

        private KaminoCustomerBuilder() {

        }

        public static KaminoCustomerBuilder aKaminoCustomer() {

            return new KaminoCustomerBuilder();
        }

        public KaminoCustomerBuilder withName(String name) {

            this.name = name;
            return this;
        }

        public KaminoCustomerBuilder withEncryptedCustomerID(String encryptedCustomerID) {

            this.encryptedCustomerID = encryptedCustomerID;
            return this;
        }

        public KaminoCustomerBuilder withEmailId(String emailId) {

            this.emailId = emailId;
            return this;
        }

        public KaminoCustomerBuilder withPassword(String password) {

            this.password = password;
            return this;
        }

        public KaminoCustomerBuilder withPaymentId(String paymentId) {

            this.paymentId = paymentId;
            return this;
        }

        public KaminoCustomer build() {

            KaminoCustomer kaminoCustomer = new KaminoCustomer();
            kaminoCustomer.encryptedCustomerID = this.encryptedCustomerID;
            kaminoCustomer.name = this.name;
            kaminoCustomer.emailId = this.emailId;
            kaminoCustomer.password = this.password;
            kaminoCustomer.paymentId = this.paymentId;
            return kaminoCustomer;
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

    public String getPaymentId() {

        return paymentId;
    }

    public void setPaymentId(final String paymentId) {

        this.paymentId = paymentId;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("KaminoCustomer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", encryptedCustomerID='").append(encryptedCustomerID).append('\'');
        sb.append(", emailId='").append(emailId).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", paymentId='").append(paymentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
