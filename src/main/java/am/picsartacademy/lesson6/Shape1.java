package am.picsartacademy.lesson6;

public class Shape1 {
    public String color;
    public boolean filled;

    public int a;
    public int b;
    public int c;

    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape1(String color, boolean filled, int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.filled = filled;
    }

    public  void printPerimeter() {
        if (a > 0 && b > 0 && c > 0) {
            int p = a + b + c;
            System.out.println("Perimeter is: " + p);
        } else {
            System.out.println("Perimeter not applicable for this shape.");
        }
    }

    public void draw() {
        System.out.println("Drawing a math shape");
    }
}

