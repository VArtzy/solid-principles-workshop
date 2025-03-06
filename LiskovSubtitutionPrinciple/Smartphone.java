import java.time.LocalDate;

class Smartphone implements Product {
    @Override
    public String getName() {
        return "Samsung S10+ Limited Edition";
    }

    @Override
    public void getProductInfo() {
        System.out.println(getName());
    }
}
