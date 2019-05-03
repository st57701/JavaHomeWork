package lv.javaguru.lessons.homework.Lesson8.car;

import java.util.Objects;

public class Truck extends Car {
    private int  maxWeight;

    public Truck(String colour, String model, int maxSpeed, int speed, int maxWeight) {
        super(colour, model, maxSpeed, speed);
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxWeight == truck.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight);
    }
}
