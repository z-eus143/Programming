import java.util.Arrays;

public class ArrayAlternate {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 5, 2, 9, 18, 32, 1 };
        Arrays.sort(arr); // sort ascending

        int[] resultArr = new int[arr.length];
        int left = 0, right = arr.length - 1, k = 0;

        while (left <= right) {
            if (left == right) {
                // when only one element remains (odd length case)
                resultArr[k++] = arr[left];
            } else {
                resultArr[k++] = arr[left++];
                resultArr[k++] = arr[right--];
            }
        }

        System.out.println(Arrays.toString(resultArr));
    }
}
