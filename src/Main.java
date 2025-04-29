import inventory.Inventory;
import products.*;

public class Main {

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        return inventory.getItems()
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static void main(String[] args) {

        Inventory<Book>      bookInv = new Inventory<>();
        Inventory<Notebook>  noteInv = new Inventory<>();
        Inventory<Accessory> accInv  = new Inventory<>();


        bookInv.addItems(new Book("Clean Code", 55.0,
                "R. Martin", "Prentice-Hall", "Programming"));
        bookInv.addItems(new Book("Effective Java", 60.0,
                "J. Bloch", "Addison-Wesley", "Programming"));

        noteInv.addItems(new Notebook("Graph Paper", 5.5, 120, false));
        noteInv.addItems(new Notebook("Sketch Pad",  7.0,  80, true));

        accInv.addItems(new Accessory("Blue",  "Pen Blue",  1.2));
        accInv.addItems(new Accessory("Black", "Pen Black", 1.2));


        System.out.println("===  محصولات افزوده‌شده  ===");
        System.out.println("--- BOOKS ---");      bookInv.displayAll();
        System.out.println();
        System.out.println("--- NOTEBOOKS ---");  noteInv.displayAll();
        System.out.println();
        System.out.println("--- ACCESSORIES ---");accInv.displayAll();
        System.out.println();


        String delBookId = bookInv.getItems().get(0).getId();
        String delAccId  = accInv.getItems().get(0).getId();
        bookInv.removeItemsById(delBookId);
        accInv.removeItemsById(delAccId);

        System.out.println("\n===  مجموع قیمت پس از حذف  ===");
        System.out.printf("Books total   : %.2f%n", calculateTotalPrice(bookInv));
        System.out.printf("Notebooks total: %.2f%n", calculateTotalPrice(noteInv));
        System.out.printf("Accessories total: %.2f%n", calculateTotalPrice(accInv));
        System.out.println();


        System.out.println("\n===  جستجو با findItemsById  ===");
        String existingId = noteInv.getItems().get(0).getId();
        Product found = noteInv.findItemsById(existingId);
        System.out.println("Existing id " + existingId + " → " + found);

        Product notFound = noteInv.findItemsById("9999");
        System.out.println("Non-existing id 9999 → " + notFound);


        bookInv.applyDiscount("Effective Java", 20);
        noteInv.applyDiscount("Sketch Pad",     10);


        System.out.println("\n===  وضعیت نهایی محصولات  ===");
        System.out.println("--- BOOKS ---");      bookInv.displayAll();
        System.out.println();
        System.out.println("--- NOTEBOOKS ---");  noteInv.displayAll();
        System.out.println();
        System.out.println("--- ACCESSORIES ---");accInv.displayAll();
        System.out.println();
    }
}
