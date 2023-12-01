package model;

public class Relationship {

    private int relationship_id;
    private int edge_source_node_id;
    private int edge_target_node_id;
    private String relationship_type;

    public Relationship(int relationship_id, int edge_source_node_id, int edge_target_node_id, String relationship_type){
        this.relationship_id = relationship_id;
        this.edge_source_node_id = edge_source_node_id;
        this.edge_target_node_id = edge_target_node_id;
        this.relationship_type = relationship_type;
    }

    public int getRelationship_id(){
        return relationship_id;
    }

    public int getEdge_source_node_id(){
        return edge_source_node_id;
    }

    public int getEdge_target_node_id(){
        return edge_target_node_id;
    }

    public String getRelationship_type(){
        return relationship_type;
    }

    public void setRelationship_id(int relationship_id){
        this.relationship_id = relationship_id;
    }

    public void setEdge_source_node_id(int edge_source_node_id){
        this.edge_source_node_id = edge_source_node_id;
    }

    public void setEdge_target_node_id(int edge_target_node_id){
        this.edge_target_node_id = edge_target_node_id;
    }

    public void setRelationship_type(String relationship_type){
        this.relationship_type = relationship_type;
    }

    @Override
    public String toString(){
        return "Relationship ID: " + relationship_id + "\n" +
            "Edge Source Node ID: " + edge_source_node_id + "\n" +
            "Edge Target Node ID: " + edge_target_node_id + "\n" +
            "Relationship Type: " + relationship_type + "\n";
    }
    
}
