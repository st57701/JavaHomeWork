package lv.javaguru.lessons.homework.Lesson8.car.Shape;

public class Rhombus extends AbstractShape {
    private double sideA;
    private double height;

    public Rhombus(String name, String colour, double sideA, double height) {
        super(name, colour);
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public double getArea() {
        return sideA * height;

    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "sideA=" + sideA +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", Area='" + getArea() + '\''+
                '}';
    }
}
