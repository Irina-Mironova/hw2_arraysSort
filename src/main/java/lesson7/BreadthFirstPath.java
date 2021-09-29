package lesson7;  // алгоритм поиска кратчайшего пути  в ширину

import java.util.LinkedList;

public class BreadthFirstPath extends FirstPath{

    public BreadthFirstPath(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        algorithm(g, source);
    }

    @Override
    public void algorithm(Graph g, int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(v);
        marked[v] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
