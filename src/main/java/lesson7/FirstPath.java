package lesson7;

import java.util.LinkedList;

public abstract class FirstPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    protected abstract void algorithm(Graph g, int v);

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
