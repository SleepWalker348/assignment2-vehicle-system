public class Track extends Vehicle {
    private double capacity;
    private int numAxles;

    public Track(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("The track engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("The track engine stopped");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Track capacity: " + capacity + ", number of axles: " + numAxles);
    }
}

