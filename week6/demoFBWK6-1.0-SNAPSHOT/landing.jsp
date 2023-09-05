<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 25/07/2023
  Time: 04:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sangam</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-custom.css" rel="stylesheet">


</head>

<style>
    .navbar-custom {
        background-color: #3b5998;
        color: #ffffff;
        border-radius: 0;
    }

    .navbar-custom .navbar-nav > li > a {
        color: #fff;
    }

    .navbar-custom .navbar-nav > .active > a {
        color: #ffffff;
        background-color: transparent;
    }

    .navbar-custom .navbar-nav > li > a:hover,
    .navbar-custom .navbar-nav > li > a:focus,
    .navbar-custom .navbar-nav > .active > a:hover,
    .navbar-custom .navbar-nav > .active > a:focus,
    .navbar-custom .navbar-nav > .open > a {
        text-decoration: none;
        background-color: #8b9dc3;
    }

    .navbar-custom .navbar-brand {
        color: #eeeeee;
    }

    .navbar-custom .navbar-toggle {
        background-color: #eeeeee;
    }

    .navbar-custom .icon-bar {
        background-color: #8b9dc3;
    }

    /* for dropdowns only */
    .navbar-custom .navbar-nav .dropdown-menu {
        background-color: #8b9dc3;
    }

    .navbar-custom .navbar-nav .dropdown-menu > li > a {
        color: #fff;
    }

    .navbar-custom .navbar-nav .dropdown-menu > li > a:hover, .navbar-custom .navbar-nav .dropdown-menu > li > a:focus {
        color: #8b9dc3;
    }

    /*for form (name and mail box only.) */
    #name {
        width: 200px;
        height: 40px;
        border-radius: 5px 5px 5px 5px;
        background: white;
        padding: 10px;
        font-size: 18px;
        margin-top: 8px;
        border-width: 1px;
    }

    #mail {
        width: 408px;
        height: 40px;
        border-radius: 5px 5px 5px 5px;
        background: white;
        padding: 10px;
        font-size: 18px;
        margin-top: 8px;
        border-width: 1px;
    }

    /*for submit button only (Create an account)*/
    .btn-login {
        width: 250px;
        height: 40px;
        left: 750px;
        top: 625px;
        background: green;
        font-size: 18px;
        color: white;
        border-radius: 5px 5px 5px 5px;
        border-width: 1px;
        border-style: solid;
        border-color: grey;
        cursor: pointer;
        outline: none;
    }


</style>
<body>
<!--header start-->
<header>
    <!--navbar start-->
    <nav class="navbar navbar-custom">
        <!--fixed width navbar contents-->
        <div class="container">
            <!--navbar header start-->
            <div class="navbar-header">
                <!--Logo and other main items here-->
                <a class="navbar-brand" href="#"><h3><b>Sangam</b></h3></a>

                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" aria-expanded="false"
                        data-target="#navbar-contents">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <!--navbar header end-->

            <!--navbar contents start-->
            <div class="collapse navbar-collapse" id="navbar-contents">
                <!--Login form and other items here-->
                <form class="navbar-form navbar-right">
                    <div class="form-group">
                        <span for="email">Email or Username</span><br>
                        <input type="email" class="form-control" id="email" placeholder="Username" name="email">
                    </div>
                    <div class="form-group">
                        <span for="pwd">Password:</span><br>
                        <input type="password" class="form-control" id="pwd" placeholder="Password" name="pwd"><br>
                    </div>
                    <div class="form-group"><br>
                        <input type="submit" class="form-control" value="Log In"
                               style="background-color:#3b5998; color:#ffffff">
                    </div>
            </div>
            </form>
        </div>
        <!--navbar contents end-->
        </div>
        <!--fixed width end-->
    </nav>
    <!--navbar end-->
</header>
<!--header end-->
<div class="container">
    <div class="row">
        <div class="col-sm-6">
            <h3><b>Sangam helps you connect and share with the people in your life.</b></h3>
            <img src="https://www.facebook.com/rsrc.php/v3/yc/r/GwFs3_KxNjS.png">
        </div>
        <div class="col-sm-1">

        </div>
        <div class="col-sm-5">
            <h1><b>Create an account</b></h1>
            <h4>It's free and always will be.</h4>
            <div class="form-group">
                <div class="raw">
                    <div class="raw">
                        <div class="col-sm-6">
                            <input type="text" name="name" id="name" placeholder="First name" class="form-control">
                        </div>
                        <div class="col-sm-6">
                            <input type="text" name="name" id="name" placeholder="Surname" class="form-control">
                        </div>
                    </div>
                    <div class="col-sm-12">
                        <input type="text" name="mail" id="mail" placeholder="Mobile number or email address"
                               class="form-control">
                        <input type="text" name="mail" id="mail" placeholder="New password" class="form-control">
                        <h4>Birthday</h4>
                        <select>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5" selected="selected">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                            <option value="21">21</option>
                            <option value="22">22</option>
                            <option value="23">23</option>
                            <option value="24">24</option>
                            <option value="25">25</option>
                            <option value="26">26</option>
                            <option value="27">27</option>
                            <option value="28">28</option>
                            <option value="29">29</option>
                            <option value="30">30</option>
                            <option value="31">31</option>
                        </select>
                        <select>
                            <option selected="selected">Jan</option>
                            <option>Feb</option>
                            <option>Mar</option>
                            <option>Apr</option>
                            <option>June</option>
                            <option>July</option>
                            <option>Aug</option>
                            <option>Sept</option>
                            <option>Oct</option>
                            <option>Nov</option>
                            <option>Dec</option>
                        </select>
                        <select>
                            <option selected="selected">1998</option>
                            <option>1999</option>
                            <option>2000</option>
                            <option>2001</option>
                            <option>2002</option>
                            <option>2003</option>
                            <option>2004</option>
                            <option>2005</option>
                            <option>2006</option>
                            <option>2007</option>
                            <option>2008</option>
                            <option>2009</option>
                            <option>2010</option>
                            <option>2011</option>
                            <option>2012</option>
                            <option>2013</option>
                            <option>2014</option>
                            <option>2015</option>
                            <option>2016</option>
                            <option>2017</option>
                        </select>
                        <a href="#">Why do I need to provide date of birth?</a><br>
                        <h4>
                            <input type="radio" name="gender" value="female"> Female
                            <input type="radio" name="gender" value="male"> Male
                        </h4>
                        <span style="color: grey; font-size: 12px;">
                        By clicking Create an account, you agree to our <a href="#">Terms</a> and<br>confirm that you have read our <a
                                href="#">Data Policy</a>, including our <a href="#">Cookie<br>Use Policy</a>. You may receive SMS message notifications from<br> Facebook and can opt out at any time.<br>
                    </span><br>
                        <%--            <input type="submit" name="signup"  class="button" value="Create an account" class="form-control">--%>
                        <button class="btn-login"><a href="login.jsp">Create an count</a></button>
                    </div>
                </div>
                <div style="color: grey; font-size: 14px">
                    <b><br>
                        <a href="#">Create a Page</a> for a celebrity, band or business.
                    </b>
                </div>

            </div>
        </div>
    </div>
    <!--footar started...-->
    <footer style="color: grey; background: white; ">
        <p style="text-align: center;">A Bharat Chaudhary Producation.</p>
    </footer>
    <!--cdn js for bootstrap-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--  <title>Facebook Signup</title>--%>
<%--</head>--%>
<%--<style>--%>
<%--  /* Reset some default styles to ensure consistent rendering */--%>
<%--  body, h1, h2, h3, p, form, label, input {--%>
<%--    margin: 0;--%>
<%--    padding: 0;--%>
<%--  }--%>

<%--  body {--%>
<%--    font-family: Arial, sans-serif;--%>
<%--    line-height: 1.6;--%>
<%--    background-color: #f2f2f2;--%>
<%--  }--%>

<%--  h1 {--%>
<%--    text-align: center;--%>
<%--    margin: 20px 0;--%>
<%--  }--%>

<%--  form {--%>
<%--    max-width: 400px;--%>
<%--    margin: 0 auto;--%>
<%--    background-color: #fff;--%>
<%--    padding: 20px;--%>
<%--    border: 1px solid #ccc;--%>
<%--    border-radius: 5px;--%>
<%--  }--%>

<%--  label {--%>
<%--    display: block;--%>
<%--    margin-bottom: 8px;--%>
<%--  }--%>

<%--  input {--%>
<%--    width: 100%;--%>
<%--    padding: 10px;--%>
<%--    margin-bottom: 15px;--%>
<%--    border: 1px solid #ccc;--%>
<%--    border-radius: 3px;--%>
<%--  }--%>

<%--  input[type="submit"] {--%>
<%--    background-color: #4267B2;--%>
<%--    color: #fff;--%>
<%--    border: none;--%>
<%--    cursor: pointer;--%>
<%--  }--%>

<%--  input[type="submit"]:hover {--%>
<%--    background-color: #3b5998;--%>
<%--  }--%>

<%--  /* Center the form on the page */--%>
<%--  html, body {--%>
<%--    height: 100%;--%>
<%--    display: flex;--%>
<%--    justify-content: center;--%>
<%--    align-items: center;--%>
<%--  }--%>

<%--</style>--%>
<%--<body>--%>
<%--<h1>Facebook Signup</h1>--%>
<%--<form action="signup.jsp" method="post">--%>
<%--  <label for="firstName">First Name:</label>--%>
<%--  <input type="text" name="firstName" id="firstName" required><br>--%>

<%--  <label for="lastName">Last Name:</label>--%>
<%--  <input type="text" name="lastName" id="lastName" required><br>--%>

<%--  <label for="email">Email:</label>--%>
<%--  <input type="email" name="email" id="email" required><br>--%>

<%--  <label for="password">Password:</label>--%>
<%--  <input type="password" name="password" id="password" required><br>--%>

<%--  <input type="submit" value="Sign Up">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

