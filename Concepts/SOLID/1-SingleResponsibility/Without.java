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

    public void printInvoice() {
        // print as pdf
    }

    public void saveToDB() {
        // save to mysql database
    }
}

/*
 * New Reasons to Edit Invoice class :
 *  -   calculate price with GST
 *  -   print invoice to different formats
 *  -   save to postgres DB
 */