<%@ page import="com.projet_hotel.hotel.services.RoomService" %>
<%@ page import="com.projet_hotel.hotel.entity.Room" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 18-07-22
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Toutes les chambres</title>

</head>
<body>

<%! RoomService service = RoomService.getInstance(); %>

<%
    List<Room> list = service.getAll();

%>

<h1>Toutes les Chambre</h1>

<ul>
    <% for( Room r : list ){ %>
    <li>
        <div>
            <p><span>Type:</span> <%= r.getRoomType() %> </p>
            <p><span>prix:</span> <%= r.getPrice()%> $ </p>
            <p><span>Capacité:</span> <%= r.getCapacity()%> Personne(s) </p>
            <p><a href="bill.jsp?id=<%= r.getRoomId() %>">Choisir la chambre</a></p>

        </div>
    </li>
    <% } %>
</ul>

<a href="<%= request.getContextPath() %>/index.jsp">retour à l'accueil</a>

</body>
</html>