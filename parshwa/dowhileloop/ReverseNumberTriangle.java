// dummy

package parshwa.dowhileloop;

public class ReverseNumberTriangle {
    public static void main(String[] args) {
        int N = 5; // for rows
        
        int rowLength = N;

        // Outer do-while loop for rows. It starts at N and goes down to 1.
        do {
            int col = 1;
            
            // Inner while loop to print numbers from 1 up to the current rowLength
            while (col <= rowLength) {
                System.out.print(col); // Print the column number
                col++;
            }
            
            // Move to the next line
            System.out.println(); 
            
            // Decrease the length for the next row
            rowLength--; 
            
        } while (rowLength >= 1); // Loop continues as long as the row length is 1 or more
    }
}
