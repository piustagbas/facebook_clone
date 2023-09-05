//package DAO;
//
//import enums.LikeType;
//import Models.Like;
//import Models.User;
//import Models.Post;
//import Models.Comment;
//import Util.DatabaseUtil;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LikeDAO {
//    // Create a new like in the database
//    public void createLike(Like like) {
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement(
//                     "INSERT INTO likes (user_id, post_id, comment_id, like_type) VALUES (?, ?, ?, ?)")) {
//
//            statement.setInt(1, like.getUser().getId());
//            if (like.getPost() != null) {
//                statement.setInt(2, like.getPost().getId());
//                statement.setNull(3, java.sql.Types.INTEGER);
//            } else if (like.getComment() != null) {
//                statement.setNull(2, java.sql.Types.INTEGER);
//                statement.setInt(3, like.getComment().getId());
//            }
//            statement.setString(4, like.getLikeType().toString());
//
//            int rowsInserted = statement.executeUpdate();
//
//            if (rowsInserted > 0) {
//                System.out.println("Like inserted successfully!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Retrieve a like by its ID
//    public Like getLikeById(int likeId) {
//        Like like = null;
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM likes WHERE id = ?")) {
//
//            statement.setInt(1, likeId);
//            ResultSet resultSet = statement.executeQuery();
//
//            if (resultSet.next()) {
//                like = new Like();
//                like.setId(resultSet.getInt("id"));
//                int userId = resultSet.getInt("user_id");
//                User user = new UserDAO().getUserById(userId);
//                like.setUser(user);
//                int postId = resultSet.getInt("post_id");
//                int commentId = resultSet.getInt("comment_id");
//                if (postId > 0) {
//                    Post post = new PostDAO().getPostById(postId);
//                    like.setPost(post);
//                } else if (commentId > 0) {
//                    Comment comment = new CommentDAO().getCommentById(commentId);
//                    like.setComment(comment);
//                }
//                like.setLikeType(LikeType.valueOf(resultSet.getString("like_type")));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return like;
//    }
//
//    // Update a like (usually not needed in most applications)
//
//    // Delete a like by its ID
//    public void deleteLike(int likeId) {
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("DELETE FROM likes WHERE id = ?")) {
//
//            statement.setInt(1, likeId);
//
//            int rowsDeleted = statement.executeUpdate();
//
//            if (rowsDeleted > 0) {
//                System.out.println("Like deleted successfully!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Retrieve all likes from the database
//    public List<Like> getAllLikes() {
//        List<Like> likeList = new ArrayList<>();
//        try (Connection connection = DatabaseUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM likes");
//             ResultSet resultSet = statement.executeQuery()) {
//
//            while (resultSet.next()) {
//                Like like = new Like();
//                like.setId(resultSet.getInt("id"));
//                int userId = resultSet.getInt("user_id");
//                User user = new UserDAO().getUserById(userId);
//                like.setUser(user);
//                int postId = resultSet.getInt("post_id");
//                int commentId = resultSet.getInt("comment_id");
//                if (postId > 0) {
//                    Post post = new PostDAO().getPostById(postId);
//                    like.setPost(post);
//                } else if (commentId > 0) {
//                    Comment comment = new CommentDAO().getCommentById(commentId);
//                    like.setComment(comment);
//                }
//                like.setLikeType(LikeType.valueOf(resultSet.getString("like_type")));
//                likeList.add(like);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return likeList;
//    }
//}
