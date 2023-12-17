package graph.visitor.result.commands;

import graph.visitor.result.Node;
import graph.visitor.result.core.Command;

public class MatchSingleCommand implements Command {
    Node node;

    public MatchSingleCommand(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }
}
