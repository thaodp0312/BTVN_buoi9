public class tongnghichdaolechan {
    double tonglechan(int x){
        double tong =0;
        for (int i=1;i<=x;i++){
            tong = tong + (2*(double)x+1)/(2*(double)x+2);
        }
        return tong;
    }

}
