package lv.javaguru.lessons.homework;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstRandomNumber = randomGenerator.nextInt(100);
        int secondRandomNumber = randomGenerator.nextInt(100);
        int thirdRandomNumber = randomGenerator.nextInt(100);
        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);
        int result = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println("Sum of Random Numbers = " + result);

    }
}



