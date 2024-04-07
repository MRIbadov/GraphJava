import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private ArrayList<vertex> vertices;
    private boolean isWeighted;
    private boolean  isDirected;

    public Main(boolean inputIsW, boolean isDire){
        this.isDirected = isDire;
        this.isWeighted = inputIsW;
        this.vertices = new ArrayList<vertex>();
    }


    public vertex addVertex(String data){
        vertex newVer = new vertex(data);
        this.vertices.add(newVer);
        return newVer;
    }

    public void addEdge(vertex Vertex1, vertex Vertex2, Integer weight){
        if(!this.isWeighted){
            weight = null;
        }

        Vertex1.addEdge(Vertex2, weight);

        if(!this.isDirected){
            Vertex2.addEdge(Vertex1, weight);
        }
    }

    public void removeEdge(vertex vertex1, vertex vertex2)
    {
        vertex1.RemoveEdge(vertex2);
        if(!this.isDirected){
            vertex2.RemoveEdge(vertex1);
        }
    }



    public void RemoveVertex(vertex vertex1)
    {
        this.vertices.remove(vertex1);
    }


    public ArrayList<vertex> getVertices(){
        return this.vertices;
    }


    public boolean IsWeight(){
        return this.isWeighted;
    }

    public boolean isDirect(){
        return this.isDirected;
    }

    public vertex GetVertexByValue(String Data){
        for(vertex vertex1 : this.vertices){
            if(Objects.equals(vertex1.getData(), Data)){
                return vertex1;
            }
        }
        return null;
    }


    public void print(){
        for(vertex v1: this.vertices){
            v1.print(isWeighted);
        }
    }

    public static void main(String[] args) {



    }
}