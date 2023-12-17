package graph.visitor.types.commands;

import graph.visitor.types.core.Command;

public class QueryResult implements Command {
    Command[] commands;

    public QueryResult(Command[] commands) {
        this.commands = commands;
    }

    public Command[] getCommands() {
        return commands;
    }
}
