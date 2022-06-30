<%-- 
    Document   : inventory
    Created on : 29-Jun-2022, 9:53:25 PM
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
        <h1>Home Inventory for ${username}</h1>
        <h2> Add Item </h2>
        <form method="post" action="additems">
            <label>Category: </label>
            <input type="dropdown" name="category" id="category" value="${category}" required>
            <br>
            <label>Item Name: </label>
            <input type="text" name="item" id="item" value="" required>
            <br>
            <label>Price: </label>
            <input type="text" name="price" id="price" value="" required>
            <br>
            <input type="submit" value="Add">
        </form>
            <p> ${addMessage} </p>
            <p> ${totalMessage} </p>
           
            <a href="login?logout">Log out</a> 
            
            
     </body>
</html>
