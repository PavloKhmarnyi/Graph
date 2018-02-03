package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavlo on 2/3/2018.
 */
public class Graph {
    private List<Node> nodes;

    public Graph() {
        nodes = new ArrayList<Node>() {{
            add(new Node(1, 0, 12));
            add(new Node(2, 1, 10));
            add(new Node(3, 1, 4));
            add(new Node(4, 2, 8));
            add(new Node(5, 4, 5));
            add(new Node(6, 4, 3));
        }};
    }

    public int solveSum(Node node) {
        int sum = node.getWeight();
        List<Node> children = findChildren(node.getId());
        for (Node child: children) {
            sum += solveSum(child);
        }
        node.setSum(sum);

        return sum;
    }

    public Node getFirstNode() {
        return nodes.get(0);
    }

    public void printToConsole() {
        for (Node node: nodes) {
            System.out.println("id = " + node.getId()
                    + ", parentId = " + node.getParentId()
                    + ", weight = " + node.getWeight()
                    + ", sum = " + node.getSum());
        }
    }

    private List<Node> findChildren(int id) {
        List<Node> children = new ArrayList<>();
        for (Node node: nodes) {
            if (node.getParentId() == id)
                children.add(node);
        }

        return children;
    }
}
