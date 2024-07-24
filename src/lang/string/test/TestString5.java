package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String fileName = "hello.txt";
        String ext = ".txt";

        int index = fileName.indexOf(ext);
        String name = fileName.substring(0, index);
        String path = fileName.substring(index);
        System.out.println(name);
        System.out.println(path);
    }
}
