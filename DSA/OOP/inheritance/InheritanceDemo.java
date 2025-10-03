package DSA.OOP.inheritance;

class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String name, int age, String gender, int rollNo, String course) {
        super(name, age, gender);
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // reuse parent method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}


class Teacher extends Person {
    int employeeId;
    String subject;

    Teacher(String name, int age, String gender, int employeeId, String subject) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Person p1 = new Student("Aditya", 20, "Male", 101, "Computer Science");
        Person p2 = new Teacher("Pratii", 22, "Female", 501, "Java Programming");

        System.out.println("--Student Details--");
        p1.displayInfo();

        System.out.println("\n-- Teacher Details --");
        p2.displayInfo();
    }
}
