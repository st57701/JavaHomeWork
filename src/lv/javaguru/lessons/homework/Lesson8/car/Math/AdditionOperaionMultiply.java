package lv.javaguru.lessons.homework.Lesson8.car.Math;

public class AdditionOperaionMultiply implements MathOperation {

    public double execute(double firstNumber, double secondNumber) {
        double mult = firstNumber * secondNumber;
        System.out.print("Multiply = ");

        return mult;
    }
}
