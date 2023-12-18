package graph.visitor.result.commands;

import graph.visitor.result.core.Command;

public class DeleteCommand implements Command {
    private String variableName;

    public DeleteCommand(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }
}
