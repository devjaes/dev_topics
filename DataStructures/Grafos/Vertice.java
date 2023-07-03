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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vertice))
            return false;

        try {
            Vertice vertice = (Vertice) obj;

            if (!vertice.ponderation.toString().equals(this.ponderation.toString()))
                return false;

            if (vertice.inEdges.size() == 0 && vertice.outEdges.size() == 0 && this.inEdges.size() == 0
                    && this.outEdges.size() == 0)
                return true;

            if (vertice.inEdges.size() != this.inEdges.size() || vertice.outEdges.size() != this.outEdges.size())
                return false;

            for (Edge edge : vertice.inEdges) {
                if (!edge.findInList(inEdges))
                    return false;
            }

            for (Edge edge : vertice.outEdges) {
                if (!edge.findInList(this.outEdges))
                    return false;
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

}