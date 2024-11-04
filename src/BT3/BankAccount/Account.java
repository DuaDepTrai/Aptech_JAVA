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
    private int accountId;
    private int accountNo;
    private double accountBalance;
    private Account[] account;
    
    public Account() {
        this.accountId = 0;
        this.accountNo = 1000;
        this.accountBalance = 0.0;
        this.account = new Account[1000];
    }
        
    public Account(int accountId, int accountNo, double accountBalance, int arraySize) {
        this.accountId = accountId;
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
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("-----");
    }
    
    public void createAccount() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter opening balance: ");
        double openingBalance = scanner.nextDouble();
    }
}