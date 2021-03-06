<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/redirect" method="post">
		<div align="center">
			<h1>Employee List</h1>
			<table>
				<tr>
					<td>FIRSTNAME:<input type="text" name="firstName">
					</td>
					<td>LASTNAME:<input type="text" name="lastName">
					</td>
					<td>EMAIL:<input type="text" name="email">
					</td>
					<td><input type="submit"></td>

				</tr>

			</table>
		</div>
	</form>
</body>
</html>