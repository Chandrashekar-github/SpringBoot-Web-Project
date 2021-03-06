<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="/employeeAdd" method="post">
		<div align="center">
			<h1>Employee List</h1>
			<table>
				<tr>		
					<td>FIRSTNAME:<input type="text" name="firstName">
					</td>
					</tr>
					<tr>
					<td>LASTNAME:<input type="text" name="lastName">
					</td>
					</tr>
					<tr>
					<td>EMAIL:<input type="text" name="email">
					</td>
					</tr>
					<tr>
					<td><input type="submit"></td>
					</tr>
			</table>
		</div>
	</form>
</div>
	<div>
	<!-- <a href="/employeeAdd">Add Employees </a>  -->
		<table border="1">
			
				<tr>
					<th>Serial  Number</th>
					<th>Employee FirstName</th>
					<th>Employee LastName</th>
					<th>Employee Email</th>
				</tr>
			<c:forEach var="emp" items="${employee}">
			<tr>
			    <td>${emp.serialNo}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.email}</td>
				

			</tr>
		</c:forEach>
			
				
		</table>

	</div>
</body>
</html>