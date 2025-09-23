package DSA.Arrays.operators;

public class AssignmentOperator {
    //Assignment Operators
    public static void main(String[] args) {
        // =
        int a = 5;
        int b = 5;
        //+=
        // a+=b  ==  a = a+b
        System.out.println("Addition on "+a+" and "+b+" is "+(a+=b));
        //-=
        //a-=b  == a = a-b
        System.out.println("Subtraction on "+a+" and "+b+" is "+(a-=b));
        //*=
        //a*=b == a = a*b
        System.out.println("Multiplication on "+a+" and "+b+" is "+(a*=b));
        // /=
        //  a/=b == a = a/b;
        System.out.println("Division on "+a+" and "+b+" is "+(a/=b));
        // %=
        // a%=b == a = a%b;
        System.out.println("Modulation on "+a+" and "+b+" is "+(a%=b));
    }
}
