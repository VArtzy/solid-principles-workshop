class SiCepatShipping implements Shipping {
    @Override
    public int calculate(Product product) {
        return product.getPrice() + 8000;
    }
}
