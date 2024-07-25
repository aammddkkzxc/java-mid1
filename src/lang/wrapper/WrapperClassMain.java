package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        Integer integer1 = Integer.valueOf(100);
        int int1 = integer1.intValue();
        int int2 = integer1;

        Long long1 = Long.valueOf(100);
        long long2 = long1.longValue();
        Long long3 = long2;

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(int1);
        System.out.println(int2);

        System.out.println(long1);
        System.out.println(long2);
        System.out.println(long3);
    }
}
