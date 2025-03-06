class JNEShipping implements Shipping {
    @Override
    public int calculate(Product product) {
        return product.getPrice() + 10000;
    }
}
