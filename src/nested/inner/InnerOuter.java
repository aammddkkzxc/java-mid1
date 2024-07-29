package nested.inner;

public class InnerOuter {
    private static final int outClassValue = 1;
    private final int outInstanceValue = 1;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);
            System.out.println(outInstanceValue);
            System.out.println(InnerOuter.outClassValue);
        }
    }
}
