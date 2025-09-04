public class StringUND {
    
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); // true, same reference in string pool
        System.out.println(s1.equals(s2)); // true, same content
        String s3 = new String("hello");
        System.out.println(s1 == s3); // false, different reference
        System.out.println(s1.equals(s3)); // true, same content
        String s4 = s3.intern();
        System.out.println(s1 == s4); // true, same reference in string pool
    }
}
