package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] grades = Grade.values();
        System.out.println(Arrays.toString(grades));
        for (Grade grade : grades) {
            System.out.println("name : " + grade.name() + "ordinal: " + grade.ordinal());
        }

        String input = "GOLD";
        Grade goldGrade = Grade.valueOf(input);
        System.out.println(goldGrade.name());
        System.out.println(goldGrade.toString());
    }
}
