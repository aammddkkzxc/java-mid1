package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV1 one = new MemberV1("one", address);
        MemberV1 two = new MemberV1("two", address);

        System.out.println(one);
        System.out.println(two);

        two.setImmutableAddress(new ImmutableAddress("부산"));
        System.out.println(one);
        System.out.println(two);
    }
}
