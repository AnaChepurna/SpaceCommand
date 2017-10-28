package utils;

import java.util.Random;

public abstract class RandomHelper {
    private static Random random = new Random();

    public static int nextInt(int x) {
        return random.nextInt(x);
    }

    public static Random getRandom() {
        return random;
    }
}
