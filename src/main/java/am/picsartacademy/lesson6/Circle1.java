package am.picsartacademy.lesson6;

public class Circle1 extends Shape1{
    private double radius;

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a circle with radius: " + radius);
    }
}

