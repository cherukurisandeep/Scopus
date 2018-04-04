<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 4/4/18
  Time: 2:11 PM
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
    <div class="col-3"></div>
    <div class="col-6">
        <h1 class="text-center"> Add Author Details Form</h1>
        <form:form class="container" action="saveAuthor" modelAttribute="author" >
            <div class="row">
                <label class="col-3">First Name</label>
                <form:input class="col form-control" type="text" path="firstName"></form:input>
            </div>
            <br>
            <div class="row">
                <label class="col-3">Last Name</label>
                <form:input class="col form-control" type="text" path="lastName"></form:input>
            </div>
            <br>
            <div class="row">
                <label class="col-3">Gender</label>
                <form:select class="col form-control" path="gender">
                    <form:option value="Male">MALE</form:option>
                    <form:option value="Female">FEMALE</form:option>
                </form:select>
            </div>
            <br>
            <div class="row">
                <label class="col-3">Signature</label>
                <form:input class="col form-control" type="text" path="sign.signStmt"></form:input>
            </div>
            <br>
            <br>
                <input class="col-md-4 form-control btn btn-success" type="Submit" style="left: 417px" value="Submit" />
        </form:form>
    </div>
    <div class="col-3"></div>
</div>
</body>
</html>
