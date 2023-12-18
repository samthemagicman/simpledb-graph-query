package graph.visitor.result.commands;

import graph.visitor.result.MatchPattern;
import graph.visitor.result.Properties;
import graph.visitor.result.core.Command;

public class MatchCommand implements Command {
    MatchPattern[] matchPattern;
    Properties returnPattern;

    public MatchCommand(MatchPattern[] matchPattern) {
        this.matchPattern = matchPattern;
        this.returnPattern = new Properties();
    }

    public MatchCommand(MatchPattern[] matchPattern, Properties returnPattern) {
        this.matchPattern = matchPattern;
        this.returnPattern = returnPattern;
    }

    public MatchPattern[] getMatchPatterns() {
        return matchPattern;
    }

    public Properties getReturnProperties() {
        return returnPattern;
    }
}
