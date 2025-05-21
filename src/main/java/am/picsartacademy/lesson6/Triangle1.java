package am.picsartacademy.lesson6;

public class Triangle1 extends Shape1 {
    public Triangle1 (String color, boolean filled, int a, int b, int c){
        super(color, filled, a, b, c);
    }

    @Override
    public void draw(){
        System.out.println("Drawing a triangle with sides " + a + ", " + b + ", " + c);
    }
}
