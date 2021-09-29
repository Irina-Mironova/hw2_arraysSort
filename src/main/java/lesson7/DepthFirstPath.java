package lesson7; // алгоритм поиска в глубину

public class DepthFirstPath extends FirstPath{

    public DepthFirstPath(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        algorithm(g,source);
    }

    @Override
    protected void algorithm(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                algorithm(g, w);
            }
        }
    }
}
