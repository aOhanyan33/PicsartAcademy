package am.picsartacademy.lesson6;

public class Main1 {
    public static void main(String[] args) {


          Circle1 circle = new Circle1("blue", true, 6);
          circle.draw();
          circle.printPerimeter();

          Triangle1 triangle = new Triangle1("red", true, 3,4,5);
          triangle.draw();
          triangle.printPerimeter();

          Rectangle1 rectangle = new Rectangle1("green", true, 5, 7 );
          rectangle.draw();
          rectangle.printPerimeter();
}}

