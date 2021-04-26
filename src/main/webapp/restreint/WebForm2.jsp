<%--
  Created by IntelliJ IDEA.
  User: Yasmine
  Date: 4/8/2021
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>WebForm2</title>

</head>

<body>

    <p style="display:inline;"> Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </p>
    <p style="display:inline; "align="right"><a href="VoirPanier">Voir votre panier</a>.</p>

    <form action="GenererTable" method="GET">
        <label> Categorie:</label>
        <select name="categorie">
            <c:forEach var="name"  items="${sessionScope['taListe']}" >
                <option value="${name}" <c:if test="${name == sessionScope.selected}">selected</c:if>> ${name} </option>
            </c:forEach>
        </select>
        <input type="submit" value="ok" />
    </form>

    <c:if test="${!empty maListe}">
        <div class="d-flex justify-content-around">
            <c:forEach var="item" items="${maListe}">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="${item.photo}" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">${item.designation}</h5>
                        <p class="card-text">${item.stock} En stock</p>
                        <p class="card-text">${item.prix} $</p>
                        <a href="GenererArticle?param=${item.codeArticle}" class="btn btn-primary">Ajouter au panier</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>
</body>
</html>