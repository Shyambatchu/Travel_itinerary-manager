import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testSetName() {
        Passenger passenger = new Passenger("John", "123", PassengerType.STANDARD, 100.0);
        passenger.setName("Alice");
        assertEquals("Alice", passenger.getName());
    }

    @Test
    public void testSetBalance() {
        Passenger passenger = new Passenger("John", "123", PassengerType.STANDARD, 100.0);
        passenger.setBalance(150.0);
        assertEquals(150.0, passenger.getBalance(), 0);
    }

    @Test
    public void testGetPassengerType() {
        Passenger passenger = new Passenger("John", "123", PassengerType.GOLD, 100.0);
        assertEquals(PassengerType.GOLD, passenger.getPassengerType());
    }

    // Add more test methods as needed
}
