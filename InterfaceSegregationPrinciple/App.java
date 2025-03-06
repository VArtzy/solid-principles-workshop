class App {
    public static void main(String[] args) {
        Gopay gopay = new Gopay();
        gopay.paymentName("Joni");
        gopay.amount(200000);
        gopay.accountID(1);
        gopay.walletProviderID(1);

        Mandiri mandiri = new Mandiri();
        mandiri.paymentName("Joko");
        mandiri.amount(100000);
        mandiri.bankID(2);
        mandiri.virtualAccount(12345);
    }
}
