import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPractice1 {
    public static void main(String[] args) {
        // System.out.println(stringUnique("ABCDEF"));
        System.out.println(shiftOne(shiftOne("abcdef")));
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        // reverseFirstHalf(arr);
    }

    public static boolean stringUnique(String str) {
        Set<Character> s = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (s.contains(c)) {
                return false;
            } else {
                s.add(c);
            }
        }
        return true;
    }

    public static String shiftOne(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.substring(1) + str.charAt(0);
    }

    public static void reverseFirstHalf(int[] arr) {
        int i = 0;
        int j = arr.length / 2 - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
