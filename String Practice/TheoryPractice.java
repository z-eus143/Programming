import java.util.Arrays;

public class TheoryPractice {

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5 };
        int[] arr2 = { 2, 7, 11, 4, 5 };
        
        int[] combined = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);
        System.out.println(Arrays.toString(combined));
    }
}