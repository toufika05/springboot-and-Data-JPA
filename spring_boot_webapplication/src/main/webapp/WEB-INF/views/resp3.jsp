<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <%@taglib uri="jakarta.tags.core" prefix="c" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Edit Form</h2>

<form action="/update">

<input type="hidden" placeholder="Enter your id" name="id" value="${edit.getId()}">
<input type="text" placeholder="Enter your name" name="name" value="${edit.getName()}">
<input type="password" placeholder="Enter your password" name="pass" value="${edit.getPassword()}">
<input type="number" placeholder="Enter your age" name="age" value="${edit.getAge()}">
<input type="text" placeholder="Enter your address" name="address" value="${edit.getAddress()}">
<input type="submit" value="Update">

</form>
</body>
</html>         