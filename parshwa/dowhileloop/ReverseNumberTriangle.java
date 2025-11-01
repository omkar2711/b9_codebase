// dummy

package parshwa.dowhileloop;

public class ReverseNumberTriangle {
    public static void main(String[] args) {
        int N = 5; // for rows
        
        int rowLength = N;

        
        do {
            int col = 1;
            
            
            while (col <= rowLength) {
                System.out.print(col); 
                col++;
            }
            
            
            System.out.println(); 
            
           
            rowLength--; 
            
        } while (rowLength >= 1); 
    }
}
