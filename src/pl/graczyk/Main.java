package pl.graczyk;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random random = new Random();

    for (int i=0; i < 200000; i++) {
        long number = random.nextLong();
        System.out.println(number);
    }
    }
}
