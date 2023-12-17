package graph.visitor.result.commands;

import graph.visitor.result.core.Command;

public class CreateCommand implements Command {
    CreateSingleNode[] singleNodes;
    CreateNodesWithRelationship[] nodesWithRelationships;

    public CreateCommand(CreateSingleNode[] singleNodes, CreateNodesWithRelationship[] nodesWithRelationships) {
        this.singleNodes = singleNodes;
        this.nodesWithRelationships = nodesWithRelationships;
    }

    public CreateSingleNode[] getSingleNodes() {
        return singleNodes;
    }

    public CreateNodesWithRelationship[] getNodesWithRelationships() {
        return nodesWithRelationships;
    }
}
