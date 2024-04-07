import java.util.ArrayList;

public class vertex {

    private String data;
    private ArrayList<Edge> edges;


    public vertex(String input)
    {
        this.data = input;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(vertex EndVertex, Integer weight){
        this.edges.add(new Edge(this, EndVertex, weight));
    };

    public void RemoveEdge(vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public String getData(){
        return this.data;
    }

    public ArrayList<Edge> getEdges(){
        return  this.edges;
    }


    public void print(boolean showWeight) {
        System.out.println("Vertex: " + this.data);
        System.out.println("Adjacent Vertices:");
        for (Edge edge : edges) {
            System.out.print("  -> " + edge.getEnd().getData());
            if (showWeight) {
                System.out.println(" (Weight: " + edge.getWeight() + ")");
            } else {
                System.out.println();
            }
        }
    }


}
