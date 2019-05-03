package lv.javaguru.lessons.homework.lesson6.car;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    private int currentSpeed;

    public Car(String model, String color, int maxSpeed, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        if (isDriving()) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
            } else {
                System.out.println("It`s maxspeed");
            }
        } else {
            System.out.println("Car is stopped");
        }

    }

    public void slowDown() {
        if (currentSpeed > 0) {
            currentSpeed--;
        } else {
            System.out.println("Speed is  0");
        }

    }

    public boolean isDriving() {
        if (currentSpeed > 0) {
            return true;
        } else
            return false;
    }

    public boolean canAccelerate() {
        if (currentSpeed == maxSpeed) {
            return false;
        } else
            return true;
    }

    public void speedUp() {
        if (canAccelerate()) {
            for (int i = currentSpeed; i <= maxSpeed; i++) {
                accelerate();
            }
        } else {
            System.out.println("it is Max Speed");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
