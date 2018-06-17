<%@include file="Header.jsp" %>
<title>Insert title here</title>

<c:url var="Avatar" value="/resources/img/ava.jpg"></c:url>
<c:url var="testBack" value="/resources/img/testBack.jpg"></c:url>
<c:url var="settings" value="/resources/img/icons/settings.png"></c:url>




</head>
<body style="background-color:#fff9ef">

<div class="userForm">
<div style="height:250px; border-bottom: 5px solid black; position: relative; width: 100%; background-image: url(${testBack})">
 <div class="Avatar"><img class="ava"alt=""  src="${Avatar}">
</div>
</div>

<a href="changeUser"><img class="settings" src="${settings}"></a>

<div style="float:right; overflow-y: scroll; border-color:black; width: 550px; height: 550px;">

<div class="featuredIdea">
Lorem ipsum dolore
</div>
<br>
<div class="featuredIdea">
Lorem ipsum dolore
</div>

  <a href="addnew"><button style="  float: right; margin: 15px; " class="btn btn-success">Add New Idea</button></a>
</div>




<div style="margin-top: 160px; margin-left: 1.5%">



<h3>${user.name} ${user.surname}</h3>

<div class="userinfo">
<h5 style="font-family: Lao Sangam MN">Country: ${user.country}</h5>
<h5 style="font-family: Lao Sangam MN">E-Mail: ${user.email}</h5>
<h5 style="font-family: Lao Sangam MN">Registration date: ${user.regadate}</h5>
<h5 style="font-family: Lao Sangam MN">Other info: ${user.other}</h5>

</div>





</div>







</div>



</body>
<%@include file="footer.jsp" %>
</html>