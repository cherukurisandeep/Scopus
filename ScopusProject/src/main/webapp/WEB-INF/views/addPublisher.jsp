<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 3/4/18
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Scopus</title>
</head>
<body>
<jsp:include page="header.jsp" />
<form:form action="addPublisher" method="post" modelAttribute="publisher">
    <br>
    <form:input type="text" path="publisherName" />
    <br>
    <form:input type="number" path="noofBooksPublished" />
    <br>
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
