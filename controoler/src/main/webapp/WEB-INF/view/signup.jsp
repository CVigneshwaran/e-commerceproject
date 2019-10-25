<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>SIGN_UP</title>
<style>
#dio
 		{ 
			height:230 px;
			width:220 px;	
			background-color:white;
			margin:25px 50px 50px 50px;
			box-shadow: 26px 20px 20px 26px rgba(0,0,2,0.2);
			z-index: 1;
			text-align:center;
			padding:100px;
        }
        .errors{
        color:red;
        }
</style>
</head>
<body>
<div id="dio">
<center><h2>Sign-Up</h2></center>
<f:form method="post" action="adduser" modelAttribute="adduser">
<table class="table table-borderless">
<tr>
<td>
<h4>Enter UserName</h4>
</td>
<td>
<f:input path="username" value="${curruser.username}"  class="form-control"/> 
<f:errors path="username" class="errors"/>
</td>
</tr> 
 
<tr>
<td>
<h4>Enter Password</h4>
<td>
<f:input path="password" value="${curruser.password}" class="form-control"/>
<f:errors path="password" class="errors"/>
</td>
</tr>
<tr>
<td>
<h4>Enter E-mail</h4>
</td>
<td>
<f:input path="email" value="${curruser.email}" class="form-control"/>
<f:errors path="email" class="errors"/>
</td>
</tr>
<tr>
<td>
<f:input type="hidden" path="user_role" value="ROLE_USER" class="form-control"/>
<f:errors path="user_role" class="errors"/>
</td>
</tr>
</table>
<tr>
<td>
<center><input type='submit' class="btn btn-primary" value="Sign-up"/></center>
</td>
</tr>
</f:form></div>
</body>
</html>