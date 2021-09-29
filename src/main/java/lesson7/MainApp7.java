package lesson7;

public class MainApp7 {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 6);
        graph.addEdge(1, 2);
        graph.addEdge(2, 7);
        graph.addEdge(3, 4);
        graph.addEdge(5, 9);
        graph.addEdge(5, 8);
        graph.addEdge(5, 6);
        graph.addEdge(6, 8);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);


        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(7));
        System.out.println(bfp.pathTo(7));

    }
}
