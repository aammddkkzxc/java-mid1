package lang.string;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(isSame(str1, str2));

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(isSame(str3, str4));
    }

    private static boolean isSame(String str1, String str2) {
        return str1 == str2;
    }

}
