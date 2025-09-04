import java.util.Arrays;

public class ConvertToLoweToUpper {
    
    public static void main(String[] args) {
        String str = "Tanmay@#112";
        System.out.println(toLower(str));
        System.out.println(toUpper(str));
        System.out.println(Arrays.toString(countString(str)));
        System.out.println(spaceCount("12345"));
    }
    
    public static String toLower(String str) {
        char[] cArr = str.toCharArray();
        String result = "";
        for (char c : cArr) {
            if (c >= 65 && c <= 90) {
                result = result + (char) (c + 32);
            } else {
                result = result + c;
            }
        }
        return result;
    }
    
    public static String toUpper(String str) {
        char[] cArr = str.toCharArray();
        String result = "";
        for (char c : cArr) {
            if (c >= 97 && c <= 122) {
                result = result + (char) (c - 32);
            } else {
                result = result + c;
            }
        }
        return result;
    }

    public static int[] countString(String str) {
        int vowal = 0;
        int consonent = 0;
        int specialCharacter = 0;
        int number = 0;
        char[] cArr = str.toCharArray();
        for (char c : cArr) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                vowal++;
            } else if (c >= 48 && c <= 57) {
                number++;
            } else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*') {
                specialCharacter++;
            } else {
                consonent++;
            }
        }
        return new int[] { vowal, consonent, specialCharacter, number };
    }

    public static int spaceCount(String str) {
        char[] cArr = str.toCharArray();
        int spaceCount = 0;
        for (char c : cArr) {
            if (c == '\s') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}
