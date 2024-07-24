package lang.string;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean flag = true;
        String str = "Hello World";

        String format1 = String.format("num : %d, bool : %b, str : %s", num, flag, str);
        System.out.println(format1);

        String format2 = String.format("숫자 : %2f", 10.22115);
        System.out.println(format2);

        System.out.printf("숫자 : %2f\n", 10.22115);

        String regex = "Hello (Java|World)";

        System.out.println(str.matches(regex));

    }
}
