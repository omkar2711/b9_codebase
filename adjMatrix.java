

class GraphMatrix {
    int[][] adjM;
    int vertices;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjM = new int[vertices ][vertices];
    }
    
    void addEdge(int u, int v,int w){
        adjM[u-1][v-1] = w;
        adjM[v-1][u-1] = w;
    }

    

    //print the adj matrix
    void printMatrix(){
        for(int i = 0;i<vertices;i++){
            for(int j = 0;j<vertices;j++){
                System.out.print(adjM[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
}

public class adjMatrix {
    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(5);

        g.addEdge(1, 2, 10);
        g.addEdge(1, 3,8);
        g.addEdge(2, 4,2);
        g.addEdge(3, 4,4);
        g.addEdge(3, 5,8);
        g.addEdge(4, 5,6);

        g.printMatrix();
    }
}
