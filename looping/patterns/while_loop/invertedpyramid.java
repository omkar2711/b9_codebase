package patterns.while_loop;

public class invertedpyramid {
    public static void main(String[] args) {
        int i=5;
        int m=1;
        while(i>=m){
            int j=0;
            while (j <= (5 - i)){
                System.out.print(" ");
                j++;
            }
            int n=1;
            while (n<= (2*i-1)) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            i--;
        }

    }
    
}
