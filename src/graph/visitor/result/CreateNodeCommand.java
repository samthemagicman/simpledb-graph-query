package graph.visitor.result;

import graph.visitor.result.core.VisitorResult;

public class CreateNodeCommand implements VisitorResult {
    Node[] nodes;

    public CreateNodeCommand(Node[] nodes) {
        this.nodes = nodes;
    }
}
