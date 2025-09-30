package parshwa.whileloop;

public class printstar2 {
    public static void main(String[] args) {
        int N = 5; // Height of the triangle
        int row = 1;

        while (row <= N) {
            
            // 1. Print Spaces (N - row)
            int space = 1;
            int numSpaces = N - row;
            while (space <= numSpaces) {
                System.out.print(" ");
                space++;
            }
            
            // 2. Print Stars (row)
            int star = 1;
            while (star <= row) {
                System.out.print("*");
                star++;
            }
            
            System.out.println();
            row++;
        }
    }
}
