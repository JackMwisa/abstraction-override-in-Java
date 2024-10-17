package VehicleApp;

public abstract class Vehicle {
    protected String type;
    protected int numberOfWheels;

    
    public void showVehicleDetails() {
        System.out.println("Vehicle Type: " + type + ", Number of Wheels: " + numberOfWheels);
    }

    // Abstract method for vehicle sound
    public abstract void doVehicleSound();
}
