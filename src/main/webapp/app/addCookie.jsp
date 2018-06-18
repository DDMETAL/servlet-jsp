<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
	<%
		Cookie c=new Cookie("userID","001");
		response.addCookie(c);
		c.setPath("/servlet");
	%>
</body>
</html>