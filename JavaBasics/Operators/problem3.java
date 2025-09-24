package JavaBasics.Operators;

public class problem3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int a = 5;
        int b = 6;

        System.out.println( "a: "+a + " b:" + b);
        System.out.println( "x: "+x + " y:" + y);

        //With using temp variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println( "a: "+a + " b:" + b);
        //without using temp variable
         x = x + y; //15
        y = x - y;
        x = x - y;

        System.out.println( "x: "+x + " y:" + y);
    }
}
