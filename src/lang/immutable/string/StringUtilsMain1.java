package lang.immutable.string;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean flag = true;
        Object obj = new Object();
        String str = "Hello World";

        String numStr = String.valueOf(num);
        System.out.println(numStr);
        String flagStr = String.valueOf(flag);
        System.out.println(flagStr);
        String objStr = String.valueOf(obj);
        System.out.println(objStr);

        char[] chars = str.toCharArray();
        System.out.println(chars);

        String numString2 = "" + num;
        System.out.println(numString2);
    }
}
