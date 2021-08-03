<%@page import="com.bookstore.entity.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../css/style.css">
<%if( request.getAttribute("password") !=null &&  request.getAttribute("email") !=null && request.getAttribute("name") != null )
{%>
<title>Edit User</title>
<%}else { %>
<title>Create New User</title>
<%} %>
</head>
<body>
	<%@ include file="header.jsp"%>

	<br>
	<%
	if ( request.getAttribute("password") !=null &&  request.getAttribute("email") !=null && request.getAttribute("name") != null ) {
	%>
	<div align="center">
            <h2 class="pageheading"> Edit User</h2>
		<form class="form" action="update_user"  method="post" onsubmit="return validateFourmInput() ">
		<input type="hidden" name="userID" value="<%= request.getAttribute("id") %>">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" id="name" name="name" size="20" value="<%=request.getAttribute("name")%>"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" id="email" name="email" size="20" value="<%=request.getAttribute("email")%>"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" id="password" name="password" size="20"value="<%=request.getAttribute("password")%>"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<!-- col span means how much column space by the  column --> 
						<button type="submit">save</button> 
						<button type="reset" onclick="javascript:history.go(-1)">cancel</button>
					</td>
				</tr>
			</table>

		</form>
		<br>
	</div>
	<%
	} else {
	%>
	<div align="center">
	    <h2 class="pageheading"> Create User</h2>
		<form class="form" action="create_user" method="post" onsubmit="return validateFourmInput() ">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" id="email" name="name" size="20"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" id="name" name="email" size="20"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit">save</button> 
						<button type="reset" onclick="javascript:history.go(-1)">cancel</button>
					</td>
				</tr>
			</table>

		</form>
		<br>
	</div>

	<%
	}
	%>

	<%@ include file="footer.jsp"%>
	<script type="text/javascript">
		function validateFourmInput() {
			var EmailField = document.getElementById("email");
			var NameField = document.getElementById("name");
			var PasswordField = document.getElementById("password");

			if (EmailField.value.length == 0) {
				alert("Email is mandatory");
				EmailField.focus();
				return false;
			}

			if (NameField.value.length == 0) {
				alert("Name is mandatory");
				EmailField.focus();
				return false;
			}

			if (PasswordField.value.length == 0) {
				alert("Password is mandatory");
				EmailField.focus();
				return false;
			}
			return true;
		}
	</script>

</body>
</html>