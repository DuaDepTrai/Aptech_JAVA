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
public class hw4_Student {
    //Thuoc tinh
    private String msv;
    private float dtb;
    private int tuoi;
    private String lop;
    
    //Constructor khong tham so
    public hw4_Student () {
    }
    
    //Constructor co tham so
    public hw4_Student (String msv, float dtb, int tuoi, String lop) {
        this.msv = msv;
        this.dtb = dtb;
        this.tuoi = tuoi;
        this.lop = lop;
    }
    
    //Phuong thuc inputInfo
    public void inputInfo() {
        Scanner s = new Scanner (System.in);
        
        do {
            System.out.print("Nhap ma sinh vien (8 ky tu): ");
            msv = s.nextLine();
            if (msv.length() != 8) {System.out.println("Sai dinh dang, nhap lai!");}
        } while (msv.length() != 8);

        do {
            System.out.print("Nhap diem trung binh (0.0 - 10.0): ");
            dtb = s.nextFloat();
            if (dtb < 0.0 || dtb > 10.0) {System.out.println("Sai dinh dang, nhap lai!");}
        } while (dtb < 0.0 || dtb > 10.0);

        do {
            System.out.print("Nhap tuoi (>= 18): ");
            tuoi = s.nextInt();
            s.nextLine();
            if (tuoi < 18) {System.out.println("Sai dinh dang, nhap lai!");}
        } while (tuoi < 18);

        do {
            System.out.print("Nhap lop (bat dau bang 'A' hoac 'C'): ");
            lop = s.nextLine();
            if (!lop.startsWith("A") && !lop.startsWith("C")) {System.out.println("Sai dinh dang, nhap lai!");}
        } while (!lop.startsWith("A") && !lop.startsWith("C"));
        
        s.close();
    }
    
    //Phuong thuc showInfo
    public void showInfo() {
        System.out.println("-----\nThong tin sinh vien: ");
        System.out.println("Ma sinh vien: " + this.msv);
        System.out.println("Diem trung binh: " + this.dtb);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Lop: " + this.lop);
        if (xetHocBong()) {
            System.out.println("Hoc bong: Co");
        } else System.out.println("Hoc bong: Khong");
    }
    
    //Phuong thuc xet hoc bong
    public boolean xetHocBong() {
        return dtb > 8;
    }
    
    //Phuong thuc main
    public static void main(String[] args) {
        hw4_Student sv = new hw4_Student();
        sv.inputInfo();
        sv.showInfo();
    }
}
