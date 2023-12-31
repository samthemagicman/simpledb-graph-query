package graph.visitor.result;

import graph.visitor.result.core.VisitorResult;

public class Pair implements VisitorResult {
    private String property;
    private String value;

    public Pair(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }
}
