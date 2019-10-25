<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>ADMIN</title>
<style type="text/css">
#pad{
padding:150px;
}
</style>
</head>

<body>
   <nav id="pad" >
      
       <c:url value="ProductDetails" var="product"/>
       <c:url value="SupplierDetails" var="supplier"/>
       <c:url value="CategoryDetails" var="category"/>
   <center> <a type="submit"  class="btn btn-primary btn-lg" href="${product}" >Product</a></center> <br> 
   
   <center> <a  type="submit"  class="btn btn-primary btn-lg" href="${category}">Category</a></center><br>
       
   <center> <a type="submit"  class="btn btn-primary btn-lg" href="${supplier}">Supplier</a></center><br>
       
      
     <center> <a type="submit" class="btn btn-primary btn-lg" href="login">HOME</a></center>
   </nav>
</body>
</html>