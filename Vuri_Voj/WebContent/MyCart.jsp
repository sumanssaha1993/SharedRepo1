<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jspiders.model.dao.FoodCartDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
<%@ page import="com.jspiders.dto.FoodItemDTO"%>
</head>
<body>
	<%
		HttpSession session1 = request.getSession(false);
		HashMap<String, ArrayList<Object>> n = (HashMap<String, ArrayList<Object>>) session1.getAttribute("food");
	%>
	<center>
		<h1>
			Welcome
			<%=session1.getAttribute("name")%></h1>
	</center>
	<div
		style="display: inline-block; height: 200px; width: 100%; overflow: auto;">
		<center>
			<table border="1" width="90%" bgcolor="cyan">
				<tr bgcolor="red">
					<th>Food Name</th>
					<th>Food Type</th>
					<th>Price</th>
					<th>Quantity</th>
					<%
						for (ArrayList<Object> list : n.values()) {
					%>
				
				<tr>
					<td><%=list.get(0)%></td>
					<td><%=list.get(1)%></td>
					<td><%=list.get(2)%></td>
					<td><%=list.get(3)%></td>
				</tr>

				<%
					}
				%>
			</table>
		</center>
	</div>
	<br>
	<br>
</body>
</html>