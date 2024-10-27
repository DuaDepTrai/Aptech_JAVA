/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241025;

/**
 *
 * @author Admin
 */
public interface TaiKhoanTietKiem {
    void guiTien(double soTien);
    void rutTien(double soTien);
    double xemSoDu();
}

public class TaiKhoanCoKyHan implements TaiKhoanTietKiem {
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

public class TaiKhoanKhongKyHan implements TaiKhoanTietKiem {
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
            System.out.println("Ban da gui " + soTien + "vao tai khoan khong ky han");
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
    
}
