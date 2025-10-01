package OOPS;



class Parent{

    //method
    void car(){
        System.out.println("Honda City");
    }
}

class Child extends Parent{

    @Override
    void car(){
        System.out.println("BMW");
    }

    void drive(){

    }
}

public class RunTimePloy {
    public static void main(String[] args) {
        

        Parent p = new Parent();
        p.car();

        Child c = new Child();

        c.car();
    }
}
