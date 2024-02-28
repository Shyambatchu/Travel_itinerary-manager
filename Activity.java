/**
 * Represents an activity at a destination with a name, description, cost, and capacity.
 */
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int enrolledPassengers;

    /**
     * Constructs a new Activity object with the specified name, description, cost, and capacity.
     * @param name The name of the activity.
     * @param description The description of the activity.
     * @param cost The cost of the activity.
     * @param capacity The maximum number of passengers allowed for this activity.
     */
    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.enrolledPassengers = 0;
    }

    /**
     * Checks if there is space available for more passengers in this activity.
     * @return true if there is space available, false otherwise.
     */
    public boolean hasSpace() {
        return enrolledPassengers < capacity;
    }

    // Getter and setter methods for other fields...
}
