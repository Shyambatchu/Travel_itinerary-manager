import org.junit.Test;
import static org.junit.Assert.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Package A", 10);
        Destination destination = new Destination("Destination A");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getItinerary().size());
    }

    @Test
    public void testPrintItinerary() {
        TravelPackage travelPackage = new TravelPackage("Package A", 10);
        Destination destination = new Destination("Destination A");
        Activity activity = new Activity("Activity A", "Description", 50.0, 20);
        destination.addActivity(activity);
        travelPackage.addDestination(destination);

        // Redirect System.out to a string
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        travelPackage.printItinerary();

        // Verify output
        String expectedOutput = "Travel Package Name: Package A\n" +
                                "Destination: Destination A\n" +
                                "  - Activity: Activity A\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Add more test methods as needed
}
