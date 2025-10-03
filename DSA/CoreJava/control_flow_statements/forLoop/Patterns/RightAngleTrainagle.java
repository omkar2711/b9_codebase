package DSA.CoreJava.control_flow_statements.forLoop.Patterns;

public class RightAngleTrainagle {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++)
        {
            for(int j = 1;j <=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("  ");
        }
    }
}