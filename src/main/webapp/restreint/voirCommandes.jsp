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
<html>
<head>
    <title>vos Commandes</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<p style="display:inline;"> Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </p>
<c:if test="${!empty utilisateur.achats}">
    <table class="table table-bordered">
        <tr>
            <th>Code Article</th>
            <th>Designation</th>
            <th>Prix</th>
            <th>Quantite</th>
            <th>Totale</th>
            <th>Date commande</th>
        </tr>

        <c:forEach var="item" items="${utilisateur.achats}">
            <tr>
            <tr><td>${item.codeArticle}</td>
                <td>${item.designation}</td>
                <td>${item.prix}</td>
                <td>${item.qteCde}</td>
                <td>${item.totale}</td>
                <td>${item.dateCommande}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
