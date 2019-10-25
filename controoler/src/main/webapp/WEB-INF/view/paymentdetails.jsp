<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("#flip").click(function(){
    $("#panel").slideDown("slow");
  });
});
</script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Payment</title>
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
#panel, #flip {
  padding: 5px;
  text-align: center;
  background-color:white;
 
}

#panel {
  padding: 50px;
   border: solid 1px #c3c3c3;
  display: none;
 
}
</style>
</head>
<body><div id="dio">
<c:url value="/resources/images/" var="image"/>
<c:url value="Invoice" var="Invoice"/>
<center>
<h1>PAYMENT DETAILS</h1>
<f:form method="post" action="addpayment" modelAttribute="addpayment" >
<table class="table table-borderless">
<tr>
<td>
<h3>Enter Paymentmethod :</h3>
</td>
<td><div id="flip">
<f:radiobutton path="paymentmethod" value="card" />CARD </div><br>
<div id="panel"><h4>Enter the account no:<f:input path="accountno" value="${currproduct.accountno}" class="form-control" /></h4>
<h4>Enter Card No:<input type='text' placeholder='CARD.NO' class="form-control"/></h4>
<h4>Enter CCV:<input type='text' placeholder='CCV' class="form-control"/></h4>
</div>
</td>
<td>
<f:radiobutton path="paymentmethod" value="cash" />CASH ON DELIVERY
</td>
</tr>
<br>
<tr>
<td>
<h3>Enter  Shipping Address</h3>
</td>
<td>
<f:textarea path="shippingaddress" value="${currproduct.shippingaddress}" class="form-control"/>

</td>
</tr>
<c:forEach items="${cartlist}" var="cart">
<input type="hidden" path="Cartid" value="${cart.cartid}" />
</c:forEach>
</table><br><br>

<input type='submit' class="btn btn-primary btn-lg" href="cart" value="Back" style="float:left"/>
<input type='submit' class="btn btn-primary btn-lg" value="Proceed" href="Invoice" style="float:right"/>&nbsp &nbsp
</center></div></f:form>
</body>
</html>