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

<h2 align="center">Mypayment app is successfully created with the given details</h2>
<div align="justify">

Customer Name          : ${success.name}<br>
Customer Mobile Number : ${success.mobileNo}<br>
Customer Balance       : ${success.wallet.balance}<br>

<a href="index"><input type="submit" value="Home" ><input></a>

</div>


</body>
</html>