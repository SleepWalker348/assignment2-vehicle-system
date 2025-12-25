public class Car extends Vehicle {
    protected int doors;
    protected String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("The car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine stopped");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + doors + ", fuel type: " + fuelType);
    }
}
