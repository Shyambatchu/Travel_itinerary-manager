/**
 * Represents a passenger with a name, passenger number, type, and balance.
 */
public class Passenger {
    private String name;
    private String passengerNumber;
    private PassengerType passengerType;
    private double balance;

    /**
     * Constructs a new Passenger object with the specified name, passenger number, type, and balance.
     * @param name The name of the passenger.
     * @param passengerNumber The passenger number.
     * @param passengerType The type of passenger (Standard, Gold, Premium).
     * @param balance The balance of the passenger.
     */
    public Passenger(String name, String passengerNumber, PassengerType passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
    }

    /**
     * Prints details of this passenger, including name, passenger number, type, and balance.
     */
    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Passenger Type: " + passengerType);
        System.out.println("Balance: $" + balance);
    }

    // Getter and setter methods for fields...
}
