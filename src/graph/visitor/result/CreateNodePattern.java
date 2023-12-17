package graph.visitor.result;

import graph.visitor.result.core.VisitorResult;

public class CreateNodePattern implements VisitorResult {
    public enum Type {
        SINGLE_NODE, RELATIONSHIP
    }

    Type type;
    Node node;
    Node nodeTo;
    Node nodeFrom;
    Node relationshipNode;

    public CreateNodePattern(Node node) {
        this.type = Type.SINGLE_NODE;
        this.node = node;
    }

    public CreateNodePattern(Node nodeTo, Node nodeFrom, Node relationship) {
        this.type = Type.RELATIONSHIP;
        this.nodeTo = nodeTo;
        this.nodeFrom = nodeFrom;
        this.relationshipNode = relationship;
    }

    public Node getNode() {
        return node;
    }

    public Node getNodeTo() {
        return nodeTo;
    }

    public Node getNodeFrom() {
        return nodeFrom;
    }

    public Node getRelationship() {
        return relationshipNode;
    }

    public Type getType() {
        return type;
    }
}
