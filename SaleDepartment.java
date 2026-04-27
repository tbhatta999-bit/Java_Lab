interface SalesDepartment {
    void processSale(double amt);
}

interface FinanceDepartment {
    void generateInvoice(String name, double amt);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amt) {
        System.out.println("Sale: " + amt);
    }

    public void generateInvoice(String name, double amt) {
        System.out.println("Invoice for " + name + ": " + amt);
    }

    void showSummary() {
        System.out.println("Operations Completed");
    }

    public static void main(String[] args) {
        CommercialExecutive c = new CommercialExecutive();
        c.processSale(5000);
        c.generateInvoice("ClientA", 5000);
        c.showSummary();
    }
}
