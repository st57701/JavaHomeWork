package lv.javaguru.lessons.homework.Lesson8.car.Math;

public class MathOperations {
    public void executeAll(MathOperation[] array, double firstNumber, double secondNumber) {
        System.out.println("Operations with numbers " + firstNumber + " and " + secondNumber);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i].execute(firstNumber, secondNumber));
        }

    }
}

