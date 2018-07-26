<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Transfer Fund Page</h2>
<table>
	<form:form action="fromfundtransferpage" method="post">
   		
   		<tr>
   			<td>Sender Mobile Number</td>
   			<td><input type="text" name="mobsen"/></td>
   		</tr>
   		
   		<tr>
   			<td>Receiver Mobile Number</td>
   			<td><input type="text" name="mobrec"/></td>
   		</tr>
   	
        <tr>
   			<td>Amount for fun transfer</td>
   			<td><input type="text" name="amount"/></td>
   		</tr>
           	
   		<tr>
   			<td>
   				<input type="submit" value="Submit"></input>
   			</td>
   		</tr>
   		
	</form:form>
	



</table>


</body>
</html>