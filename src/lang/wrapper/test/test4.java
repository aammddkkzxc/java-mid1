package lang.wrapper.test;

public class test4 {
    public static void main(String[] args) {
        String str = "100";
        Integer strToInteger = Integer.valueOf(str);
        System.out.println(strToInteger);

        int IntegerToInt = strToInteger;
        System.out.println(IntegerToInt);

        Integer intToInteger = IntegerToInt;
        System.out.println(intToInteger);
    }
}
