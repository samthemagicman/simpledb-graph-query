package graph.visitor.types;

import graph.visitor.types.core.VisitorResult;

public class StringResult implements VisitorResult {
    private String result;

    public StringResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
