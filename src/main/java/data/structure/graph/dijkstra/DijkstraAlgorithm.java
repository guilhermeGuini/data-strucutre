package data.structure.graph.dijkstra;

import java.util.List;

public class DijkstraAlgorithm {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A", List.of(Vertex.of("B", 6), Vertex.of("C", 10)));
        graph.addVertex("B", List.of(Vertex.of("A", 6), Vertex.of("C", 3), Vertex.of("D", 20)));
        graph.addVertex("C", List.of(Vertex.of("A", 10), Vertex.of("B", 3),
                Vertex.of("D", 15), Vertex.of("G", 17), Vertex.of("H", 7)));
        graph.addVertex("D", List.of(Vertex.of("B", 20), Vertex.of("C", 15), Vertex.of("G", 6)));
        graph.addVertex("H", List.of(Vertex.of("C", 7), Vertex.of("G", 9)));
        graph.addVertex("G", List.of(Vertex.of("H", 9), Vertex.of("C", 17), Vertex.of("D", 6)));

        graph.getShortestPath("A", "C");
    }
}