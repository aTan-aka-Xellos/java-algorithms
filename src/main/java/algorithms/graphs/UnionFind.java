package algorithms.graphs;

/**
 * https://www.notion.so/UnionFind-d2ec128e1f264163973bfcc26bd179e1
 */
public class UnionFind {

    int[] roots;

    // Init N nodes, each point to itself
    public UnionFind(int size) {
        roots = new int[size];
        for (int i = 0; i < roots.length; i++) {
            roots[i] = i;
        }
    }

    // With huge inputs iterative approach safer
    int findRoot(int[] p, int node) {
        if (p[node] == node) return node;
        p[node] = findRoot(p, p[node]); // important step to flat the tree
        return p[node];
    }

    // Iterative approach
    int findRootIter(int[] p, int node) {
        while (p[node] != node) {
            p[node] = p[p[node]];
            node = p[node];
        }
        return node;
    }

    // UnionFind:
    // maintain size array and union smaller tree to a larger one (p.34)
    void union(int[] p, int a, int b) {
        int parentA = findRoot(p, a);
        int parentB = findRoot(p, b);
        p[parentB] = parentA; // not weighted version!
    }

    // just compare if nodes has the same root
    boolean isConnected(int[] p, int a, int b) {
        return findRoot(p, a) == findRoot(p, b);
    }
}
