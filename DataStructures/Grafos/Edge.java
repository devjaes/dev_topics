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
        if (obj == null)
            return false;
        if (!(obj instanceof Edge))
            return false;
        Edge edge = (Edge) obj;
        return this.source.equals(edge.source) && this.target.equals(edge.target);
    }

}
