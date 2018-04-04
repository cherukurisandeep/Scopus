<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 4/4/18
  Time: 4:03 PM
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
<div class="row">
    <div class="col-2"></div>
    <div class="col-8">
        <jsp:include page="header.jsp" />
        <h3 class="text-center">List of Authors</h3>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>#</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Gender</th>
                <th>Signature</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="listAuthor" items="${listAuthor}">
                    <tr>
                        <th scope="row">${listAuthor.id}</th>
                        <td>${listAuthor.firstName}</td>
                        <td>${listAuthor.lastName}</td>
                        <td>${listAuthor.gender}</td>
                        <td>${listAuthor.sign.signStmt}</td>
                        <td><button class="btn btn-info">Edit</button>
                            <button class="btn btn-danger">Delete</button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </div>
    <div class="col-2"></div>
</div>
</body>
</html>
