package model;

import java.time.LocalDate;

public class Relationship {

    private int relationship_id;
    private String edge_type; 
    private int edge_source_node_id;
    private int edge_target_node_id;
    private LocalDate edge_date_created;
    private String relationship_description;
    private String relationship_type;

    public Relationship(int relationship_id, String edge_type, int edge_source_node_id, int edge_target_node_id, LocalDate edge_date_created, String relationship_description, String relationship_type){
        this.relationship_id = relationship_id;
        this.edge_type = edge_type;
        this.edge_source_node_id = edge_source_node_id;
        this.edge_target_node_id = edge_target_node_id;
        this.edge_date_created = edge_date_created;
        this.relationship_description = relationship_description;
        this.relationship_type = relationship_type;
    }

    public int getRelationship_id(){
        return relationship_id;
    }

    public String getEdge_type(){
        return edge_type;
    }

    public int getEdge_source_node_id(){
        return edge_source_node_id;
    }

    public int getEdge_target_node_id(){
        return edge_target_node_id;
    }

    public LocalDate getEdge_date_created(){
        return edge_date_created;
    }

    public String getRelationship_description(){
        return relationship_description;
    }

    public String getRelationship_type(){
        return relationship_type;
    }

    public void setRelationship_id(int relationship_id){
        this.relationship_id = relationship_id;
    }

    public void setEdge_type(String edge_type){
        this.edge_type = edge_type;
    }

    public void setEdge_source_node_id(int edge_source_node_id){
        this.edge_source_node_id = edge_source_node_id;
    }

    public void setEdge_target_node_id(int edge_target_node_id){
        this.edge_target_node_id = edge_target_node_id;
    }

    public void setEdge_date_created(LocalDate edge_date_created){
        this.edge_date_created = edge_date_created;
    }

    public void setRelationship_description(String relationship_description){
        this.relationship_description = relationship_description;
    }

    public void setRelationship_type(String relationship_type){
        this.relationship_type = relationship_type;
    }


    @Override
    public String toString(){
        return "Relationship ID: " + relationship_id + "\n" +
                "Edge Type: " + edge_type + "\n" +
                "Edge Source Node ID: " + edge_source_node_id + "\n" +
                "Edge Target Node ID: " + edge_target_node_id + "\n" +
                "Edge Date Created: " + edge_date_created + "\n" +
                "Relationship Description: " + relationship_description + "\n" +
                "Relationship Type: " + relationship_type + "\n";
    }
    
}
