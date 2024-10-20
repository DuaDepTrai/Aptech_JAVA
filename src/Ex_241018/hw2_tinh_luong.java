package Ex_241018;
import java.util.Scanner;

public class hw2_tinh_luong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Khai bao
        String role;
        double k, salary;
        int n;
        
        //Nhap hoc ham, hoc vi, tinh he so
        do {
            System.out.println("Nhap hoc ham, hoc vi cua giang vien (THS, TS, GS): ");
            role = s.nextLine().toUpperCase();
            if (!role.equals("THS") && !role.equals("TS") && !role.equals("GS")) {
                System.out.println("Hoc ham, hoc vi khong hop le, vui long nhap lai! ");
            }
        } while (!role.equals("THS") && !role.equals("TS") && !role.equals("GS"));
        
        if (role.equals("THS")) {
            k = 2.3;
        } else if (role.equals("TS")) {
            k = 2.5;
        } else k = 3;
        
        //Nhap so tiet day
        do {
            System.out.println("Nhap so tiet day (n>0): ");
            n = s.nextInt();
            if (n <= 0) {
                System.out.println("So tiet day khong hop le, vui long nhap lai! ");
            }
        } while (n <= 0);
        
        
        //Tinh luong, hien thi ket qua
        if (n<=250) {
            salary = 50000 * n * k;
        } else if ( 250<n && n<=350) {
            salary = 50000*n*k + 500000;
        } else salary = 50000*350*k + (n-350)*100000;
        
        System.out.printf("Luong cua giang vien: %.0f%n", salary);
        
        s.close();
    }
}
