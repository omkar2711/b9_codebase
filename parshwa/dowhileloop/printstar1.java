package parshwa.dowhileloop;

public class printstar1 {
    public static void main(String[] args) {
        int N = 5; // The number of times the line should be repeated
        int starsPerLine = 5; // The number of stars in each line
        
        int row = 1;

        // Outer do-while loop to control the number of rows (N)
        do {
            int col = 1;
            
            // Inner while loop to print the stars for the current row
            while (col <= starsPerLine) {
                System.out.print("*");
                col++;
            }
            
            // Move to the next line
            System.out.println(); 
            
            row++;
        } while (row <= N);
    }
}
