package model;

import java.time.LocalDate;

public class Node {

    private int id;
    private String label;
    private String name;
    private String username;
    private String email;
    private String content;
    private LocalDate dateCreated;
    private String tags;
    private String country;
    private String city;

    public Node(String type) {
        this.label = type;
    }

    public Node(String type, String name, String username, String email, String content,
            LocalDate dateCreated, String tags, String country, String city) {
        this.label = type;
        this.name = name;
        this.username = username;
        this.email = email;
        this.content = content;
        this.dateCreated = dateCreated;
        this.tags = tags;
        this.country = country;
        this.city = city;
    }

    public Node(int id, String type, String name, String username, String email, String content,
            LocalDate dateCreated, String tags, String country, String city) {
        this.id = id;
        this.label = type;
        this.name = name;
        this.username = username;
        this.email = email;
        this.content = content;
        this.dateCreated = dateCreated;
        this.tags = tags;
        this.country = country;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String getTags() {
        return tags;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String type) {
        this.label = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Node ID: " + getId() + "\n" +
                "Node Type: " + getLabel() + "\n" +
                "Node Name: " + getName() + "\n" +
                "Node Email: " + getEmail() + "\n" +
                "Node Content: " + getContent() + "\n" +
                "Node Date Created: " + getDateCreated() + "\n" +
                "Node Tags: " + getTags() + "\n" +
                "Node Country: " + getCountry() + "\n" +
                "Node City: " + getCity() + "\n";
    }
}
