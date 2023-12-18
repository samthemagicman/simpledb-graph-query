package graph.visitor.result.commands;

import graph.visitor.result.core.Command;

public class MultiQuery implements Command {
    Query[] queries;

    public MultiQuery(Query[] queries) {
        this.queries = queries;
    }

    public Query[] getQueries() {
        return queries;
    }
}
