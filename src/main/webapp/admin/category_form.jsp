<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>

	<%@ include file="header.jsp"%>

	<br>
	<% if(request.getParameter("id") == null && request.getAttribute("message")==null) {%>
	<div align="center">
	  <h2 class="pageheading">Create Category</h2>	  
		<form class="form" action="create_category" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<button type="submit">save</button>
					<button type="button" onclick="javascript:history.go(-1)">cancel</button>
					</td>
				</tr>

			</table>
		</form>
	</div>
	<%}  else{%>
       	<div align="center">
       	<h2 class="pageheading">Edit Category</h2>
       	<form class="form" action="update_category" method="post" onsubmit="return validateFourmInput()">
       	<input type="hidden" name="categoryId" value="<%=request.getParameter("id") %>" />
			<table>
				<tr>
					<td>Name</td>
					<td>
					<input type="text" id="name" name="name" value="<%= request.getAttribute("name") %>" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					
					<button type="submit">save</button>
					<button type="button" onclick="javascript:history.go(-1)">cancel</button>
					
					</td>
				</tr>

			</table>
		</form>
	</div>
	<%} %>	
	
	
	
	<br>
	<%@ include file="footer.jsp"%>

<script>
function validateFourmInput(){
	var name=document.getElementById("name");
	if(name.value.length == 0){
		alert("Category Name Not Be Null");
		name.focus();
		return false;
	}
	return true;
}

</script>

</body>
</html>