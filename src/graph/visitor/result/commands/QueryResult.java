package graph.visitor.result.commands;

import graph.visitor.result.core.Command;

public class QueryResult implements Command {
    Command[] commands;

    public QueryResult(Command[] commands) {
        this.commands = commands;
    }

    public Command[] getCommands() {
        return commands;
    }
}
