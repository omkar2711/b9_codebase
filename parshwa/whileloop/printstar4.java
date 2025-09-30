package parshwa.whileloop;

public class printstar4 {
    public static void main(String[] args) {
        int N = 5; // Number of rows
        int row = 1;

        while (row <= N) {
            
            // Inner loop prints numbers from 1 up to the current row number
            int col = 1;
            while (col <= row) {
                System.out.print(col); // Print the column number
                col++;
            }
            
            System.out.println();
            row++;
        }
    }
}