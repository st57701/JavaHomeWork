package lv.javaguru.lessons.homework.Lesson8.car;


import java.util.Objects;

public class FamilyCar extends Car {
   private String type;

    public FamilyCar(String colour, String model, int maxSpeed, int speed, String type) {
        super(colour, model, maxSpeed, speed);
        this.type = type;
    }

    @Override
    public String toString() {
        return "FamilyCar{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FamilyCar)) return false;
        if (!super.equals(o)) return false;
        FamilyCar familyCar = (FamilyCar) o;
        return Objects.equals(type, familyCar.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
