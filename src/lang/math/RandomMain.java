package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random rand = new Random();
        //Random rand2 = new Random(1);

        int randomInt = rand.nextInt();
        System.out.println(randomInt);
        int randomInt2 = rand.nextInt(100);
        System.out.println(randomInt2);

        double randomDouble = rand.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = rand.nextBoolean();
        System.out.println(randomBoolean);

        int randomRange1 = rand.nextInt(10) + 1;
        System.out.println(randomRange1);
    }
}
