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

<h2 align="center">CREATE NEW ACCOUNT</h2>

<table>

<form:form action="fromcreateaccountpage" method="post" modelAttribute="create">

<tr>
	<td>Name</td>
	<td><form:input path="name"></form:input></td><br>
</tr>
<tr>
	<td>Mobile Number</td>
	<td><form:input path="mobileNo"></form:input></td><br>	
</tr>

<tr>
	<td>Balance</td>
	<td><input name="wallet.balance"></input></td>
</tr>

<tr>
	<td><input type="submit" value="Create account"></input></td>

</tr>
</form:form>

</table>

</body>
</html>