package model;

import graph.visitor.result.Node;

public class MatchQueryResult {
    Node source;
    Node target;
    Node relationship;

    public MatchQueryResult(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

    public MatchQueryResult(Node source, Node target, Node relationship) {
        this.source = source;
        this.target = target;
        this.relationship = relationship;
    }

    public Node getSource() {
        return source;
    }

    public Node getTarget() {
        return target;
    }

    public Node getRelationship() {
        return relationship;
    }
}
