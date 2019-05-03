package lv.javaguru.lessons.homework;

public class Product {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double regularPrice;

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice() {

        return regularPrice - (regularPrice / 100 * discount);

    }

    void printInformation() {
        System.out.println("Product= " + getName() + "\nRegular price= " + getRegularPrice() + "\nDiscount= " + getDiscount() + "%\n" + "Price with discount= " + calculateActualPrice());
    }

}
