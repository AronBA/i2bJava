package W06;

import java.util.Random;

public class Übung7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]randomzahlen = new int[10];
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100) + 1;
            randomzahlen[i] += randomInt;
            System.out.print(randomzahlen[i]+ " ");
        }
    }
}
