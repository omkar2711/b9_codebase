package OOPS;


///Interfaces
interface Shape{

    //abstract methods
    void area();
    void perimeter();
}

class Rectangle implements Shape{
    double length;
    double width;

    //Constructor
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Implementing abstract methods
    public void area(){
        System.out.println("Area of Rectangle: " + (length * width));
    }

    public void perimeter(){
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

public class Abstraction2 {

}
