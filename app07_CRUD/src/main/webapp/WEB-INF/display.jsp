<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br><br>
<h2 style="color:red" align="center">Student Details</h2>
<br><br>
<table border="1" align="center">
	<tr>
		<td>Student Id</td>
		<td>Student Name</td>
		<td>Student Address</td>
	</tr>
	<tr>
		<td>${student.sid}</td>
		<td>${student.sname}</td>
		<td>${student.saddr}</td>
	</tr>
</table>
</body>
</html>