package nested.test;

public class OuterClass4 {
    public void method() {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };

        hello.hello();
    }
}
