package lv.javaguru.lessons.homework.Lesson8.car;

import java.util.Objects;

public class Car {
    protected String colour;
    protected String model;
    protected int maxSpeed;
    protected int speed;

    public Car(String colour, String model, int maxSpeed, int speed) {
        this.colour = colour;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }
    public void speedUp(){
        if(speed <= maxSpeed){
            speed++;
        }else{
            System.out.println("Speed is maximum");
        }
    }
    public void speedDown(){
        if(speed > 0){
            speed--;
        }else{
            System.out.println("is stopped");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                speed == car.speed &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, model, maxSpeed, speed);
    }
}
