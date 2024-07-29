package nested.inner;

public class InnerMain {
    public static void main(String[] args) {
        InnerOuter innerOuter1 = new InnerOuter();
        InnerOuter.Inner inner1 = innerOuter1.new Inner();

        InnerOuter innerOuter2 = new InnerOuter();
        InnerOuter.Inner inner2 = innerOuter2.new Inner();

        inner1.print();
        inner2.print();
        System.out.println(inner1.getClass());
        System.out.println(inner2.getClass());
    }
}
