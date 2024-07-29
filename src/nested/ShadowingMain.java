package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        public void print() {
            int value = 3;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(ShadowingMain.this.value);
        }
    }
}
