public abstract class PublicTransport extends Vehicle {
    protected int passengerCapacity;

    public PublicTransport(String brand, int year, int passengerCapacity) {
        super(brand, year);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passenger capacity: " + passengerCapacity);
    }
}