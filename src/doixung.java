public class doixung {
    boolean sodoixung(int x) {
        String s;
        s = String.valueOf(x);
        char[] c = s.toCharArray();

       int i = 0;
        while (c[i] == c[s.length() - 1 - i]){
            i++;
                return true;
        } return false;

    }
}
