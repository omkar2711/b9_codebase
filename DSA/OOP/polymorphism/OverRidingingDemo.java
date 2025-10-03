package DSA.OOP.polymorphism;

import java.util.Scanner;

class Shape {
    Scanner sc = new Scanner(System.in);
    int area;

    void area() {
        System.out.println("Area of Shape");
    }

}
class R1 extends Shape{
    @Override
    void area()
    {
        System.out.println("Enter Height and Width of Rectangle");
        int h = sc.nextInt();
        int w = sc.nextInt();
        area =  h * w;
        System.out.println("Area of Rectangle : "+area);
    }
}

class Circle extends Shape{
    @Override
    void area()
    {
        System.out.println("Enter Radius of Circle");
        int r = sc.nextInt();
        area = r * r;
        System.out.println("Area of Circle : "+area);
    }
}
class Triangle extends Shape {
    @Override
    void area()
    {
    System.out.println("Enter Base and Height of Triangle");
        int b = sc.nextInt();
        int h = sc.nextInt();
        area =  (b * h)/2;
        System.out.println("Area of Triangle : "+area);
    }
}
public class OverRidingingDemo {
    public static void main(String[] args) {
    Shape shape = new Shape();
    shape.area();
    Triangle triangle = new Triangle();
    triangle.area();
    R1 r = new R1();
    r.area();
    Circle circle = new Circle();
    circle.area();
    }
}
