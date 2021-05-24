public class daonguoc {
    void sodaonguoc(int x) {
        String s;
        s = String.valueOf(x);
        char[] c = s.toCharArray();

        char d[] = new char[s.length()];
        for (int i = 0; i <= s.length() - 1; i++) {
            d[i] = c[s.length() - 1 - i];

        }
        System.out.println("Số đảo ngược là: ");
        for (char i : d) {
            System.out.print(i);
        }
    }
}

