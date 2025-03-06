import java.time.LocalDate;

class FoodExpiry {
    static boolean isExpired(LocalDate date) {
        LocalDate now = LocalDate.now();

        return now.isAfter(date);
    }
}
