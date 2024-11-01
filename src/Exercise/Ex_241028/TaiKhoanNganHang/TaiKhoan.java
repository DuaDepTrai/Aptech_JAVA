/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241028.TaiKhoanNganHang;

/**
 *
 * @author Admin
 */
class TaiKhoanCaNhan implements TK {
    private double soDu;
    private double laiSuat;
    
    public TaiKhoanCaNhan (double laiSuat) {
        this.laiSuat = laiSuat;
        this.soDu = 0;
    }
    
    @Override
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Ban da gui " + soTien + " vao tai khoan");
        } else {
            System.out.println("So tien gui khong hop le");
        }
    }
    
    @Override
    public void rutTien(double soTien) {
        if (soTien > 0) {
            if (soTien <= 5000000) {
                if (soDu >= soTien) {
                    soDu -= soTien;
                } else {
                    System.out.println("So du khong du de thuc hien giao dich nay");
                }
            } else {
                System.out.println("Han muc rut tien cua tai khoan la 5.000.000");
            }
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    
    @Override
    public double tinhLaiSuat() {
        return soDu * laiSuat;
    }
    
    @Override
    public double xemSoDu() {
        return soDu;
    }
}

public class TaiKhoan {
    public static void main(String[] args) {
        
    }
}
