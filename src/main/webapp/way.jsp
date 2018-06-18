<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
	way<br/>
	<a href="biz/path.jsp">跳转到path</a><br/>
	
	<a href="<%=request.getContextPath() %>/biz/path.jsp">跳转到path</a><br/>
</body>
</html>