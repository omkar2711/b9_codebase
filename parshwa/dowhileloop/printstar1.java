package parshwa.dowhileloop;

public class printstar1 {
    public static void main(String[] args) {
        int N = 5; 
        int starsPerLine = 5; 
        
        int row = 1;

        
        do {
            int col = 1;
            
            
            while (col <= starsPerLine) {
                System.out.print("*");
                col++;
            }
            
            
            System.out.println(); 
            
            row++;
        } while (row <= N);
    }
}
