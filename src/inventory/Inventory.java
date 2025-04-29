package inventory;

import products.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemsById(String id) {
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(id)) {
                it.remove();
                return;
            }
        }
    }

    public T findItemsById(String id) {
        for (T p : items)
            if (p.getId().equals(id))
                return p;
        return null;
    }

    public void applyDiscount(String productName, int discountPercent) {
        if (discountPercent <= 0 || discountPercent > 100)
            throw new IllegalArgumentException("Discount percent must be greater than 0 and less than 100");


        for (T p : items)
            if (p.getTitle().equalsIgnoreCase(productName)) {
                double newPrice = p.getPrice() * (100 - discountPercent) / 100.0;
                p.setPrice(newPrice);
            }
    }

    public void displayAll() {
        items.forEach(System.out::println);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
