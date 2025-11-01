package practice;
// Student Class
// Create a class Student with attributes: name, rollNo, and marks.
// Create an object and print the details.
class Student{
    String name;
    int rollNo;
    float marks;

    void displaydetails(){
        System.out.println("Details of Student:");
        System.out.println("Name=" +name);
        System.out.println("Roll No=" +rollNo);
        System.out.println("Marks=" +marks);
    }
}

public class practiceex {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Parshwa";
        s1.rollNo=21;
        s1.marks=95.5f;
        s1.displaydetails();
    }
    
}
