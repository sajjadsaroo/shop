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

    protected void setId(String id) {
        this.id = id;
    }

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        setId(generateId());
    }

    @Override
    public String toString() {
        return "Title=" + title + " ,Price=" + price + " ,ID=" + id;
    }

    protected abstract String generateId();
}
