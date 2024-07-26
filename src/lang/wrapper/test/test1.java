package lang.wrapper.test;

public class test1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int str1ToInt = Integer.parseInt(str1);
        int str2ToInt = Integer.parseInt(str2);

        Integer str1ToInteger = Integer.valueOf(str1);
        Integer str2ToInteger = Integer.valueOf(str2);

        System.out.println(str1ToInt + str2ToInt);
        System.out.println(str1ToInteger + str2ToInteger);
    }
}
