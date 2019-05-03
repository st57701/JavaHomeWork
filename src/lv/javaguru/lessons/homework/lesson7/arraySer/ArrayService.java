package lv.javaguru.lessons.homework.lesson7.arraySer;

import java.util.Random;

public class ArrayService {
    public int[] creat(int n) {
        int[] arrayFirst = new int[n];
        return arrayFirst;
    }

    static void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }


    void fillArrayWithRandomNumbers(int[] array, int maxRange) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxRange);
        }
    }

    int sumNumber(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
