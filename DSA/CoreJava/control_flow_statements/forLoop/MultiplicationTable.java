package DSA.CoreJava.control_flow_statements.forLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++)
        {
            for(int j = 1;j<=50;j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println(" ");
        }
    }
}
