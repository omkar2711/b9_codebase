package parshwa.forloop;

public class printstart3 {
    public static void main(String[] args) {
        System.out.println("print pyramid star pattern");
        int row=6;

        for(int i=1;i<=row;i++){

            for(int space=1;space<=row-i;space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
