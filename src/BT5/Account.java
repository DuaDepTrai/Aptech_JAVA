/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

import java.util.Date;

public class Account {
    private String customerName;
    private int accountNumber; // Thay đổi từ String sang int
    private double accountBalance;
    private Date createdDate;

    public Account(String customerName, int accountNumber, double accountBalance, Date createdDate) {
        this.customerName = customerName;
        this.accountNumber = accountNumber; // Khởi tạo accountNumber
        this.accountBalance = accountBalance;
        this.createdDate = createdDate;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    // Phương thức để cập nhật số dư tài khoản
    public void updateBalance(double amount) {
        this.accountBalance += amount;
    }
}
