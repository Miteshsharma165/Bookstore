<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>
</head>
<body>

<!-- Include header -->
	<%@include file="header.jsp"%>


<!-- Main -->
	<div align="center">
	<br>
		<form>
			<table>
				<thead>
					<tr>
					 <h3> Login to Proceed</h3>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>Email</td>
						<td><input type="text"></td>
					</tr>
					<tr>
						<td>Paswword</td>
						<td><input type="password"></td>
					</tr>
				</tbody>

				<tfoot>
					<tr>

					</tr>
				</tfoot>

			</table>

		</form>
   <br>
   
	</div>

<!-- Footer Include -->
	<%@include file="footer.jsp"%>

</body>
</html>