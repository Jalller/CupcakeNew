<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Shopping page
    </jsp:attribute>

    <jsp:attribute name="footer">
        Shopping page
    </jsp:attribute>

    <jsp:body>
        <h1>Shop amok</h1>

        <form action="addtocart" method=post>

            <select name="cupcakebottom" id="cupcakebottom"> //kan bare droppe id
                <option value="1">Chocolate (5kr)</option>
                <option value="2">Vanilla (5kr)</option>
                <option value="3">Nutmeg (5kr)</option>
                <option value="4">Pistacio (6kr)</option>
                <option value="5">Almond (7kr)</option>
            </select>

            <select name="cupcaketop" id="cupcaketop">
                <option value="1">Chocolate (5kr)</option>
                <option value="2">Blueberry (5kr)</option>
                <option value="3">Rasberry (5kr)</option>
                <option value="4">Crispy (6kr)</option>
                <option value="5">Strawberry (6kr)</option>
                <option value="6">Rum/Raisin (7kr)</option>
                <option value="7">Orange (8kr)</option>
                <option value="8">Lemon (8kr)</option>
                <option value="9">Blue cheese (9kr)</option>
            </select>

            <select name="quantity" id="quantity">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
            </select>
            <button name="AddtoCart">Add to cart</button>
        </form>

        <h2>Antal linier i kurven: ${requestScope.cartsize}</h2>
        <h2>Indhold i kurv:</h2>
        <c:forEach var="item" items="${sessionScope.cart.cupcakeList}">
          TopId: ${item.topId} BottomId: ${item.bottomId} Quantity: ${item.quantity}</br>
        </c:forEach>


    </jsp:body>

</t:pagetemplate>