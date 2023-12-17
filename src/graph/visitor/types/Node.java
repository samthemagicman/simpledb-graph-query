package graph.visitor.types;

import graph.visitor.types.core.VisitorResult;

public class Node implements VisitorResult {
    public enum Type {
        NODE,
        RELATIONSHIP
    }

    Type type;
    Properties properties;
    String variableName;
    String label;

    public Node(Type type, Properties properties, String variableName, String label) {
        this.type = type;
        this.properties = properties;
        this.variableName = variableName;
        this.label = label;
    }

    public Type getType() {
        return type;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getLabel() {
        return label;
    }
}
