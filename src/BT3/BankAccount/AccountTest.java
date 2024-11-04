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
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner (System.in);
        int pick;
        
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("1. Create new account");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            
            if (pick == 1) {
                account.createAccount();
            } else if (pick == 2) {
                account.withdraw();
            } else if (pick == 3) {
                account.deposit();
            } else if (pick == 4) {
                System.out.println("Thank you!");
                break;
            } else System.out.println("Invalid choice, please try again.");
        } while (pick != 4);
    }
}
