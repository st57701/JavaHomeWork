package lv.javaguru.lessons.homework.lesson7.arraySer;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayService firstArray = new ArrayService();
        int numbersArray[] = firstArray.creat(10);

        firstArray.fillArrayWithRandomNumbers(numbersArray, 101);
        int sum = firstArray.sumNumber(numbersArray);
        firstArray.printArrayToConsole(numbersArray);
        System.out.println("Sum of array elements : " + sum);
    }
}

