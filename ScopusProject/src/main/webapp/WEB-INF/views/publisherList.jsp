
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp" />
<h3 class="text-center">List Of Publishers</h3>
<div class="row">
    <div class="col-2"></div>
    <div class="col-8">
        <table class="table table-bordered">
            <tr>
                <th>ID</th>
                <th>PublisherName</th>
                <th>Books Published</th>
                <th>Actions</th>
            </tr>
             <c:forEach var="publisher" items="${listPublisher}">
            <tr>
                <td>${publisher.id}</td>
                <td>${publisher.publisherName}</td>
                <td>${publisher.noofBooksPublished}</td>
                <td>
                    <a href="deletePublisher?id=${publisher.id}">
                        <button class="btn btn-danger">Delete</button>
                    </a>
                </td>
            </tr>
        </c:forEach>

        </table>

    </div>
    <div class="col-2"></div>
</div>
</body>
</html>
