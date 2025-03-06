import java.time.LocalDate;

class Vegetable implements FoodProduct {
    @Override
    public String getName() {
        return "Broccoli";
    }

    @Override
    public LocalDate getDate() {
        return LocalDate.now();
    }

    @Override
    public void getProductInfo() {
        System.out.println(getName() + " akan kadaluarsa pada tanggal " + getDate());
    }
}
