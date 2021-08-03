<%@ page import="java.util.List , com.bookstore.entity.Category"%>
<div align="center">

	<div>
		<img src="images/BookstoreLogo.png">
	</div>

	<div>

		<input type="text" name="keyword" size="30" />

		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button"
			value="search" /> <a href="">Sign in</a> <a href="">Register</a> <a
			href="">Cart</a>

	</div>
   &nbsp;
	<div>
		<%
		List<Category> categoryList = (List<Category>) request.getAttribute("listCategory");
		 int size =categoryList.size();
		 int i=0;
		 for(Category category:categoryList)
		 {%>
		 <a href="view_category?id=<%= category.getCategory_id() %>" >		 
		 <font size="+1"><b><%=category.getName() %></b></font> 
		 <%if(--size >0) {%> &nbsp;&nbsp; |  &nbsp;&nbsp; <%} %>
		 </a>
		 <%}%>

	</div>

</div>


<!--            ../  ====>     its mean now iam in folder fronted after ../ that i am in folder webapp                       -->