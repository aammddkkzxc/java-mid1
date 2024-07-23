package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(1);
        ImmutableObj immutableObj1 = immutableObj.add(3);

        System.out.println(immutableObj.getValue());
        System.out.println(immutableObj1.getValue());
    }
}
