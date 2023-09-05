//package DAO;
//
//import Models.Comment;
//import Models.User;
//import Models.Post;
//import Util.DatabaseUtil;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CommentDAO {
//    // Create a new comment in the database
//    public void createComment(Comment comment) {
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement(
//                     "INSERT INTO comments (user_id, post_id, content) VALUES (?, ?, ?)")) {
//
//            statement.setInt(1, comment.getUser().getId());
//            statement.setInt(2, comment.getPost().getId());
//            statement.setString(3, comment.getContent());
//
//            int rowsInserted = statement.executeUpdate();
//
//            if (rowsInserted > 0) {
//                System.out.println("Comment inserted successfully!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Retrieve a comment by its ID
//    public Comment getCommentById(int commentId) {
//        Comment comment = null;
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM comments WHERE id = ?")) {
//
//            statement.setInt(1, commentId);
//            ResultSet resultSet = statement.executeQuery();
//
//            if (resultSet.next()) {
//                comment = new Comment();
//                comment.setId(resultSet.getInt("id"));
//                int userId = resultSet.getInt("user_id");
//                User user = new UserDAO().getUserById(userId);
//                comment.setUser(user);
//                int postId = resultSet.getInt("post_id");
//                Post post = new PostDAO().getPostById(postId);
//                comment.setPost(post);
//                comment.setContent(resultSet.getString("content"));
//                comment.setTimestamp(resultSet.getTimestamp("timestamp"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return comment;
//    }
//
//    // Update a comment
//    public void updateComment(Comment comment) {
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement(
//                     "UPDATE comments SET content = ? WHERE id = ?")) {
//
//            statement.setString(1, comment.getContent());
//            statement.setInt(2, comment.getId());
//
//            int rowsUpdated = statement.executeUpdate();
//
//            if (rowsUpdated > 0) {
//                System.out.println("Comment updated successfully!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Delete a comment by its ID
//    public void deleteComment(int commentId) {
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("DELETE FROM comments WHERE id = ?")) {
//
//            statement.setInt(1, commentId);
//
//            int rowsDeleted = statement.executeUpdate();
//
//            if (rowsDeleted > 0) {
//                System.out.println("Comment deleted successfully!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Retrieve all comments of a post from the database
//    public List<Comment> getAllCommentsByPost(int postId) {
//        List<Comment> commentList = new ArrayList<>();
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM comments WHERE post_id = ?");
//             ResultSet resultSet = statement.executeQuery()) {
//
//            statement.setInt(1, postId);
//
//            while (resultSet.next()) {
//                Comment comment = new Comment("6yu","hvgjhv","jhvg");
//                comment.setId(resultSet.getInt("id"));
//                int userId = resultSet.getInt("user_id");
//                User user = new UserDAO().getUserById(userId);
//                comment.setUser(user);
//                int postID = resultSet.getInt("post_id");
//                Post post = new PostDAO().getPostById(postID);
//                comment.setPost(post);
//                comment.setContent(resultSet.getString("content"));
//                comment.setTimestamp(resultSet.getTimestamp("timestamp"));
//                commentList.add(comment);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return commentList;
//    }
//}
