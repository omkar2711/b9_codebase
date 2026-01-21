package DSA.Recursion;

public class sample1 {

     void function1(int n)
    {
       if(n==5) return ;
        
       
       System.out.println(" "+n);
       n++;
       function1(n);
    }

    public static void main(String [] args)
    { sample1 s=new sample1();
        int n=1;
        s.function1(n);


    }
    
}
