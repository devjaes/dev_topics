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
            if (v.equals(vertice))
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

        if (edge.findInList(this.edges) || edge == null) {
            System.out.println("Agregando arista: " + edge.toString());
            return false;

        }

        if (!this.vertices.contains(edge.source) || !this.vertices.contains(edge.target))
            return false;

        this.edges.add(edge);
        edge.source.outEdges.add(edge);
        edge.target.inEdges.add(edge);
        return true;
    }

    public boolean removeVertice(Vertice verticeToRemove) {
        if (verticeToRemove != null) {
            for (Vertice vertice : this.vertices) {
                if (vertice.equals(verticeToRemove)) {
                    for (Edge edge : vertice.inEdges) {
                        this.removeEdge(edge);
                    }
                    for (Edge edge : vertice.outEdges) {
                        this.removeEdge(edge);
                    }
                    this.vertices.remove(vertice);
                    return true;
                }
            }
        }

        return false;
    }

    public boolean removeEdge(Vertice source, Vertice target, Object ponderation) {
        if (source == null || target == null)
            return false;

        return removeEdge(new Edge(source, target, ponderation));
    }

    public boolean removeEdge(Edge edge) {
        if (edge == null)
            return false;

        for (Edge e : edge.source.outEdges) {
            if (e.equals(edge)) {
                edge.source.outEdges.remove(e);
                edge.target.inEdges.remove(e);
                this.edges.remove(edge);
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

    public Vertice[][] getMatrixGraph() {
        Vertice[][] matrix = new Vertice[this.vertices.size() + 1][this.vertices.size() + 1];
        matrix[0][0] = new Vertice("V");

        for (int i = 0; i < this.vertices.size(); i++) {
            matrix[0][i + 1] = this.vertices.get(i);
            matrix[i + 1][0] = this.vertices.get(i);
        }

        for (Edge edge : this.edges) {
            int i = this.vertices.indexOf(edge.source);
            int j = this.vertices.indexOf(edge.target);
            matrix[i + 1][j + 1] = new Vertice(edge.ponderation.toString()); // Convertimos el ponderation a String
        }

        return matrix;
    }

    public void printMatrixGraph() {
        Vertice[][] matrix = this.getMatrixGraph();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != null)
                    System.out.printf("%4s|", matrix[i][j].ponderation.toString());
                else
                    System.out.printf("%4s|", " ");
            }
            System.out.println();
        }
    }
}