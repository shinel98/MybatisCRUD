<!-- 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<form:form method="post" action="save">
		<table>
			<tr>
				<td>Type :</td>
				<td><form:input path="type" /></td>
			</tr>
			<tr>
				<td>Photo :</td>
				<td><form:input path="photo" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Description :</td>
				<td><form:input path="des" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>
 -->

<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Employee</h1>  
       <form method="post" action="save" enctype="multipart/form-data">    
        <table >    
         <tr>    
          <td>Type : </td>   
          <%-- <td><form:input path="type" /></td>   --%>
          <td><input name="type"/></td>
         </tr>    
         <tr>    
          <td>Photo :</td>    
          <%-- <td><form:input path="photo"/></td> --%>
          <td><input name="photo" type="file"/></td>  
         </tr>   
         <tr>    
          <td>Name :</td>    
          <%-- <td><form:input path="name" /></td> --%>
          <td><input name="name"/></td>  
         </tr>
         <tr>    
          <td>Description :</td>    
          <%-- <td><form:input path="des" /></td> --%>
          <td><input name="des"/></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form> 