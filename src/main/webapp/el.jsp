<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<html>
<head>
</head>
<body>
	${1+1 }<br/>
	${"1"+"2" }<br/>
	${1<2 }<br/>
	<%
		request.setAttribute("str1", "abc");
	%>
	${str1=="abc" }<br/>
	${1<2&&2>3 }<br/>
	
	<%
		List list=new ArrayList();
		request.setAttribute("list", list);
		request.setAttribute("str2", "");
	%>
	空的集合:${empty list }<br/>
	空字符串:${empty str2 }<br/>
	null值:${empty null }<br/>
	找不到对应的值:${empty abc }<br/>
	
	name:${param.name }<br/>
	interest:${paramValues.interest[0] }
</body>
</html>