package lv.javaguru.lessons.homework;

public class ProductTest {
    public static void main(String[] args) {
        Product firstProduct = new Product();
        firstProduct.setName("milk");
        firstProduct.setRegularPrice(0.8);
        firstProduct.setDiscount(20);
        firstProduct.printInformation();
    }
}
