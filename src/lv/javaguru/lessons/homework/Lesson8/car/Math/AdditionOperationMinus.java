package lv.javaguru.lessons.homework.Lesson8.car.Math;

public class AdditionOperationMinus implements MathOperation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        double diff = firstNumber - secondNumber;
        System.out.print("Minus = ");

        return diff;
    }
}
