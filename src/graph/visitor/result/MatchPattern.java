package graph.visitor.result;

import graph.visitor.result.core.VisitorResult;

public class MatchPattern implements VisitorResult {
    public enum Type {
        SINGLE, RELATIONSHIP, ANY_RELATIONSHIP
    }

    Node nodeSource;
    Node nodeTarget;
    Node nodeRelationship;
    Type type;

    public MatchPattern(Node nodeSource, Type type) {
        this.nodeSource = nodeSource;
        this.type = type;
    }

    public MatchPattern(Node nodeSource, Node nodeTarget, Type type) {
        this.nodeSource = nodeSource;
        this.nodeTarget = nodeTarget;
        this.type = type;
    }

    public MatchPattern(Node nodeSource, Node nodeTarget, Node nodeRelationship, Type type) {
        this.nodeSource = nodeSource;
        this.nodeTarget = nodeTarget;
        this.nodeRelationship = nodeRelationship;
        this.type = type;
    }

    public Node getNodeSource() {
        return nodeSource;
    }

    public Node getNodeTarget() {
        return nodeTarget;
    }

    public Node getNodeRelationship() {
        return nodeRelationship;
    }

    public Type getType() {
        return type;
    }
}
