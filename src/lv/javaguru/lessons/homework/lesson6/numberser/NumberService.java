package lv.javaguru.lessons.homework.lesson6.numberser;

public class NumberService {
    int sum = 0;
    int evenCounter = 0;

    public int sumInRange(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                sum += i;

            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public int getEvenNumberCount(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                if (i % 2 == 0) {
                    evenCounter++;
                }
            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                if (i % 2 == 0) {
                    evenCounter++;
                }
            }
        }
        return evenCounter;

    }
}
