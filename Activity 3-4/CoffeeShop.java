public class CoffeeShop {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Joseph", 200);    
        Customer customer2 = new Customer("Peter");        
        Customer customer3 = new Customer();                 

        customer2.addPoints(200); 
        customer2.addPoints(20); 

        System.out.println("___________________");
        System.out.println("|  Redeem Reward  |");
        System.out.println("___________________");
        customer1.redeemReward();
        customer2.redeemReward();
        customer3.redeemReward();

        System.out.println("__________________________");
        System.out.println("|  Customer Information  |");
        System.out.println("__________________________");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        System.out.println("_____________________");
        System.out.println("|  Total Customers  |");
        System.out.println("_____________________");
        Customer.displayTotalCustomers();

        Customer customer4 = new Customer("Diane");
        customer4.addPoints(50);

        System.out.println("_______________________");
        System.out.println("|  New Customer Info  |");
        System.out.println("_______________________");
        customer4.displayCustomerInfo();

        System.out.println("_____________________________");
        System.out.println("|  Updated Total Customers  |");
        System.out.println("_____________________________");
        Customer.displayTotalCustomers();

        System.out.println("______________________________");
        System.out.println("|  Rewards Redeemable Count  |");
        System.out.println("______________________________");
        System.out.println("Joseph can redeem: " + Customer.getAllowedRewardsRedemption(customer1) + " times");
        System.out.println("Peter can redeem: " + Customer.getAllowedRewardsRedemption(customer2) + " times");
        System.out.println("Guest can redeem: " + Customer.getAllowedRewardsRedemption(customer3) + " times");
        System.out.println("Diane can redeem: " + Customer.getAllowedRewardsRedemption(customer4) + " times");
    }
}
