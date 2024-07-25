package lang.wrapper;

public class MyIntegerMethodMain2 {
    public static void main(String[] args) {
        MyInteger[] ints = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(ints, -1));
        System.out.println(findValue(ints, 0));
        System.out.println(findValue(ints, 1));
        System.out.println(findValue(ints, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
