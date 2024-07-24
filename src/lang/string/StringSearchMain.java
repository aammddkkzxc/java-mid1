package lang.string;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World";

        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf("Java", 10));
        System.out.println(str.lastIndexOf("Java"));
    }
}
