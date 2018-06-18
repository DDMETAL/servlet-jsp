<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
	<head></head>
	<body>
		先定一个小目标，挣他一个亿<br/>
		current time:
		<%
			Date date=new Date();
			out.println(date);
			
		%>
		<br/>
		current time1:<%=new Date() %>
		<%
			for(int i=0;i<100;i++){
				out.println("<h1>HelloWorld</h1>");
			}
		%>
	</body>
</html>