package lv.javaguru.lessons.homework.lesson7.arraySer.copyarray;

import java.util.Random;
import java.util.Scanner;

public class ArrayFunctions {
    private int count = 0;
    private int indexSecondArray = 0;
    private int firstNumberD;
    private int secondNumberD;


    static void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
    }

    void fillArrayWithRandomNumbers(int[] array, int maxRange) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxRange);
        }
    }

    public int[] fillTheSecondArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= firstNumberD && array[i] <= secondNumberD) {
                count++;

            }
        }
        int[] secondArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= firstNumberD && array[i] <= secondNumberD) {
                secondArray[indexSecondArray] = array[i];
                indexSecondArray++;
            }

        }
        return secondArray;
    }


    public void typeNumberFrames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type number of down bound");
        firstNumberD = sc.nextInt();
        System.out.println("Please type number of up bound");
        secondNumberD = sc.nextInt();

    }
}
