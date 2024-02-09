<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
	int count=0;
	
	public void jspInit(){
		System.out.println("U r in Jsp Init Method");
	}
	
	public void jspDestroy(){
		System.out.println("U r in jspDestroy Method");
	}
		
%>

<%
	count++;
	System.out.println("Count is "+count);
	//out.println("Count is "+count);
	
	if(count%2==0){
	//	System.out.println("Even Number "+count);	
		%>
		<h2 style="color: green;" > Even Number:: <%=count %>  
		</h2>
	<% 	
	}else{
		//System.out.println("Odd Number "+count);	
		%>
		
		<h3 style="color: red;">Odd Number:: <%=count %> </h3>
		
	<% }%>

	



</body>
</html>