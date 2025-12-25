public class ElectricCar extends Car {
    private double bCapacity;

    public ElectricCar(String brand, int year, int doors, double bCapacity) {
        super(brand, year, doors, "Electric");
        this.bCapacity = bCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("The electric motor started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The electric motor stopped");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + bCapacity);
    }
}