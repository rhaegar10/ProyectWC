<%-- 
    Document   : simple
    Created on : 05-abr-2014, 13:05:23
    Author     : Nish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animal Lover's Page</title>
    </head>
    <body>
        <h1>Hello Animal lover's!</h1>
        <p>Your favorite animal is a
            <%= request.getParameter("favoriteAnimal") %>
            Wow, mine is too!
        </p>
    </body>
</html>
