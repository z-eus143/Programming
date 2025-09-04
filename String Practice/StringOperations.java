import java.util.*;

public class StringOperations {

    // 1. Convert to lowercase
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // 2. Convert to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // 3. Count vowels, consonants, numbers, special characters
    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, digits = 0, specials = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                digits++;
            else if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else if (Character.isLetter(ch))
                consonants++;
            else
                specials++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants +
                ", Digits: " + digits + ", Special Characters: " + specials);
    }

    // 4. Count spaces
    public static int countSpaces(String str) {
        return (int) str.chars().filter(ch -> ch == ' ').count();
    }

    // 5. Even index uppercase, odd index lowercase
    public static String alternateCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(i % 2 == 0 ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i)));
        }
        return sb.toString();
    }

    // 6. Remove all spaces
    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    // 6. Remove first and last character
    public static String removeFirstLast(String str) {
        return str.length() <= 2 ? "" : str.substring(1, str.length() - 1);
    }

    // 7. Remove vowels
    public static String removeVowels(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    // 8. Trim starting and ending spaces
    public static String trimSpaces(String str) {
        return str.trim();
    }

    // 9. Convert each letter to uppercase
    public static String allUpperCase(String str) {
        return str.toUpperCase();
    }

    // 10. Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 11. Check palindrome
    public static boolean isPalindrome(String str) {
        String rev = reverseString(str);
        return str.equals(rev);
    }

    // 12. Count words
    public static int countWords(String str) {
        return str.trim().split("\\s+").length;
    }

    // 13. Remove all occurrences of a character
    public static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    // 14. Remove first occurrence of a character
    public static String removeFirstOccurrence(String str, char ch) {
        return str.replaceFirst(String.valueOf(ch), "");
    }

    // 15. Replace character
    public static String replaceChar(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    // 16. Add character at index
    public static String addCharAt(String str, char ch, int index) {
        return str.substring(0, index) + ch + str.substring(index);
    }

    // 17. Reverse each word
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        return sb.toString().trim();
    }

    // 18. Check string equality
    public static void checkEquality(String s1, String s2) {
        System.out.println("Using equals(): " + s1.equals(s2));
        System.out.println("Using equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
        System.out.println("Using compareTo(): " + (s1.compareTo(s2) == 0));
    }

    // 19. Remove duplicate characters
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : str.toCharArray())
            seen.add(ch);
        StringBuilder sb = new StringBuilder();
        for (char ch : seen)
            sb.append(ch);
        return sb.toString();
    }

    // 20. Print duplicate words
    public static void printDuplicateWords(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("Duplicate word: " + entry.getKey());
        }
    }

    // 21. Check anagram
    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    // 22. Check pangram
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1)
                return false;
        }
        return true;
    }

    // 23. Remove odd index characters
    public static String removeOddIndexChars(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    // 24. Remove substring (exact match)
    public static String removeSubstring(String str, String toRemove) {
        return str.replace(toRemove, "");
    }

    // 25. Remove characters from string
    public static String removeChars(String str, String toRemove) {
        for (char ch : toRemove.toCharArray()) {
            str = str.replace(String.valueOf(ch), "");
        }
        return str;
    }

    // 26. Longest and shortest word
    public static void printLongestShortestWord(String str) {
        String[] words = str.trim().split("\\s+");
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length())
                shortest = word;
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Shortest: " + shortest + ", Longest: " + longest);
    }

    public static void main(String[] args) {
        // You can test each method here
        String input = "Hello World! 123";
        System.out.println("Lowercase: " + toLowerCase(input));
        System.out.println("Uppercase: " + toUpperCase(input));
        countCharacters(input);
        System.out.println("Spaces: " + countSpaces(input));
        System.out.println("Alternate Case: " + alternateCase(input));
        System.out.println("No Spaces: " + removeSpaces(input));
        System.out.println("Trimmed: " + trimSpaces("   Hello   "));
        System.out.println("Reversed: " + reverseString("hello"));
        System.out.println("Is Palindrome: " + isPalindrome("madam"));
        System.out.println("Word Count: " + countWords("Java is awesome"));
        System.out.println("Remove 'l': " + removeChar("hello", 'l'));
        System.out.println("Remove First 'l': " + removeFirstOccurrence("hello", 'l'));
        System.out.println("Replace 'l' with 'x': " + replaceChar("hello", 'l', 'x'));
        System.out.println("Add 'Z' at 2: " + addCharAt("hello", 'Z', 2));
        System.out.println("Reverse Each Word: " + reverseEachWord("Java is fun"));
        checkEquality("Java", "java");
        System.out.println("Remove Duplicates: " + removeDuplicates("programming"));
        printDuplicateWords("Java is fun and Java is powerful");
        System.out.println("Is Anagram: " + isAnagram("listen", "silent"));
        System.out.println("Is Pangram: " + isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println("Remove Odd Index: " + removeOddIndexChars("abcdef"));
        System.out.println("Remove Substring: " + removeSubstring("hello", "he"));
        System.out.println("Remove Chars: " + removeChars("hello", "eh"));
        printLongestShortestWord("Java is a powerful programming language");
    }
}