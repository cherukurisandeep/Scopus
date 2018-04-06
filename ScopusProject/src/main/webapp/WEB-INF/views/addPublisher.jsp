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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp" />
<h3 class="text-center">Add Publisher Details</h3>
<div class="row">
    <div class="col"></div>
    <div class="col">
        <form:form class="container" action="savePublisher" method="post" modelAttribute="publisher">
            <div class="row">
                <label class="col">Publisher Name</label>
                <form:input class="col form-control" type="text" path="publisherName" />
            </div>
            <br>
            <div class="row">
                <label class="col">No Of Books Published</label>
                <form:input class="col form-control" type="number" path="noofBooksPublished" />
            </div>
            <br>
            <input class="btn btn-success" type="submit" value="Submit" />
        </form:form>
    </div>
    <div class="col"></div>
</div>


</body>
</html>
