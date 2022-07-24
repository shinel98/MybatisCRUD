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
        <h1>Edit Menu</h1>  
       <form:form method="POST" action="/editSave">    
        <table>    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Type : </td>   
          <td><form:input path="type"/></td>  
         </tr>    
         <tr>    
          <td>Photo :</td>    
          <td><form:input path="photo"/></td>  
         </tr>   
         <tr>    
          <td>Name :</td>    
          <td><form:input path="name"/></td>  
         </tr>   
         <tr>    
          <td>Description :</td>    
          <td><form:input path="des"/></td>  
         </tr>   
         <tr>    
          <td></td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>