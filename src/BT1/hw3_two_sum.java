/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

package BT1;
import java.util.Scanner;

public class hw3_two_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Nhap du lieu
        System.out.println("Nhap so phan tu cua mang: ");
        int n = s.nextInt();
        
        int[] a = new int[n];
        System.out.print("Nhap gia tri " + n + " phan tu cua mang: ");
        for (int i=0; i<n; i++) {
            a[i] = s.nextInt();
        }
        
        System.out.print("Nhap target: ");
        int t = s.nextInt();
        
        //Hien thi ket qua
        int c = 0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i] + a[j] == t) {
                    System.out.println("[" + i + "," + j + "]");
                    c++;
                    return;
                }
            }
        }
        if (c == 0) System.out.println("No results were found");
        
        s.close();
    }
}
