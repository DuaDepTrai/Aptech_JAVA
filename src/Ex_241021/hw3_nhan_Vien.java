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
public class hw3_nhan_Vien {
    // Thuộc tính
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;

    // Constructor không tham số
    public hw3_nhan_Vien() {
    }

    // Constructor đầy đủ tham số
    public hw3_nhan_Vien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    // Phương thức nhập thông tin nhân viên
    public void inputInfo() {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        ten = s.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = s.nextInt();
        s.nextLine(); // Bo dong trong sau enter

        System.out.print("Nhap dia chi: ");
        diaChi = s.nextLine();

        System.out.print("Nhap tien luong: ");
        tienLuong = s.nextDouble();

        System.out.print("Nhap tong so gio lam: ");
        tongSoGioLam = s.nextInt();
        
        s.close();
    }

    // Phương thức in thông tin nhân viên
    public void printInfo() {
        System.out.println("Thong tin nhan vien:");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tien luong: " + String.format("%.0f", tienLuong));
        System.out.println("Tong so gio lam: " + tongSoGioLam);
        System.out.println("Tien thuong: " + tinhThuong());
    }

    // Phương thức tính tiền thưởng
    public double tinhThuong() {
        if (tongSoGioLam >= 200) {
            return tienLuong * 0.2;
        } else if (tongSoGioLam >= 100) {
            return tienLuong * 0.1;
        } else {
            return 0;
        }
    }

    // Phương thức main để kiểm tra chương trình
    public static void main(String[] args) {
        hw3_nhan_Vien nv = new hw3_nhan_Vien();
        nv.inputInfo();
        nv.printInfo();
    }
}