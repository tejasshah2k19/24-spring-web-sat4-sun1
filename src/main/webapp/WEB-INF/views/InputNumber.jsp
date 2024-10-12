<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="calculate" method="post">
		No.1 <input type="text" name="n1"/><br><br> 
		No.2 <input type="text" name="n2"/><br><br>
		
		Add <input type="radio" name="opr" value="+"/>
		Sub <input type="radio" name="opr" value="-"/> 
		Mul <input type="radio" name="opr" value="*"/> <br><br> 
	<input type="submit" value="Add"/> 	
	</form>
</body>
</html>