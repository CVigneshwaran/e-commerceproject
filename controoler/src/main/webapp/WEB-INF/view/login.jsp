<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>LOG-IN</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
#dio
 		{ 	
			background-color:white;
			margin:25px 50px 75px 50px;
			box-shadow: 26px 20px 20px 26px rgba(0,0,2,0.2);
			z-index: 1;
			text-align:center;
			padding:60px;
        }
</style>
<script>
class user{

}
function validate()
{
var login=document.forms["myformobject"]["username"].value;
var passwordtext=document.forms["myformobject"]["passwordtext"].value;
console.log(login)
console.log(passwordtext)
if (login==null || login=="")
{  
  alert("Name can't be blank");  
  return false;  
}
else if(passwordtext.length<8)
{  
  alert("Password must be at least 8 characters long.");  
  return false;  
}  
}
</script>
</head>
<body>
<div id="dio">
<center><h2>Log-in</h2></center>
<form method="post" action='/controoler/j_spring_security_check' name='myformobject'>
<div class="col-xs-10">
<label>Enter Username<input type="text" class="form-control"  name="j_username" required></label>
<br>
<label>Enter password:<input type="password" class="form-control" name='j_password' required/></label><br><br><p>*Password must contain atleast 8 characteristics with uppercase,lowercase.*</p>
<br>
<button class="btn btn-primary" type="submit" />LOG-IN</button>
<br><br>
<a href="signup">Create a new Account </a> 
</div>
</form>
</div>
</body>
</html>