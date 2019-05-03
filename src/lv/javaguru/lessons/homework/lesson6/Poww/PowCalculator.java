package lv.javaguru.lessons.homework.lesson6.Poww;

public class PowCalculator {
    public int pow(int number, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; ++i)
            result *= number;
        return result;

    }
}
