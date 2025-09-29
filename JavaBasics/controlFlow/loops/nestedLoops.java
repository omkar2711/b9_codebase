package JavaBasics.controlFlow.loops;

public class nestedLoops {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=2*n;i++){

            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* " );
            }
            System.out.println();

        }
//        {i,j}

    }
}
