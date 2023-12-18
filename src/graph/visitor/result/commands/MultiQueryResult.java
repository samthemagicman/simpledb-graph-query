package graph.visitor.result.commands;

import graph.visitor.result.core.Command;

public class MultiQueryResult implements Command {
    QueryResult[] queries;

    public MultiQueryResult(QueryResult[] queries) {
        this.queries = queries;
    }

    public QueryResult[] getQueries() {
        return queries;
    }
}
