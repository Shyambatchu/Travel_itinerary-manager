import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TravelPackageTest {

    @Test
    public void testEnrollActivity() {
        Destination destination = new Destination("Beach", new ArrayList<>());
        Activity activity = new Activity("Surfing", "Enjoy surfing on the beach", 50.0, 10, destination);
        Passenger passenger = new StandardPassenger("Shyam", 1, 100.0);

        passenger.enrollActivity(activity);

        assertEquals(1, passenger.getActivitiesEnrolled().size());
        assertEquals(9, activity.getCapacity());
    }

    @Test
    public void testPrintItinerary() {
        Destination destination = new Destination("Beach", new ArrayList<>());
        Activity activity = new Activity("Surfing", "Enjoy surfing on the beach", 50.0, 10, destination);
        destination.addActivity(activity);

        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 20, new ArrayList<>(), new ArrayList<>());
        travelPackage.addDestination(destination);

        // Add your code to test the printItinerary() method here
    }

    @Test
    public void testPrintPassengerList() {
        Passenger passenger1 = new StandardPassenger("Ramu", 1, 100.0);
        Passenger passenger2 = new GoldPassenger("Somu", 2, 200.0);

        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 20, new ArrayList<>(), new ArrayList<>());
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        // Add your code to test the printPassengerList() method here
    }

    @Test
    public void testPrintAvailableActivities() {
        Destination destination = new Destination("Beach", new ArrayList<>());
        Activity activity1 = new Activity("Surfing", "Enjoy surfing on the beach", 50.0, 10, destination);
        Activity activity2 = new Activity("Snorkeling", "Explore underwater life", 40.0, 5, destination);
        destination.addActivity(activity1);
        destination.addActivity(activity2);

        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 20, new ArrayList<>(), new ArrayList<>());
        travelPackage.addDestination(destination);

        // Add your code to test the printAvailableActivities() method here
    }
}
