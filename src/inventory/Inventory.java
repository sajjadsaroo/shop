package inventory;

import products.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemsById(int id) {
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (Integer.parseInt(it.next().getId()) == id) {
                it.remove();
                return;
            }
        }
    }

    public T findItemsById(int id) {
        for (T p : items)
            if (Integer.parseInt(p.getId()) == id)
                return p;
        return null;
    }

    public void applyDiscount(String productName, int discountPercent) {
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
