import java.util.*;
import java.util.stream.*;

public class ArrayAlternateJava8 {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 5, 2, 9, 18, 32, 1 };
        Arrays.sort(arr);

        int n = arr.length;
        int[] result = IntStream.range(0, n)
                .map(i -> (i % 2 == 0) ? arr[i / 2] : arr[n - 1 - i / 2])
                .toArray();

        System.out.println(Arrays.toString(result));

        String[] nameArrStrings = { "Alice", "Bob", "Charlie", "David" };
        List<String> nameList = Arrays.asList(nameArrStrings);
        nameList.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
