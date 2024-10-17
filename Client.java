public class Client {
    public static void main(String[] args) {
        RideContext rideContext = new RideContext();

        // Тестируем поездку в обычное время
        rideContext.selectStrategy("day", false);
        System.out.println("Regular fare: " + rideContext.calculateFare(10, 15));

        // Тестируем поездку в часы пик
        rideContext.selectStrategy("day", true);
        System.out.println("Surge fare: " + rideContext.calculateFare(10, 15));

        // Тестируем премиум поездку ночью
        rideContext.selectStrategy("night", false);
        System.out.println("Premium fare: " + rideContext.calculateFare(10, 15));

        // Тестируем скидочную стратегию вручную
        rideContext.setFareStrategy(new DiscountFareStrategy());
        System.out.println("Discount fare: " + rideContext.calculateFare(10, 15));
    }
}
