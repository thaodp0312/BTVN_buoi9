import java.util.Scanner;

public class hinhtg {
    void hinhtamgiac() {
        int n;
        do {
            System.out.println(" Nhập chiều cao của tam giác height = ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n<=0);
for (int i=1; i<=n;i++){
    for (int j =0;j<(n-i);j++){
        System.out.print(" ");
    }
    for (int k = 0; k<(2*i-1);k++) {
        System.out.print("*");
    }
    System.out.println();
}
    }
}
