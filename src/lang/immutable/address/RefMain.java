package lang.immutable.address;

public class RefMain {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        a.setName("부산");


        System.out.println(a);
        System.out.println(b);

        change(a, "강원");
        System.out.println(a);
        System.out.println(b);
    }

    private static void change(Address address, String name) {
        address.setName(name);
    }
}
