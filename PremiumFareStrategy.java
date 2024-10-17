public class PremiumFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        return (2.00 * distance) + (0.50 * duration);
    }
}
