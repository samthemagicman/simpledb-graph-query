package graph.visitor.types;

import graph.visitor.types.core.VisitorResult;

public class CreateNodeCommand implements VisitorResult {
    Node[] nodes;

    public CreateNodeCommand(Node[] nodes) {
        this.nodes = nodes;
    }
}
