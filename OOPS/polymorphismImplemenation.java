package OOPS;


class Student{

    //Attributes
    String name;
    int age;
    String id;


    //Constructors
    Student(String Name, int age, String id){
        this.name = Name;
        this.age = age;
        this.id = id;
    }


    //Methods
    void displayDetails(String name){
        //Print only name
        System.out.println(name);
    }
    void displayDetails(int age){
        //Print only age
        System.out.println(age);
    }
    void displayDetails(String name, int age){
        //Print name and age
        System.out.println(name + " " + age);
    }

}

public class polymorphismImplemenation {
    public static void main(String[] args) {

        //Object
        Student s1 = new Student("Aditya", 20,"A-123");
        s1.displayDetails(20);


    }
}
