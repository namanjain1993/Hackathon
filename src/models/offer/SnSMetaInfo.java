package models.offer;

public class SnSMetaInfo {

    private boolean isSnSEligible;

    private boolean isSnSEnabled;

    public SnSMetaInfo(final boolean isSnSEligible, final boolean isSnSEnabled) {
        this.isSnSEligible = isSnSEligible;
        this.isSnSEnabled = isSnSEnabled;
    }

    public boolean isSnSEligible() {

        return isSnSEligible;
    }

    public void setSnSEligible(final boolean snSEligible) {

        isSnSEligible = snSEligible;
    }

    public boolean isSnSEnabled() {

        return isSnSEnabled;
    }

    public void setSnSEnabled(final boolean snSEnabled) {

        isSnSEnabled = snSEnabled;
    }

    @Override
    public String toString() {

        return "SnSMetaInfo{" +
            "isSnSEligible=" + isSnSEligible +
            ", isSnSEnabled=" + isSnSEnabled +
            '}';
    }
}
