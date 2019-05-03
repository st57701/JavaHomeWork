package lv.javaguru.lessons.homework.lesson7.arraySer.copyarray;



public class CopyArrayTest {
    public static void main(String[] args) {

        ArrayFunctions victim = new ArrayFunctions();
        int[] firstArray = new int[10];
        victim.fillArrayWithRandomNumbers(firstArray, 100);
        victim.printArrayToConsole(firstArray);
        victim.typeNumberFrames();
        int[] secondArray = victim.fillTheSecondArray(firstArray);
        System.out.println("The first Array :");
        victim.printArrayToConsole(firstArray);
        System.out.println("The second Array : ");
        victim.printArrayToConsole(secondArray);

    }
}
