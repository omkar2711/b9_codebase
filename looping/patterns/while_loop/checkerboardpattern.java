package patterns.while_loop;
public class checkerboardpattern {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            int j=1;
            while (j<=5) {
                if(i%2==0){
                     System.out.print(" ");
                }
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
