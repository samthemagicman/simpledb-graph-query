package graph.visitor.result.commands;

import graph.visitor.result.core.Command;

public class Query implements Command {
    Command[] commands;

    public Query(Command[] commands) {
        this.commands = commands;
    }

    public Command[] getCommands() {
        return commands;
    }
}
