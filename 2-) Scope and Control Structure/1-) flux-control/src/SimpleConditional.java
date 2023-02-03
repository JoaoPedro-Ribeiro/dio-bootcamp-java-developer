public class SimpleConditional {
    public static void main(String[] args) throws Exception {
        double balance = 1000;
        double requestedAmount = 678;

        if (requestedAmount < balance) {
            balance -= requestedAmount;
            System.out.println("Please take your money");
        }
        System.out.println("\nYour balance is: " + balance);
    }
}
