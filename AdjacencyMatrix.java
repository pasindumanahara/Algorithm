import java.util.ArrayList;

public class AdjacencyMatrix {
    /**
     * adjacency matrix - a 2d array to store 1 / 0 values to
     *          represent edges also booleans
     *          # of rows = # of unique nodes
     *          # of columns = # of unique nodes
     *  
     * runtime complexity to check an edge - O (1)
     * space complexity: O (v^2) (vertices)
     */
    public static void main(String[] args) {

        Graph graph = new Graph(5);
        // adding nodes
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        
        // adding edges
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(0, 1));

    } 
}
// working with graph
class Graph{
    ArrayList<Node> nodes;
    int[][] matrix;
    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    // add a node
    public void addNode(Node node){
        nodes.add(node);
    }
    // add a edge (connction)
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    // checking an edge (connection)
    public boolean checkEdge(int src, int dst){
        if (matrix[src][dst] == 1) {
            return true;
        }
        else{
            return false;
        }
    }
    // to print the matrix
    public void print(){
        System.out.print("  ");
        for (Node node: nodes){
            System.out.print(node.data+" ");
        }
        System.out.println();
        for (int i = 0 ; i < matrix.length ; i++ ){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0 ; j < matrix[i].length ; j++ ){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// node class
class Node{
    char data;
    Node(char data){
        this.data = data;
    }

}
