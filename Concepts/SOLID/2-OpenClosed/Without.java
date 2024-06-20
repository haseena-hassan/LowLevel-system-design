/*
 * Open Closed Principle
 *  - Open to Extension and closed for modification
 *  - 
 */


// InvoiceDAO is a fully tested and LIVE functionality for saving Invoice to DB

class InvoiceDAO__ {
    int invoice;

    public InvoiceDAO__(int invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save to DB
    }
}

// We have a new requirement to save Invoice to DB but the below violates OpenClose Principle

class InvoiceDAO_ {
    int invoice;

    public InvoiceDAO_(int invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save to DB
    }

    public void saveToFile() {
        // Save to File
    }
}
