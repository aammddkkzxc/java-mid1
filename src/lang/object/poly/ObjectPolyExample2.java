package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};

        count(objects);
    }

    private static void count(Object[] objects) {
        System.out.println("객체 수 : " + objects.length);
    }
}
