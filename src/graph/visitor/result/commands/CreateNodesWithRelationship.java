package graph.visitor.result.commands;

import graph.visitor.result.Node;
import graph.visitor.result.core.Command;

public class CreateNodesWithRelationship implements Command {
    Node nodeTo;
    Node nodeFrom;
    Node relationshipNode;

    public CreateNodesWithRelationship(Node nodeTo, Node nodeFrom, Node relationshipNode) {
        this.nodeTo = nodeTo;
        this.nodeFrom = nodeFrom;
        this.relationshipNode = relationshipNode;
    }

    public Node getNodeTo() {
        return nodeTo;
    }

    public Node getNodeFrom() {
        return nodeFrom;
    }

    public Node getRelationshipNode() {
        return relationshipNode;
    }
}
