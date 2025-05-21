package am.picsartacademy.lesson6;

public class Rectangle1 extends Shape1 {
    public Rectangle1 (String color, boolean filled, int width, int height){
        super(color, filled);
        this.a = width;
        this.b = height;
    }
    @Override
    public  void printPerimeter(){
        int p = 2 * (a+b);
        System.out.println("Rectangle perimeter is:" + p);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a rectangle with width: " + a + " and height: " + b);
    }

}
