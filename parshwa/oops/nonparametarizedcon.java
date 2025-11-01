//non parameterized constructor example
//constructor name is same as class name
//it is used to initialize object


package parshwa.oops;
class Student{
    String name;
    char div;
    int age;

    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Division: " + div);
        System.out.println("Age: " + age);
    }

    //non parameterized constructor called
    Student(){
        System.out.println("Constructor called");
    }

}
public class nonparametarizedcon {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Parshwa";
        s1.div='A';
        s1.age=20;
        s1.displayinfo();
    }
}
