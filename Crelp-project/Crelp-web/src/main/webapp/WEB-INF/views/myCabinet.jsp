<%@include file="Header.jsp" %>
<title>Insert title here</title>
</head>
<body>
<div style="margin-top: 80px; text-align:center;">

<h1>Hello, ${user1.login} !</h1>
<h3>Your name: ${user1.name}</h3>

<h3>Your surname: ${user1.surname}</h3>

<h3>Your phone: ${user1.phone}</h3>
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