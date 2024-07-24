package lang.immutable.string;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");

        System.out.println(stringBuilder);

        stringBuilder.insert(4, "Java");
        System.out.println(stringBuilder);

        stringBuilder.delete(4,8);
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String sbString = stringBuilder.toString();
        System.out.println(sbString);
    }
}
