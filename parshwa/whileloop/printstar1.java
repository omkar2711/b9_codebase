package parshwa.whileloop;

public class printstar1 {
    public static void main(String[] args) {
        int n = 4; // Size of the square
        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print("*");
                col++;
            }
            // Move to the net line after the row is complete
            System.out.println(); 
            row++;
        }
    }
}
