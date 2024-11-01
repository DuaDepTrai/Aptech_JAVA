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
public class SapXepMangTangDan {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int i, j, n;
        
        System.out.println("Nhap n: ");
        n = s.nextInt();
        
        int[] a = new int[n];
        System.out.print("Nhap " + n + " phan tu cua mang: ");
        for (i=0; i<n; i++) {
            a[i] = s.nextInt();
        }
        
        for (i=0; i<n-1; i++) {
            for (j=i+1; j<n; j++) {
                if (a[i]>a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        
        System.out.print("Mang da sap xep: ");
        for (i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        
        s.close();
    }
}
