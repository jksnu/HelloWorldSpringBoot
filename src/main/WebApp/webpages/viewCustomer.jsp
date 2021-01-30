<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Courses</title>
</head>
<body>
<h1>Enter customer id to get detail</h1> 
<form action="details" method="post">
	Enter Customer Id: <input type="text" name="cid"><br>
	<input type="submit">
</form>
<h1>View customer details</h1>
<h2>Details as submitted as follows: </h2>
Customer Id: ${customer}
<h4>Customer Id: ${customer.cid}</h4>
<h4>Customer Name: ${customer.cname}</h4>
<h4>Customer Email: ${customer.cemail}</h4>
</body>
</html>