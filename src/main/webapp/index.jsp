<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html><
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Home Page" %>
</h1>
<br/>
<div><a href="jsps/rooms"> Reserver une chambre</a></div>
<input type="text" value=" check-in " alt=" date de debut de séjour "><input type="text" value=" check-out " alt=" date de fin de séjour ">

<input type="datetime-local" value=" check-in " alt=" date de debut de séjour "><br><br>

<h4> Pour combien de personnes ? </h4><br>
<input type="checkbox" id="one" name="one" value="one personne" >
<label for="one"> 1 personne</label><br>
<input type="checkbox" value="2 personnes " id="two" name="two" value="two personnes" >
<label for="two"> 2 personnes</label><br>
<input type="checkbox" value="3 personnes " id="three" name="three" value="three personnes" >
<label for="three"> 3 personnes</label><br>
<input type="checkbox" value="3 personnes et plus " id="three+" name="three+" value="three+ personnes" >
<label for="three+"> 3 personnes et plus </label><br>
<br>

<a href="jsps/rooms">Modifier une réservation</a><br>


<br><br><br><br><br><br>








<a href="#">Contactez-nous      </a>
<a href="#">Rami le pro :p </a>
</body>
</html>