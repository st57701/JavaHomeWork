package lv.javaguru.lessons.homework.Lesson8.car.Shape;

public class Rectangle extends AbstractShape {
    private double sideA;
    private double sideB;

    public Rectangle(String name, String colour, double sideA, double sideB) {
        super(name, colour);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", Area='" + getArea() + '\''+
                '}';
    }


}
