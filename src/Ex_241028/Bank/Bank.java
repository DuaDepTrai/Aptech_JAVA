package Ex_241028.Bank;

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
            assert openingBalance >= 0 : "Số dư mở không được âm";
            if (openingBalance < 100) {
                throw new IllegalArgumentException("Minimum opening balance is $100.");
            }
            
            Date createdDate = new Date(); // Khởi tạo ngày hiện tại

            if (nextAccount >= maximumAccounts) {
                throw new IllegalStateException("Maximum accounts limit reached.");
            }
            
            Account newAccount = new Account(customerName, nextAccountNumber++, openingBalance, createdDate);
            account[nextAccount++] = newAccount;
            System.out.println("-----\nAccount created successfully.");
            displayAccountDetails(newAccount);
    } catch (AssertionError | IllegalArgumentException | IllegalStateException e) {
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
            assert amount > 0 : "Amount must be positive.";
            assert nextAccount > 0 : "No accounts available.";

            Account account = findAccount(accountNumber);
            if (account == null) {
                throw new IllegalArgumentException("Account does not exist.");
            }

            if (amount > account.getAccountBalance()) {
                throw new InsufficientFundsException(account.getAccountBalance());
            }
            if (amount < 100) {
                throw new IllegalArgumentException("You must withdraw at least $100.");
            }

            account.updateBalance(-amount);
            System.out.println("-----\nWithdrawal " + amount + " successful.\n-----");
            displayAccountDetails(account);
        } catch (Exception e) {
            e.printStackTrace(); // Xử lý ngoại lệ
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        try {
            assert amount > 0 : "Amount must be positive.";
            Account account = findAccount(accountNumber);
            if (account == null) {
                throw new IllegalArgumentException("Account does not exist.");
            }

            account.updateBalance(amount);
            System.out.println("-----\nDeposit " + amount + " successful.\n-----");
            displayAccountDetails(account);
            } catch (AssertionError | IllegalArgumentException e) {
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
