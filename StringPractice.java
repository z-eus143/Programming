import java.util.LinkedHashMap;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println(reverse("TANMAY MAJI"));

        greatestWord("Jai Hind Dosto");

        frequencyOfCharacter("aabbccddeeffgg");

        removeExtraSpace("Tanmay      Nantu        Maji");

    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void greatestWord(String str) {
        int count = 0;
        String result = "";
        String[] newStr = str.split(" ");
        for (String s : newStr) {
            if (s.length() > count) {
                count = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }

    public static void frequencyOfCharacter(String str) {
        LinkedHashMap<Character, Integer> data = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            data.put(str.charAt(i), charCount(str, str.charAt(i)));
        }
        System.out.println(data);
    }

    public static Integer charCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void removeExtraSpace(String str) {
        String trimmed = trim(str);
        String result = "";
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) == ' ' && trimmed.charAt(i + 1) == ' ') {

            } else {
                result = result + trimmed.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static String trim(String str) {
        int firstchar = 0;
        int lastchar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                firstchar = i;
                break;
            }
        }
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ') {
                lastchar = i;
                break;
            }
        }
        return str.substring(firstchar, lastchar + 1);
    }
}
