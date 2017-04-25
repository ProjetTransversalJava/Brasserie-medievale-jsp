<%-- 
    Document   : test
    Created on : 25 avr. 2017, 14:02:44
    Author     : daky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% 
            out.print("<p>Id : ");
            out.print(request.getAttribute("id"));
            out.println("</p>");
            out.print("<p>Prix : ");
            out.print(request.getAttribute("prix"));
            out.println("</p>");
            out.print("<p>Article : ");
            out.print(request.getAttribute("article"));
            out.println("</p>");
            out.print("<p>Parametre url : ");
            out.print(request.getAttribute("parametre"));
            out.println("</p>");
        %>
    </body>
</html>
