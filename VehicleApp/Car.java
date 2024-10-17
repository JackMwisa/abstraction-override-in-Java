package VehicleApp;

public class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    // Constructor
    public Car(int numberOfWheels, int numberOfDoors, double carPrice) {
        this.type = "Car";
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    // Override showVehicleDetails() to include doors information
    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();  // Calls the superclass method
        System.out.println("Number of Doors: " + numberOfDoors + ", Price: " + carPrice);
    }

    // Implement the abstract method doVehicleSound
    @Override
    public void doVehicleSound() {
        System.out.println("Car sound: Vroom Vroom!");
    }
}
