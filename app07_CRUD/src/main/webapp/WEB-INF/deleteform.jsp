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
<h2 style="color:red" align="center">Student Delete Form</h2>
<br><br>
<form method="POST" action="delete">
<table align="center">
	<tr>
		<td>Student Id</td>
		<td><input type="text" name="sid"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="DELETE"/></td>
	</tr>
</table>
</form>
<br><br>
</body>
</html>