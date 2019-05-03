package lv.javaguru.lessons.homework.lesson6;

public class PrimeNumbers {
    //2, 3, 5, 7, 11, 13, 17, 19, 23
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        boolean isPrime;

        CheckNumber test = new CheckNumber();
        for (int num = 2; num < 500; num++) {
            if (counter == 50) {
                break;
            }

            isPrime = test.checkM(num);
            if (isPrime) {
                if (num == 17 || num == 71) {
                    //counter++;
                    continue;

                } else {
                    sum += num;
                    counter++;

                }


            }
        }

        System.out.println(sum);
        System.out.println(counter);


    }
}