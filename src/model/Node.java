package model;

public class Node {

    private int node_id;
    private String node_type;
    private String node_name;
    private String node_username;
    private String node_email;
    private String node_dob;
    private String node_content;
    private String node_date_created;
    private String node_tags;
    
    public Node(int node_id, String node_type, String node_name, String username, String node_email, String node_dob, String node_content, String node_date_created, String node_tags){
        this.node_id = node_id;
        this.node_type = node_type;
        this.node_name = node_name;
        this.node_username = username;
        this.node_email = node_email;
        this.node_dob = node_dob;
        this.node_content = node_content;
        this.node_date_created = node_date_created;
        this.node_tags = node_tags;
    }

    public int getNode_id(){
        return node_id;
    }

    public String getNode_type(){
        return node_type;
    }

    public String getNode_name(){
        return node_name;
    }

    public String getNode_username(){
        return node_username;
    }

    public String getNode_email(){
        return node_email;
    }

    public String getNode_dob(){
        return node_dob;
    }

    public String getNode_content(){
        return node_content;
    }

    public String getNode_date_created(){
        return node_date_created;
    }

    public String getNode_tags(){
        return node_tags;
    }

    public void setNode_id(int node_id){
        this.node_id = node_id;
    }

    public void setNode_type(String node_type){
        this.node_type = node_type;
    }

    public void setNode_name(String node_name){
        this.node_name = node_name;
    }

    public void setNode_username(String node_username){
        this.node_username = node_username;
    }

    public void setNode_email(String node_email){
        this.node_email = node_email;
    }

    public void setNode_dob(String node_dob){
        this.node_dob = node_dob;
    }

    public void setNode_content(String node_content){
        this.node_content = node_content;
    }

    public void setNode_date_created(String node_date_created){
        this.node_date_created = node_date_created;
    }

    public void setNode_tags(String node_tags){
        this.node_tags = node_tags;
    }

    @Override
    public String toString(){
        return "Node ID: " + node_id + "\n" +
               "Node Type: " + node_type + "\n" +
               "Node Name: " + node_name + "\n" +
               "Node Email: " + node_email + "\n" +
               "Node DOB: " + node_dob + "\n" +
               "Node Content: " + node_content + "\n" +
               "Node Date Created: " + node_date_created + "\n" +
               "Node Tags: " + node_tags + "\n";
    }
}
