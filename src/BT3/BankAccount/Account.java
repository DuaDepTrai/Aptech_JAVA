/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3.BankAccount;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Account {
    private int accountId = 1;
    private int accountNo;
    private double accountBalance;
    private Account[] account;
    
    public Account() {
        this.accountNo = 1001;
        this.accountBalance = 0.0;
        this.account = new Account[1000];
    }
        
    public Account(int accountNo, double accountBalance, int arraySize) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.account = new Account[arraySize];
    }
    
    public int getAccountId() {
        return accountId;
    }
    
    public int getAccountNo() {
        return accountNo;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void updateBalance(double amount) {
        this.accountBalance += amount;
    }
    
    public Account[] getAccountArray() {
        return account;
    }
    
    public void displayAccountDetails(Account account) {
        System.out.println("Account No: " + account.getAccountNo());
        System.out.println("Account Balance: " + account.getAccountBalance());
    }
    
    public void createAccount() {
        Scanner scanner = new Scanner (System.in);
        
        if (accountId < account.length) {
            System.out.print("Enter opening balance: ");
            double openingBalance = scanner.nextDouble();

            Account newAccount = new Account(accountNo++, openingBalance, 0);
            account[accountId++] = newAccount;
            System.out.println("Create account successfully");
            displayAccountDetails(newAccount);
        } else System.out.println("Cannot create more account");
    }
    
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account No: ");
        int accountNo = scanner.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        if (amount < 0) {
            System.out.println("Amount must be positive");
            return;
        }
        if (accountNo <= 0) {
            System.out.println("No account avaiable");
            return;
        }
        
        Account account = findAccount(accountNo);
        if (account == null) {
            System.out.println("Account does not exist");
            return;
        }
        if (amount > account.getAccountBalance()) {
            System.out.println("Account balance is not enough");
            return;
        }
        
        account.updateBalance(-amount);
        System.out.println("-----\nWithdraw " + amount + " successfull\n-----");
        displayAccountDetails(account);
    }
    
    public void deposit() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter account no: ");
        int accountNo = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }
        if (accountNo <= 0) {
            System.out.println("No account avaiable");
            return;
        }
        
        Account account = findAccount(accountNo);
        if (account == null) {
            System.out.println("Account does not exist");
            return;
        }
        
        account.updateBalance(+amount);
        System.out.println("-----\nDeposit " + amount + " successfull\n-----");
        displayAccountDetails(account);
    }
    
    public Account findAccount(int accountNo) {
        for (int i=1; i < accountId; i++) {
            if (account[i] != null && account[i].getAccountNo() == accountNo) {
                return account[i];
            }
        }
        return null;
    }
}