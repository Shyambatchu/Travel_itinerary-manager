public class TravelPackageDriver {
    public static void main(String[] args) {
        // Create a travel package
        TravelPackage travelPackage = new TravelPackage("Package A", 10);

        // Create destinations
        Destination destinationA = new Destination("Destination A");
        Destination destinationB = new Destination("Destination B");

        // Create activities
        Activity activityA = new Activity("Activity A", "Description A", 50.0, 20);
        Activity activityB = new Activity("Activity B", "Description B", 60.0, 15);
        destinationA.addActivity(activityA);
        destinationB.addActivity(activityB);

        // Add destinations to the travel package
        travelPackage.addDestination(destinationA);
        travelPackage.addDestination(destinationB);

        // Print itinerary
        travelPackage.printItinerary();

        // Print available activities
        travelPackage.printAvailableActivities();
    }
}
