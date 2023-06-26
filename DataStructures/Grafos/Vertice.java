import java.util.ArrayList;
import java.util.List;

public class Vertice {
    public Object ponderation;
    public List<Edge> inEdges;
    public List<Edge> outEdges;

    public Vertice(Object ponderation) {
        this.ponderation = ponderation;
        this.inEdges = new ArrayList<Edge>();
        this.outEdges = new ArrayList<Edge>();
    }

}