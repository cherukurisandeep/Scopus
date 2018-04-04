
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 3/4/18
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Scopus</title>
</head>
<body>
<jsp:include page="header.jsp" />
<table>
    <tr>
        <th>ID</th>
        <th>PublisherName</th>
        <th>Books Published</th>
    </tr>
 <c:forEach var="publisher" items="${listPublisher}">
    <tr>
    <td>${publisher.id}</td>
    <td>${publisher.publisherName}</td>
    <td>${publisher.noofBooksPublished}</td>
    </tr>
</c:forEach>

</table>

</body>
</html>
