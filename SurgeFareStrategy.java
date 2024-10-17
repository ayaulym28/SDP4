public class SurgeFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        return (2.00 * ((1.00 * distance) + (0.25 * duration)));  // Удвоенные тарифы
    }
}
