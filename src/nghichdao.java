import java.util.Scanner;

public class nghichdao {
    double tongnghichdao(int x) {
        double tong =0;
       for (int i=1;i<=x;i++){
            tong = tong + 1/(double)i;
        }
       return tong;
    }
}
