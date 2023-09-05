package Models;

import java.security.Timestamp;

public class Post {
    private int id;
    private User user;
    private String content;
    private Timestamp timestamp;

    // Constructor, getters, and setters

    public Post(int id, User user, String content, Timestamp timestamp) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Post() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setTimestamp(java.sql.Timestamp timestamp) {
    }

    // Add methods for CRUD operations on the Post object if needed
}
