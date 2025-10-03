package patterns.while_loop;

public class rightangled {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        while(i<=n){
            int j=i;
            while(j<n){
                System.out.print(" ");
                j++;
            }
            int q=1;
            while(q<=i){
                System.out.print("*");
                q++;
            }
            System.out.println();
            i++;
        }
    }
    
}
