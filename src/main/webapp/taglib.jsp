<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>
	.row1{
		background-color:#fff3da;
	}
	.row2{
		background-color:#fffad9;
	}
</style>
</head>
<body>
	<%
		User user=new User();
		user.setName("李白");
		user.setAge(21);
		user.setGender("M");
		request.setAttribute("user", user);
		
		List<User> users=new ArrayList<User>();
		for(int i=0;i<5;i++){
			User user1=new User();
			user1.setName("user0"+i);
			user1.setAge(22+i);
			user1.setGender("M");
			users.add(user1);
		}
		request.setAttribute("users", users);
	%>
	姓名:${user.name }<br/>
	性别:<c:if test="${user.gender=='M' }">男</c:if>
		<c:if test="${user.gender=='F' }">女</c:if>
	<br/>
	性别:<c:if test="${user.gender=='M' }">男</c:if>
		<c:if test="${user.gender!='M' }">女</c:if>
	<br/>
	性别:<c:if test="${user.gender=='M' }" var="rs" scope="request">男</c:if>
		<c:if test="${!rs }">女</c:if>
	<br/>
	性别:<c:choose>
			<c:when test="${user.gender=='M' }">男</c:when>
			<c:when test="${user.gender=='F' }">女</c:when>
			<c:otherwise>未知</c:otherwise>
		</c:choose>
	<br/>
	年龄:<c:choose>
			<c:when test="${user.age<18 }">未成年</c:when>
			<c:when test="${user.age>18&&user.age<30 }">青年</c:when>
			<c:when test="${user.age>=30&&user.age<55 }">中年</c:when>
			<c:otherwise>老年</c:otherwise>
		</c:choose>
	<br/>
	<table border="1" width="60%" cellpadding="0" cellspacing="0">
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>index</td>
			<td>序号</td>
		</tr>
		<c:forEach items="${users }" var="u" varStatus="s">
			<tr class="row${s.index%2+1 }">
				<td>${u.name }</td>
				<td>${u.age }</td>
				<td>
					<c:choose>
						<c:when test="${u.gender=='M'}">男</c:when>
						<c:when test="${u.gender=='F'}">女</c:when>
						<c:otherwise>未知</c:otherwise>
					</c:choose>
				</td>
				<td>${s.index}</td>
				<td>${s.count }</td>
			</tr>
		</c:forEach>
	</table>
</body>	
</html>