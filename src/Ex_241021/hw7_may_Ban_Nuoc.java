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
public class hw7_may_Ban_Nuoc {
    private static final String[] products = {
        "Cafe den",
        "Cafe sua",
        "Coca Cola",
        "Fanta",
        "Pepsi",
        "Bo huc",
        "Heneiken"
    };
    
    private static final int[] price = {
        16000, //Cafe den
        18000, //Cafe sua
        12000, //Coca
        12000, //Fanta
        13000, //Pepsi
        18000, //Bo huc
        20000  //Heneiken
    };
    
    private static int account = 0; //Tong tien trong tai khoan
    
    private static void showProducts() {
        System.out.println("-----\nDanh sach san pham:");
        for (int i=0; i<products.length; i++) {
            System.out.println((char)('A' + i) + ": " + products[i] + " - " + price[i] + "VND");
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int pick;
        
        do {
            System.out.println("-----\nMay Ban Nuoc Tu Dong");
            System.out.println("So du tai khoan: " + account);
            System.out.println("1. Nap tien vao may");
            System.out.println("2. Mua nuoc");
            System.out.println("3. Rut tien");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            pick = s.nextInt();
            
            if (pick == 1) {
                deposit(s);
            } else if (pick == 2) {
                buy(s);
            } else if (pick == 3) {
                withdraw();
            } else if (pick == 4) {
                System.out.println("Thank you!");
                break;
            } else System.out.println("Lua chon khong hop le, nhap lai!");
        } while (pick != 4);
        
        s.close();
    }
    
    private static void deposit(Scanner s) {
        System.out.print("Nhap so tien muon nap: ");
        int amount = s.nextInt();
        if (amount > 0) {
            account += amount;
            System.out.println("Ban da nap " + amount + " vao tai khoan.");
            System.out.println("So du tai khoan: " + account);
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    
    private static void buy(Scanner s) {
        if (account <=0) {
            System.out.println("Ban chua nap tien, vui long nap tien vao tai khoan.");
            return;
        } else {
            System.out.println("-----\nSo du tai khoan: " + account);
            showProducts();
            System.out.print("Ban muon mua gi?\nNhap ky tu tuong ung [A-G]: ");
            char pickProduct = s.next().toUpperCase().charAt(0);
            int index = pickProduct - 'A';
            
            if (index < 0 || index >= products.length) {
                System.out.println("Vui long chon lai.");
                return;
            }
            
            int priceIndex = price[index];
            
            if (account >= priceIndex) {
                account -= priceIndex;
                System.out.println("Ban da mua " + products[index] + ", chuc ngon mieng");
            } else {
                System.out.println("Ban khong du tien, vui long nap them tien");
                return;
            }
        }
    }
    
    private static void withdraw() {
        if (account > 0) {
            System.out.println("Ban da rut " + account);
            account = 0;
        } else System.out.println("So du tai khoan khong du");
    }
}
