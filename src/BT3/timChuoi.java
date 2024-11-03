/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class timChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String s1, s2;
        String[] words1, words2;
        List<Integer> positions = new ArrayList<>();
        
        System.out.println("Nhap chuoi s1: ");
        s1 = scanner.nextLine();
        System.out.println("Nhap chuoi s2: ");
        s2 = scanner.nextLine();
        
        words1 = s1.replaceAll("[^a-zA-Z\\s]", "").trim().toLowerCase().split("\\s+");
        words2 = s2.replaceAll("[^a-zA-Z\\s]", "").trim().toLowerCase().split("\\s+");
        
        if (words1.length < words2.length) {
            System.out.println("Chuoi s2 khong xuat hien trong chuoi s1");
            return;
        }
        
        for (int i=0; i < words1.length - words2.length; i++) {
            boolean match = true;
            
            for (int j=0; j < words2.length; j++) {
                if (!words1[i+j].equals(words2[j])) {
                    match = false;
                    break;
                }
            }
            
            if (match) {
                positions.add(i);
            }
        }
        
        if (!positions.isEmpty()) {
            System.out.println("Chuoi s2 xuat hien trong chuoi s1 tai vi tri: " + positions);
        } else System.out.println("Chuoi s2 khong xuat hien trong chuoi s1");
    }
}
