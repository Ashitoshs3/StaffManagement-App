<%--
  Created by IntelliJ IDEA.
  User: SHUBHAM
  Date: 18-09-2021
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Bootstrap Elegant Sign Up Form</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        body {
            color: #999;
            background: #fafafa;
            font-family: 'Roboto', sans-serif;
        }
        .form-control {
            min-height: 41px;
            box-shadow: none;
            border-color: #e6e6e6;
        }
        .form-control:focus {
            border-color: #00c1c0;
        }
        .form-control, .btn {
            border-radius: 3px;
        }
        .signup-form {
            width: 425px;
            margin: 0 auto;
            padding: 30px 0;
        }
        .signup-form h2 {
            color: #333;
            font-weight: bold;
            margin: 0 0 25px;
        }
        .signup-form form {
            margin-bottom: 15px;
            background: #fff;
            border: 1px solid #f4f4f4;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            padding: 40px 50px;
        }
        .signup-form .form-group {
            margin-bottom: 20px;
        }
        .signup-form label {
            font-weight: normal;
            font-size: 14px;
        }
        .signup-form input[type="checkbox"] {
            position: relative;
            top: 1px;
        }
        .signup-form .btn, .signup-form .btn:active {
            font-size: 16px;
            font-weight: bold;
            background: #00c1c0 !important;
            border: none;
            min-width: 140px;
        }
        .signup-form .btn:hover, .signup-form .btn:focus {
            background: #00b3b3 !important;
        }
        .signup-form a {
            color: #00c1c0;
            text-decoration: none;
        }
        .signup-form a:hover {
            text-decoration: underline;
        }
    </style>
    <style>
        body {
            font-family: 'Varela Round', sans-serif;
        }
        .modal-login {
            color: #636363;
            width: 350px;
        }
        .modal-login .modal-content {
            padding: 20px;
            border-radius: 5px;
            border: none;
        }
        .modal-login .modal-header {
            border-bottom: none;
            position: relative;
            justify-content: center;
        }
        .modal-login h4 {
            text-align: center;
            font-size: 26px;
        }
        .modal-login  .form-group {
            position: relative;
        }
        .modal-login i {
            position: absolute;
            left: 13px;
            top: 11px;
            font-size: 18px;
        }
        .modal-login .form-control {
            padding-left: 40px;
        }
        .modal-login .form-control:focus {
            border-color: #00ce81;
        }
        .modal-login .form-control, .modal-login .btn {
            min-height: 40px;
            border-radius: 3px;
        }
        .modal-login .hint-text {
            text-align: center;
            padding-top: 10px;
        }
        .modal-login .close {
            position: absolute;
            top: -5px;
            right: -5px;
        }
        .modal-login .btn, .modal-login .btn:active {
            border: none;
            background: #00ce81 !important;
            line-height: normal;
        }
        .modal-login .btn:hover, .modal-login .btn:focus {
            background: #00bf78 !important;
        }
        .modal-login .modal-footer {
            background: #ecf0f1;
            border-color: #dee4e7;
            text-align: center;
            margin: 0 -20px -20px;
            border-radius: 5px;
            font-size: 13px;
            justify-content: center;
        }
        .modal-login .modal-footer a {
            color: #999;
        }
        .trigger-btn {
            display: inline-block;
            margin: 100px auto;
        }
    </style>
</head>
<body>
<%@include file="header.jsp"%>
<div class="signup-form">
    <form id="signform" action="signup" method="post">
        <h2>Sign Up</h2>
        <div class="form-group">
            <input type="text" class="form-control" name="username" placeholder="Username" required="required">
        </div>
        <div class="form-group">
            <input type="email" class="form-control" name="email" placeholder="Email Address" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="confirm_password" placeholder="Confirm Password" required="required">
        </div>
        <div class="form-group">
            <label class="form-check-label"><input type="checkbox" required="required"> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
        </div>
        <div class="form-group">
            <button type="submit"  class="btn btn-primary btn-lg">Sign Up</button>
        </div>
    </form>
    <div class="text-center">Already have an account?<a href="#myModal" class="trigger-btn" data-toggle="modal">Login here</a></div>
</div>


<!-- Modal HTML -->
<div id="myModal" class="modal fade">
    <div class="modal-dialog modal-login">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Member Login</h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            </div>
            <div class="modal-body">
                <form action="login" method="post">
                    <div class="form-group">
                        <i class="fa fa-user"></i>
                        <input  name="username" type="text" class="form-control" placeholder="Username" required="required">
                    </div>
                    <div class="form-group">
                        <i class="fa fa-lock"></i>
                        <input name="password" type="password" class="form-control" placeholder="Password" required="required">
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-block btn-lg" value="Login">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <a href="#">Forgot Password?</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>