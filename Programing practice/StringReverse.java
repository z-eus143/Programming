public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("TANMAY MAJI"));
    }
    
    public static String reverseString(String str) {
        char[] c = str.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return new String(c);
    }
}
