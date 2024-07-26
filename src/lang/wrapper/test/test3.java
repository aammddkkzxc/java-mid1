package lang.wrapper.test;

public class test3 {
    public static void main(String[] args) {
        String str = "100";
        Integer strToInteger = Integer.valueOf(str);
        System.out.println(strToInteger);

        int IntegerToInt = strToInteger.intValue();
        System.out.println(IntegerToInt);

        Integer intToInteger = Integer.valueOf(IntegerToInt);
        System.out.println(intToInteger);
    }
}
