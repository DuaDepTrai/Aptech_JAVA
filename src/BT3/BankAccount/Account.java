/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3.BankAccount;

/**
 *
 * @author Admin
 */
public class Account {
    private int accountNo;
    private double accountBalance;
    
    public Account(int accountNo, double accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
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
}