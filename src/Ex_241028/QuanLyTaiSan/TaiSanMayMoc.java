/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241028.QuanLyTaiSan;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TaiSanMayMoc extends TaiSan {
    public TaiSanMayMoc(String maTaiSan, String ten, double giaMua, String moTa, Date ngayMua, int thoiGianKhauHao, String boPhanSuDung) { 
        super(maTaiSan, ten, giaMua, moTa, ngayMua, thoiGianKhauHao, boPhanSuDung); }

    @Override
    public double giaTriKhauHaoHangNam() {
        return getGiaMua() / (getThoiGianKhauHao() / 2);
    }
}
