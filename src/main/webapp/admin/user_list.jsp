<%@page import="com.bookstore.service.UserServices"%>
<%@page import="com.bookstore.entity.Users , java.util.List"%>
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
   
  
<%@ include file="header.jsp" %>


<div align="center">
  
 
  
  <h1 class="pageheading">User Management</h1>
  <h2><a href="user_form.jsp">Create New user</a></h2>
   <div>
  <% 
    String message= (String)request.getAttribute("message");
    if(message != null){%>
    	<div>
    	 <h3 class="message"><%= message %></h3>
    	</div>
    	
     <%}%>
</div>  
     <table border="1" cellpadding="5">
        <tr>
           <th>Index</th>
           <th>Id</th>
           <th>Name</th>
           <th>Email</th>
           <th>password</th>
           <th>Actions</th>
        
        </tr>
              <%! int i=0; %>
             <% 
           List<Users> list=(List<Users>) request.getAttribute("listUser");
           for(Users user:list){%>   <!-- you can also use jstl forEach loop-->
            <tr>
            <td><%= i=i+1 %></td>
        	<td><%=user.getUser_Id() %></td>   
            <td><%=user.getFull_Name() %></td>
            <td><%=user.getEmail() %></td>
            <td><%=user.getPassword()%></td>
            <td><a href="edit_user?id=<%= user.getUser_Id()  %>">Edit</a>  
            &nbsp;|&nbsp; 
              <a href="javascript:confirmDelete(<%=user.getUser_Id() %>)">Delete</a></td>
            </tr>
            
            <%} 
             i=0;
            %>
            
     </table>
    
</div>


<%@ include file="footer.jsp" %>

<script>
  function confirmDelete(userId){
	  if(confirm("Are you sure to delete the uses with user id"+"   "+userId)){
		  window.location="delete_user?id="+userId;
	  }
  }

</script>
</body>
</html>