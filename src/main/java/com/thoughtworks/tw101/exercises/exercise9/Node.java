package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String name;

    Node leftNode;
    Node rightNode;
    ArrayList<String> names = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        int direction = this.name.compareTo(nameOfNewNode);

        if (direction > 0) {
            if (this.leftNode == null) {
                this.leftNode = new Node(nameOfNewNode);
            } else {
                this.leftNode.add(nameOfNewNode);
            }
        } else {
            if (this.rightNode == null) {
                this.rightNode = new Node(nameOfNewNode);
            } else {
                this.rightNode.add(nameOfNewNode);
            }
        }

     }

    public List<String> names() {
        orderNames(this);
        return names;
    }

    private void orderNames(Node currentNode) {
        if (currentNode == null) {
            return;
        }

        orderNames(currentNode.leftNode);
        names.add(currentNode.name);
        orderNames(currentNode.rightNode);
    }
}
