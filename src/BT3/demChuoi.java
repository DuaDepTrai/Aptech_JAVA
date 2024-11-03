/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demChuoi {
    public static int count(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String s;
        
        System.out.println("Nhap chuoi: ");
        s = scanner.nextLine();
        
        int count = count(s);
        System.out.println("So tu trong chuoi: " + count);
    }
}
