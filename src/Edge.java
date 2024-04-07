public class Edge {

    private vertex start;
    private vertex end;
    private Integer weight;

    public Edge(vertex InS, vertex InE, Integer InWeight){
        this.start = InS;
        this.end = InE;
        this.weight = InWeight;
    }

    public vertex GetStart(){
        return this.start;
    }

    public vertex getEnd()
    {
        return this.end;
    }

    public Integer getWeight()
    {
        return this.weight;
    }


    public void setStart(vertex Start){
        this.start = Start;
    }


    public void setEnd(vertex End){
        this.end = End;
    }

    public void setWeight(Integer Weight){
        this.weight = Weight;
    }


}
