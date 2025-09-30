package OOPS;

class Car{
    //Attributes
    String Brand;
    String Model;
    int year;

    //Constructors
    //Non parameterized Constructors
    Car(){
        System.out.println("Constrcutor called");
    }

    //Parameterized Constructors
    Car(String b, String m, int y){
        this.Brand = b;
        this.Model = m;
        this.year = y;
    }

    //Copy Constructor
    Car(Car myCar){
        this.Brand = myCar.Brand;
        this.Model = myCar.Model;
        this.year = myCar.year;
    }

    //Method
    void display(){
        System.out.println("--Information about the car--");
        System.out.println("Brand of the car is: " + this.Brand);
        System.out.println("Model of the car is: " + this.Model);
        System.out.println("Year of the car is: " + this.year);
    }
}


public class program1 {
    public static void main(String[] args) {
        //Objects

        Car myCar1 = new Car();
        
        myCar1.Brand = "Toyota";
        myCar1.Model = "Fortuner";
        myCar1.year = 2025;

        // myCar1.display();


        Car myCar2 = new Car();
        myCar2.Brand = "BMW";
        myCar2.Model = "M5";
        myCar2.year = 2024;

        // myCar2.display();

        Car myCar3 = new Car("Mahindra","Bolero",0);
        // myCar3.display();

        Car myCar4 = new Car(myCar2);
        myCar4.display();

    }
}
