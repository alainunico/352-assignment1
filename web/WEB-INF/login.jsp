<%-- 
    Document   : login
    Created on : 29-Jun-2022, 9:52:21 PM
    Author     : Alain Unico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Inventory</title>
    </head>
    <body>
        <h1>Home Inventory</h1>
        <h2>Login</h2>
        <form method="post" action="login">
            <label>Username: </label>
            <input type="text" name="username" id="username" value="${username}" required>
            <br>
            <label>Password: </label>
            <input type="password" name="password" id="password" value="${password}" required>
            <br>
            <input type="submit" value="Log in">  
        </form>
            <p> ${message} </p>
    </body>
</html>
