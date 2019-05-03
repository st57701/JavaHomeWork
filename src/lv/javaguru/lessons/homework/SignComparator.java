package lv.javaguru.lessons.homework;

public class SignComparator {
    public int compare(int number) {
        if (number > 0) {
            System.out.printf(number + " Number is Positive");
            return number;

        } else if (number == 0) {
            System.out.printf(number + " Number is equal to zero");
            return number;
        } else {
            System.out.println(number + " Number is negative");
            return number;

        }
    }
}
