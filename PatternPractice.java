public class PatternPractice {
    public static void main(String[] args) {
        p1(6);
    }

    public static void p1(int n) {
        System.out.println("");
        int num = 1;
        int xdiff = n;
        for (int i = 1; i <= n; i++) {
            int temp = num;
            int ydiff = xdiff;
            for (int j = 1; j <= n; j++) {
                if (i >= 1 && i >= j) {
                    System.out.print(" " + temp + " ");
                    temp -= ydiff++;
                }
            }
            System.out.println("");
            num += xdiff--;
        }
    }
}
