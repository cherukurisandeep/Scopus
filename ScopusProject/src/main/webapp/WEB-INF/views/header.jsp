<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 4/4/18
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        /*
* Style tweaks
* --------------------------------------------------
*/
        html,
        body {
            overflow-x: hidden; /* Prevent scroll on narrow devices */
        }
        body {
            padding-top: 100px;
        }
        footer {
            padding: 30px 0;
        }

        /*
         * Custom styles
         */
        .navbar-brand {
            font-size: 24px;
        }

        .navbar-container {
            padding: 20px 0 20px 0;
        }

        .navbar.navbar-fixed-top.fixed-theme {
            background-color: #222;
            border-color: #080808;
            box-shadow: 0 0 5px rgba(0,0,0,.8);
        }

        .navbar-brand.fixed-theme {
            font-size: 18px;
        }

        .navbar-container.fixed-theme {
            padding: 0;
        }

        .navbar-brand.fixed-theme,
        .navbar-container.fixed-theme,
        .navbar.navbar-fixed-top.fixed-theme,
        .navbar-brand,
        .navbar-container{
            transition: 0.8s;
            -webkit-transition:  0.8s;
        }
    </style>
</head>
<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!-- Fixed navbar -->
<nav id="header" class="navbar navbar-fixed-top">
    <div id="header-container" class="container navbar-container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a id="brand" class="navbar-brand" href="#">Scopus</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#book">Books</a></li>
                <li><a href="#about">Publisher</a></li>
                <li><a href="#contact">Author</a></li>
                <li><a href="#contact">Awards</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->
</body>
</html>
