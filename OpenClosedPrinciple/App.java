class App {
    public static void main(String[] args) {
        Product makanan = new Product("Makanan", 20000);

        Shipping shipping = new SiCepatShipping();

        ShippingOrderService shippingService = new ShippingOrderService();
        shippingService.checkout(makanan, shipping);
    }
}
