package model;

import java.time.LocalDate;

public class Relationship {

    private int id;
    private String description;
    private String label;
    private String edgeType;
    private int edgeSourceNodeId;
    private int edgeTargetNodeId;
    private LocalDate edgeDateCreated;

    public Relationship(String edgeType, int edgeSourceNodeId, int edgeTargetNodeId,
            LocalDate edgeDateCreated, String description, String type) {
        this.edgeType = edgeType;
        this.edgeSourceNodeId = edgeSourceNodeId;
        this.edgeTargetNodeId = edgeTargetNodeId;
        this.edgeDateCreated = edgeDateCreated;
        this.description = description;
        this.label = type;
    }

    public Relationship(int id, String edgeType, int edgeSourceNodeId, int edgeTargetNodeId,
            LocalDate edgeDateCreated, String description, String type) {
        this.id = id;
        this.edgeType = edgeType;
        this.edgeSourceNodeId = edgeSourceNodeId;
        this.edgeTargetNodeId = edgeTargetNodeId;
        this.edgeDateCreated = edgeDateCreated;
        this.description = description;
        this.label = type;
    }

    public int getId() {
        return id;
    }

    public String getEdgeType() {
        return edgeType;
    }

    public int getEdgeSourceNodeId() {
        return edgeSourceNodeId;
    }

    public int getEdgeTargetNodeId() {
        return edgeTargetNodeId;
    }

    public LocalDate getEdgeDateCreated() {
        return edgeDateCreated;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdgeType(String edgeType) {
        this.edgeType = edgeType;
    }

    public void setEdgeSourceNodeId(int edgeSourceNodeId) {
        this.edgeSourceNodeId = edgeSourceNodeId;
    }

    public void setEdgeTargetNodeId(int edgeTargetNodeId) {
        this.edgeTargetNodeId = edgeTargetNodeId;
    }

    public void setEdgeDateCreated(LocalDate edgeDateCreated) {
        this.edgeDateCreated = edgeDateCreated;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLabel(String type) {
        this.label = type;
    }

    @Override
    public String toString() {
        return "Relationship ID: " + getId() + "\n" +
                "Edge Type: " + getEdgeType() + "\n" +
                "Edge Source Node ID: " + getEdgeSourceNodeId() + "\n" +
                "Edge Target Node ID: " + getEdgeTargetNodeId() + "\n" +
                "Edge Date Created: " + getEdgeDateCreated() + "\n" +
                "Relationship Type: " + getLabel() + "\n";
    }

}
