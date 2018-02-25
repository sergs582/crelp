<%@include file="Header.jsp" %>
<title>Log In Page</title>
</head>
<body  class="BackgroundSign">

<form method="post" class="centresq" >
<h1 style="color: white; text-align:center; margin-top:15px;">Log in:</h1>
<h3 class="logtext" style="color: white;">Login:</h3>
<input style="margin-bottom:20px; width: 280px;" class="logtext form-control" type="text" name="login" placeholder="login"/>
<h3 class="logtext" style="color: white;">Password:</h3>
<input style="margin-bottom:20px; width: 280px;" class="logtext form-control"type="password" name="pass" placeholder="password"/> <br>
<input class=" btn btn-success" style="margin-left: 45px" type="submit" name="go" value="Sign Up" >
<input class=" btn btn-success" style="margin-right: 50px; float: right;" type="submit" name="go" value="Log In" >


</form>



</body>
<%@include file="footer.jsp" %>
</html>