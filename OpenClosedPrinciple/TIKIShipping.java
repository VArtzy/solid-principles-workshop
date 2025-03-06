class TIKIShipping implements Shipping {
    @Override
    public int calculate(Product product) {
        return product.getPrice() + 12000;
    }
}
