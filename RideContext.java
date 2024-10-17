public class RideContext {
    private FareStrategy fareStrategy;

    // Метод для выбора стратегии в зависимости от условий
    public void selectStrategy(String timeOfDay, boolean isPeakHour) {
        if (isPeakHour) {
            this.fareStrategy = new SurgeFareStrategy();
        } else if (timeOfDay.equals("night")) {
            this.fareStrategy = new PremiumFareStrategy();
        } else {
            this.fareStrategy = new RegularFareStrategy();
        }
    }

    // Метод для установки стратегии вручную
    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    // Метод для расчета стоимости поездки
    public double calculateFare(double distance, double duration) {
        // Проверка на отрицательные значения
        if (distance < 0 || duration < 0) {
            throw new IllegalArgumentException("Distance and duration must be non-negative.");
        }

        // Расчет стоимости по выбранной стратегии
        return fareStrategy.calculateFare(distance, duration);
    }
}
