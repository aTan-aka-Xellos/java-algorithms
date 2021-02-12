package algorithms.graphs;

/**
 * https://www.notion.so/UnionFind-d2ec128e1f264163973bfcc26bd179e1
 */
public class UnionFind {

    int[] root;

    // Init N nodes, each point to itself
    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
    }

    // With huge inputs iterative approach safer
    int findRoot(int node) {
        if (root[node] == node) return node;
        root[node] = findRoot(root[node]); // important step to flat the tree
        return root[node];
    }

    // Iterative approach
    int findRootIter(int node) {
        while (root[node] != node) {
            root[node] = root[root[node]];
            node = root[node];
        }
        return node;
    }

    // UnionFind:
    // maintain size array and union smaller tree to a larger one (p.34)
    void union(int[] p, int a, int b) {
        int rootA = findRoot(a);
        int rootB = findRoot(b);
        p[rootB] = rootA; // not weighted version!
    }

    // just compare if nodes has the same root
    boolean isConnected(int a, int b) {
        return findRoot(a) == findRoot(b);
    }
}
