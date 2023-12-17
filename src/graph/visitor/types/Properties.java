package graph.visitor.types;

import java.util.NoSuchElementException;

import graph.visitor.types.core.VisitorResult;

public class Properties implements VisitorResult {
    // Would benefit turning this into a dictionary instead for getting properties,
    // but this is ok for now.
    private Pair[] properties;

    public Properties(Pair[] properties) {
        this.properties = properties;
    }

    public Pair[] getProperties() {
        return properties;
    }

    public Pair getPropertyPair(String property) {
        for (Pair pair : properties) {
            if (pair.getProperty().equalsIgnoreCase(property)) {
                return pair;
            }
        }
        return null;
    }

    /**
     * Returns the value of the specified property.
     *
     * @param property the name of the property to retrieve the value for
     * @return the value of the specified property, or null if not found
     */
    public String get(String property) {
        for (Pair pair : properties) {
            if (pair.getProperty().equalsIgnoreCase(property)) {
                return pair.getValue();
            }
        }
        return null;
    }
}