package lv.javaguru.lessons.homework.Lesson8.car.Shape;


public class ShapeTest {
    public static void main(String[] args) {


        Circle circle1 = new Circle("Circle2", "green", 2);
        circle1.getName();
        Triangle triangle1 = new Triangle("triangle1 ", "blue", 18, 6);
        Square square1 = new Square("square1", "yellow", 5);
        Rhombus rhombus1 = new Rhombus("rhombus1 ", "purple", 5, 2);
        Shape[] shapesArray = {circle1, triangle1, square1, rhombus1};
        for (int i = 0; i < shapesArray.length; i++) {
            System.out.println(shapesArray[i]);
        }
    }
}
