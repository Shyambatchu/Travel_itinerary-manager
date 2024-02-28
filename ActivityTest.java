import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void testHasSpaceTrue() {
        Activity activity = new Activity("Activity A", "Description", 50.0, 20);
        assertTrue(activity.hasSpace());
    }

    @Test
    public void testHasSpaceFalse() {
        Activity activity = new Activity("Activity A", "Description", 50.0, 2);
        activity.enrollPassenger(); // Enroll 2 passengers
        activity.enrollPassenger();
        assertFalse(activity.hasSpace());
    }

    @Test
    public void testEnrollPassenger() {
        Activity activity = new Activity("Activity A", "Description", 50.0, 3);
        activity.enrollPassenger();
        assertEquals(1, activity.getEnrolledPassengers());
    }

    @Test
    public void testEnrollPassengerBeyondCapacity() {
        Activity activity = new Activity("Activity A", "Description", 50.0, 1);
        activity.enrollPassenger();
        assertFalse(activity.enrollPassenger()); // Attempt to enroll more than capacity
    }

    // Add more test methods as needed
}
