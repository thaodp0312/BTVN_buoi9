public class amdau {
    int soamdau(int[] mang) {
        int n = mang.length;
        int i = 0;
        int am;
        while ((i < n) && (mang[i] >= 0)) {
            i++;
        }
        if (i == n) {
            am = -1;
        } else {
            am = mang[i];
        }
        return (am);

    }}


