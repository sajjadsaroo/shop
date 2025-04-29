package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product [title=" + title + ", price=" + price + ", id=" + id + "]";
    }

    protected abstract String generateId();
}
