<%@include file="Header.jsp" %>
<title>Insert title here</title>
</head>
<body>
<div style="margin-top: 80px; text-align:center;">

<h1>Hello, ${investor.login} !</h1>
<h3>Your name: ${investor.name}</h3>

<h3>Your surname: ${investor.surname}</h3>

<h3>Your phone: ${investor.phone}</h3>
<h3>Thanks for Registration!!!</h3>
<br>
<br>
<form action="saveIdea" method="post">
<input type="text" placeholder="title" name="title">
<input type="text" placeholder="idea" name="idea">
<input type="submit" name="submit">




</form>
</div>
</body>
</html>