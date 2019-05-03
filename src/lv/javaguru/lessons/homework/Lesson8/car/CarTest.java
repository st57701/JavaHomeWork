package lv.javaguru.lessons.homework.Lesson8.car;

public class CarTest {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Green", "Mercedes", 90, 40, 36);
        System.out.println(bus1);
        bus1.comeInPassenger();
        bus1.speedUp();
        System.out.println(bus1);

        Truck truck1 = new Truck("Yellow","Scania",100,60,2000);
        System.out.println(truck1);

        FamilyCar family1= new FamilyCar("black","audi",240,100,"Sedan");
        family1.speedDown();
        System.out.println(family1);

    }

}
