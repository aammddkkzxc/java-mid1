package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(10);
        int int1 = integer.intValue();

        Long long1 = Long.valueOf(10L);
        long long2 = long1.longValue();

        int compareInteger = integer.compareTo(int1);
        System.out.println(compareInteger);
    }
}
