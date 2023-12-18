package graph.visitor.result;

import java.util.ArrayList;

import graph.visitor.result.core.VisitorResult;

public class Node implements VisitorResult {
    public enum Type {
        NODE,
        RELATIONSHIP
    }

    Type type;
    Properties properties;
    String variableName;
    String label;
    ArrayList<String> selectProperties = new ArrayList<>();

    public Node(Type type, Properties properties, String variableName, String label) {
        this.type = type;
        this.properties = properties;
        this.variableName = variableName;
        this.label = label;
    }

    public Type getType() {
        return type;
    }

    public Type setType(Type type) {
        return this.type = type;
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

    public String[] getSelectProperties() {
        return selectProperties.toArray(String[]::new);
    }

    public void addSelectProperty(String property) {
        selectProperties.add(property);
    }

    @Override
    public String toString() {
        String result = "(" +
                ":" + getLabel();

        Pair[] properties = getProperties().getProperties();

        if (properties.length > 0) {
            result += " {";

            for (int i = 0; i < properties.length; i++) {
                result += properties[i].getProperty() + ": \"" + properties[i].getValue() + "\"";

                if (i < properties.length - 1) {
                    result += ", ";
                }
            }

            result += "}";
        }

        result = result + ")";

        return result;
    }
}
