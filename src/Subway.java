public class Subway extends PublicTransport {
    private String lineName;

    public Subway(String brand, int year, int passengerCapacity, String lineName) {
        super(brand, year, passengerCapacity);
        this.lineName = lineName;
    }

    @Override
    public void startEngine() {
        System.out.println("The subway's electric motor started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The subway's electric motor stopped");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subway line: " + lineName);
    }
}