package lv.javaguru.lessons.homework.Lesson8.car.Shape;

public class Triangle extends AbstractShape {
    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", Area='" + getArea() + '\''+
                '}';
    }
}
