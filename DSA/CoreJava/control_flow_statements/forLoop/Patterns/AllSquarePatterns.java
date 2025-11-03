package DSA.CoreJava.control_flow_statements.forLoop.Patterns;
import java.util.Scanner;
public class AllSquarePatterns {
    void numberSquare(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 1 ;j<=n;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    void AlphabetSquare(int n)
    {
        for(int i = 0;i<n;i++)
        {
            char ch = 'A';
            for(int j = 0;j<n;j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
    void squareStar(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 1 ;j<=n;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    void numbers(int n)
    {
        int num=1;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0 ;j<n;j++)
            {
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        AllSquarePatterns a1 = new AllSquarePatterns();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your pattern : ");int n = sc.nextInt();
        a1.numberSquare(n);
//        System.out.println();
//        a1.AlphabetSquare(n);
//        System.out.println();
//        a1.squareStar(n);
        System.out.println();
        a1.numbers(n);
    }
}
