/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT6_1;

import java.util.Date;

/**
 *
 * @author Admin
 */
public abstract class TaiSan {
    private String maTaiSan;
    private String ten;
    private double giaMua;
    private String moTa;
    private Date ngayMua;
    private int thoiGianKhauHao; //thoi gian khau hao
    private String boPhanSuDung;

    public TaiSan(String maTaiSan, String ten, double giaMua, String moTa, Date ngayMua, int thoiGianKhauHao, String boPhanSuDung) {
        this.maTaiSan = maTaiSan;
        this.ten = ten;
        this.giaMua = giaMua;
        this.moTa = moTa;
        this.ngayMua = ngayMua;
        this.thoiGianKhauHao = thoiGianKhauHao;
        this.boPhanSuDung = boPhanSuDung;
    }

    public abstract double giaTriKhauHaoHangNam();

    public double giaTriKhauHaoConLai() {
        long soNamDaSuDung = (new Date().getTime() - ngayMua.getTime()) / (1000L * 60 * 60 * 24 * 365);
        int soNamConLai = thoiGianKhauHao - (int) soNamDaSuDung;
        return giaTriKhauHaoHangNam() * Math.max(soNamConLai, 0);
    }

    public int thoiGianKhauHaoConLai() {
        long soNamDaSuDung = (new Date().getTime() - ngayMua.getTime()) / (1000L * 60 * 60 * 24 * 365);
        return Math.max(thoiGianKhauHao - (int) soNamDaSuDung, 0);
    }
    
    public String getTen() {
        return this.ten;
    }
    
    public double getGiaMua() {
        return this.giaMua;
    }

    public int getThoiGianKhauHao() {
        return this.thoiGianKhauHao;
    }
    
    public String getBoPhanSuDung() {
        return this.boPhanSuDung;
    }
    
    @Override
    public String toString() {
        return String.format("\t%-10s %-20s %-20.0f %-30s %-40s %-20s %-20s %-20s %n",
                             maTaiSan, ten, giaMua, moTa, ngayMua, thoiGianKhauHao, thoiGianKhauHaoConLai(), boPhanSuDung);
    }
}

