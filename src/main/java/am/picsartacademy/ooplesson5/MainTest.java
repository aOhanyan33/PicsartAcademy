package am.picsartacademy.ooplesson5;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color = "Red";
        circle.filled = true;
        circle.setRadius(6.0);
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.color = "Blue";
        rectangle.filled = false;
        rectangle.setWidth(7.0);
        rectangle.setHeight(8.0);
        rectangle.draw();
    }
}

