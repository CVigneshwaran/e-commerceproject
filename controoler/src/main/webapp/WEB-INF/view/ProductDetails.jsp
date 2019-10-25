<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>ProductDetails</title>
<style>
.errors{
color:red
}
</style>
</head>
<body>
<c:url value="/resources/images/" var="image"/>
<center><h3>Product Details</h3></center>
<f:form method="post" action="addproduct" modelAttribute="addproduct" enctype="multipart/form-data">
<table class="table table-borderless">
<tr>
<td>
<h4>Enter Product Name</h4>
</td>
<td>
<f:input path="productname" value="${currproduct.productname}" class="form-control" />
<f:errors path="productname" class="errors"></f:errors>
</td>
</tr>
<tr>
<td>
<h4>Enter Price</h4>
</td>
<td>
<f:input path="price" value="${currproduct.price}" class="form-control"/>
</td>
</tr>
<tr>
<td>
<h4>Enter Quantity</h4>
</td>
<td>
<f:input path="quantity" value="${currproduct.quantity}" class="form-control"/>
<f:errors path="quantity" class="errors"></f:errors>
</td>
</tr>
<tr>
<td>
<h4>Enter description</h4>
</td>
<td>
<f:textarea path="description" value="${currproduct.description}" class="form-control"/>
<f:errors path="description" class="errors"/>
</td>
</tr>
<tr>
<td>
<h4>Select Category Id</h4>
</td>
<td>
<f:input path="categoryid" class="form-control"/>
<f:errors path="categoryid" class="errors"></f:errors>
</td>
</tr>
<tr>
<td>
<h4>Select Supplier Id</h4>
</td>
<td>
<select name="supplierid" class="custom-select">
<c:forEach items="${supplierlist}" var="supplier">
    <option value="${supplier.id}">
       ${supplier.suppliername}
       
    </option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td>
<h4>Select Product Image</h4>
</td>
<td>
<input type="file" class="form-control" name="image" />
</td>
</tr>
</table>
<tr>
<td>
<center><input class="btn btn-primary" type="submit" value="Save"></center>
</td>
</tr>
</f:form><br><br>
<table class="table table-dark table-striped">
<th>Product Name
</th>
<th>
Price
</th>
<th>Quantity
</th>
<th><center>Image</center>
</th>
<th>Option
</th>
<th>Option
</th>
<c:forEach items="${productlist}" var="product">
<tr>
<td>
<h5>${product.productname}</h5>
</td>
<td>
<h5>${product.price}</h5>
</td>
<td>
<h5>${product.quantity}</h5>
</td>
<td>
<img src="${image}${product.productid}.jpg" height="250" width="250"/>
</td>
<td>
<a type="submit"  class="btn btn-primary" href="ProductDetails?id=${product.productid}">Edit</a>
</td>
<td>
 <a type="submit" class="btn btn-primary" href="deleteproduct?id=${product.productid}">Delete</a>
</td>
</tr>

</c:forEach>
</table>
</body>
</html>
