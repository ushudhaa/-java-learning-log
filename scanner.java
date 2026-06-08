import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set Balance: ");
        int balance = sc.nextInt();
        boolean running = true;
        while (running) {

            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + balance);
            }
            if (choice == 2) {
                System.out.print("Enter amount to deposit: " + "Balance: ");
                int deposit = sc.nextInt();
                balance -= deposit;
            }
            if (choice == 3) {
                System.out.print("Enter amount to withdraw: " + "Balance: " );
                int withdraw = sc.nextInt();
                balance -= withdraw;
            }
            if (choice == 4) {
                System.out.println("Goodbye!");
                running = false;
            }
        }
        sc.close();
    }
}
