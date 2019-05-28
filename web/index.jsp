<%@page import="java.util.List"%>
<%@page import="dao.User"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% List tDaneList = (List)session.getAttribute("tDaneList");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <table>
         <tr>
            <th>Id</th>
            <th>Numer</th>
            <th>Tytuł</th>
            <th>Opis</th>
            <th>Kwota</th>                                                              
         </tr>
    <c:forEach items="${tDaneList}" var="tDane">
        <tr>
            <td><c:out value="${tDane.getId()}"/></td>
            <td><c:out value="${tDane.getNr()}"/></td>
            <td><c:out value="${tDane.getTytul()}"/></td>
            <td><c:out value="${tDane.getOpis()}"/></td>
            <td><c:out value="${tDane.getKwota()}"/></td>
        </tr>
    </c:forEach>
</table>
    </body>
</html>