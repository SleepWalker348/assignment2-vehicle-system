public class Bus extends PublicTransport {
    private int routeNumber;

    public Bus(String brand, int year, int passengerCapacity, int routeNumber) {
        super(brand, year, passengerCapacity);
        this.routeNumber = routeNumber;
    }

    @Override
    public void startEngine() {
        System.out.println("The bus engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The bus engine stopped");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bus route number: " + routeNumber);
    }
}