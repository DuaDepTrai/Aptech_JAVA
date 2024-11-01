package BT6_2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BT6_2_1 {
    public static int countWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        
        System.out.println("Nhap chuoi s: ");
        s = scanner.nextLine();
        
        int count = countWord(s);
        System.out.println("The number of words in the string: " + count);
    }
}
