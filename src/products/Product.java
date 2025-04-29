package products;

public abstract class Product {
    private String title;
    private Double price;
    private final String id;

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
        if(price < 0)
            throw new IllegalArgumentException("Price cannot be negative");

        this.price = price;
    }

    public String getId() {
        return id;
    }


    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        this.id = generateId();
    }

    @Override
    public String toString() {
        return "Title=" + title + " ,Price=" + price + " ,ID=" + id;
    }

    protected abstract String generateId();
}
