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
            <span class="line">Card number </span>
            <span class="line">date d'espiration</span>
            <span class="line">CSC</span>
            <span class="line">nom</span>
            <span class="line">prenom</span>
            <span class="line">adresse</span>
            <span class="line">adresse de facturation</span>
            <span class="line">pays</span>
            <span class="line">ville</span>
            <span class="line">CAP</span>
            <span class="line">Tel</span>
            <span class="line">GSM</span>
            <span class="line">e-mail</span>
        </div>
        <div class="flex-2">
            <form action="PayementServlet" method="get">
                <input type="text" name="name" ><br />
            <input type="text" name="name" placeholder="jj"><br />
            <input type="text" name="name" placeholder="mm"><br />
            <input type="text" name="name" placeholder="aa"><br />
            <input type="text" name="name" placeholder="CSC"><br />
            <input type="text" name="name" placeholder="nom"><br />
            <input type="text" name="name" placeholder="prenom"><br />
            <input type="text" name="name" placeholder="adresse"><br />
            <input type="text" name="name" placeholder="adresse de facturation"><br />
            <input type="text" name="name" placeholder="pays"><br />
            <input type="text" name="name" placeholder="ville"><br />
            <input type="text" name="name" placeholder="CAP"><br />
            <input type="text" name="name" placeholder="Tel"><br />
            <input type="text" name="name" placeholder="GSM"><br />
            <input type="text" name="name" placeholder="e-mail"><br />
            <button class="button" type="submit">payer</button>
            </form>
        </div>
    </div>
<% Reservation reservation = (Reservation) request.getAttribute("reservation"); %>
</body>
</html>
