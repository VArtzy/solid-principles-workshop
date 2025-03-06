class BNI implements Bank, Payment {
    @Override
    public void paymentName(String name) {
        System.out.println(name + " lewat BNI menstransfer ");
    }

    @Override
    public void amount(int amount) {
        System.out.println(amount + " ke rekening ");
    }

    @Override
    public void bankID(int id) {
        System.out.println(id + " dengan nomor virtual account ");
    }

    @Override
    public void virtualAccount(int acc) {
        System.out.println(acc);
    }
}
