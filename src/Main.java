public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2015, 4, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", 2020, false);
        Track track = new Track("Shacman", 2010, 15, 4);
        ElectricCar electricCar = new ElectricCar("Tesla", 2020, 4, 95);
        Bus bus = new Bus("Yutong", 2019, 80, 47);
        Subway subway = new Subway("Metro", 2009, 1000, "Broadway-7th Ave");

        Driver driver1 = new Driver("Bob", "1A2S3D4F");
        Driver driver2 = new Driver("James", "0L9K8J7H");
        Driver driver3 = new Driver("Alikhan", "0O1Q9I2W");
        Driver driver4 = new Driver("Kira", "1029VBCN");

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        track.setDriver(driver1);
        electricCar.setDriver(driver2);
        bus.setDriver(driver3);
        subway.setDriver(driver4);

        Vehicle[] vehicles = {car, motorcycle, track, electricCar, bus, subway};

        for (Vehicle vehicle: vehicles) {
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.stopEngine();
            System.out.println();
        }
    }
}
