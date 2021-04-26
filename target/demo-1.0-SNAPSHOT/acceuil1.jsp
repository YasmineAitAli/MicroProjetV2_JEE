<%--
  Created by IntelliJ IDEA.
  User: Yasmine
  Date: 4/8/2021
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>acceuil1</title><style>
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

    <h1> Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </h1>
    <div class="links">
        <a href="GenererTable">Consulter le Catalogue</a><br><br>
        <a href="VoirPanier">Suivre vos Commandes</a><br><br>
        <a href="AfficherCommandes">Visualiser votre panier</a>
    </div>

</body>
</html>
