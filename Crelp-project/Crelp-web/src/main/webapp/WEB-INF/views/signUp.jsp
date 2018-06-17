<%@include file="Header.jsp" %>
<title>Insert title here</title>
</head>
<body class="BodySign">

 <c:set var = "status"  value = "${status}"/>
<c:if test="${status==1}">

<div style="height: auto; width:100%; background-color: red; margin-top: 72px;">
<h1 style="text-align:center; color:white; font-size: 21px;">${FailMessage}</h1>
</div>

</c:if>
<div style="margin-top: 80px; margin-left:20%; margin-right:20%; color: white;">
 

 <h1>Registration</h1>
 <form method="get" action="Registration">
<br><br>
Login:<input class="logtext form-control" style=" width: 300px;"type="text" name="login" placeholder="Login"/>
<br>
Password:<input class="logtext form-control" style=" width: 300px;" type="password" name="password" placeholder="Password"/>
<br>
Name:<input class="logtext form-control" style=" width: 300px;" type="text" name="name" placeholder="Name"/>
<br>
Surname<input class="logtext form-control" style=" width: 300px;" type="text" name="surname" placeholder="Surname"/>
<br>
E-Mail:<input class="logtext form-control" style=" width: 300px;" type="email" name="email" placeholder="E-Mail"/>
<br>

Country:<input class="logtext form-control" style=" width: 300px;" type="text" name="country" placeholder="Country"/>
<br>
Role:&nbsp;<input type="radio" name="role" value="2"/> I have money!&nbsp;
     <input type="radio" name="role" value="1"/> I have an idea!&nbsp;
<br>
<br>

Sex:&nbsp;
<input type="radio" name="sex" value="man" />&nbsp;Man&nbsp;

<input type="radio" name="sex" value="woman"/>&nbsp;Woman
<br>
<br>
Birthday:
<input class="logtext form-control" style=" width: 300px;" type="date" name="birth"/>
<br>
Phone Number
<input class="logtext form-control" style=" width: 300px;" type="tel" name="phone" placeholder="Phone Number">
<br>

 <textarea name = "other"   rows="8" cols="60" placeholder="Other information or name of your comoany" ></textarea> 
<br>

<input type="submit" class="btn btn-default" value="SignIn(Info)">
</form>
</div>

    <!-- Footer -->
    <footer class="py-5" style=" margin-bottom: 0;">
      <div class="container">
        <p class="m-0 text-center text-white small">Copyright &copy; Crelp.com 2018</p>
      </div>
      <!-- /.container -->
    </footer>

</body>
</html>