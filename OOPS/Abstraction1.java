package OOPS;

//abstract class
abstract class Animal{
    
    //Attributes
    

    //abstract method
    abstract void solve();
    abstract void medicines();

    //non-abstract method
    void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{
    //Attributes
    String breed;
    String color;

    //Methods
    void solve(){
        System.out.println("Bark");
    }

    void medicines(){

        System.out.println("Dog medicines");
    }
}


public class Abstraction1 {
    
}
