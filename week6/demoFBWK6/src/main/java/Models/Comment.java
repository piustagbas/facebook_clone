package Models;

import java.security.Timestamp;

public class Comment {
    private int id;
    private User user;
    private Post post;
    private String content;
    private Timestamp timestamp;

    // Constructor, getters, and setters

    public Comment(int id, User user, Post post, String content, Timestamp timestamp) {
        this.id = id;
        this.user = user;
        this.post = post;
        this.content = content;
        this.timestamp = timestamp;
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
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

    // Add methods for CRUD operations on the Comment object if needed
}
