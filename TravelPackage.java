import java.util.ArrayList;
import java.util.List;

/**
 * Represents a travel package with a name, passenger capacity, and itinerary.
 */
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Passenger> passengers;
    private List<Destination> itinerary;

    /**
     * Constructs a new TravelPackage object with the specified name and passenger capacity.
     * @param name The name of the travel package.
     * @param passengerCapacity The maximum number of passengers allowed for this package.
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.passengers = new ArrayList<>();
        this.itinerary = new ArrayList<>();
    }

    /**
     * Adds a destination to the itinerary of this travel package.
     * @param destination The destination to be added.
     */
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    /**
     * Adds a passenger to this travel package.
     * @param passenger The passenger to be added.
     */
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    /**
     * Prints the itinerary of this travel package, including destinations and activities.
     */
    public void printItinerary() {
        System.out.println("Travel Package Name: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            destination.printActivities();
        }
    }

    /**
     * Prints details of all passengers in this travel package.
     */
    public void printPassengerDetails() {
        System.out.println("Passenger Details for " + name);
        for (Passenger passenger : passengers) {
           
