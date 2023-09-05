<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 26/07/2023
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Facebook</title>
    <link rel="stylesheet" href="./post.css">
</head>
<body>
<header>
    <!-- Facebook header content -->
    <div class="header-container">
        <div class="logo">
            <img src="./WEB-INF/fb_logo.svg" alt="Facebook Logo">
        </div>
        <div class="search-bar">
            <input type="text" placeholder="Search Facebook">
            <button>Search</button>
        </div>
        <div class="profile-nav">
            <img src="" alt="My Example Image">
            <span class="profile-name">Pius Tagbajumi</span>
        </div>
    </div>
</header>
<main>
    <section class="post-creator">
        <div class="post-creator-container">
            <div class="profile-pic">
                <img src="profile_picture.jpg" alt="Profile Picture">
            </div>
            <textarea class="post-input" placeholder="What's on your mind?"></textarea>
            <div class="post-actions">
                <button class="post-button">Post</button>
                <button class="add-photo-button">Add Photo</button>
            </div>
        </div>
    </section>
    <section class="posts">
        <div class="post-item">
            <div class="post-header">
                <img src="friend_profile_picture.jpg" alt="Friend Profile Picture" class="profile-pic">
                <div class="post-info">
                    <h3>Friend's Name</h3>
                    <p>Posted on July 26, 2023</p>
                </div>
            </div>
            <p class="post-content">Post you content and shear with friends.</p>
            <img src="post_image.jpg" alt="Post Image" class="post-image">
            <div class="post-actions">
                <button class="like-button">Like</button>
                <button class="comment-button">Comment</button>
                <button class="share-button">Share</button>
            </div>
        </div>
    </section>
</main>
<footer>
    <div class="footer-container">
        <p>Facebook &copy; 2023</p>
        <ul class="footer-links">
            <li><a href="#">About</a></li>
            <li><a href="#">Privacy Policy</a></li>
            <li><a href="#">Terms of Service</a></li>
            <li><a href="#">Data Policy</a></li>
            <li><a href="#">Cookie Policy</a></li>
        </ul>
    </div>
</footer>
</body>
</html>

