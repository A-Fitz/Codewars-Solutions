public class Line {
    public static String WhoIsNext(String[] names, int n) {
        int x = 1;
        if (n <= 5)
            return names[n - 1];
        else {
            while (x * 5 < n) {
                n -= x * 5;
                x *= 2;
            }
            return names[(n - 1) / x];
        }
    }
}