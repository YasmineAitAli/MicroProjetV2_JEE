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
    <title>WebForm1</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<p> Fiche  : ${article.designation} </p> <br>
<form method="GET" action="AjouterAuPanier">
    <label for="codeArticle">Code Article :</label>
    <input type="text" id="codeArticle" value="${article.codeArticle}" name="param" readonly>
    <label for="designation">Designation:</label>
    <input type="text" id="designation" value="${article.designation}" readonly><br>
    <label for="prix">Prix :</label>
    <input type="text" id="prix" value="${article.prix}" readonly>
    <label for="categorie">Categorie :</label>
    <input type="text" id="categorie" value="${article.categorie.cat}" readonly><br>
    <label for="stock">En Stock :</label>
    <input type="text" id="stock" value="${article.stock}" readonly> <br>
    <label for="quantite">Combien voulez-vous :</label>
    <input type="text" id="quantite" name="quantite">
    <input type="Submit" value="Ajouter au panier" >
</form>
</body>
</html>
