/*
 * Open Closed Principle
 *  - Open to Extension and closed for modification
 *  - 
 */



interface InvoiceDAO {
    public void save(int invoice);
}

class DatabaseInvoiceDAO implements InvoiceDAO {

    @Override
    public void save(int invoice) {
        // Database save logic
    }
}

class FileInvoiceDAO implements InvoiceDAO {

    @Override
    public void save(int invoice) {
        // Database save logic
    }
}

