package products;

public class Accessory extends Product{
    private String color;
    private static int counter = 1;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Accessory(String color , String title, double price) {
        super(title, price);
        setColor(color);
    }

    @Override
    public String toString() {
        String baseString = super.toString();
        return baseString + " ,Color=" + getColor();
    }

    @Override
    protected String generateId() {
        if (counter > 999)
            throw new IllegalStateException("Accessory ID limit reached");
        return "3" + String.format("%03d", counter++);
    }

}
