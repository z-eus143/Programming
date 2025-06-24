import java.util.Stack;

public class NextGreater {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        nextGreaterElement(arr);
    }

    public static void nextGreaterElement(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --> " + res[i]);
        }
    }
}
