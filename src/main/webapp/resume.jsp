<%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 19-07-22
  Time: 08:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Votre paiement a été accepté</h1>
    <h3>Voici les details de votre reservation</h3>
    <h3>check-in: <%= request.getAttribute("checkIn")%></h3>
    <h3>check-out: <%= request.getAttribute("checkOut")%></h3>
    <h3>type de chambre: </h3>
    <h3>nombre de personne: </h3>
</body>
</html>
