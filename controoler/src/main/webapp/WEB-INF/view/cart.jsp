<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>CART</title>
<style type="text/css">
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
        }</style>
</head>
<body><div id="dio">
<c:url value="/resources/images/" var="image"/>
<center><h1>CART</h1></center>
  <table class="table table-borderless">
   <thead class="table-dark">

   <th>Id</th>
   <th>Image</th>
   <th><center>Price</center></th>
   <th><center>Option</center></th></thead></table>
     <c:forEach items="${cartlist}" var="cart">
<table class="table table-borderless">   
<tr>
        <td>
           ${cart.productid}
           </td>
           <td>
           <img src="${image}${cart.productid}.jpg" height="250px" width="250px"/>
         </td> 
          <td>
           <h3> ${cart.price}</h3> 
           </td>
         <td>
           <a type="submit"  class="btn btn-primary btn-md"  href='deletecart?id=${cart.id}'>Delete</a>
          </td>
      
  
</tr></table>
<c:url value="payment" var="payment"/>
<label><h1><center>Total amount :${carttotal}</center></h1> </label></td></c:forEach><br>
<a type="submit"  class="btn btn-primary btn-lg"  href="home" style ="float:left">Back</a></center>
<a type="submit"  class="btn btn-primary btn-lg"  href="paymentdetails" style ="float:right">Payment</a></center></div>
</body>
</html>