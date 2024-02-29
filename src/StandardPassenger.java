class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, "Standard");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
