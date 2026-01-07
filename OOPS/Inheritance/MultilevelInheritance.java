package OOPS.Inheritance;

class GrandParent{
    void home(){
        System.out.println("GrandParent's Home");
    }
}

class Parent extends GrandParent{
    void car(){
        System.out.println("Parent's Car");
    }
}

class Child extends Parent{
    void bike(){
        System.out.println("Child's Bike");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        c.car();
        c.bike();
    }



}
