package parshwa.oops;
//creating a class
class Car{
    //attributes
    String brand;
    String model;
    String price;
    
    void displayinfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class carexample {
    public static void main(String[] args) {
        //creating object
        Car car1=new Car();
        car1.brand="BMW";
        car1.model="X5";
        car1.price="60000";
        System.out.println("Details of car1:");
        car1.displayinfo();

    }
    
}
