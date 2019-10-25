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
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
<script type="text/javascript">
var arr=[];
arr.push(foo);
function cart()
{
var foo=document.getElementById("count").innerHTML;
foo++;
document.getElementById("count").innerHTML=foo;
}
</script>
	</head>
<body>
<c:forEach items="${productlist}" var="product">
<c:url value="cartdetails" var="gotocart"/>
 </c:forEach>
<c:if test="${logoutstatus}==true"> 
<jsp:forward page="login"/>
</c:if>
<c:url value="/resources/images/" var="image"/>
<div class="jumbotron text-center">
<h1>Burma Bazzar</h1>
<div class="container">
<div class="dropdown" style="float:left;">
<label type="label" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"> Menu</label>
     <div class="dropdown-menu">
     <label> <a class="dropdown-item" href="#Category">Category</a></label><br>
     <label> <a class="dropdown-item" href="#Offers">Offers</a></label><br>
     </div>
  </div>
  <div class="dropdown" style="float:left;">
			<label type="label" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"> Home</label>
			<div class="dropdown-menu">
			<label><a class="dropdown-item" href="#">About-us</a></label><br>
			<label><a class="dropdown-item" href="#">Contact-us</a></label><br>
			<label><a class="dropdown-item" href="#">News</a></label><br>
			</div>
			</div>
			
 <div class="row">
 <div class="col-sm-6">
 <div class="input-group">
 <input type="text" class="form-control"placeholder="Search"><button class="btn btn-primary"><i class='fas fa-search' style='font-size:23px'></i></button>
 </div>
</div>
        <label style="float:right;"><a class="btn btn-primary btn-md"  href="signup">Sign-up</a></label> &nbsp &nbsp 
		<label style="float:right;"><a class="btn btn-primary btn-md"  href="login" >Log-in</a></label> &nbsp &nbsp 
		<label style="float:right;"><a class="btn btn-primary btn-md"  href="cart"><span class="glyphicon glyphicon-shopping-cart"></span>Cart<label class="badge" id="count">${cartsize}</label> </a></label>
	 &nbsp &nbsp 	<label style="float:right;"><a class="btn btn-primary btn-md" href='logout'>Logout</a>	</label>
		
</div>
	</div>
	<div class="container">
	<h4><%String username=(String)session.getAttribute("username") ;
 out.println(username);
 %></h4>
	</div></div>
<div class="container">
	<div class="row">
	
<c:forEach items="${productlist}" var="product" varStatus="vs">
			<div class="col-sm-3">
						<figure class="figure">
							<a href="#" data-toggle="modal" data-target="#myModal${vs.index}">
								<img src="${image}${product.productid}.jpg" class="rounded" height="200" width="250"/>
							</a>
								<center><figcaption class="figure-caption">${product.productname} </figcaption></center>
							<div class="modal fade" id="myModal${vs.index}" role="dialog">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div>
											<br>
											<center>
												<img src="${image}${product.productid}.jpg" class="rounded" height="350" width="550"/>
											<h1>${product.productname} </h1><h3>${product.price }</h3>
												<h4>${product.description}</h4>
											</center>
													<div>
 <f:form method="post" action="addtocart" modelAttribute="myCart">
 <input type='hidden' name="email" value=<%=username%>/>
 <input type='hidden' name='productid' value='${product.productid}'/>
 <input type='hidden' name='price' value='${product.price}'/>
 
<center><input type='submit' class="btn btn-primary btn-lg" value='Addtocart'/></center>
</f:form>
</div>
        
													</div>
													<div class="modal-footer">
															<span class="btn btn-default" data-dismiss="modal">close</span>
													</div>
													
											</div>
									</div>
								</div>
							</div>
						</figure>
					</c:forEach>	
			</div>
			
	</body>
</html>	