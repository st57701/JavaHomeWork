package lv.javaguru.lessons.homework.lesson4;


public class StockTest {
    public static void main(String[] args) {

        StockTest stock1 = new StockTest();

        stock1.checkStockTest();
    }

    public void checkStockTest() {
        Stock checkSt = new Stock("IBM", 150);
        checkSt.updatePrice(150.37);
        checkSt.updatePrice(149.82);
        checkSt.updatePrice(150.12);
        checkSt.updatePrice(232);
        checkSt.printInformation();
        double expectedMax = 150.37;
        double expectedMin = 149.82;
        double expectedCurrentValue = 150.12;
        double actualMax = checkSt.getMax();
        double actualMin = checkSt.getMin();
        double actualCurrentValue = checkSt.currentValue;
        if (expectedMax == actualMax && expectedMin == actualMin && expectedCurrentValue == actualCurrentValue) {
            System.out.println("Stock Test : SUCCESS");
        } else {

            System.out.println("Stock Test : FAIL!" + "\nActual : ");
            checkSt.printInformation();
        }
    }
}
