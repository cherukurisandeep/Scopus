<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 5/4/18
  Time: 2:29 PM
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
<h3 class="text-center">Awards details Form </h3>
<div class="row">
    <div class="col"></div>
    <div class="col">
        <form:form class="container" action="saveAward" modelAttribute="award">
            <div class="row">
                <label class="col-3">Award Name</label>
                <form:input class="col form-control" type="text" path="awardName"></form:input>
            </div>
            <br>
            <div class="row">
                <label class="col-3">Award Name</label>
                <form:textarea class="col form-control" type="textarea" path="awardDesc"></form:textarea>
            </div>
            <br>
            <input type="submit" class="btn btn-success" value="Submit">

        </form:form>
    </div>
    <div class="col"></div>
</div>
</body>
</html>
