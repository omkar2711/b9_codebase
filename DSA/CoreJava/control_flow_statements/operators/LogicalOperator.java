package DSA.CoreJava.control_flow_statements.operators;

public class LogicalOperator {
    public static void main(String[] args) {

        //Logical Operators
        // && (AND) , || (OR) , ! (NOT)

        boolean TRUE = true;
        boolean FALSE = false;

        System.out.println("1) Logical AND (&&)\n");
        System.out.println("True AND True = "+ (TRUE && TRUE));
        System.out.println("True AND False = "+(TRUE && FALSE));
        System.out.println("False AND True = "+(FALSE && TRUE));
        System.out.println("False AND False = "+(FALSE && FALSE));

        System.out.println("2) Logical OR (||)\n");
        System.out.println("True OR True = "+ (TRUE || TRUE));
        System.out.println("True OR False = "+(TRUE || FALSE));
        System.out.println("False OR True = "+(FALSE || TRUE));
        System.out.println("False OR False = "+(FALSE || FALSE));

        System.out.println("3) Logical NOT (||)\n");
            System.out.println("NOT True = "+!true);
            System.out.println("NOT False = "+!false);
    }
}
