<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
<meta charset="ISO-8859-1">
<title>INVOICE</title>
<style type="text/css">#dio
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
<body>
<center><h1>Burma Bazzar</h1></center><br>
<h2 style="float:right">Contact us:<br><a href="#">burmabazzar@gmail.com</a></h2><br><br><br>
<div id="dio">
<c:url value="/resources/images/" var="image"/>
<center><h2>BILLING DETAILS</h2></center>
<table class="table table-borderless"> 
<thead class="table table-dark">
<th><h3>Product Image</h3></th>
<th><h3>Price</h3></th>
</thead></table>
<table class="table table-borderless">   
<c:forEach items="${cartlist}" var="cart">
<tr>
           <td>
<img src="${image}${cart.productid}.jpg" height="250px" width="250px"/>
         </td> 
          <td>
<h3> ${cart.price}</h3> 
           </td>
           </tr>
</c:forEach></table>
<label><h1><center>Total amount :${carttotal}</center></h1> </label><br>
<c:forEach  items="${Paymentlist}" var="payment">
<label><h3><center>Shipping Address:</h3><h5>${payment.shippingaddress}</center></h5></label><br></c:forEach>  
<center><a type="submit"  class="btn btn-primary btn-lg"  href="home">Proceed</a></center></div>
</body>
</html>