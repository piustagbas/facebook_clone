package DAO;

import Models.Post;
import Models.User;
import Util.DatabaseUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    // Create a new post in the database
    public void createPost(Post post) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO posts (user_id, content) VALUES (?, ?)")) {

            statement.setInt(1, Math.toIntExact(post.getUser().getId()));
            statement.setString(2, post.getContent());

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Post inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve a post by its ID
    public Post getPostById(int postId) {
        Post post = null;
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM posts WHERE id = ?")) {

            statement.setInt(1, postId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                post = new Post();
                post.setId(resultSet.getInt("id"));
                int userId = resultSet.getInt("user_id");
                User user = new UserDAO().getUserById(userId);
                post.setUser(user);
                post.setContent(resultSet.getString("content"));
                post.setTimestamp(resultSet.getTimestamp("timestamp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return post;
    }

    // Update a post
    public void updatePost(Post post) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "UPDATE posts SET content = ? WHERE id = ?")) {

            statement.setString(1, post.getContent());
            statement.setInt(2, post.getId());

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Post updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a post by its ID
    public void deletePost(int postId) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM posts WHERE id = ?")) {

            statement.setInt(1, postId);

            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Post deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve all posts from the database
    public List<Post> getAllPosts() {
        List<Post> postList = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM posts");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Post post = new Post();
                post.setId(resultSet.getInt("id"));
                int userId = resultSet.getInt("user_id");
                User user = new UserDAO().getUserById(userId);
                post.setUser(user);
                post.setContent(resultSet.getString("content"));
                post.setTimestamp(resultSet.getTimestamp("timestamp"));
                postList.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postList;
    }
}
