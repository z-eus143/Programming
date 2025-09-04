public class CycleSort {
    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n - 1; start++) {
            int item = arr[start];
            int pos = start;

            // Find position where we put the element
            for (int i = start + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            // If item is already in correct position
            if (pos == start)
                continue;

            // Skip duplicate elements
            while (item == arr[pos]) {
                pos++;
            }

            // Swap
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            // Rotate rest of the cycle
            while (pos != start) {
                pos = start;
                for (int i = start + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                // Swap
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 8, 3, 1, 5, 4, 2, 12, 53 };
        cycleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
