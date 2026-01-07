package OOPS.Method;

public class productOfAandB {
    public static int multiply(int num1 , int num2){
        int product = num1 * num2;
        return product;
    }


    public static void main(String[] args) {
        int a = 3; 
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a * b = "+prod);
    }
}
