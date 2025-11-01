// Example of class and object in Java

//creating a class
package parshwa.oops;
class car{
    
    String brand;
    String model;
    int year;

    // constructor to initialize car details
    //NON PARAMETERIZED CONSTRUCTOR / DEFAULT CONSTRUCTOR
    car(){
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    //PARAMETERIZED CONSTRUCTOR
    car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }

    //copy constructor
    car(car c){
        brand = c.brand;
        model = c.model;
        year = c.year;
    }

    // method to display car details

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class classobjects {
    public static void main(String[] args) {
        // creating object of class
        car myCar = new car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;
        
        // calling method to display car details
        myCar.displayInfo();

        // creating another object using parameterized constructor
        car anotherCar = new car("Honda", "Civic", 2019);
        anotherCar.displayInfo();

        // creating object using copy constructor
        car copyCar = new car(anotherCar);
        copyCar.displayInfo();
    }
}
