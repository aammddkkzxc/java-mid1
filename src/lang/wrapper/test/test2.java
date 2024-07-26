package lang.wrapper.test;

public class test2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double result = 0.0;

        for (int i = 0; i < array.length; i++) {
            result += Double.parseDouble(array[i]);
        }

        System.out.println(result);
    }
}
