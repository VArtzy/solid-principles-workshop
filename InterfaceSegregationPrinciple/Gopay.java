class Gopay implements EWallet, Payment {
    @Override
    public void paymentName(String name) {
        System.out.println(name + " lewat Gopay menstransferkan ");
    }

    @Override
    public void amount(int amount) {
        System.out.println(amount + " ke akun ");
    }
    
    @Override
    public void accountID(int id) {
        System.out.println(id + " dari wallet provider ");
    }
    
    @Override
    public void walletProviderID(int id) {
        System.out.println(id);
    }
}
