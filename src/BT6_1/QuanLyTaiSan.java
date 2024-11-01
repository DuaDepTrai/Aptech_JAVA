/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT6_1;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.util.stream.Collectors;

public class QuanLyTaiSan {
    private List<TaiSan> danhSachTaiSan = new ArrayList<>();

    public void themTaiSan(TaiSan taiSan) {
        danhSachTaiSan.add(taiSan);
    }

    public long demTaiSanCoGiaTriLonHon(double giaTri) {
        return danhSachTaiSan.stream().filter(ts -> ts.getGiaMua() > giaTri).count();
    }

    public Map<String, Long> demTaiSanTheoBoPhan() {
        return danhSachTaiSan.stream().collect(Collectors.groupingBy(TaiSan::getBoPhanSuDung, Collectors.counting()));
    }

    public List<TaiSan> sapXepTheoKhauHaoConLai() {
        return danhSachTaiSan.stream()
                .sorted(Comparator.comparingDouble(TaiSan::giaTriKhauHaoConLai))
                .collect(Collectors.toList());
    }

    public List<TaiSan> taiSanCoThoiGianKhauHaoLonNhat() {
        int khauHaoMax = danhSachTaiSan.stream().mapToInt(TaiSan::getThoiGianKhauHao).max().orElse(0);
        return danhSachTaiSan.stream().filter(ts -> ts.getThoiGianKhauHao() == khauHaoMax).collect(Collectors.toList());
    }

    public List<TaiSan> taiSanCoThoiGianKhauHaoConLaiItNhat() {
        int khauHaoConLaiMin = danhSachTaiSan.stream().mapToInt(TaiSan::thoiGianKhauHaoConLai).min().orElse(0);
        return danhSachTaiSan.stream().filter(ts -> ts.thoiGianKhauHaoConLai() == khauHaoConLaiMin).collect(Collectors.toList());
    }

    public List<TaiSan> taiSanHetKhauHao() {
        return danhSachTaiSan.stream().filter(ts -> ts.thoiGianKhauHaoConLai() <= 0).collect(Collectors.toList());
    }

    public List<TaiSan> timTaiSanTheoTen(String tuKhoa) {
        return danhSachTaiSan.stream().filter(ts -> ts.getTen().contains(tuKhoa)).collect(Collectors.toList());
    }
    
    public void header() {
        System.out.println("\tMa\t\tTen\t\tGia Mua\t\t\tMo Ta\t\t\t\t\tNgay Mua\t\tT.Gian K.Hao\t\tT.Gian K.Hao Con\tBP Su Dung");
    }
}