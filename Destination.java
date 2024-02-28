import java.util.ArrayList;
import java.util.List;

/**
 * Represents a destination in a travel package with a name and a list of activities.
 */
public class Destination {
    private String name;
    private List<Activity> activities;

    /**
     * Constructs a new Destination object with the specified name.
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Adds an activity to this destination.
     * @param activity The activity to be added.
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * Retrieves the name of this destination.
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Prints the activities available at this destination.
     */
    public void printActivities() {
        for (Activity activity : activities) {
            System.out.println("  - Activity: " + activity.getName());
            // Print activity details
        }
    }

    /**
     * Prints details of available activities in this destination.
     */
    public void printAvailableActivities() {
        System.out.println("  Destination: " + name);
        for (Activity activity : activities) {
            if (activity.hasSpace()) {
                System.out.println("    - Activity: " + activity.getName());
            }
        }
    }
}
