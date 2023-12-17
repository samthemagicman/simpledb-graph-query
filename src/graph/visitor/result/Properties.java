package graph.visitor.result;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import graph.visitor.result.core.VisitorResult;

public class Properties implements VisitorResult {
    // Would benefit turning this into a dictionary instead for getting properties,
    // but this is ok for now.
    private ArrayList<Pair> properties = new ArrayList<>();

    public Properties() {
    }

    public Properties(Pair[] properties) {
        for (Pair pair : properties) {
            this.properties.add(pair);
        }
    }

    public Pair[] getProperties() {
        return properties.toArray(Pair[]::new);
    }

    public Pair getPropertyPair(String property) {
        for (Pair pair : properties) {
            if (pair.getProperty().equalsIgnoreCase(property)) {
                return pair;
            }
        }
        return null;
    }

    public void addProperty(Pair property) {
        properties.add(property);
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