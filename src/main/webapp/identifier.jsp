<%--
  Created by IntelliJ IDEA.
  User: Yasmine
  Date: 4/8/2021
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>identifier</title>
    <style>
        h1{
            text-align : center;
            font-weight : bolder;
            font-size :70px;
            color : purple;
            font-style :italic;


        }
        form{

            display : inline-block;

        }
        .som{
            margin-left: 60px;
            min-width : 100px;
        }
        label{
            float : left;

            color : blue;
            font-weight : bolder;
        }
        .foo{
            display : block;
            text-align : center;
        }

    </style>
</head>
<body>
<h1>Identifiez-vous</h1>
<div class="foo">
    <form action="Identification" method="post">
        <table style="with: 50%">
            <tr class="tt">
                <td><label for="email">Email :</label></td>
                <td><input type="text" id="email" name="email" /></td>
            </tr>
            <tr>
                <td><label for="motdepasse">Mot de passe :</label></td>
                <td><input type="password" id="motdepasse" name="motdepasse" /></td>
                <td><input type="submit" value="OK" class="som" /></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>