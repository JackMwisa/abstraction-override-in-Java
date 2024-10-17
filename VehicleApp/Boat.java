package VehicleApp;

public class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    // Constructor
    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        this.type = "Boat";
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    // Implement the abstract method doVehicleSound
    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound: Whoosh Whoosh!");
    }

    // Method to return information about boat's weight and speed
    public String getBoatWeightAndSpeed() {
        return "Boat Weight: " + boatKilosWeight + " kg, Max Speed: " + maxKnotsSpeed + " knots";
    }
}
