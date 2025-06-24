import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String[] str = new String[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter the Sting No : " + (i + 1) + " ");
                str[i] = s.nextLine();
                System.out.println();
            }
            for (String strnew : str) {
                System.out.print(strnew + " ");
            }
        }
    }
}