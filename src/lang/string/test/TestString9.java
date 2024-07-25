package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] name = email.split("@");
        System.out.println(name[0]);
        System.out.println(name[1]);
    }
}
