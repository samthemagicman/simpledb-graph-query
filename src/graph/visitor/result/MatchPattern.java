package graph.visitor.result;

import graph.visitor.result.core.VisitorResult;

public class MatchPattern implements VisitorResult {
    public enum Type {
        SINGLE, RELATIONSHIP, UNDIRECTED_RELATIONSHIP
    }

    Node nodeSource;
    Type type;

    public MatchPattern(Node nodeSource, Type type) {
        this.nodeSource = nodeSource;
        this.type = type;
    }

    public Node getNodeSource() {
        return nodeSource;
    }

    public Type getType() {
        return type;
    }
}
