package DSA.CoreJava.control_flow_statements.operators;

public class RelationalOperatorDemo
{
    public static void main(String[] args)
    {
        //Relational Operator :
        // == , != , < , > , <= , >=
        int a = 5;
        int b = 5;
        if (a == b)
        {
            System.out.println("a equal to b");
        }
        else if(a != b)
        {
            System.out.println("a is not equal to b");
        }

        if(a > b)
        {
            System.out.println("a is Greater than b");
        }
        else if(a < b)
        {
            System.out.println("a is Less than b");
        }

        if(a >= b)
        {
            System.out.println("a is Greater than or Equal to  b");
        }
        else if(a <= b)
        {
            System.out.println("a is Less than or Equal to  b");
        }
    }
}
