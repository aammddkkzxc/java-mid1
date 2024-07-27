package enumeration.ref1;

public class ClassGrade {
    public static ClassGrade BASIC = new ClassGrade(10);
    public static ClassGrade GOLD = new ClassGrade(20);
    public static ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
