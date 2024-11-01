/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class hw5_hoc_Bong {
    //Thuoc tinh:
    private String khoaHoc;
    private float dtk;
    private boolean vpnq;
    private boolean thiLai;
    
    public hw5_hoc_Bong(){
    }
    
    public hw5_hoc_Bong(String khoaHoc, float dtk, boolean vpnq, boolean thiLai){
        this.khoaHoc = khoaHoc;
        this.dtk = dtk;
        this.vpnq = vpnq;
        this.thiLai = thiLai;
    }
    
    public void inputInfo() {
        Scanner s = new Scanner (System.in);
        String input_vpnq;
        String input_thiLai;
        
        System.out.print("Nhap khoa hoc: ");
        khoaHoc = s.nextLine();

        do {
            System.out.print("Nhap diem tong ket (0% - 100%): ");
            dtk = s.nextFloat();
            s.nextLine();
            if (dtk < 0 || dtk > 100) {System.out.println("Sai dinh dang, nhap lai!");}
        } while (dtk < 0 || dtk > 100);

        do {
            System.out.print("Hoc vien co vi pham noi quy khong? (true/false hoac yes/no): ");
            input_vpnq = s.nextLine().trim().toLowerCase();
            
            if (input_vpnq.equals("true") || input_vpnq.equals("yes")) {
                vpnq = true;
                break;
            } else if (input_vpnq.equals("false") || input_vpnq.equals("no")) {
                vpnq = false;
                break;
            } else {
                System.out.println("Sai dinh dang, nhap lai!");
            }
        } while (true);

        do {
            System.out.print("Hoc vien co thi lai khong? (true/false hoac yes/no): ");
            input_thiLai = s.nextLine().trim().toLowerCase();
            
            if (input_thiLai.equals("true") || input_thiLai.equals("yes")) {
                thiLai = true;
                break;
            } else if (input_thiLai.equals("false") || input_thiLai.equals("no")) {
                thiLai = false;
                break;
            } else {
                System.out.println("Sai dinh dang, nhap lai!");
            }
        } while (true);
        
        s.close();
    }
    
    //Phuong thuc showInfo
    public void showInfo() {
        System.out.println("-----\nThong tin sinh vien: ");
        System.out.println("Khoa hoc: " + this.khoaHoc);
        System.out.println("Diem tong ket: " + this.dtk + "%");
        System.out.print("Vi pham noi quy: ");
        if (this.vpnq) {
            System.out.println("Co");
        } else System.out.println("Khong");
        System.out.print("Chi thi lan dau: ");
        if (this.thiLai) {
            System.out.println("Khong");
        } else System.out.println("Co");
        if (this.khoaHoc.equals("HDSE")
            && this.dtk >= 75
            && this.vpnq == false
            && this.thiLai == false) {
            System.out.println("Co hoc bong");
        } else System.out.println("Khong co hoc bong");
    }
    
    public static void main(String[] args) {
        hw5_hoc_Bong hocBong = new hw5_hoc_Bong();
        hocBong.inputInfo();
        hocBong.showInfo();
    }
}
