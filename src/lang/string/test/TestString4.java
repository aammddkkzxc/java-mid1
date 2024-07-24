package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0, 5);
        String filePath = str.substring(5);

        System.out.println(fileName);
        System.out.println(filePath);
    }
}
