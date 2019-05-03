package lv.javaguru.lessons.homework.lesson6.car;

public class CarTest {
    public static void main(String[] args) {
        CarTest runningTest = new CarTest();
        runningTest.checkAccelerate();
        /*Car car1 = new Car("Ford", "Blue", 100, 50);
        car1.accelerate();

        System.out.println(car1);
        car1.speedUp();
        System.out.println(car1);
        car1.speedUp();
        car1.accelerate();
        System.out.println(car1);

        car1.slowDown();
        System.out.println(car1);
*/
    }
    public void checkAccelerate( ){
        Car testCar = new Car("Ford", "Blue", 100, 50);
        int expectedSpeed = 52;
        testCar.accelerate();
        int acctualSpeed  = testCar.getCurrentSpeed();
        if(expectedSpeed== acctualSpeed){
            System.out.println("Test working correct Accelerate");
        }else{
            System.out.println("Acceslerate is not working correct " + acctualSpeed + " is not "+ expectedSpeed);
        }
    }
}
