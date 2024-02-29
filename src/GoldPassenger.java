class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, "Gold");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
