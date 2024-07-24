package lang.string;

public class StringInfoMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";

        System.out.println(str1.length());
        System.out.println(str1.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(str1.isBlank());
        System.out.println("       ".isBlank());
        System.out.println(str1.charAt(7));
    }
}
