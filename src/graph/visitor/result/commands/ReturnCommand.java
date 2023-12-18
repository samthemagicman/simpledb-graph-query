package graph.visitor.result.commands;

import graph.visitor.result.Properties;
import graph.visitor.result.core.Command;

public class ReturnCommand implements Command {
    Properties properties;

    public ReturnCommand(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }
}