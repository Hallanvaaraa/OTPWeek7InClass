import java.util.Scanner;

public class TripCostCalculator {

    public static void main(String[] args) {
        // Create a new TripCostCalculator object
        TripCostCalculator tripCostCalculator = new TripCostCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance of the trip in kilometres: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter fuel price per litre: ");
        double fuelCost = scanner.nextDouble();

        // Calculate the cost of a trip
        double cost = tripCostCalculator.calculateTripCost(distance, fuelCost);

        // Print the cost of the trip
        System.out.println("The cost of the trip is: $" + cost);
    }

    public double calculateTripCost(double distance, double fuelCost) {
        // Calculate the cost of the trip
        double fuelNeeded = calculateFuelNeeded(distance);

        // Return the cost of the trip
        return fuelNeeded * fuelCost;
    }

    public double calculateFuelNeeded(double distance) {
        // Calculate the fuel needed for the trip
        // 5 litres per 100 km fuel efficiency
        double fuelEfficiency = (double) 5 / 100;

        // Return the fuel needed for the trip
        return distance * fuelEfficiency;
    }
}
