<%@include file="Header.jsp" %>



<title>LogIn Page</title>
</head>
 <c:set var = "status"  value = "${status}"/>
<c:if test="${status==1}">

<div style="height: auto; width:100%; background-color: red; margin-top: 72px;">
<h1 style="text-align:center; color:white; font-size: 21px;">${FailMessage}</h1>
</div>

</c:if>
<body  class="BackgroundSign">



<form method="post" class="centresq" action="login" >
<h1 style="color: white; text-align:center; margin-top:15px;">Log in:</h1>
<h3 class="logtext" style="color: white;">Login:</h3>
<input style="margin-bottom:20px; width: 280px;" class="logtext form-control" type="text" name="login" placeholder="login"/>
<h3 class="logtext" style="color: white;">Password:</h3>
<input style="margin-bottom:20px; width: 280px;" class="logtext form-control"type="password" name="password" placeholder="password"/> <br>
<input class=" btn btn-success" style="margin-left: 45px" type="submit" name="go" value="Sign Up" >
<input class=" btn btn-success" style="margin-right: 50px; float: right;" type="submit" name="go" value="Log In" >


</form>



</body>
<%@include file="footer.jsp" %>
</html>