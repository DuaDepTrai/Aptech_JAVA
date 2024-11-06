/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241025;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

class TaiKhoanCoKyHan implements TKTK {
    private double soDu;
    private double laiSuat;
    
    public TaiKhoanCoKyHan(double laiSuat) {
        this.laiSuat = laiSuat;
        this.soDu = 0;
    }
    
    @Override
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Ban da gui " + soTien + " vao tai khoan co ky han");
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    
    @Override
    public void rutTien(double soTien) {
        if (soDu >= 1000000) {
            if (soDu >= soTien) {
                soDu -= soTien;
                System.out.println("Ban da rut " + soTien + " tu tai khoan co ky han");
            } else {
                System.out.println("So tien khong du de rut");
            }
        } else {
            System.out.println("So du phai dat toi thieu 1000000 de rut tien");
        }
    }
    
    @Override
    public double xemSoDu() {
        return soDu;
    }
}

class TaiKhoanKhongKyHan implements TKTK {
    private double soDu;
    private double laiSuat;
    
    public TaiKhoanKhongKyHan(double laiSuat) {
        this.laiSuat = laiSuat;
        this.soDu = 0;
    }
    
    @Override
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Ban da gui " + soTien + " vao tai khoan khong ky han");
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    
    @Override
    public void rutTien(double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.println("Ban da rut " + soTien + " tu tai khoan khong ky han");
        } else {
            System.out.println("So tien khong du de rut");
        }
    }
    
    @Override 
    public  double xemSoDu() {
        return soDu;
    }
}

public class TaiKhoanTietKiem {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        TKTK taiKhoan = null;
        int pick;
        
        do {
            System.out.println("-----\nChon chuc nang: ");
            System.out.println("1. Tao tai khoan");
            System.out.println("2. Gui tien");
            System.out.println("3. Rut tien");
            System.out.println("4. Xem so du");
            System.out.println("5. Thoat");
            pick = s.nextInt();
            
            if (pick == 1) {
                System.out.println("Chon loai tai khoan: ");
                System.out.println("A. Tai khoan co ky han");
                System.out.println("B. Tai khoan khong ky han");
                char loaiTaiKhoan = s.next().toUpperCase().charAt(0);
                System.out.print("Nhap lai suat mong muon: ");
                double laiSuat = s.nextDouble();
                
                if (loaiTaiKhoan == 'A') {
                    taiKhoan = new TaiKhoanCoKyHan(laiSuat);
                    System.out.println("Da tao tai khoan co ky han");
                } else if (loaiTaiKhoan == 'B') {
                    taiKhoan = new TaiKhoanKhongKyHan(laiSuat);
                    System.out.println("Da tao tai khoan khong ky han");
                } else {
                    System.out.println("Loai tai khoan khong hop le");
                }
                
            } else if (pick == 2) {
                if (taiKhoan != null) {
                    System.out.print("Nhap so tien muon gui: ");
                    double soTienGui = s.nextDouble();
                    taiKhoan.guiTien(soTienGui);
                } else {
                    System.out.println("Vui long tao tai khoan truoc");
                }
                
            } else if (pick == 3) {
                if (taiKhoan != null) {
                    System.out.println("Nhap so tien muon rut: ");
                    double soTienRut = s.nextDouble();
                    taiKhoan.rutTien(soTienRut);
                } else {
                    System.out.println("Vui long tao tai khoan truoc");
                }
            } else if (pick == 4) {
                if (taiKhoan != null) {
                    System.out.print("So du tai khoan: " + taiKhoan.xemSoDu());
                } else {
                    System.out.println("Vui long tao tai khoan truoc");
                }
            } else if (pick == 5) {
                System.out.println("Thank you!");
                break;
            }
            else {
                System.out.println("Lua chon khong hop le, vui long chon lai");
            }
        } while (pick != 5);
        
        s.close();
    }
}
