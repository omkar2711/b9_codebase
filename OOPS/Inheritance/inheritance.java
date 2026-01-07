package OOPS.Inheritance;

 class Animal{
    String skinColor;

    void food(){
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("breath");
    }
}

 class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim in river");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.food();
        
    }
}
