package nested.local;

public class LocalOuterV3 {
    private int outerInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 2;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outerInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        // localVar = 10; // 컴파일 오류
        // paramVar = 20; // 컴파일 오류
        return printer;
    }
}
