public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertice("v1");
        graph.addVertice("v2");
        graph.addVertice("v3");
        graph.addVertice("v4");

        graph.addEdge(graph.vertices.get(0), graph.vertices.get(1), "e1");
        graph.addEdge(graph.vertices.get(1), graph.vertices.get(2), "e2");
        graph.addEdge(graph.vertices.get(2), graph.vertices.get(3), "e3");
        graph.addEdge(graph.vertices.get(3), graph.vertices.get(0), "e4");

        graph.printMatrixGraph();
    }
}
