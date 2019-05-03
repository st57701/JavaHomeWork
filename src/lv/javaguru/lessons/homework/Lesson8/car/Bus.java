package lv.javaguru.lessons.homework.Lesson8.car;

import java.util.Objects;

public class Bus extends Car {
    private int countOfPassengers;

    public Bus(String colour, String model, int maxSpeed, int speed, int countOfPassengers) {
        super(colour, model, maxSpeed, speed);
        this.countOfPassengers = countOfPassengers;
    }

    void comeInPassenger() {
        if (speed == 0) {
            countOfPassengers++;
        } else {
            System.out.println("Passenger can`t come in a bus when it is not stopped");
        }

    }

    void goOutPassenger() {
        if (speed == 0) {
            countOfPassengers--;
        } else {
            System.out.println("Passenger can`t go out from a bus when it is not stopped");
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "countOfPassengers=" + countOfPassengers +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return countOfPassengers == bus.countOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countOfPassengers);
    }
}
