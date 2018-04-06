<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 4/4/18
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scopus</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp" />
<h3 class="text-center">List of Books</h3>
<div class="row">
    <div class="col-2"></div>
    <div class="col-8">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>#</th>
                <th>BookName</th>
                <th>YearReleases</th>
                <th>Author</th>
                <th>Publisher</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="listBook" items="${listBook}">
                <tr>
                    <td>${listBook.id}</td>
                    <td>${listBook.bookName}</td>
                    <td>${listBook.releaseDate}</td>
                    <td>${listBook.author.firstName}</td>
                    <td>${listBook.publish.publisherName}</td>
                    <td><button class="btn btn-info">Edit</button>
                        <button class="btn btn-danger">Delete</button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="col-8"></div>
</div>
</body>
</html>
