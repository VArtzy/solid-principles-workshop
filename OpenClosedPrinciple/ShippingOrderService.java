class ShippingOrderService {
    void checkout(Product product, Shipping shipping) {
        int costShipping = shipping.calculate(product);
        System.out.println(costShipping);
    }
}
