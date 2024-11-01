/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in the account.");
    }

    public InsufficientFundsException(double currentBalance) {
        super("Insufficient funds. Current balance is: $" + currentBalance);
    }
}
