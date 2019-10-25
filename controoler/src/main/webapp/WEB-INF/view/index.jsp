<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>FRONT PAGE</title>
</head>
<body>
<div class="jumbotron text-center">
<h1>BURMA BAZZAR</h1>
<c:url value="admin" var="admin"/>
    <a type="submit"  class="btn btn-primary btn-lg" href="admin" >ADMIN</a> 
    <br><br>
<c:url value="home" var="home"/>
    <a type="submit"  class="btn btn-primary btn-lg" href="home" >HOME</a>     
    
    
    
    
</div>
</body>
</html>