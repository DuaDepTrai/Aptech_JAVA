import java.util.Scanner;

public class ex1_ptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị a và b từ bàn phím
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        // Kiểm tra và giải phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }

        scanner.close();
    }
}
