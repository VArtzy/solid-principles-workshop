import java.time.LocalDate;

class FoodService {
    private int id;
    private String name;
    private LocalDate date;

    FoodService(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    void addToStore() {
        if (!FoodExpiry.isExpired(date)) {
            // Add to store
        }
    }

    public LocalDate getDate() {
        return date;
    }
}
