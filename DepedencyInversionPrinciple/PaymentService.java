class PaymentService {
    private Database database;

    PaymentService(Database database) {
        this.database = database;
    }

    boolean paymentIsValid() { return true; }

    void openDatabase() {
        System.out.println("Connected");
    }

    void addNewPayment() {
        database.insert();
    }

    void removePaymentById() {
        database.delete();
    }

    void updatePaymentById() {
        database.update();
    }
}
