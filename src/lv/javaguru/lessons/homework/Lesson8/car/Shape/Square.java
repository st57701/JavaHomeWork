package lv.javaguru.lessons.homework.Lesson8.car.Shape;

public class Square extends AbstractShape {
    private double sideA;



    public Square(String name, String colour, double sideA) {
        super(name, colour);
        this.sideA = sideA;

    }

    @Override
    public double getArea() {
        return sideA *sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", Area='" + getArea() + '\''+
                '}';
    }
}
