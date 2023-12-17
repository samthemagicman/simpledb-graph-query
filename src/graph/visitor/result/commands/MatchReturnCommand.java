package graph.visitor.result.commands;

import graph.visitor.result.MatchPattern;
import graph.visitor.result.Properties;
import graph.visitor.result.core.Command;

public class MatchReturnCommand implements Command {
    MatchPattern matchPattern;
    Properties returnPattern;

    public MatchReturnCommand(MatchPattern matchPattern) {
        this.matchPattern = matchPattern;
    }

    public MatchReturnCommand(MatchPattern matchPattern, Properties returnPattern) {
        this.matchPattern = matchPattern;
        this.returnPattern = returnPattern;
    }

    public MatchPattern getMatchPattern() {
        return matchPattern;
    }

    public Properties getReturnProperties() {
        return returnPattern;
    }
}
