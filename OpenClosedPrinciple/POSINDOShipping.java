class POSINDOShipping implements Shipping {
    @Override
    public int calculate(Product product) {
        return product.getPrice() + 15000;
    }
}
