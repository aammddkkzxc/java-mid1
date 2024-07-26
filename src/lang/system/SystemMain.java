package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentMilliSeconds = System.currentTimeMillis();
        System.out.println(currentMilliSeconds);

        long currentNanoSeconds = System.nanoTime();
        System.out.println(currentNanoSeconds);

        System.out.println(System.getenv());

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        char[] charsOriginal = {'h', 'e', 'l', 'l', 'o'};
        char[] charsCopied = new char[5];
        System.arraycopy(charsOriginal, 0, charsCopied, 0, charsOriginal.length);
        System.out.println(charsCopied);
        System.out.println(Arrays.toString(charsCopied));

        System.exit(0);
        System.out.println("hello");
    }
}
