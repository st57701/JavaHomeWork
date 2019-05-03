package lv.javaguru.lessons.homework.Lesson8.car.Math;

public class AdditionOperationDivide implements MathOperation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        double div = firstNumber / secondNumber;
        System.out.print("Divide = ");

        return div;
    }
}
