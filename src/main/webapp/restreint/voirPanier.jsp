<%--
  Created by IntelliJ IDEA.
  User: Yasmine
  Date: 4/11/2021
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>votre Panier</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<p style="display:inline;"> Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </p>
<c:if test="${!empty utilisateur.panier}">
    <table class="table table-bordered">
        <tr>
            <th>Code Article</th>
            <th>Designation</th>
            <th>Prix</th>
            <th>Quantite</th>
            <th></th>
        </tr>

        <c:forEach var="item" items="${utilisateur.panier}">
            <tr>
            <tr><td>${item.article.codeArticle}</td>
                <td>${item.article.designation}</td>
                <td>${item.article.prix}</td>
                <td>${item.quantite}</td>
                <td>
                    <a href="SupprimerArticle?articleasupp=${item.article.codeArticle}&quantite=${item.quantite}">Supprimer </a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="AfficherCommandes">Commander</a>
</c:if>
</body>
</html>
