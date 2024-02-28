import org.junit.Test;
import static org.junit.Assert.*;

public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Destination A");
        Activity activity = new Activity("Activity A", "Description", 50.0, 20);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
    }

    @Test
    public void testPrintAvailableActivities() {
        Destination destination = new Destination("Destination A");
        Activity activity1 = new Activity("Activity A", "Description", 50.0, 20);
        Activity activity2 = new Activity("Activity B", "Description", 60.0, 15);
        destination.addActivity(activity1);
        destination.addActivity(activity2);

        // Redirect System.out to a string
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        destination.printAvailableActivities();

        // Verify output
        String expectedOutput = "  Destination: Destination A\n" +
                                "    - Activity: Activity A\n" +
                                "    - Activity: Activity B\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Add more test methods as needed
}
