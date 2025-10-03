package patterns.for_loop;

public class inverted_rightangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
