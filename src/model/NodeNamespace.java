package model;

import java.util.ArrayList;
import java.util.HashMap;

import graph.visitor.result.Node;

public class NodeNamespace extends HashMap<String, ArrayList<Node>> {
    public void addNode(String key, Node node) {
        if (this.containsKey(key)) {
            ArrayList<Node> nodes = this.get(key);
            for (Node n : nodes) {
                if (n.getProperties().get("id") != null
                        && n.getProperties().get("id").equals(node.getProperties().get("id"))) {
                    return;
                }
            }
            if (!nodes.contains(node)) {
                nodes.add(node);
            }
        } else {
            ArrayList<Node> nodes = new ArrayList<Node>();
            nodes.add(node);
            this.put(key, nodes);
        }
    }
}
