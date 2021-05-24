import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương n = ");
            n = sc.nextInt();
        } while (n <= 0);
        mu2 m2= new mu2();
        System.out.println("Tổng mũ 2 là: "+m2.tongmu2(n));
        nghichdao nd = new nghichdao();
        System.out.println("Tong nghich đảo là:" + nd.tongnghichdao(n));
        tongnghichdaolechan lc = new tongnghichdaolechan();
        System.out.println("Tong nghich đảo lẻ chẵn là:" + lc.tonglechan(n));
        daonguoc dn = new daonguoc();
        dn.sodaonguoc(n);
        doixung dx = new doixung();
        System.out.println();
        if (dx.sodoixung(n)){
            System.out.println("Là số đối xứng");
        }else {
        System.out.println("Không phải là số đối xứng");
    }
        System.out.print("Nhập kích thước mảng số nguyên ");
        Scanner sc2 = new Scanner(System.in);
        int z = sc2.nextInt();
        int m[] = new int[z];
        for (int i = 0; i < z; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1)+" ");
            m[i] = sc.nextInt();
        }
        System.out.println("Mảng nhập vào là: ");
        for (int x : m) {
            System.out.print(x+"\t");
        }
        System.out.println();
        chancuoi cc= new chancuoi();
        cc.sochancuoi(m);
        amdau ad= new amdau();
        System.out.println("Số âm đầu tiên là: "+ad.soamdau(m));
        hinhtg tg= new hinhtg();
        tg.hinhtamgiac();
        hinhcn cn =new hinhcn();
        cn.vehinhcn();
}
}
