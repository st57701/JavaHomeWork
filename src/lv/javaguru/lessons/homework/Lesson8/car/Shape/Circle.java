package lv.javaguru.lessons.homework.Lesson8.car.Shape;

public class Circle extends AbstractShape {
    private int radius;
    //final double pi = 3.14;

    public Circle(String name, String colour, int radius) {
        super(name, colour);
        this.radius = radius;
    }





    @Override
    public double getArea() {
        return pi*(radius*radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", Area='" + getArea() + '\''+
                '}';
    }
}
