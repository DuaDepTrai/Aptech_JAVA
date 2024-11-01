package BT5;

import BT5.Account;
import java.util.Scanner;
import java.util.Date;

public class Bank {
    private int nextAccount = 0;
    private static final int maximumAccounts = 100; // Giới hạn số tài khoản
    private int nextAccountNumber = 1001; // Bắt đầu số tài khoản
    private Account[] account;

    public Bank() {
        account = new Account[maximumAccounts];
    }

    public void displayAccountDetails(Account account) {
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: $" + account.getAccountBalance());
        System.out.println("Created Date: " + account.getCreatedDate());
        System.out.println("-----");
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter opening balance: ");
        double openingBalance = scanner.nextDouble();

        try {
            if (openingBalance < 100) {
                throw new Exception("Minimum opening balance is $100.");
            }
            
            Date createdDate = new Date(); // Khởi tạo ngày hiện tại

            if (nextAccount >= maximumAccounts) {
                throw new Exception("Maximum accounts limit reached.");
            }
            
            Account newAccount = new Account(customerName, nextAccountNumber++, openingBalance, createdDate);
            account[nextAccount++] = newAccount;
            System.out.println("-----\nAccount created successfully.");
            displayAccountDetails(newAccount);
    } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }
            if (nextAccount <= 0) {
                throw new Exception("No account avaiable");
            }
            
            Account account = findAccount(accountNumber);
            if (account == null) {
                throw new Exception("Account does not exist.");
            }

            if (amount > account.getAccountBalance()) {
                throw new Exception("Account balance is not enough");
            }
            if (amount < 100) {
                throw new Exception("You must withdraw at least $100.");
            }

            account.updateBalance(-amount);
            System.out.println("-----\nWithdrawal " + amount + " successful.\n-----");
            displayAccountDetails(account);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }
            Account account = findAccount(accountNumber);
            if (account == null) {
                throw new Exception("Account does not exist.");
            }

            account.updateBalance(amount);
            System.out.println("-----\nDeposit " + amount + " successful.\n-----");
            displayAccountDetails(account);
            } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Account findAccount(int accountNumber) {
        for (int i = 0; i < nextAccount; i++) {
        if (account[i] != null && account[i].getAccountNumber() == accountNumber) {
                return account[i];
            }
        }
        return null; // Không tìm thấy tài khoản
    }
}
