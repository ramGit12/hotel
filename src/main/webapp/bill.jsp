<%@ page import="com.projet_hotel.hotel.entity.Reservation" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Vous etes à un pas de votre sejour dans notre hotel!" %>
    <%@ include file="WEB-INF/fragments/css.jsp" %>
</h1>
<br/>
<h3>Introduisez vos données bancaires:</h3> <br />
    <div class="flex-3">
        <div class="flex-1">











        </div>
        <div class="flex-2">
            <form action="PayementServlet" method="post">
                <span class="line">ID </span><input type="text" name="id" ><br />
                <span class="line">date d'espiration</span>
                <input type="text" name="jj" ><br />
            <input type="text" name="mm" ><br />
            <input type="text" name="aa" ><br />
                <span class="line">CSC</span>
            <input type="text" name="csc" ><br />
                <span class="line">nom</span>
            <input type="text" name="nom" ><br />
                <span class="line">prenom</span>
            <input type="text" name="prenom" ><br />
                <span class="line">adresse</span>
            <input type="text" name="adresse" ><br />
                <span class="line">adresse de facturation</span>
            <input type="text" name="adresseFacturation" ><br />
                <span class="line">pays</span>
            <input type="text" name="pays" ><br />
                <span class="line">ville</span>
            <input type="text" name="ville" ><br />
                <span class="line">CAP</span>
            <input type="text" name="cap" ><br />
                <span class="line">Tel</span>
            <input type="text" name="tel" ><br />
                <span class="line">GSM</span>
            <input type="text" name="gsm" ><br />
                <span class="line">e-mail</span>
            <input type="text" name="email" ><br />
            <button class="button" type="submit">payer</button>
            </form>
        </div>
    </div>
<% Reservation reservation = (Reservation) request.getAttribute("reservation"); %>
</body>
</html>
