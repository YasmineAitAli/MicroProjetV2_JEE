<%--
  Created by IntelliJ IDEA.
  User: Yasmine
  Date: 4/8/2021
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>s'inscrire</title>
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
        .input1{
            width: 75px;
            float : left;
            margin-right : 20px;
        }
        .input2{
            width: 200px;
        }
        .att{
            float : left;
            color : red;
            font-size : 12px;
        }
        .tab{
            margin-bottom : 100px;
        }



    </style>
</head>
<body>
<h1>Inscriez-vous</h1>
<div class="foo">
    <form action="Inscription" method="POST">
        <table style="with: 50%" class="tab">
            <tr>
                <td><label for="nom">Nom:</label></td>
                <td><input type="text" id="nom" name="nom" ></td>
            </tr>
            <tr>
                <td><label for="prenom">Prenom:</label></td>
                <td><input type="text" id="prenom" name="prenom"></td>
            </tr>
            <tr>
                <td><label for="adresse">Adresse:</label></td>
                <td><input type="text" id="adresse" name="adresse"></td>
            </tr>
            <tr><td></td>
                <td><input type="text" placeholder="Code Postal" id="codepostal" name="codepostal"></td>
            </tr>
            <tr><td></td>
                <td><input type="text" placeholder="Ville" id="ville" name="ville"></td>
            </tr>
            <tr>
                <td><label for="tel">Tel:</label></td>
                <td><input type="text" id="tel" name="tel"></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="text" id="email" name="email"></td>
            </tr>
            <tr>
                <td><label for="motdepasse">Password:</label></td>
                <td><input type="password" id="motdepasse" name="motdepasse"></td>
            </tr>
        </table>

        <input type="submit" value="Submit">
        <label class="att">* Mot de passe obligatoire</label><br>
        <label class="att">* E-mail erroné</label>
    </form>

</div>

</body>
</html>