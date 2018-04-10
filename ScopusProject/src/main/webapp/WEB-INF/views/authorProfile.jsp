<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 5/4/18
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scopus</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="header.jsp" />
<h3 class="text-center">Author Complete Profile</h3>
<div class="row">
    <div class="col-2"></div>
    <div class="col-8">
        <div id="accordion">
            <div class="card">
                <div class="card-header" id="headingOne">
                    <h5 class="mb-0">
                        <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                           Author Details
                        </button>
                    </h5>
                </div>

                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                    <div class="card-body">
                        <div class="row">
                                <labe class="col">Author Name</labe>
                                <span class="col">${author.firstName} ${author.lastName}</span>
                        </div>
                        <br>
                        <div class="row">
                            <labe class="col">Gender</labe>
                            <span class="col">${author.gender}</span>
                        </div>
                        <br>
                        <div class="row">
                            <labe class="col">Signature</labe>
                            <span class="col">${author.sign.signStmt}</span>
                        </div>
                        <br>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header" id="headingTwo">
                    <h5 class="mb-0">
                        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                            Author - Books Details
                        </button>
                    </h5>
                </div>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                    <div class="card-body">
                        <div class="row">
                        <c:forEach var="books" items="${author.book}">
                            <div class="col-md-3">
                            <div class="card">
                                <div class="card-body">
                                    <h6 class="card-title">Book Name: ${books.bookName}</h6>
                                    <h6 class="card-subtitle mb-2 text-muted">Books Released on : <strong>${books.releaseDate}</strong></h6>
                                </div>
                            </div>
                            </div>
                        </c:forEach>
                    </div>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header" id="headingThree">
                    <h5 class="mb-0">
                        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                            Author Awards
                        </button>
                    </h5>
                </div>
                <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                    <div class="card-body">
                        <div class="card-body">
                            <div class="row">
                                <form action="saveAuthorAward" method="post">
                                    <input type="hidden" name="authorId" value="${author.id}">
                                <select class="col form-control" name="awardId">
                                    <c:forEach var="award" items="${awards}">
                                        <option value="${award.id}">${award.awardName}</option>
                                    </c:forEach>
                                </select>
                                    <input type="submit" value="Submit">
                                </form>
                            </div>
                            <div class="row">
                                <c:forEach var="awards" items="${author.awards}">
                                    <div class="col-md-4">
                                        <div class="card">
                                            <div class="row">
                                                <a href="deleteAuthorAward?authorId=${author.id}&awardId=${awards.id}"><button class="btn btn-danger" style="margin-left: 214px;">
                                                    x</button></a>
                                            </div>
                                            <div class="card-body">
                                                <h6 class="card-title">Award:${awards.awardName}</h6>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-2"></div>
</div>
</div>
</body>
</html>
