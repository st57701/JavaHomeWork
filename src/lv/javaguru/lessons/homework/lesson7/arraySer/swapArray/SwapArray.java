package lv.javaguru.lessons.homework.lesson7.arraySer.swapArray;

import javax.sound.midi.SysexMessage;
import java.sql.Array;

public class SwapArray {


    public void swapArr(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }

    public void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }

            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;

            }
            System.out.println(array[i]);
        }


    }
}


