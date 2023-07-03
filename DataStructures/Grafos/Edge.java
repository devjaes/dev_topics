import java.util.List;

public class Edge {
    public Vertice source;
    public Vertice target;
    public Object ponderation;

    public Edge(Vertice source, Vertice target, Object ponderation) {
        this.source = source;
        this.target = target;
        this.ponderation = ponderation;
    }

    public Edge(Vertice source, Vertice target) {
        this(source, target, null);
    }

    public Edge() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Edge))
            return false;

        Edge edge = (Edge) obj;
        boolean isE = (this.source == edge.source) && this.target == (edge.target)
                && this.ponderation.toString().equals(edge.ponderation.toString());
        // return (this.source.equals(edge.source) && this.target.equals(edge.target) &&
        // this.ponderation.toString().equals(edge.ponderation.toString()));
        return isE;
    }

    public boolean findInList(List<Edge> edges) {
        for (Edge e : edges) {
            if (this.equals(e)) {
                return true;
            }
        }

        return false;
    }
}
