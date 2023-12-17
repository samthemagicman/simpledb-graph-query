package graph.visitor.types.commands;

import graph.visitor.types.core.Command;

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
