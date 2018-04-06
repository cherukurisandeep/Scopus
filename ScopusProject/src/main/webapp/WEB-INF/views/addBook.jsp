<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 4/4/18
  Time: 4:59 PM
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
<div class="row">
    <div class="col-3"></div>
    <div class="col-6">
        <h3 class="text-center"> Add Book Details Form</h3>
        <form:form class="container" action="saveBook" modelAttribute="book">
            <div class="row">
                <label class="col-3">Book Name</label>
                <form:input class="col form-control" type="text" path="bookName"></form:input>
            </div>
            <br>
            <div class="row">
                <label class="col-3">Year</label>
                <form:input class="col form-control" type="number" path="releaseDate"></form:input>
            </div>
            <br>
            <div class="row">
                <label class="col-3">Author</label>
                <form:select class="col form-control" path="author.id" items="${authors}" itemLabel="firstName" itemValue="id" />
            </div>
            <br>
            <div class="row">
                <label class="col-3">Publisher</label>
                <form:select class="col form-control" path="publish.id" items="${publishers}" itemLabel="publisherName" itemValue="id" />
            </div>
            <br>
            <input type="submit" class="btn btn-success" value="Submit">

        </form:form>
    </div>
    <div class="col-3"></div>
</div>
</body>
</html>
