package VehicleApp;

public class Tester {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(4, 4, 20000.00);
        // Create a Boat object
        Boat boat = new Boat(50.5, 3000);

        // Call the Vehicle methods for the Car object
        System.out.println("Car Details:");
        car.showVehicleDetails();  // Displays details about the car
        car.doVehicleSound();      // Displays the car's sound

        // Call the Vehicle methods for the Boat object
        System.out.println("\nBoat Details:");
        boat.showVehicleDetails();  // Displays details about the boat
        boat.doVehicleSound();      // Displays the boat's sound

        // Print the boat's weight and speed using the dedicated method
        System.out.println("\nBoat Weight and Speed:");
        System.out.println(boat.getBoatWeightAndSpeed());  // Shows weight and max speed of the boat
    }
}
