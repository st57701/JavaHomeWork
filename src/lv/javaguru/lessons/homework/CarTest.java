package lv.javaguru.lessons.homework;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColour("green");
        car1.setManufacturer("Germany");
        car1.setYear(1981);
        System.out.println(" Colour " + car1.getColour() + "\n Country " + car1.getManufacturer() + "\n Year " + car1.getYear());
    }
}
