<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/bootstrap/bootstrap.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<h2>U r in Home Page </h2>
	

<table class="table table-bordered ">
	<thead>
		<tr>
			<th>Id</th>
			<td>Action</td>
			<th>First Name</th>
			<th>Email Id</th>
			<th>Mobile No</th>
		</tr>
	</thead>
	
	<tbody>
	<c:forEach var="person" items="${personlist}" >
		<tr>
			<td> ${person.id} </td>
			<td> <a href="/getparticurlardata/${person.id}"  class="btn btn-success">Update</a> </td>
			<td> ${person.fname } </td>
			<td> ${person.emailid } </td>
			<td> ${person.mobileno } </td>
		</tr>
	</c:forEach>
		
	</tbody>
	
</table>
	
	
	
</body>
</html>