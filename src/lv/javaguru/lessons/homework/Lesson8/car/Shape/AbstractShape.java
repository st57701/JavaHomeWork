package lv.javaguru.lessons.homework.Lesson8.car.Shape;

abstract class AbstractShape implements Shape {
    protected String name;
    protected String colour;

    public AbstractShape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String getName() {
        System.out.println(name);
        return name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "AbstractShape{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", Area='" + getArea() + '\''+
                '}';
    }
}
