<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<html>
<head>
</head>
<body>
	<%
		User user=new User();
		user.setName("DMETAL");
		user.setAge(21);
		user.setInterest(new String[]{"music","game","read"});
		request.setAttribute("user", user);
		
		User user2=new User();
		user2.setName("DDMETAL");
		user2.setAge(22);
		session.setAttribute("user", user2);
	%>
	name:
	<%
		//User user1=(User)request.getAttribute("user");
		//out.println(user1.getName());
	%>
	<br/>
	name:${user.name}<br/>
	name:${sessionScope.user.name}<br/>
	name:${user['name'] }<br/>
	
	<%
		request.setAttribute("str", "age");
	%>
	age:${user[str]}<br/>
	interest:${user.interest[0] }
</body>
</html>