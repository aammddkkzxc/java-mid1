package lang.immutable.change;

public class ImmutableDateMain {
    public static void main(String[] args) {
        ImmutableDate immutableDate = new ImmutableDate(2024, 7, 23);
        System.out.println(immutableDate);

        ImmutableDate yearChangedDate = immutableDate.withYear(2021);
        System.out.println(yearChangedDate);
        ImmutableDate monthChangedDate = immutableDate.withMonth(12);
        System.out.println(monthChangedDate);
        ImmutableDate dayChangedDate = immutableDate.withDay(7);
        System.out.println(dayChangedDate);
    }
}
