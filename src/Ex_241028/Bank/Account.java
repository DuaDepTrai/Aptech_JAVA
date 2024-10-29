/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241028.Bank;

import java.util.Date;

public class Account {
    private String customerName;
    private int accountNumber;
    private double accountBalance;
    private Date createdDate;

    // Constructor
    public Account(String customerName, int accountNumber, double accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.createdDate = new Date(); // Ngày tạo tài khoản là ngày hiện tại
    }

    Account(String customerName, int i, double initialBalance, String createdDate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter và Setter
    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

    // Phương thức để cập nhật số dư tài khoản
    public void updateBalance(double amount) {
        this.accountBalance += amount;
    }
}