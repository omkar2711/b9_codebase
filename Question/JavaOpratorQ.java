package Question;

public class JavaOpratorQ {
    public static void main(String[] args){
        /*
         WHAT IS OUTPUT OF Y
          int x = 5;
          int y = x++ * 2 + --x;
          System.out.println(y); 
        */
       int x = 5; 
       int y = x++ * 2 + --x; 
       /* EXPLAIN
        first x value is 5 and multiple with 2 is equal to 10
        then x value is increment with 1 then value is 6
        after that value decrease with 1 means value is 5 
        now add (10 + 5 ) output is 15
       */
       System.out.println("Ans One : The value of Y is " + y); // so output is 15

       /* WHAT IS OUTPUT OF result
        * int a = 4; int b = 3;
        int result = a++ + --b + a;
        System.out.println(result)
       */
      int a = 4, b = 3;
      int result = a++ + --b + a; // output is  11;
      /* 
       * first value of a is  {4} and then increment value of 1 is {5}
       * then value of b is {3} and decrement value so {2}
       * in order to excute 
       * first {a++} secound {--b} and thrid {a}
       *  4 + 2 + 5 = {11}
      */
      System.out.println("Ans two: Value of Result is " + result);

      /*  output of z 
      int x = 2; int y = 3;
      int z = x++ + (++y * x) - y--;
      System.out.println(z);
      */
      int x1 = 2, y1 = 3;
      int z = x1++ + (++y1 * x1) - y1-- ;
      /* first unary oprator is excute
        so value of x1 is {3} AND value of y is = {4}
        {3 + (4 * 3) - 4 }
        { 3 + 12 - 4} {14-4} = 10
      */
      System.out.println("Ans three : Output is z is " + z); // output is 10;

      /* OUTPUT of result 
       int x = 1; int y = 2;
       int result = ++x + y++ + x++;
       System.out.println(result);
      */
        int x2 = 1, y2 = 2;
        int result1 = ++x2 + y2++ + x2++; // output is 6
      System.out.println("Ans fouth : Ouptput is " + result1);

      /* OUTPUT IS result3 is 
       int a = 5; int b = 6;
       int result = (a++ * b--) + (--a * ++b);
       System.out.println(result);
      */
      int a1 = 5, b1 = 6;
      int result2 = (a1++ * b1--) + (--a1 * ++b1); // output is 60
      /* first a1++ * b1--) (5 * 6) = 30
        now value of a1 is {6} and b1 is {5}
        then a1 {5} and b1 {6}
        secound  (--a1 * ++b1) (5 * 6) = 30
        so {30 + 30 = 60 }  output
      */
      System.out.println("Ans fifth :  Output is : " + result2);

      /* OUTPUT of b is 
       * int a = 10; int b = a++ + ++a;
       * System.out.println(b);
      */
      int a2 = 10;
      int  b2 = a2++ + ++a2;// output is  22
      /* a2 = {10} after psot-increment is value is {11}
      now a2 = {11} after pre-incremnet value is {12}
      so {10 + 12  = 22} 
      */
      System.out.println("Ans Six : Output is " + b2);

      int a5 = 2;
int b5 = 3;
int c5 = a5 * b5 + a5++ * ++b5;
System.out.println(c5);


    }
}
