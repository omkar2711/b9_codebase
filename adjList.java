import java.util.*;

class Edge {
    int node;
    int weight;

    public Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class GraphList {
    List<List<Edge>> adjL;
    int vertices;

    public GraphList(int vertices) {
        this.vertices = vertices;
        adjL = new ArrayList<>();

        for(int i = 0;i<= vertices;i++){
            adjL.add(new ArrayList<>());
        }
    }

     void addEdge(int u, int v, int w){
        adjL.get(u).add(new Edge(v,w));
        // adjL.get(v).add(new Edge(u,w));

     }

     void printList(){
        for(int i = 1;i<=vertices;i++){
            System.out.print((i + ": "));
            for(Edge e : adjL.get(i)){
                System.out.print( "{" +e.node + ", " +  e.weight + "},");
            }
            System.out.println();
        }
     }
    
}

public class adjList {
    public static void main(String[] args) {
        GraphList g = new GraphList(5);
        g.addEdge(1, 2, 10);
        g.addEdge(1, 3,8);
        g.addEdge(2, 4,2);
        g.addEdge(3, 4,4);
        g.addEdge(3, 5,8);
        g.addEdge(4, 5,6);

        g.printList();
    }
}
