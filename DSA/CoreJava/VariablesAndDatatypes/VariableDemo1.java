package DSA.CoreJava.VariablesAndDatatypes;

public class VariableDemo1
{
public static void main(String[] args)
{
    //Variables : Variable is a conainer in which we hold the data.
    // It is a Name Given to the Memory location where data is Stored
    //Syntax : data_type variable_name = value;
    byte age = 21;
    short Recharge = 299;
    int Marks = 450;
    long Mobile_No = 7709648063l;
    float Percentage = 85.25f;
    double d1 = 84597.52d;
    char c1 = 'a';
    boolean b1 = true;
    String name = "Aditya";
    String City = "Sangamner";

    System.out.println("I am "+name+" I am Form "+City+", My age is "+age);
    System.out.println("My Mobile number is "+Mobile_No+". and I do monthly recharge of "+Recharge+" Rs");
    System.out.println("I Have Scored "+Marks+" in my last sem and get "+Percentage+" %");
}
}
