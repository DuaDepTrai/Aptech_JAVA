/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT6_1;

/**
 *
 * @author Admin
 */
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BaoCao {
    public static void main(String[] args) throws Exception {
        QuanLyTaiSan quanLy = new QuanLyTaiSan();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);

        // Thêm các tài sản kiến trúc
        quanLy.themTaiSan(new TaiSanKienTruc("KT001", "Nha cua", 5000000, "Nha cap 4", sdf.parse("2018-01-01"), 20, "Bo phan 1"));
        quanLy.themTaiSan(new TaiSanKienTruc("KT002", "Cua so", 1200000, "Cua so nhom kinh", sdf.parse("2019-05-10"), 15, "Bo phan 1"));
        quanLy.themTaiSan(new TaiSanKienTruc("KT003", "Ke sach", 800000, "Ke sach go", sdf.parse("2020-11-15"), 10, "Bo phan 1"));

        // Thêm các tài sản máy móc thiết bị
        quanLy.themTaiSan(new TaiSanMayMoc("MM001", "Laptop", 15000000, "Macbook Pro", sdf.parse("2020-06-01"), 5, "Bo phan 2"));
        quanLy.themTaiSan(new TaiSanMayMoc("MM002", "May tinh", 10000000, "PC Dell", sdf.parse("2021-03-20"), 7, "Bo phan 2"));
        quanLy.themTaiSan(new TaiSanMayMoc("MM003", "May in", 5000000, "Canon", sdf.parse("2022-01-10"), 4, "Bo phan 2"));

        // Thêm các tài sản văn phòng
        quanLy.themTaiSan(new TaiSanVanPhong("VP001", "But bi", 5000, "But bi xanh", sdf.parse("2023-01-01"), 1, "Bo phan 3"));
        quanLy.themTaiSan(new TaiSanVanPhong("VP002", "Giay A4", 45000, "Giay A4 Trang", sdf.parse("2022-11-01"), 1, "Bo phan 3"));
        quanLy.themTaiSan(new TaiSanVanPhong("VP003", "Keo dan", 10000, "Keo dan trong", sdf.parse("2022-05-10"), 1, "Bo phan 3"));

        // Thêm các tài sản khác
        quanLy.themTaiSan(new TaiSanKhac("OT001", "Dinh", 1000, "Dinh sat", sdf.parse("2021-01-01"), 1, "Bo phan 4"));
        quanLy.themTaiSan(new TaiSanKhac("OT002", "Kim", 2000, "Kim bam", sdf.parse("2021-04-25"), 1, "Bo phan 4"));
        quanLy.themTaiSan(new TaiSanKhac("OT003", "Oc vit", 3000, "Oc vit kim loai", sdf.parse("2021-08-15"), 1, "Bo phan 4"));

        // Báo cáo
        char pick;
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("a. So luong tai san co gia mua lon hon 200.000d");
            System.out.println("b. So luong tai san theo tung bo phan dang su dung tai san");
            System.out.println("c. Danh sach tai san sap xep theo gia tri khau hao con lai tang dan");
            System.out.println("d. Danh sach tai san co thoi gian khau hao lon nhat");
            System.out.println("e. Danh sach tai san co thoi gian khau hao con lai it nhat");
            System.out.println("f. Danh sach tai san het khau hao");
            System.out.println("g. Tim kiem tai san theo ten");
            System.out.println("h. Thoat chuong trinh");
            System.out.println("Chon bao cao: ");
            pick = scanner.next().toLowerCase().charAt(0);
            
            if (pick == 'a') {
                System.out.println("So luong tai san co gia mua lon hon 200.000d: " + quanLy.demTaiSanCoGiaTriLonHon(200000));
            } else if (pick == 'b') {
                System.out.println("So luong tai san theo tung bo phan dang su dung tai san: " + quanLy.demTaiSanTheoBoPhan());
            } else if (pick == 'c') {
                System.out.println("Danh sach tai san sap xep theo gia tri khau hao con lai tang dan: ");
                quanLy.header();
                System.out.println(quanLy.sapXepTheoKhauHaoConLai());
            } else if (pick == 'd') {
                System.out.println("Danh sach tai san co thoi gian khau hao lon nhat: ");
                quanLy.header();
                System.out.println(quanLy.taiSanCoThoiGianKhauHaoLonNhat());
            } else if (pick == 'e') {
                System.out.println("Danh sach tai san co thoi gian khau hao con lai it nhat: ");
                quanLy.header();
                System.out.println(quanLy.taiSanCoThoiGianKhauHaoConLaiItNhat());
            } else if (pick == 'f') {
                System.out.println("Danh sach tai san het khau hao");
                quanLy.header();
                System.out.println(quanLy.taiSanHetKhauHao());
            } else if (pick == 'g') {
                System.out.print("Nhap ten tai san can tim: ");
                String tuKhoa = scanner.nextLine();
                scanner.nextLine();
                
                System.out.println("Ket qua tim kiem: ");
                quanLy.header();
                System.out.println(quanLy.timTaiSanTheoTen(tuKhoa));
            } else if (pick == 'h') {
                System.out.println("Thank you!");
                break;
            } else System.out.println("Lua chon khong hop le, vui long chon lai.");
        } while (pick != 'h');
        
        scanner.close();
    }
}