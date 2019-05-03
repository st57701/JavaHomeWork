package lv.javaguru.lessons.homework.Lesson8.car.Math;

public class MathOperationsTest {
    public static void main(String[] args) {
        AdditionOperaionMultiply multi = new AdditionOperaionMultiply();
        AdditionOperation suma = new AdditionOperation();
        AdditionOperationDivide div = new AdditionOperationDivide();
        AdditionOperationMinus minus = new AdditionOperationMinus();

        MathOperation[] operations = {multi, suma, div, minus};

        MathOperations test1 = new MathOperations();

        test1.executeAll(operations, 4, 5);


    }
}
