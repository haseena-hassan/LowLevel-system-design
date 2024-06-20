/*
 * Single Responsibility Principle
 *  - Class has only one reason to change
 *  - Easy to maintain
 *  - Easy to Understand
 */

 class Item {
    String name;
    String color;
    int price;

    public Item(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
 }

class Invoice {
    private Item item;
    private int quantity;

    public Invoice(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int totalPrice = item.price * this.quantity;
        return totalPrice;
    }
}

class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        // print logic
    }
}

class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save() {
        // Save to file or DB
    }
}

