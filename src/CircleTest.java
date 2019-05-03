public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(25);
        System.out.println("Radius = " + circle.getRadius() + "\n" +
                "Area = " + circle.calculateArea());
    }
}
