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
        return printer;
    }
}
