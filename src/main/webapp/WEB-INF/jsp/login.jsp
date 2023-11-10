<%--
    Document   : login
    Created on : Nov 9, 2023, 12:40:14 PM
    Author     : Neva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@include file="jspf/header.jspf"%>
        <link rel="stylesheet" href="Files/css/login.css">
    </head>
    <style>
    </style>
    <body>
        <div class="main">
            <input type="checkbox" id="chk" aria-hidden="true">
            <div class="signup">
                <label for="chk" aria-hidden="true">Sign up</label>
                <input id="register_username" type="text" name="txt" placeholder="User name" required="">
                <input id="register_email" type="email" name="email" placeholder="Email" required="">
                <input id="register_password" type="password" name="pswd" placeholder="Password" required="">
                <button id="register_button">Register</button>
            </div>

            <div class="login">
                <label for="chk" aria-hidden="true">Login</label>
                <input id="login_username" type="text" name="txt" placeholder="User name" required="">
                <input id="login_password" type="password" name="pswd" placeholder="Password" required="">
                <button id="login_button">Login</button>
            </div>
        </div>
        <script>
            $(document).ready(function () {
                $('#login_button').on('click', function () {
                    $.post('login', {username: $('#login_username').val(), password: $('#login_password').val()}, function (data) {
                        if (data === "ok") {
                            window.location.href = '/home';
                        } else {
                            Swal.fire({
                                title: "Error",
                                text: "Wrong username or password",
                                icon: "error"
                            });
                        }
                    });
                });
            });

        </script>
    </body>
</html>