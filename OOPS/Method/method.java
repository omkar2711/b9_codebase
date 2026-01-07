package OOPS.Method;

public class method {
    // public static void printHelloWorld(){
    //     System.out.println("Hello World!");
    // }


    /*swap the value */
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b); 
    }
        



    public static void main(String[] args) {
        // printHelloWorld();

        /*swap the value*/
        int a = 10 ; 
        int b = 20;
        swap(a, b);

    }

}
