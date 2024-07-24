package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int start;
        int cnt = 0;

        while (str.contains(key)) {
            start = str.indexOf(key);
            cnt ++;
            str = str.substring(start + key.length());
        }

        System.out.println(cnt);
    }
}
