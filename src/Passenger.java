class Passenger {
    private String name;
    private int passengerNumber;
    private List<Activity> activitiesEnrolled;
    private String passengerType;

    public Passenger(String name, int passengerNumber, String passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.activitiesEnrolled = new ArrayList<>();
        this.passengerType = passengerType;
    }

    public void enrollActivity(Activity activity) {
        activitiesEnrolled.add(activity);
        activity.setCapacity(activity.getCapacity() - 1);
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public List<Activity> getActivitiesEnrolled() {
        return activitiesEnrolled;
    }

    public String getPassengerType() {
        return passengerType;
    }
}
