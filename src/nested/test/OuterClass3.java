package nested.test;

public class OuterClass3 {
    public void method() {
        class LocalClass {
           public void hello() {
               System.out.println("hello");
           }
        }

        LocalClass inner = new LocalClass();
        inner.hello();
    }
}
