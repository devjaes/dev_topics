import java.util.ArrayList;
import java.util.List;

public class Graph {
    public List<Edge> edges;
    public List<Vertice> vertices;

    public Graph() {
        this.edges = new ArrayList<Edge>();
        this.vertices = new ArrayList<Vertice>();
    }

    public Graph(List<Edge> edges, List<Vertice> vertices) {
        this.edges = edges;
        this.vertices = vertices;
    }

    public boolean addVertice(Object ponderation) {
        if (ponderation == null || ponderation.equals("") || ponderation.equals(" ") || ponderation instanceof Edge
                || ponderation instanceof Vertice)
            return false;

        Vertice vertice = new Vertice(ponderation);

        for (Vertice v : this.vertices) {
            if (v.ponderation.equals(vertice.ponderation))
                return false;
        }

        this.vertices.add(vertice);
        return true;
    }

    public boolean addEdge(Vertice source, Vertice target, Object ponderation) {
        if (source == null || target == null || ponderation == null || ponderation.equals("")
                || ponderation.equals(" ") || ponderation instanceof Edge || ponderation instanceof Vertice)
            return false;

        Edge edge = new Edge(source, target, ponderation);

        if (this.edges.contains(edge) || edge == null)
            return false;

        if (!this.vertices.contains(edge.source) || !this.vertices.contains(edge.target))
            return false;

        this.edges.add(edge);
        edge.source.outEdges.add(edge);
        edge.target.inEdges.add(edge);
        return true;
    }

    public boolean removeVertice(Object ponderation) {
        if (ponderation == null || ponderation.equals("") || ponderation.equals(" ") || ponderation instanceof Edge
                || ponderation instanceof Vertice)
            return false;

        for (Vertice vertice : this.vertices) {
            if (vertice.ponderation.equals(ponderation)) {
                for (Edge edge : vertice.inEdges) {
                    this.edges.remove(edge);
                }
                for (Edge edge : vertice.outEdges) {
                    this.edges.remove(edge);
                }
                this.vertices.remove(vertice);
                return true;
            }
        }
        return false;
    }

    public boolean removeEdge(Vertice source, Vertice target) {
        if (source == null || target == null)
            return false;

        for (Edge edge : source.outEdges) {
            if (edge.target.equals(target)) {
                this.edges.remove(edge);
                edge.source.outEdges.remove(edge);
                edge.target.inEdges.remove(edge);
                return true;
            }
        }
        return false;
    }

    public boolean isAdyacent(Vertice source, Vertice target) {
        if (source == null || target == null)
            return false;

        for (Edge edge : source.outEdges) {
            if (edge.target.equals(target))
                return true;
        }
        return false;
    }
}