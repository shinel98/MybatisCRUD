<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Type</th><th>Photo</th><th>Name</th><th>Description</th><th>Delete</th></tr>  
   <c:forEach var="menu" items="${list}">   
	   <tr>  
		   <td>${menu.id}</td>
		   <td>${menu.type}</td>  
		   <td>${menu.photo}</td>  
		   <td>${menu.name}</td>  
		   <td>${menu.des}</td>  
		   <td><a href="editMenu/${menu.id}">Edit</a></td>  
		   <td><a href="deleteMenu/${menu.id}">Delete</a></td>  
	   </tr>  
	   </c:forEach>  
   </table>  
   <br/>  
   <a href="menuForm">Add New Employee</a>
</body>
</html>