package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class clazz {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
        Class clazz2 = new String().getClass();
        Class clazz3 = Class.forName("java.lang.String");

        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        Method[] methods = clazz2.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println(clazz3.getSuperclass().getName());

        Class[] interfaces = clazz3.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i.getName());
        }
    }
}
