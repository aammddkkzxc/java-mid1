package enumeration.ref3;

public class GradeMain3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            calculate(grade, price);
        }
    }

    private static void calculate(Grade grade, int price) {
        System.out.println(grade.discount(price));
    }
}
