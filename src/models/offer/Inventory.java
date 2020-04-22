package models.offer;

public class Inventory {

    private Integer count;

    public Inventory(final Integer count) {

        this.count = count;
    }

    public Integer getCount() {

        return count;
    }

    public void setCount(final Integer count) {

        this.count = count;
    }

    @Override
    public String toString() {

        return "Inventory{" +
            "count=" + count +
            '}';
    }
}
