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
<h2 style="color:red" align="center">Student Edit Form</h2>
<br><br>
<form method="POST" action="update">
<table align="center">
	<tr>
		<td>Student Id</td>
		<td >${student.sid}</td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td><input type="text" name="sname" value='${student.sname}'/></td>
	</tr>
	<tr>
		<td>Student Address</td>
		<td><input type="text" name="saddr" value='${student.saddr}'/></td>
	</tr>
	<tr>
		<td><input type="submit" value="UPDATE"/></td>
	</tr>
</table>
<input type="hidden" name="sid" value='${student.sid}' />
</form>
<br><br>
</body>
</html>