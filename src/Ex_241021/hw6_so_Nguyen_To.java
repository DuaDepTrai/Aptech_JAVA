/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241021;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class hw6_so_Nguyen_To {
    private int a;
    
    public hw6_so_Nguyen_To(){
        this.a = 0;
    }
    
    public hw6_so_Nguyen_To(int x) {
        if (isSoNguyenTo(x)) {
            this.a = x;
        } else System.out.println(x + " khong la so nguyen to, khong luu tru");
    }
        
    public static boolean isSoNguyenTo(int x) {
        for (int i=2; i<=Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int getA() {
        return a;
    }
    
    public static int timSoNguyenToTiepTheo(int x) {
        do {
            x++;            
        } while (!isSoNguyenTo(x));
        return x;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x; 
        
        do {
            System.out.println("Nhap x (x>1): ");
            x = s.nextInt();
            if (x<=1) {System.out.println("x > 1, nhap lai!");}
        } while (x<=1);
        
        hw6_so_Nguyen_To snt = new hw6_so_Nguyen_To(x);
        if(snt.getA()!=0) {
            System.out.println(snt.getA() + " la so nguyen to");
            System.out.println("So nguyen to tiep theo: " + timSoNguyenToTiepTheo(snt.getA()));
        }
        
        s.close();        
    }
}
