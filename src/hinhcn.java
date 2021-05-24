import java.util.Scanner;

public class hinhcn {
    void vehinhcn (){
        int h,w;
        do {
            System.out.println("Nhập kích thước hình chữ nhật:");
            System.out.print("Height = ");
            Scanner sc = new Scanner(System.in);
             h = sc.nextInt();
            System.out.print("Width = ");
            Scanner sc2 = new Scanner(System.in);
             w = sc2.nextInt();

        } while ((h<= 0)||(w<=0));
        for (int i = 0;i<h;i++){
            for (int j=0;j<w;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
