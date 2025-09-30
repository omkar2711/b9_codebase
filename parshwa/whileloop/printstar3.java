package parshwa.whileloop;

public class printstar3 {
    public static void main(String[] args) {
        int N = 5; // Number of rows
        int row = 1;

        while (row <= N) {
            
            // 1. Print Spaces (row - 1)
            int space = 1;
            int numSpaces = row - 1;
            while (space <= numSpaces) {
                System.out.print(" ");
                space++;
            }
            
            // 2. Print Stars: (2 * N) - (2 * row) + 1
            int star = 1;
            // Example: row 1 -> (10 - 2 + 1) = 9 stars
            // Example: row 5 -> (10 - 10 + 1) = 1 star
            int numStars = (2 * N) - (2 * row) + 1;
            while (star <= numStars) {
                System.out.print("*");
                star++;
            }
            
            System.out.println();
            row++;
        }
    }
}
