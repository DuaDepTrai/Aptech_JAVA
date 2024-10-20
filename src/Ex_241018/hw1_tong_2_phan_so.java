package Ex_241018;
import java.util.Scanner;

public class hw1_tong_2_phan_so {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Nhap gia tri tu so & mau so cua 2 phan so
        System.out.println("Nhap tu so va mau so phan so thu nhat (MS khac 0): ");
        int ts1 = s.nextInt();
        int ms1 = s.nextInt();
        
        System.out.println("Nhap tu so va mau so phan so thu hai (MS khac 0): ");
        int ts2 = s.nextInt();
        int ms2 = s.nextInt();
        
        //Tinh mau so chung va tong hai phan so
        int msc = ms1 * ms2;
        int tsc = ts1 * ms2 + ts2 * ms1;
        
        //Tim UCLN cua tu so va mau so
        int ttsc = Math.abs(tsc);
        int tmsc = Math.abs(msc);
        int ucln = ttsc;
        
        while (ttsc % ucln != 0 || tmsc % ucln !=0) ucln--;
        
        //Rut gon phan so va hien thi ket qua
        if (msc < 0) {
            tsc = -tsc;
            msc = -msc;
        }
        
        System.out.print("Tong hai phan so la: " + ts1 + "/" + ms1 + " + " + ts2 + "/" + ms2 + " = ");
        if (tmsc == ucln) {
            System.out.println (tsc / msc);
        } else System.out.println(tsc/ucln + "/" + msc/ucln);
        
        s.close();
    }
}
