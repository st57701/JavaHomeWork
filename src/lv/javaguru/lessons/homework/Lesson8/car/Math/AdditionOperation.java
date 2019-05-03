package lv.javaguru.lessons.homework.Lesson8.car.Math;

public class AdditionOperation implements MathOperation {

    public double execute(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        System.out.print("Sum = ");

        return sum;
    }


}
