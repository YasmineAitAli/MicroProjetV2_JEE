<%--
  Created by IntelliJ IDEA.
  User: Yasmine
  Date: 4/8/2021
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Acces Interdit</title>
    <style>
        h1{
            margin-left: 20px;
            border-bottom : groove blue 1px;
            color : blue;
            font-style:italic;
            padding-bottom: 10px;
        }
        .links{
            margin: 20px;

        }
        a{
            color : purple;
        }
    </style>

</head>
<body>

    <h1>Acces Interdit</h1> <br>
    <div class="links">
        <a href="identifier.jsp">Déja Client : Identifiez-vous</a><br><br>
        <a href="inscrire.jsp">Nouveau Client : Inscriez-vous</a>
    </div>

</body>
</html>