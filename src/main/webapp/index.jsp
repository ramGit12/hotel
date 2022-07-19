<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html><
<head>
    <title>Hotel De Luxe</title>
    <%@ include file="WEB-INF/styles/css_part.jsp" %>
    <%@ include file="WEB-INF/styles/script_part.jsp" %>
    <link rel="stylesheet" href="assets/css/main.css"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>


<body style="background-color: gray ">
<div class="container-fluid">
<h1 class="titre"><%= "Home Page" %>
</h1>

<div id="carou" class="carousel slide" data-ride="carousel">
<ul class="carousel-indicators">
    <li data-target="#carou" data-slide-to="0" class="active"></li>
    <li data-target="#carou" data-slide-to="1"></li>
    <li data-target="#carou" data-slide-to="2"></li>
</ul>
<div class="carousel-inner">
    <div class="carousel-item active">
        <img src="assets/images/chambre1.jpeg" alt="suite vue mer"/>
    </div>
    <div class="carousel-item">
        <img src="assets/images/chambre2.jpeg" alt="suite vue ville"/>
    </div>
    <div class="carousel-item">
        <img src="assets/images/chambre3.jpeg" alt="piscine a l'interieur"/>
    </div>
</div>
</div>


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
    <div id="resa">
        <form action="rooms" method="post">
            <input class="date" type="text" value=" check-in " alt=" date de debut de séjour " name="checkIn">
            <input  class="date" type="text" value=" check-out " alt=" date de fin de séjour " name="checkOut">
            <div class="btn_resa">
                <button type="submit"> Reserver une chambre</button>
            </div>
        </form>

        <!-- <input  class="date" type="datetime-local" value=" check-in " alt=" date de debut de séjour "> -->
    </div>
    <div>
        <a href="jsps/rooms">Modifier votre réservation</a><br>
    </div>

<br><br><br><br><br><br>







<footer><a href="#">Contactez-nous      </a>
    <a href="#">Rami le pro :p </a>
</footer>

</div>
</body>
</html>