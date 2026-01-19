public class Customer {
    private String name;
    private int points;
    private static int totalCustomers = 0;

    public Customer() {
        this.name = "Guest";
        this.points = 0;
        totalCustomers++;
    }

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
    }

    public void redeemReward() {
        if (this.points >= 100) {
            this.points -= 100;
            System.out.println(name + " redeemed a free drink!");
        } else {
            System.out.println(name + " does not have enough points to redeem a reward.");
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Points: " + points);
    }

    public static void displayTotalCustomers() {
        System.out.println("Total Registered Customers: " + totalCustomers);
    }

    public static int getAllowedRewardsRedemption(Customer customer) {
        return customer.points / 100;
    }
}
