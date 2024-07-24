package lang.string;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
            stringBuilder.append("Hello Java");
        }

        long endTime = System.currentTimeMillis();

        System.out.println(stringBuilder);
        System.out.println(endTime - startTime);
    }
}
