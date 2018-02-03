package com.company;

/**
 * Created by pavlo on 2/3/2018.
 */
public class Node {
    private int id;
    private int parentId;
    private int weight;
    private int sum;

    public Node(int id, int parentId, int weight) {
        this.id = id;
        this.parentId = parentId;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public int getWeight() {
        return weight;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
