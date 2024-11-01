import java.util.Scanner;

public class ex2_canchi {
    private static final String[] CAN = {
        "Giap", "At", "Binh", "Dinh", "Mau", "Ky",
        "Canh", "Tan", "Nham", "Quy"
    };
    
    private static final String[] CHI = {
        "Ti", "Suu", "Dan", "Mao", "Thin", "Ty",
        "Ngo", "Mui", "Than", "Dau", "Tuat", "Hoi"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam duong lich: ");
        int nam = scanner.nextInt();

        String can = CAN[(nam - 4) % 10];
        String chi = CHI[(nam - 4) % 12];

        System.out.print(nam + " - " + can + " " + chi);

        scanner.close();
    }
}