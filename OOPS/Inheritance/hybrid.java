package OOPS.Inheritance;

interface A{
    void methodA();
}

interface B extends A{
    void methodB();
}

interface C {
    void methodC();
}

class D implements B,C{
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB(){
        System.out.println("Method B");
    }
    public void methodC(){
        System.out.println("Method C");
    }

}
public class hybrid {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();

    }
}
