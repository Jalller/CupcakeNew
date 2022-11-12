<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Olsker cupcake
    </jsp:attribute>

    <jsp:attribute name="footer">
        Olsker cupcake
    </jsp:attribute>

    <jsp:body>

        <p>Log venligst på systemet først</p>
        <p>Herefter kan du hanle</p>
        <p>Det kan du gøre her: <a href="login.jsp">Login</a></p>
    </jsp:body>

</t:pagetemplate>