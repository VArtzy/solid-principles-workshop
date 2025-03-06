class App {
    public static void main(String[] args) {
        MongoDatabase mongoDatabase = new MongoDatabase();
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        PaymentService paymentServiceMongo = new PaymentService(mongoDatabase);
        PaymentService paymentServiceMySQL = new PaymentService(mySQLDatabase);

        paymentServiceMySQL.addNewPayment();
        paymentServiceMongo.addNewPayment();
    }
}
