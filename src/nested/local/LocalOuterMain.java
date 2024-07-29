package nested.local;

import java.lang.reflect.Field;

public class LocalOuterMain {
    public static void main(String[] args) {
        LocalOuterV3 local = new LocalOuterV3();
        Printer printer = local.process(3);
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
