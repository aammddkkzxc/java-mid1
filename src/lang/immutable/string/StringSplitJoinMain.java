package lang.immutable.string;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] strings = str.split(",");
        for (String string : strings) {
            System.out.println(string);
        }

        String joinString = String.join("-", "Apple", "Banana", "Orange");
        System.out.println(joinString);
        System.out.println(String.join("-", strings));
    }

}
