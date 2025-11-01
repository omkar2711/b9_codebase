//java class and object example
// creating a class pen with attributes color and type
package parshwa.oops;
class Pen{
    String color;
    String type;

    // method to display pen information
    void displayinfo(){
        System.out.println("Color of pen is " +this.color);
        System.out.println("Type of pen is " +this.type);
    }
}

public class classobjex {
    public static void main(String[] args) {
        //Creating an object of pen class
        Pen p1=new Pen(); //p1 is a reference variable of type Pen
        p1.color="Black";
        p1.type="Gel";
        p1.displayinfo(); // calling method to display info of pen p1
        
    }
    
}
