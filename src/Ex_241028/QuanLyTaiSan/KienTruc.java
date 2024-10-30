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
public class KienTruc {
    private String ma;
    private String ten;
    private double giaMua;
    private String moTa;
    private Date ngayMua;
    private double khauHao;
    private String boPhan;
    
    public KienTruc(String ma, String ten, double giaMua, String moTa, Date ngayMua, double khauHao, String boPhan) {
        this.ma = ma;
        this.ten = ten;
        this.giaMua = giaMua;
        this.moTa = moTa;
        this.ngayMua = ngayMua;
        this.khauHao = khauHao;
        this.boPhan = boPhan;
    }
    
    
}
