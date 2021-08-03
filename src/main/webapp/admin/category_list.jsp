<%@page import="com.bookstore.entity.Category"%>
<%@page import="com.bookstore.service.UserServices"%>
<%@page import="com.bookstore.entity.Users , java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../css/style.css">
<title>Insert title here</title>
</head>
<body>
   
  
<%@ include file="header.jsp" %>


<div align="center">
  
 
  
  <h1 class="pageheading">Category Management</h1>
  <h2><a href="category_form.jsp">Create New category</a></h2>
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
           <th>Category Id</th>
           <th>Category Name</th>
           <th>Action</th>
        </tr>
              <%! int i=0; %>
             <% 
           List<Category> list=(List<Category>) request.getAttribute("listCategory");
           for(Category category:list){%>   <!-- you can also use jstl forEach loop-->
            <tr>
            <td><%= i=i+1 %></td>
        	<td><%= category.getCategory_id() %></td>   
            <td><%=category.getName() %></td>
            
            <td><a href="edit_category?id=<%= category.getCategory_id()  %>">Edit</a>  
            &nbsp;|&nbsp; 
              <a href="javascript:confirmDelete(<%=category.getCategory_id() %>)">Delete</a></td>
            </tr>
            
            <%} 
             i=0;
            %>
            
     </table>
    
</div>


<%@ include file="footer.jsp" %>

<script>
  function confirmDelete(categoryId){
	  if(confirm("Are you sure to delete the category with category id"+"   "+categoryId)){
		  window.location="delete_category?id="+categoryId;
	  }
  }

</script>
</body>
</html>