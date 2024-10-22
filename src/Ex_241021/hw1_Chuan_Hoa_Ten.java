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
public class hw1_Chuan_Hoa_Ten {
    public static String chuanHoaHoTen(String hoTen) {
        // Loai bo khoang trang dau va cuoi chuoi
        hoTen = hoTen.trim();
        
        // Tach cac tu bang dau cach
        String[] words = hoTen.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        // Chuan hoa tung tu
        for (String word : words) {
            if (!word.isEmpty()) {
                // Viet hoa chu cai dau, viet thuong cac chu cai con lai
                result.append(Character.toUpperCase(word.charAt(0))) // Chữ cái đầu
                      .append(word.substring(1).toLowerCase())       // Phần còn lại
                      .append(" "); // Thêm khoảng cách giữa các từ
            }
        }

        // Loai bo khoang trang cuoi chuoi, tra ve ket qua
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        // Nhập họ tên và chuẩn hóa
        String hoTen;        
        System.out.println("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.println("Ho ten sau khi chuan hoa: '" + chuanHoaHoTen(hoTen) + "'");
        
        s.close();
    }
}