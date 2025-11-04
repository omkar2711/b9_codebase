package OOPS;


class Employee{

    //Attributes
    private String name;
    private int age;
    private String position;

    //Getter methods
    public String getName(){
        return this.name;
    }
 

    public int getAge(){
        return this.age;
    }

    public String getPosition(){
        return this.position;
    }

    //Setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Age cannot be negative");
            return;
        }
        this.age = age;
    }

    public void setPosition(String position){
        this.position = position;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Alice");
        emp.setAge(30);
        emp.setPosition("Manager");

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Position: " + emp.getPosition());
        

    }
}
