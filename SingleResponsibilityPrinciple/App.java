import java.time.LocalDate;

class App {
    public static void main(String[] args) {
        FoodService foodService1 = new FoodService(1, "Chitato", LocalDate.parse("2025-03-01"));
        FoodService foodService2 = new FoodService(2, "Teh Botol", LocalDate.parse("2025-03-03"));

        System.out.println(FoodExpiry.isExpired(foodService1.getDate()));
        System.out.println(FoodExpiry.isExpired(foodService2.getDate()));
    }
}
