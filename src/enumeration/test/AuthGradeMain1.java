package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for(AuthGrade authGrade : authGrades) {
            System.out.println(authGrade.name() + " " + authGrade.getLevel() + " " + authGrade.getDescription());
        }
    }
}
