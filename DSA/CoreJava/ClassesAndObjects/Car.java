package DSA.CoreJava.ClassesAndObjects;

public class Car {
    String CarName;
    String CarBrand;
    String CarColor;

    Car() //Non-Parameterized constructor / Default Constructor (If we do not declare then java Compiler Provides it..)
    {
        System.out.println("Car'S Non-Parameterized Constructor");
    }
    Car(String CarName, String CarBrand, String CarColor)//Parameterized constructor
    {
        this.CarName = CarName;
        this.CarBrand = CarBrand;
        this.CarColor = CarColor;
    }
    Car(Car c) //Copy Constructor
    {
    this.CarName=c.CarName;
    this.CarBrand=c.CarBrand;
    this.CarColor=c.CarColor;
    }
    void Display()
    {
        System.out.println("Car Information is :");
        System.out.println("Car Name is : "+CarName);
        System.out.println("Car Brand is : "+CarBrand);
        System.out.println("Car Color is : "+CarColor);
    }
}
 class Demo{
    public static void main(String[] args) {
  //Class_Name  Obj_Ref_var = new  Constructor; //Object is an instance of a class.
    Car c1 = new Car();//Object creating using Non-Parameterized Constructor
    c1.CarName = "Bolero";
    c1.CarBrand = "Mahindra";
    c1.CarColor = "White";
    c1.Display();
    Car c2 = new Car("Fortuner","Toyota","Black");//Object creating using Parameterized Constructor
    c2.Display();
    Car c3 = new Car(c2);//Object creating using Copy Constructor
    c3.Display();
    }
}


