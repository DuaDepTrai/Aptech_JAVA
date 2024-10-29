package Ex_241028.Bank;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create New Account");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            
            if (choice == 1) {
                bank.createAccount();
            } else if (choice == 2) {
                bank.withdraw();
            } else if (choice == 3) {
                bank.deposit();
            } else if (choice == 4) {
                System.out.println("Exiting the application.");
            } else {
                System.out.println("Error: Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
