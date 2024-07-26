package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime = System.currentTimeMillis();

        long sumPrimitive = 0;

        for (int i = 0; i < iterations; i++) {
            sumPrimitive+=i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long startTime2 = System.currentTimeMillis();

        Long sumPrimitive2 = 0L;
        for (int i = 0; i < iterations; i++) {
            sumPrimitive2+=i;
        }

        long endTime2 = System.currentTimeMillis();

        System.out.println(endTime2 - startTime2);
    }
}
