package graph.visitor.types.commands;

import graph.visitor.types.Node;
import graph.visitor.types.core.Command;

public class CreateSingleNode implements Command {
    Node node;

    public CreateSingleNode(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }
}
